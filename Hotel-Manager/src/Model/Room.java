package Model;

import com.google.gson.Gson;
import java.util.ArrayList;

/**
 *
 * @author Lucas Dolsan
 */
public class Room {

    private int number;
    private int amountOfBeds;
    private boolean isBooked;
    private boolean isOccupied;
    private boolean hasBathroom;
    private boolean hasRoomService;

    public Room() {

    }

    public Room(int number, int amountOfBeds, boolean isBooked, boolean isOccupied, boolean hasBathroom, boolean hasRoomService) {
        this.number = number;
        this.amountOfBeds = amountOfBeds;
        this.isBooked = isBooked;
        this.isOccupied = isOccupied;
        this.hasBathroom = hasBathroom;
        this.hasRoomService = hasRoomService;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAmountOfBeds() {
        return amountOfBeds;
    }

    public void setAmountOfBeds(int amountOfBeds) {
        this.amountOfBeds = amountOfBeds;
    }

    public boolean hasBathroom() {
        return hasBathroom;
    }

    public void setHasBathroom(boolean hasBathroom) {
        this.hasBathroom = hasBathroom;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setIsBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setIsOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public boolean hasRoomService() {
        return hasRoomService;
    }

    public void setHasRoomService(boolean hasRoomService) {
        this.hasRoomService = hasRoomService;
    }

    public String toFileString() {
        return this.number + ";" + this.amountOfBeds + ";" + this.isBooked + ";" + this.isOccupied + ";" + this.hasBathroom + ";" + this.hasRoomService;
    }

    @Override
    public String toString() {
        return "Room{" + "number=" + number + ", amountOfBeds=" + amountOfBeds + ", isBooked=" + isBooked + ", isOccupied=" + isOccupied + ", hasBathroom=" + hasBathroom + ", hasRoomService=" + hasRoomService + '}';
    }

}
