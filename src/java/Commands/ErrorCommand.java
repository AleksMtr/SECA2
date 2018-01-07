/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author allen
 */
public class ErrorCommand implements Command {
    
    public String execute(HttpServletRequest request, HttpServletResponse response)
    {
        //if an error occurs, it brings the user to the homepage, "index.html"...
        return "/index.html";
    }
    
}
