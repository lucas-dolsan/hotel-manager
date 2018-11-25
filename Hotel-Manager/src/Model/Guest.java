package Model;

/**
 *
 * @author Lucas Dolsan
 */
public class Guest extends Person {

    public Guest(float addiotionalBilling, int id, String name) {
        super(id, name);
    }

    public String toFileString() {
        return this.getId() + ";" + this.getName();
    }
}
