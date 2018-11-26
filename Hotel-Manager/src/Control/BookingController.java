/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Booking;
import Model.BookingGuest;
import Model.Guest;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Lucas Dolsan
 */
public class BookingController {

    public static final String FILE_PATH = "d:/Hotel-manager-files/bookings.txt";
    public static final String GUESTLIST_FILE_PATH = "d:/Hotel-manager-files/BookingGuest.txt";
    ArrayList<Booking> bookings = new ArrayList<>();
    ArrayList<Guest> guests = new ArrayList<>();
    ArrayList<BookingGuest> bookingGuests = new ArrayList<>();

    public Booking findBookingByCode(int code) {
        readBookingsFromFile();
        Booking booking = new Booking();

        for (Booking bookingIteration : this.bookings) {
            if (bookingIteration.getCode() == code) {
                return bookingIteration;
            }
        }
        return booking;
    }

    public boolean bookingExistsInFile(int code) {
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
            
            bufferedWriter.write("");
            
            for (Booking booking : this.bookings) {
                bufferedWriter.write(booking.toFileString());
                saveGuestsToBooking(booking);
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

    private void saveGuestsToBooking(Booking booking) {
        this.bookingGuests.clear();
        readBookingGuestFromFile();
        try {
            FileWriter fileWriter = new FileWriter(new File(GUESTLIST_FILE_PATH));
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (BookingGuest bg : this.bookingGuests) {
                bufferedWriter.write(bg.toFileString());
                bufferedWriter.newLine();
            }

            for (Guest guest : booking.getGuests()) {
                BookingGuest bookingGuest = new BookingGuest(guest, booking);
                System.out.println(bookingGuest.toFileString());
                bufferedWriter.write(bookingGuest.toFileString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
            this.bookingGuests.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private boolean readBookingGuestFromFile() {
        File file = new File(GUESTLIST_FILE_PATH);
        try {
            if (file.exists()) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String line = bufferedReader.readLine();

                while (line != null) {

                    String[] stringifiedBookingGuest = line.split(";");
                    BookingGuest bookingGuest = new BookingGuest();

                    Booking booking = findBookingByCode(Integer.parseInt(stringifiedBookingGuest[1]));
                    Guest guest = new GuestController().findGuestByID(Integer.parseInt(stringifiedBookingGuest[0]));
                    if (guest.getId() == 0) {
                        return false;
                    }
                    bookingGuest.setBooking(booking);
                    bookingGuest.setGuest(guest);

                    this.bookingGuests.add(bookingGuest);

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

    private boolean readBookingsFromFile() {
        File file = new File(FILE_PATH);
        try {
            if (file.exists()) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String line = bufferedReader.readLine();

                this.bookings.clear();
                while (line != null) {

                    String[] stringifiedBooking = line.split(";");
                    Booking booking = new Booking();

                    System.out.println(stringifiedBooking);

                    booking.setCode(Integer.parseInt(stringifiedBooking[0]));
                    booking.setArchived(Boolean.parseBoolean(stringifiedBooking[1]));
                    booking.setRoom(new RoomController().findRoomByNumber(Integer.parseInt(stringifiedBooking[2])));
                    booking.setCheckinDate(stringifiedBooking[3]);
                    booking.setCheckoutDate(stringifiedBooking[4]);
                    booking.setCost(Float.parseFloat(stringifiedBooking[5]));

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

    public String editBooking(Booking editedBooking) {
        readBookingsFromFile();

        for (int i = 0; i < this.bookings.size(); i++) {
            if (this.bookings.get(i).getCode() == editedBooking.getCode()) {
                this.bookings.remove(i);
                this.bookings.add(editedBooking);

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
