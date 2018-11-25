/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Lucas Dolsan
 */
public class Booking {
    private Date checkinDate;
    private Date checkoutDate;
    private float cost;
    ArrayList<Guest> guests = new ArrayList();

    public Date getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(Date checkinDate) {
        this.checkinDate = checkinDate;
    }

    public Date getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(Date checkoutDate) {
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

    @Override
    public String toString() {
        return "Booking{" + "checkinDate=" + checkinDate + ", checkoutDate=" + checkoutDate + ", cost=" + cost + ", guests=" + guests + '}';
    }  
}
