<%-- 
    Document   : CreateBurger
    Created on : 05-Jan-2018, 14:36:57
    Author     : allen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create your Basic Burger</title>
    </head>
    <body>
        <header>

        </header>

        <div class="CreateBurger">
            <h1>Create Burger</h1>
            <form action="FrontController" method="post">
                <table>
                    <tr>
                        <td> Bun Type : </td><td> <input name="basicBun" size=15 type="text" required placeholder="Enter bun type" /> </td> 
                    </tr>
                    <tr>
                        <td> Meat  : </td><td> <input name="origBeef" size=15 type="text" required placeholder="Enter meat type" /> </td> 
                    </tr>
                    <tr>
                        <td> Sauce : </td><td> <input name="ketchup" size=15 type="text" required placeholder="Enter Ketchup" /> </td> 
                    </tr>
                    <tr>
                        <td> Salad  : </td><td> <input name="plainLettuce" size=15 type="text" required placeholder="Enter Salad type"/> </td> 
                    </tr>
                    <tr>
                        <td> Description  : </td><td> <input name="description" size=15 type="text" required placeholder="Burger Description"/> </td> 
                    </tr>
                    <tr>
                        <td> Price  : </td><td> <input name="price" size=15 type="text" required placeholder="Burger Price"/> </td> 
                    </tr>
                </table>

                <input type="hidden" name="action" value="create" />
                <input type="submit" value="Post" />

            </form>

        </div>
    </body>
</html>
