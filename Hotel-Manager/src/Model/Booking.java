package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Lucas Dolsan
 */
public class Booking {

    private int code;
    private boolean archived;
    private String checkinDate;
    private String checkoutDate;
    private float cost;
    private float additionalCost;
    private Room room;
    ArrayList<Guest> guests = new ArrayList();

    public Booking(int code, Room room, boolean archived, String checkinDate, String checkoutDate, float cost) {
        this.code = code;
        this.room = room;
        this.archived = archived;
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
        this.cost = cost;
    }

    public Booking() {
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public float getAdditionalCost() {
        return additionalCost;
    }

    public void setAdditionalCost(float additionalCost) {
        this.additionalCost = additionalCost;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(String checkinDate) {
        this.checkinDate = checkinDate;
    }

    public String getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(String checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public String toFileString() {
        String line = this.code + ";"
                + this.archived + ";"
                + this.room.getNumber() + ";"
                + this.checkinDate + ";"
                + this.checkoutDate + ";"
                + this.cost + ";";
        return line;
    }

    @Override
    public String toString() {
        return "Booking{" + "code=" + code + ", archived=" + archived + ", checkinDate=" + checkinDate + ", checkoutDate=" + checkoutDate + ", cost=" + cost + ", room=" + room + ", guests=" + guests + '}';
    }

}
