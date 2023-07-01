
<%@page import="java.util.ArrayList"%>
<%@page import="model.* , databaseIO.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
        <html>
            <head>
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <title>New Accessory Project </title>
            </head>
            <body>
       
                    <%
                        Cart cart = (Cart) session.getAttribute("cart");
                        User user = (User)session.getAttribute("user");
                        ArrayList<Line> list = cart.getList();
                       

                   %>
                   <h1> My Project - <%=user.getUname() %> Bill </h1>
                        <table border="1"  cellpadding="5">
                            <tr>
                                <th>Ordered Quantity</th>
                                 <th>Accessory Number</th>
                                  <th>Accessory Name</th>
                                   <th>Price</th>
                                    <th>Amount</th>
                                    <tr>
                                       
                               <% for(int i=0;i<list.size();i++)
                                    {
                                        Line line = (Line) list.get(i);
                                    
                               %>
                               <tr>
                                     <td><%=line.getQ() %></td>
                                     <td><%=line.getA().getAnum()%></td>
                                       <td><%=line.getA().getAname()%></td>
                                       <td><%=line.getA().getAprice()%></td>
                                        <td><%=line.getTotal() %> KD</td>
                                       
                                    </tr>
                                <% } %>
                                <tr>
                                    <td colspan="9">
                                        <p><b>Your Total bill for <%=cart.getCount() %> Items is <%=cart.getCartTotal() %> </p>
                                    </td>
                                </tr>
                        </table>
                                    <br>
                                <form action="EgyptServlet" method="get">
                                   
                                    <input type="hidden" name="code" value="list" />
                                      <input type="submit" name="continue" value="Continue Shopping" />
                                </form>
                                
                                <a href="index.html">Home</a>
                         </body>
    
    

</html>
