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
public class Employee extends Person {

    private float salary;
    private Date paymentDay;
    private boolean roomServer;
    private boolean cooker;

    public Employee(int id, String name) {
        super(id, name);
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Date getPaymentDay() {
        return paymentDay;
    }

    public void setPaymentDay(Date paymentDay) {
        this.paymentDay = paymentDay;
    }

    public boolean isRoomServer() {
        return roomServer;
    }

    public void setRoomServer(boolean roomServer) {
        this.roomServer = roomServer;
    }

    public boolean isCooker() {
        return cooker;
    }

    public void setCooker(boolean cooker) {
        this.cooker = cooker;
    }

}
