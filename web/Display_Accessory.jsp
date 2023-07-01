
<%@page import="java.util.ArrayList"%>
<%@page import="model.* , databaseIO.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Girls Accessories Project</title>
    </head>
            <body>

                    <%
                        HttpSession sess = request.getSession();
                        Accessory a =(Accessory) sess.getAttribute("a");
                         String msg =(String) sess.getAttribute("msg");
                          String anum  =(String) sess.getAttribute("anum");

                   %>
               <h1> Search result from Database(AccessoryDB) </h1>
               <h1><%=msg%></h1>
               <% if (a!=null) { %>
                 <form action="EgyptServlet" method="get">
                       <table border="1" width="3" cellspacing="3" cellpadding="3">
                           <tr><td>Accessory Number:</td><td><input type="text" name="anum" value="<%= a.getAnum() %>" readonly /></td></tr>
                           <tr><td>Accessory Name:</td><td><input type="text" name="aname" value="<%= a.getAname() %>" required /></td></tr>
                              <tr><td>Accessory Brand:</td><td><input type="text" name="abrand" value="<%= a.getAbrand()%>" required /></td></tr>
                           <tr><td>Accessory Color:</td><td><input type="text" name="acolor" value="<%= a.getAcolor() %>" required /></td></tr>
                              <tr><td>Accessory Quantity:</td><td><input type="text" name="aquantity" value="<%= a.getAquantity()%>" required /></td></tr>
                           <tr><td>Accessory Price:</td><td><input type="text" name="aprice"   value="<%= a.getAprice()%>" required /></td></tr>
                           <td colspan="2" ><img src=<%= "pics/"+a.getAnum()+".jpg" %> width="250" height="100" onerror="this.src='pics/accessory.jpg';"/></td>

                       </table><br>
                       <input type="submit" name="code" value="UpdateAccessoryRecord" />
                       <input type="submit" name="code" value="DeleteAccessoryRecord" />
                   </form>
                       <br>
                       <% } else {%>
                   <form action="EgyptServlet" method="get">
                       <table border="1" width="3" cellspacing="3" cellpadding="3">
                           <tr><td>Accessory Number:</td><td><input type="text" name="anum" value="<%=anum%>" readonly /></td></tr>
                           <tr><td>Accessory Name:</td><td><input type="text" name="aname"  required /></td></tr>
                              <tr><td>Accessory Brand:</td><td><input type="text" name="abrand" value="Kuwait Brand" required /></td></tr>
                           <tr><td>Accessory Color:</td><td><input type="text" name="acolor" value="Red" required /></td></tr>
                              <tr><td>Accessory Quantity:</td><td><input type="text" name="aquantity"  required /></td></tr>
                           <tr><td>Accessory Price:</td><td><input type="text" name="aprice"  required /></td></tr>
                       </table><br>
                       <input type="submit" name="code" value="AddNewAccessory" />
                   </form>
                           <% } %><br>

                   <a href ="index.html"> Home </a></div>
            </body>
            
</html>
