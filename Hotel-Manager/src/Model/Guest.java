package Model;

/**
 *
 * @author Lucas Dolsan
 */
public class Guest extends Person {

    private float addiotionalBilling;

    public Guest(int id, String name) {
        super(id, name);
    }

    public float getAddiotionalBilling() {
        return addiotionalBilling;
    }

    public void setAddiotionalBilling(float addiotionalBilling) {
        if (addiotionalBilling > 0) {
            this.addiotionalBilling = addiotionalBilling;
        }
    }

}
