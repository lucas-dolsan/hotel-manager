/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Booking;
import Model.Guest;
import Model.Room;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author Lucas Dolsan
 */
public class BookingController {

    public static final String FILE_PATH = "d:/Hotel-manager-files/bookings.txt";
    ArrayList<Booking> bookings = new ArrayList<>();

    public Booking findBookingByCode(int code) {
        //readRoomsFromFile();
        Booking booking = new Booking();

        for (Booking bookingIteration : this.bookings) {
            if (bookingIteration.getCode() == code) {
                return bookingIteration;
            }
        }
        return booking;
    }

    public boolean bookingExistsInFile(int code) {
        readBookingsFromFile();
        for (Booking booking : this.bookings) {
            if (booking.getCode() == code) {
                return true;
            }
        }
        return false;
    }

    public String createNewBooking(Booking booking) {
        readBookingsFromFile();
        try {
            if (bookingExistsInFile(booking.getCode())) {
                String message = "Já existe um quarto com esse número cadastrado!";
                System.out.println(message);
                return message;
            }

            this.bookings.add(booking);

            if (this.saveBookingsToFile()) {
                String message = "Cadastro efetuado com sucesso!";
                System.out.println(message);
                return message;
            }
        } catch (Exception e) {
            e.printStackTrace();
            String message = "Não foi possível cadastar um novo agendamento!";
            System.out.println(message);
            return message;
        }
        String message = "Erro inesperado!";
        System.out.println(message);
        return message;
    }

    private boolean saveBookingsToFile() {
        try {
            FileWriter fileWriter = new FileWriter(new File(FILE_PATH));
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Booking booking : this.bookings) {
                bufferedWriter.write(booking.toFileString());
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            fileWriter.close();

            return true;

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean readBookingsFromFile() {
        File file = new File(FILE_PATH);
        try {
            if (file.exists()) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String line = bufferedReader.readLine();

                while (line != null) {

                    String[] stringifiedBooking = line.split(";");
                    Booking booking = new Booking();

                    booking.setCode(Integer.parseInt(stringifiedBooking[0]));
                    booking.setRoom(new RoomController().findRoomByNumber(Integer.parseInt(stringifiedBooking[1])));
                    booking.setCheckinDate(new Date(stringifiedBooking[2]));
                    booking.setCheckoutDate(new Date(stringifiedBooking[3]));
                    booking.setCost(Float.parseFloat(stringifiedBooking[4]));
                    int qtdAutores = Integer.parseInt(stringifiedBooking[5]);

                    for (int i = 6; i < (6 + qtdAutores); i++) {
                        int codAutor = Integer.parseInt(stringifiedBooking[i]);
                        Guest currentGuest = new GuestController().findGuestByID(codAutor);
                        booking.addGuest(currentGuest);
                    }
                    this.bookings.add(booking);
                    line = bufferedReader.readLine();
                }
                bufferedReader.close();
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public ArrayList<Booking> getAllBookings() {
        readBookingsFromFile();
        return this.bookings;
    }

    public String deleteBookingFromFile(int number) {
        this.readBookingsFromFile();
        for (Iterator<Booking> bookingIteration = this.bookings.iterator(); bookingIteration.hasNext();) {
            Booking booking = bookingIteration.next();
            if (booking.getCode() == number) {

                bookingIteration.remove();

                String message = "Agendamento [" + number + "] foi removido com sucesso!";
                System.out.println(message);

                this.saveBookingsToFile();

                return message;
            }
        }
        return "Ocorreu um erro inesperado!";
    }

    public String editRoom(Booking editedBooking) {
        readBookingsFromFile();

        for (int i = 0; i < this.bookings.size(); i++) {
            if (this.bookings.get(i).getCode() == editedBooking.getCode()) {

                this.bookings.set(i, editedBooking);
                saveBookingsToFile();
                String message = "Agendamento editado com sucesso!";
                System.out.println(message);
                return message;
            }
        }

        String message = "Ocorreu um erro inesperado!";
        System.out.println(message);
        return message;
    }
}
