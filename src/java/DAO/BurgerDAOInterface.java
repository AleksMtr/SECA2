/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.PlainBurger;
import java.util.ArrayList;

/**
 *
 * @author allen
 */
public interface BurgerDAOInterface {
    /**
     * @return An ArrayList to return all burgers in the database
     */
    public ArrayList<PlainBurger> viewAllBurgers();
    /**
     * @param basicBun
     * @param origBeef
     * @param ketchup
     * @param plainLettuce
     * @param description
     * @param price
     * @return A boolean to show whether or not the burger was added
     */
    public boolean createBurger(String basicBun, String origBeef, String ketchup, String plainLettuce, String description, double price);
    /**
     * @param burger_id
     * @return A boolean to return a burger by its ID
     */
    public PlainBurger findBurgerByID(int burger_id);
    /**
     * @param orderNumber
     * @param burger_id
     * @param quantity_ordered
     * @return A boolean to return a if a burger was ordered
     */
    public boolean OrderBurger(int orderNumber,int burger_id,int quantity_ordered);
}
