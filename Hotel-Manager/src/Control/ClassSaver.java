/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Room;
import com.google.gson.Gson;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;

/**
 *
 * @author Lucas Dolsan
 */
public class ClassSaver {

    public ClassSaver() {
    }

    private String getOlderLines(String filePath) throws IOException {
        try {
            String bunda = new String(Files.readAllBytes(new File(filePath).toPath()), "UTF-8");
        } catch (NoSuchFileException ex) {
            System.out.println("No file found at path: " + filePath);
            System.out.println("Creating new file...");
            try {
                File file = new File(filePath);
                System.out.println("Successfully created file at path:" + filePath);
                getOlderLines(filePath);
            } catch (Exception e) {
                System.out.println("File creation failed at path: " + filePath);
                e.printStackTrace();
            }
        }

        return "Room{number=1, amountOfBeds=1, isBooked=true, isOccupied=true, hasBathroom=true, hasRoomService=true, hostedGuests=[]}";

    }

    public boolean save(Object instance) throws IOException {
        String filePath = "C:\\Users\\Lucas Dolsan\\Desktop\\Hotel-Manger\\";
        if (instance instanceof Room) {
            filePath += "Room.txt";
            String olderLines = this.getOlderLines(filePath);
            Writer writer = new BufferedWriter(new FileWriter("C:\\Users\\Lucas Dolsan\\Desktop\\Hotel-Manger\\Room.txt"));
            String JSON = new Gson().toJson(instance);
            String finalString = olderLines.concat("\n" + JSON);
            writer.write(finalString);
            writer.close();
        }
        return true;
    }

    public Object restore(String className) throws UnsupportedEncodingException, IOException {
        String filePath = "C:\\Users\\Lucas Dolsan\\Desktop\\Hotel-Manger\\" + className + ".txt";

        byte[] bytes = Files.readAllBytes(new File(filePath).toPath());
        String JSON = new String(bytes, "UTF-8");

        return new Gson().fromJson(JSON, Room.class);
    }
}
