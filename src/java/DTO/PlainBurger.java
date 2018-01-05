/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;
import java.util.Objects;
/**
 *
 * @author allen
 */
public class PlainBurger implements Burger {
    private int burger_id;
    private String basicBun;
    private String origBeef;
    private String ketchup;
    private String plainLettuce;
    private String description;
    private double price;
    
    public PlainBurger(){
        
    }

    public PlainBurger(int burger_id, String basicBun, String origBeef, String ketchup, String plainLettuce, String description, double price) {
        this.burger_id = burger_id;
        this.basicBun = basicBun;
        this.origBeef = origBeef;
        this.ketchup = ketchup;
        this.plainLettuce = plainLettuce;
        this.description = description;
        this.price = price;
    }

    public int getBurger_id() {
        return burger_id;
    }

    public void setBurger_id(int burger_id) {
        this.burger_id = burger_id;
    }

    public String getBasicBun() {
        return basicBun;
    }

    public void setBasicBun(String basicBun) {
        this.basicBun = basicBun;
    }

    public String getOrigBeef() {
        return origBeef;
    }

    public void setOrigBeef(String origBeef) {
        this.origBeef = origBeef;
    }

    public String getKetchup() {
        return ketchup;
    }

    public void setKetchup(String ketchup) {
        this.ketchup = ketchup;
    }

    public String getPlainLettuce() {
        return plainLettuce;
    }

    public void setPlainLettuce(String plainLettuce) {
        this.plainLettuce = plainLettuce;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.burger_id;
        hash = 23 * hash + Objects.hashCode(this.basicBun);
        hash = 23 * hash + Objects.hashCode(this.origBeef);
        hash = 23 * hash + Objects.hashCode(this.ketchup);
        hash = 23 * hash + Objects.hashCode(this.plainLettuce);
        hash = 23 * hash + Objects.hashCode(this.description);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PlainBurger other = (PlainBurger) obj;
        if (this.burger_id != other.burger_id) {
            return false;
        }
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (!Objects.equals(this.basicBun, other.basicBun)) {
            return false;
        }
        if (!Objects.equals(this.origBeef, other.origBeef)) {
            return false;
        }
        if (!Objects.equals(this.ketchup, other.ketchup)) {
            return false;
        }
        if (!Objects.equals(this.plainLettuce, other.plainLettuce)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PlainBurger{" + "burger_id=" + burger_id + ", basicBun=" + basicBun + ", origBeef=" + origBeef + ", ketchup=" + ketchup + ", plainLettuce=" + plainLettuce + ", description=" + description + ", price=" + price + '}';
    }
    
    
    
    
}

