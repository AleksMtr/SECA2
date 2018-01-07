/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.sql.Date;
import java.util.Objects;
/**
 *
 * @author allen
 */
public class FinalOrder {
    private int order_id;
    private String order_name;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String country;
    private String cardType;
    private int cardNo;
    private int cvv;

    public FinalOrder() {
    }

    public FinalOrder(int order_id, String order_name, String addressLine1, String addressLine2, String city, String country, String cardType, int cardNo, int cvv) {
        this.order_id = order_id;
        this.order_name = order_name;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.country = country;
        this.cardType = cardType;
        this.cardNo = cardNo;
        this.cvv = cvv;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getOrder_name() {
        return order_name;
    }

    public void setOrder_name(String order_name) {
        this.order_name = order_name;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.order_id;
        hash = 37 * hash + Objects.hashCode(this.order_name);
        hash = 37 * hash + Objects.hashCode(this.addressLine1);
        hash = 37 * hash + Objects.hashCode(this.addressLine2);
        hash = 37 * hash + Objects.hashCode(this.city);
        hash = 37 * hash + Objects.hashCode(this.country);
        hash = 37 * hash + Objects.hashCode(this.cardType);
        hash = 37 * hash + this.cardNo;
        hash = 37 * hash + this.cvv;
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
        final FinalOrder other = (FinalOrder) obj;
        if (this.order_id != other.order_id) {
            return false;
        }
        if (this.cardNo != other.cardNo) {
            return false;
        }
        if (this.cvv != other.cvv) {
            return false;
        }
        if (!Objects.equals(this.order_name, other.order_name)) {
            return false;
        }
        if (!Objects.equals(this.addressLine1, other.addressLine1)) {
            return false;
        }
        if (!Objects.equals(this.addressLine2, other.addressLine2)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        if (!Objects.equals(this.country, other.country)) {
            return false;
        }
        if (!Objects.equals(this.cardType, other.cardType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FinalOrder{" + "order_id=" + order_id + ", order_name=" + order_name + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", city=" + city + ", country=" + country + ", cardType=" + cardType + ", cardNo=" + cardNo + ", cvv=" + cvv + '}';
    }
    
    
    
}
