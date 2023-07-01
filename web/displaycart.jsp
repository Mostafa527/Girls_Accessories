
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Java Project JSP and Servlets</title>
    </head>
    <body>
     <%@ page import="model.* , databaseIO.* , java.util.ArrayList" %>
       
        <%
            Cart cart = (Cart) session.getAttribute("cart");
            ArrayList<Line> cartlist= cart.getList();
           
          
       %>
       
      
         
       <table border="1" cellpadding="5">
          
               <tr>
                   <th>Accessory Number</th><th>Accessory Name</th><th>Brand</th>
                   <th>Price</th><th>Line Quantity</th>
                   <th>Line Total</th><th>Picture</th>
               </tr>
      
           
               <% 
                   for (Line ln : cartlist) {
                %>
               <tr>
                   <td><%=ln.getA().getAnum()%></td>
                   <td><%=ln.getA().getAname()%></td>
                   <td><%=ln.getA().getAbrand()%></td> 
                   <td><%=ln.getA().getAprice()%></td>
                   <td><%=ln.getQ()%></td>
                   <td><%=ln.getTotal()%> KD</td>
                   <td><img src=<%= "pics/"+ln.getA().getAnum()+".jpg" %> width="100" height="100" onerror="this.src='pics/accessory.jpg';"/><br>
                       <br><form action="EgyptServlet" method="get">
                           
                          <input type="hidden" name="anum" value="<%=ln.getA().getAnum() %>">
                        <input type="hidden" size=2 name="aquantity" value="<%=ln.getQ()%>">
                        <input type="submit"  name="code" value="+">   
                          <input type="submit"  name="code" value="-">   
                        <input type="submit"  name="code" value="x">   
                       </form>
                       
               </tr>
               <% } %>
               <tr>
                   <td colspan="7">
                       <p>Grand total is : <%=cart.getCartTotalCurrencyFormat() %> KD </p>
                       <p><b>To increment quantity press + , to decrement quantity press - and to
                               remove item from cart press X</b>,
                       </p>
                   </td>
               </tr>
                </table>
                       <br>
                       
                       <form action="EgyptServlet" method="get">
                              <input type="hidden" name="code" value="list">
                              <input type="submit"  value="Continue Shopping">                            
                       
                          </form><br>
                           <form action="EgyptServlet" method="get">
                             
                              <input type="submit"  name="code" value="CheckOut">                            
                       
                          </form>
                            </body>
                        </html>
                    