package Model;

/**
 *
 * @author Lucas Dolsan
 */
public class BookingGuest {

    Guest guest;
    Booking booking;

    public BookingGuest(Guest guest, Booking booking) {
        this.guest = guest;
        this.booking = booking;
    }

    public BookingGuest() {
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public String toFileString() {
        return this.guest.getId() + ";" + this.booking.getCode();
    }

}
