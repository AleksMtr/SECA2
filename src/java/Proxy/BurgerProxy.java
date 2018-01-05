package Proxy;

import DTO.PlainBurger;
import DAO.BurgerDAO;
import DAO.BurgerDAOInterface;
import java.util.ArrayList;

public class BurgerProxy implements BurgerDAOInterface{
    
    private BurgerDAO bDao;
    @Override
    public ArrayList<PlainBurger> viewAllBurgers() {
        ArrayList<PlainBurger> allBurgers = bDao.viewAllBurgers();
        return allBurgers;
    }
    
    @Override
    public boolean createBurger(String basicBun, String origBeef, String ketchup, String plainLettuce, String description, double price) {
        boolean burger = bDao.createBurger(basicBun, origBeef, ketchup, plainLettuce, description, price);
        return burger;
    }
    
    
}
