/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;

import DAO.BurgerDAOProxy;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CreateBurgerCommand implements Command {
    
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String forwardToJsp;
        
        //calls the user service class...
        BurgerDAOProxy bDao = new BurgerDAOProxy();
        Boolean check;
        
        //parameters entered by the user to register...
        String bun = request.getParameter("basicBun");
        String meat = request.getParameter("origBeef");
        String sauce = request.getParameter("ketchup");
        String salad = request.getParameter("plainLettuce");
        String desc = request.getParameter("description");
        Double price = Double.parseDouble(request.getParameter("price"));
        
        //checks if parameters aren't null and not empty...
        if (bun != null && meat != null && sauce != null && salad != null && desc != null && price != null
                 && !bun.isEmpty() && !meat.isEmpty() && !sauce.isEmpty() && !salad.isEmpty() && !desc.isEmpty() && price != 0) {
            
            //register method from the user service is stored in the boolean variable called "check"...
            check = bDao.createBurger(bun, meat, sauce, salad, desc, price);
            
            //if true
            if (check == true) {
                
                //then forward to the registration success jsp...
                forwardToJsp = "/CreateBurgerSuccess.jsp";
            } else {
                //if fail, forward to registration fail jsp...
                forwardToJsp = "/CreateBurgerFail.jsp";
            }
        } else {
            //if parameters are null and empty then forward to registration fail jsp...
            forwardToJsp = "/CreateBurgerFail.jsp";
        }

        return forwardToJsp;

    }
}
