/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author allen
 */
public class OrderBurger {
    
    private int orderNumber;
    private int burger_id;
    private int quantityOrdered;

    public OrderBurger(int orderNumber, int burger_id, int quantityOrdered) {
        this.orderNumber = orderNumber;
        this.burger_id = burger_id;
        this.quantityOrdered = quantityOrdered;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getBurger_id() {
        return burger_id;
    }

    public void setBurger_id(int burger_id) {
        this.burger_id = burger_id;
    }

    public int getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setQuantityOrdered(int quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.orderNumber;
        hash = 83 * hash + this.burger_id;
        hash = 83 * hash + this.quantityOrdered;
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
        final OrderBurger other = (OrderBurger) obj;
        if (this.orderNumber != other.orderNumber) {
            return false;
        }
        if (this.burger_id != other.burger_id) {
            return false;
        }
        if (this.quantityOrdered != other.quantityOrdered) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "OrderBurger{" + "orderNumber=" + orderNumber + ", burger_id=" + burger_id + ", quantityOrdered=" + quantityOrdered + '}';
    }
    
    
    
}
