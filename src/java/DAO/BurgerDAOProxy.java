/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.PlainBurger;

import java.util.ArrayList;

public class BurgerDAOProxy implements BurgerDAOInterface {

    private BurgerDAO bDao;
    private static volatile BurgerDAOProxy singleProxyInstance;

    public static BurgerDAOProxy getInstance() {
        if (singleProxyInstance == null) {
            synchronized (BurgerDAOProxy.class) {
                if (singleProxyInstance == null) {
                    singleProxyInstance = new BurgerDAOProxy();
                }
            }
        }
        return singleProxyInstance;
    }

    public BurgerDAOProxy()
    {
        bDao = new BurgerDAO("burgerdb");
    }
    
    @Override
    public ArrayList<PlainBurger> viewAllBurgers() {
        ArrayList<PlainBurger> allBurgers = bDao.viewAllBurgers();
        if (allBurgers.isEmpty()) {
            return null;
        } else {
            return allBurgers;
        }
    }

    @Override
    public boolean createBurger(String basicBun, String origBeef, String ketchup, String plainLettuce, String description, double price) {
        boolean burger = bDao.createBurger(basicBun, origBeef, ketchup, plainLettuce, description, price);
        return burger;
    }
    @Override
    public PlainBurger findBurgerByID(int burger_id) {
        if (burger_id != 0) {
            getInstance();
            PlainBurger burgerId = bDao.findBurgerByID(burger_id);
            return burgerId;
        } else {
            return null;
        }
    }
    @Override
    public boolean OrderBurger(int orderNumber, int burger_id, int quantity_ordered) {
        boolean ordBurger = bDao.OrderBurger(orderNumber, burger_id, quantity_ordered);
        return ordBurger;
    }

}
