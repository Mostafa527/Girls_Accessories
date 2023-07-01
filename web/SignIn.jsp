
<%@page import="java.util.ArrayList"%>
<%@page import="model.* , databaseIO.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Project</title>
    </head>
    <body>
       
        <%
            HttpSession sess = request.getSession();
            User user = (User) sess.getAttribute("user");
            if(user==null)
                user = new User();
            String msg = (String) sess.getAttribute("msg");
            
       %>
         <form action="EgyptServlet" method="get">
             <table  cellspacing="5" border="1">
                     <tr><td align="right">User Name:</td><td><input type="text" name="uname" value="" required /></td></tr>
                      <tr><td align="right">User Password:</td><td><input type="password" name="upass"  value="" required /></td></tr>
                      <tr><td colspan ="2">
                        <input type="submit" name="code" value="SignIn" />
                        <input type="submit" name="code" value="SignUp" />
                      </tr>
             </table>
         </form><br>
         
             <form action="EgyptServlet" method="get">
            
                       <input type="hidden" name="op" value="list" />
                       <input type="submit"  value="Continue Shopping" />
                     
            
         </form><br>
         <br>
                   
    </body>
    
    

</html>
