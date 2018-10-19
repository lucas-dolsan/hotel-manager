package hotel.manager.Model;

import java.util.ArrayList;

/**
 *
 * @author Lucas Dolsan
 */
public class Room {

    private int number;
    private int amountOfBeds;
    private boolean hasBathroom;
    private boolean hasRoomService;
    ArrayList<Guest> hostedGuests = new ArrayList();

    public void addGuests(ArrayList<Guest> guests) {
        if (this.getAmountOfBeds() <= this.gethostedGuests().size()) {
            this.gethostedGuests().addAll(guests);
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

    public boolean isHasBathroom() {
        return hasBathroom;
    }

    public void setHasBathroom(boolean hasBathroom) {
        this.hasBathroom = hasBathroom;
    }

    public boolean isHasRoomService() {
        return hasRoomService;
    }

    public void setHasRoomService(boolean hasRoomService) {
        this.hasRoomService = hasRoomService;
    }

}
