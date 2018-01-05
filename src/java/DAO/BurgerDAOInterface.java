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
    
    public ArrayList<PlainBurger> viewAllBurgers();
    
    public boolean createBurger(String basicBun, String origBeef, String ketchup, String plainLettuce, String description, double price);
    
    
}
