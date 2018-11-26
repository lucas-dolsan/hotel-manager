package Control;

import Model.Guest;
import Model.Room;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class GuestController {

    public static final String FILE_PATH = "d:/Hotel-manager-files/guests.txt";
    ArrayList<Guest> guests = new ArrayList<>();

    public Guest findGuestByID(int id) {
        readGuestsFromFile();
        Guest guest = new Guest(0, "Guest Não Encontrado");
        for (Guest guestIteration : this.guests) {
            if (guestIteration.getId() == id) {
                return guestIteration;
            }
        }
        return guest;
    }

    public Guest findGuestByName(String name) {
        readGuestsFromFile();
        Guest guest = new Guest(0, "Guest Não Encontrado");
        for (Guest guestIteration : this.guests) {
            if (guestIteration.getName().equals(name)) {
                return guestIteration;
            }
        }
        return guest;
    }

    public boolean guestExistsInFile(int id) {
        readGuestsFromFile();
        for (Guest guest : this.guests) {
            if (guest.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public String createNewGuest(Guest guest) {
        try {
            if (guestExistsInFile(guest.getId())) {
                String message = "Já existe um hóspede com esse número cadastrado!";
                System.out.println(message);
                return message;
            }
            this.guests.clear();
            readGuestsFromFile();
            this.guests.add(guest);

            if (this.saveGuestsToFile()) {
                String message = "Cadastro efetuado com sucesso!";
                System.out.println(message);
                return message;
            }
        } catch (Exception e) {
            e.printStackTrace();
            String message = "Não foi possível cadastar um novo quarto";
            System.out.println(message);
            return message;
        }
        String message = "Erro inesperado!";
        System.out.println(message);
        return message;
    }

    private boolean saveGuestsToFile() {
        try {
            FileWriter fileWriter = new FileWriter(new File(FILE_PATH));
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Guest guest : this.guests) {
                bufferedWriter.write(guest.toFileString());
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

    private boolean readGuestsFromFile() {
        File file = new File(FILE_PATH);
        try {
            if (file.exists()) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String line = bufferedReader.readLine();

                while (line != null) {
                    String[] stringifiedGuest = line.split(";");

                    int id = Integer.parseInt(stringifiedGuest[0]);
                    String name = stringifiedGuest[1];

                    Guest guest = new Guest(id, name);

                    this.guests.add(guest);

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

    public ArrayList<Guest> getAllGuests() {
        readGuestsFromFile();
        return this.guests;
    }

    public String deleteGuestFromFile(int id) {
        this.readGuestsFromFile();
        for (Iterator<Guest> guestIteration = this.guests.iterator(); guestIteration.hasNext();) {
            Guest guest = guestIteration.next();
            if (guest.getId() == id) {

                guestIteration.remove();

                String message = "Hóspede[" + id + "] foi removido com sucesso!";
                System.out.println(message);

                this.saveGuestsToFile();

                return message;
            }
        }
        return "Ocorreu um erro inesperado!";
    }

    public String editGuest(Guest editedGuest) {
        readGuestsFromFile();

        for (int i = 0; i < this.guests.size(); i++) {
            if (this.guests.get(i).getId() == editedGuest.getId()) {
                this.guests.set(i, editedGuest);
                saveGuestsToFile();
                String message = "Hóspede editado com sucesso!";
                System.out.println(message);
                return message;
            }
        }

        String message = "Ocorreu um erro inesperado!";
        System.out.println(message);
        return message;
    }
}
