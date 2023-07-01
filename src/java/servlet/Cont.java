    
package servlet;

import databaseIO.TestAccessoryDB;
import static databaseIO.TestAccessoryDB.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Accessory;



public class Cont extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
            String url = "";
            String msg = "";
            String code = request.getParameter("code");

            HttpSession sess = request.getSession();
            if(code.equalsIgnoreCase("list")){
                ArrayList<Accessory> all = TestAccessoryDB.getDatabaseTable();
                sess.setAttribute("all", all);
                url = "/list_table.jsp";
                msg=  "listing table from database";
                sess.setAttribute("msg", msg);
            }
         
                     
            this.getServletContext().getRequestDispatcher(url).forward(request, response);
        }
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

