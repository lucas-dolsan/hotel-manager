package hotel.manager;

import Control.ClassSaver;
import Model.Booking;
import Model.Employee;
import Model.Guest;
import Model.Room;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.Room;

/**
 *
 * @author Lucas Dolsan
 */
public class Index {

    public static void main(String[] args) {
        Room r = new Room(1, 1, true, true, true, true);
        ClassSaver cv = new ClassSaver();
        try {
            cv.save(r);
            Room res = (Room) cv.restore("Room");
            System.out.println(res);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
