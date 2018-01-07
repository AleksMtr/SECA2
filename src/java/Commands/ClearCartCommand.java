/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;

import DTO.PlainBurger;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author allen
 */
public class ClearCartCommand implements Command {
    
    public String execute(HttpServletRequest request, HttpServletResponse response)
    {
        String forwardToJsp = "/Cart.jsp"; 
        
        HttpSession session = request.getSession();
        
        ArrayList<PlainBurger> cart = (ArrayList) session.getAttribute("cart");
        
        cart.clear();
        
        session.setAttribute("cart", cart);
        
        return forwardToJsp;
    }
}
