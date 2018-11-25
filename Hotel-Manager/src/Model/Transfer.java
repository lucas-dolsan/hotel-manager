/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Schork
 */
public class Transfer {

    private int code;
    private float value;
    private String description;
    private String date;
    private boolean typeIn;

    public Transfer() {
    }

    @Override
    public String toString() {
        return "Transfer{" + "code=" + code + ", value=" + value + ", description=" + description + ", date=" + date + ", typeIn=" + typeIn + '}';
    }

    public Transfer(int code, float value, String description, String date, boolean typeIn) {
        this.code = code;
        this.value = value;
        this.description = description;
        this.date = date;
        this.typeIn = typeIn;
    }
    
    

    public boolean isTypeIn() {
        return typeIn;
    }

    public void setTypeIn(boolean typeIn) {
        this.typeIn = typeIn;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
