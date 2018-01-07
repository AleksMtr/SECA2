/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;

import DAO.BurgerDAO;
import DTO.PlainBurger;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author allen
 */
public class BuyBurgerCommand implements Command {
    public String execute(HttpServletRequest request, HttpServletResponse response)
    {

        String forwardToJsp = "/Cart.jsp";
        HttpSession session = request.getSession();
        PlainBurger b;
        
        //
        String id = request.getParameter("burger_id");
        String qty = request.getParameter("qtyOrder");

        if(id != null && !qty.equalsIgnoreCase("0"))
        {
            int bID = Integer.parseInt(id);
            int quantity = Integer.parseInt(qty);
            
            ArrayList<PlainBurger> cart = (ArrayList) session.getAttribute("cart");
            
            if(cart == null)
            {
                cart = new ArrayList();
            }
            
            BurgerDAO burgerDao = new BurgerDAO("burgerdb");
            b = burgerDao.findBurgerByID(bID);
            cart.add(b);
            
            b.setPrice(b.getPrice() * quantity);

            
            session.setAttribute("cart", cart);
        }
        return forwardToJsp;
    }
}
