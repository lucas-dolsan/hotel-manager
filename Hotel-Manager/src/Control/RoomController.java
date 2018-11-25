/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Room;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.nio.file.Files.list;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Lucas Dolsan
 */
public class RoomController {

    public static final String FILE_PATH = "d:/Hotel-manager-files/rooms.txt";
    ArrayList<Room> rooms = new ArrayList<>();

    public Room findRoomByNumber(int roomNumber) {
        readRoomsFromFile();
        Room room = new Room();
        for (Room roomIteration : this.rooms) {
            System.out.println(roomIteration);
            if (roomIteration.getNumber() == roomNumber) {
                return roomIteration;
            }
        }
        return room;
    }

    public boolean roomExistsInFile(int roomNumber) {
        readRoomsFromFile();
        for (Room room : this.rooms) {
            if (room.getNumber() == roomNumber) {
                return true;
            }
        }
        return false;
    }

    public String createNewRoom(Room room) {
        readRoomsFromFile();
        try {
            if (roomExistsInFile(room.getNumber())) {
                String message = "Já existe um quarto com esse número cadastrado!";
                System.out.println(message);
                return message;
            }

            this.rooms.add(room);

            if (this.saveRoomsToFile()) {
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

    private boolean saveRoomsToFile() {
        try {
            FileWriter fileWriter = new FileWriter(new File(FILE_PATH));
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Room room : this.rooms) {
                bufferedWriter.write(new Gson().toJson(room));
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

    private boolean readRoomsFromFile() {
        File file = new File(FILE_PATH);
        try {
            if (file.exists()) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String line = bufferedReader.readLine();

                while (line != null) {
                    this.rooms.add(new Gson().fromJson(line, Room.class));
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

    public ArrayList<Room> getAllRooms() {
        readRoomsFromFile();
        return this.rooms;
    }

    public String deleteRoomFromFile(int number) {
        this.readRoomsFromFile();
        for (Iterator<Room> roomIteration = this.rooms.iterator(); roomIteration.hasNext();) {
            Room room = roomIteration.next();
            if (room.getNumber() == number) {

                roomIteration.remove();

                String message = "Quarto[" + number + "] foi removido com sucesso!";
                System.out.println(message);

                this.saveRoomsToFile();

                return message;
            }
        }
        return "Ocorreu um erro inesperado!";
    }

    public String editRoom(Room editedRoom) {
        readRoomsFromFile();

        for (int i = 0; i < this.rooms.size(); i++) {
            if (this.rooms.get(i).getNumber() == editedRoom.getNumber()) {
                Room oldRoom = this.rooms.get(i);
                this.rooms.set(i, editedRoom);
                saveRoomsToFile();
                String message = "Quarto editado com sucesso!";
                System.out.println(message);
                return message;
            }
        }

        String message = "Ocorreu um erro inesperado!";
        System.out.println(message);
        return message;
    }
}
