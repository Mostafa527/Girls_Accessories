
<%@page import="java.util.ArrayList"%>
<%@page import="model.* , databaseIO.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Accessories Project</title>
    </head>
    <body>
       
        <%
            HttpSession sess = request.getSession();
            ArrayList<Accessory> al = (ArrayList<Accessory>) sess.getAttribute("all");
            String msg = (String) sess.getAttribute("msg");
            
       %>
    
       
      
       <table border="2" width="5" cellspacing="5" cellpadding="5">
           <thead>
               <tr>
                   <th>Accessory Number</th><th>Accessory Name</th><th>Brand</th>
                   <th>Color</th><th>Quantity</th><th>Price</th><th>Picture</th>
               </tr>
           </thead>
           <tbody>
               <% for (int i=0;i<al.size();i++){ %>
               <tr>
                   <td><%=al.get(i).getAnum()%></td><td><%=al.get(i).getAname()%></td>
                   <td><%=al.get(i).getAbrand()%></td> <td><%=al.get(i).getAcolor()%></td>
                   <td><%=al.get(i).getAquantity()%></td> <td><%=al.get(i).getAprice()%></td>
                   <td><img src=<%= "pics/"+al.get(i).getAnum()+".jpg" %> width="100" height="100" onerror="this.src='pics/accessory.jpg';"/>
                          <form action="EgyptServlet" method="get">
                              <input type="hidden" name="anum" value=<%=al.get(i).getAnum() %> ><br>
                              <input type="submit" name="code" value="AddToCart"><br>                              
                       
                          </form><br>
                           </td>
               </tr>
               <% } %>
           </tbody>
       </table>
           <a href ="index.html"> Home </a></div>
    </body>
    
    

</html>
