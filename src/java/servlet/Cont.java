    
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
            String anum = request.getParameter("anum");
           String aname = request.getParameter("aname");
            String abrand = request.getParameter("abrand");
            String acolor = request.getParameter("acolor");
             String aquantity = request.getParameter("aquantity");
             String aprice = request.getParameter("aprice");

            HttpSession sess = request.getSession();
            if(code.equalsIgnoreCase("list")){
                ArrayList<Accessory> all = TestAccessoryDB.getDatabaseTable();
                sess.setAttribute("all", all);
                url = "/list_table.jsp";
                msg=  "listing table from database";
                sess.setAttribute("msg", msg);
            }
            else
                if(code.equalsIgnoreCase("SearchByNumber")){
                    Accessory a = TestAccessoryDB.searchAccessoryTable(Integer.parseInt(anum));
                    
                    if(a == null){
                        System.out.println("anum ="+anum+" not exist in accessory table");
                        msg = "anum ="+anum+" not exist in accessory table";
                    }
                    else{
                       System.out.println("anum ="+anum+" exist in accessory table");
                        msg = "anum ="+anum+" exist in accessory table";
                        System.out.println(a);
                        
                    }
                    url = "/Display_Accessory.jsp";
                    sess.setAttribute("msg", msg);
                    sess.setAttribute("a", a);
                    sess.setAttribute("anum", anum);
                    }
            else
                   if(code.equalsIgnoreCase("AddNewAccessory")){
                       Accessory a = new Accessory(anum,aname,abrand,acolor,aquantity,aprice);
                       int result = TestAccessoryDB.addNewAccessoryRecord(a);
                       if(result >=1){
                             System.out.println("Insert is Ok");
                             msg = "anum ="+anum+" insert accessory table OK";
                            }
                       else{
                                 System.out.println("Insert is not Ok");
                             msg = "anum ="+anum+" insert accessory table NOT OK";
                       }
                    url = "/Display_Accessory.jsp";
                    sess.setAttribute("msg", msg);
                    sess.setAttribute("a", a);
                    sess.setAttribute("anum", anum);
                   }
            else
                 if(code.equalsIgnoreCase("UpdateAccessoryRecord")){
                            Accessory a = new Accessory(anum,aname,abrand,acolor,aquantity,aprice);
                       int result = TestAccessoryDB.updateRecord(a);
                       if(result >=1){
                             System.out.println("update is Ok");
                             msg = "anum ="+anum+" update accessory table OK";
                            }
                       else{
                                 System.out.println("update is not Ok");
                             msg = "anum ="+anum+" update accessory table NOT OK";
                       }
                    url = "/Display_Accessory.jsp";
                    sess.setAttribute("msg", msg);
                    sess.setAttribute("a", a);
                    sess.setAttribute("anum", anum);
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

