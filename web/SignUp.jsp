
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
        <h1>User Sign Up-Enter User Information Then , click on the SignUp button.</h1>
         <form action="EgyptServlet" method="get">
             <table  cellspacing="5" border="0">
                     <tr><td align="right">User Id:</td><td><input type="number" name="uid" required /></td></tr>
                      <tr><td align="right">User Name:</td><td><input type="text" name="uname"   required /></td></tr>
                      <tr><td align="right">User Password:</td><td><input type="text" name="upass"   required /></td></tr>
                     <tr><td align="right">User Email:</td><td><input type="email" name="uemail"   required /></td></tr>
                     <tr><td><input type="submit" name="code" value="SignUp"></td></tr>
             </table>
         </form>

        <a href="index.html"> Home</a>
                   
    </body>
    
    

</html>
