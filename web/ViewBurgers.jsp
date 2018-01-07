<%-- 
    Document   : ViewBurgers
    Created on : 05-Jan-2018, 14:37:17
    Author     : allen
--%>
<%@page import="DTO.PlainBurger"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Available Burgers</title>
    </head>
    <body>
        <h1>Burger List</h1>
        <ul>
            <%
                ArrayList<PlainBurger> burg;
                burg = (ArrayList) (request.getSession().getAttribute("plainBurger"));

                if (burg != null) {

                    for (PlainBurger b : burg) {

            %>

            <li>
                
                <h4>Bun: <%=b.getBasicBun()%></h4>
                <h4>Meat: <%=b.getOrigBeef()%></h4>
                <h4>Sauce: <%=b.getKetchup()%></h4>
                <h4>Salad: <%=b.getPlainLettuce()%></h4>
                <h4>Description: <%=b.getDescription()%></h4>
                <h4>Price: <%=b.getPrice()%></h4> 

                <form action="FrontController" method="post">

                    <input type="hidden" name="action" value="buyBurger"  />
                    <input type="hidden" name="burger_id" value="<%=b.getBurger_id()%>"/>
                    <select name = "quantity" onmouseup="if (this.options.length > 4) {
                                            this.size = 4;
                                        }" onchange='this.size = 0;'>
                        <option value="0">Qty</option>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                        <option value="6">6</option>
                        <option value="7">7</option>
                        <option value="8">8</option>
                        <option value="9">9</option>
                        <option value="10">10</option>
                    </select>
                    <input type="submit" name ="burger" value="Add to Cart">

                </form>


            </li>
            <%
                    }
                } else {
                    out.println("No products where found!");

                }
            %>
        </ul>
    </body>
</html>
