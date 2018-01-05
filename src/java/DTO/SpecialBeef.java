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
public class SpecialBeef extends BurgerDecorator {
    
    public SpecialBeef(Burger newBurger)
    {
        super(newBurger);
    }
    
     public String getBasicBun(){
        return basicBurger.getBasicBun();
    }
    public String getOrigBeef(){
        return basicBurger.getOrigBeef()+ ", Special beef";
    }
    public String getKetchup(){
        return basicBurger.getKetchup();
    }
    public String getPlainLettuce(){
        return basicBurger.getPlainLettuce();
    }
    public String getDescription(){
        return basicBurger.getDescription() + ", Special Beef meat";
    }
    public double getPrice(){
        return basicBurger.getPrice() + 3.50;
    }
}
