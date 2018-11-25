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
    ArrayList<Guest> hostedGuests = new ArrayList();

    public Room(int number, int amountOfBeds, boolean isBooked, boolean isOccupied, boolean hasBathroom, boolean hasRoomService) {
        this.number = number;
        this.amountOfBeds = amountOfBeds;
        this.isBooked = isBooked;
        this.isOccupied = isOccupied;
        this.hasBathroom = hasBathroom;
        this.hasRoomService = hasRoomService;
    }
    
    public void addGuest(Guest guest) {
        if (this.getAmountOfBeds() < this.getHostedGuests().size()) {
            this.getHostedGuests().add(guest);
            setIsOccupied(true);
        }
    }

    public void addGuests(ArrayList<Guest> guests) {
        if (this.getAmountOfBeds() <= this.gethostedGuests().size()) {
            this.gethostedGuests().addAll(guests);
            setIsOccupied(true);
        }
    }

    public void removeGuests(ArrayList<Guest> guests) {
        this.gethostedGuests().removeAll(guests);
    }

    public void RemoveAllGuests() {
        this.gethostedGuests().removeAll(this.gethostedGuests());
    }

    public ArrayList<Guest> gethostedGuests() {
        return hostedGuests;
    }

    public void removeLastGuest() {
        this.gethostedGuests().remove(this.gethostedGuests().size() - 1);
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

    public boolean HasBathroom() {
        return hasBathroom;
    }

    public void setHasBathroom(boolean hasBathroom) {
        this.hasBathroom = hasBathroom;
    }

    public boolean isIsBooked() {
        return isBooked;
    }

    public void setIsBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }

    public boolean isIsOccupied() {
        return isOccupied;
    }

    public void setIsOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public ArrayList<Guest> getHostedGuests() {
        return hostedGuests;
    }

    public void setHostedGuests(ArrayList<Guest> hostedGuests) {
        this.hostedGuests = hostedGuests;
    }

    public boolean hasRoomService() {
        return hasRoomService;
    }

    public void setHasRoomService(boolean hasRoomService) {
        this.hasRoomService = hasRoomService;
    }

    @Override
    public String toString() {
        return "Room{" + "number=" + number + ", amountOfBeds=" + amountOfBeds + ", isBooked=" + isBooked + ", isOccupied=" + isOccupied + ", hasBathroom=" + hasBathroom + ", hasRoomService=" + hasRoomService + ", hostedGuests=" + hostedGuests + '}';
    }

}
