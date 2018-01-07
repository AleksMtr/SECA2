/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;

import DTO.PlainBurger;
import DAO.BurgerDAOProxy;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author allen
 */
public class ViewAllBurgers implements Command {
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String forwardToJsp;
        HttpSession session = request.getSession();
    BurgerDAOProxy bDao = new BurgerDAOProxy();
        
        //calls the method to view all products...
        ArrayList<PlainBurger> plainBurger = bDao.viewAllBurgers();

        //set the session...
        session.setAttribute("plainBurger", plainBurger);
        //forward to product jsp page...
        forwardToJsp = "/ViewBurger.jsp";

        return forwardToJsp;
    }
}
