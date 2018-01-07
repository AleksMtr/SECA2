<%-- 
    Document   : Cart
    Created on : 06-Jan-2018, 13:29:40
    Author     : allen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DTO.PlainBurger"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Burger Cart Page</title>
    </head>
    <body>
        <h1>Cart</h1>
         <table>
            <tr>
                <%
                    ArrayList<PlainBurger> cart;
                    cart = (ArrayList) (request.getSession().getAttribute("cart"));
                    DecimalFormat df = new DecimalFormat("####0.00");
                    double totalCost = 0;
                    if (cart != null) {

                        for (PlainBurger b : cart) {
                %>
                <td>Name: <%=b.getBasicBun()%></td>
                <td>Price: <%=df.format(b.getPrice())%></td>
                <%
                            totalCost = totalCost + b.getPrice();
                        }
                    } else {
                        out.println("You have no items in your cart!!");
                    }
                %>
            </tr>

            <tr>

                <td>total Cost : <%=df.format(totalCost)%></td>
                <td colspan="2">&nbsp;</td>
                <td colspan="2"><span class="thick"></span></td>

            </tr>

            <tr>
            <form action="FrontController" method="post">
                <td colspan="2"><input type="hidden" name="action" value="clearCart"  />
                    <input type="submit" name ="prod" value="Clear Cart" /></td>
                <td colspan="5" class="checkout"><a href="#">
                        <button type="button">Buy</button></a></td>
            </form>
        </tr>
    </table>
    </body>
</html>
