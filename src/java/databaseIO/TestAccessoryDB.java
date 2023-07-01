
package databaseIO;
import java.sql.*;
import java.util.ArrayList;
import java.sql.DriverManager;
import model.*;

public class TestAccessoryDB {
    public static Connection getConnection(){
    Connection conn = null;
    try{
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/accessoryDB","root","42105518");
       
    }catch(SQLException e){
        for(Throwable t : e){t.printStackTrace();}
    }
    return conn;
    }
      public static ArrayList getDatabaseTable(){
            ArrayList al = null;
            try{
                Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            String sqlst=  "select * from accessoryTB";
            ResultSet result = stmt.executeQuery(sqlst);
            al = new ArrayList();
              while(result.next()){
               al.add(new Accessory(result.getString("anum"),result.getString("aname"),result.getString("abrand"),result.getString("acolor")
                        ,result.getString("aquantity"),result.getString("aprice"))
                        
                        );
            }
           stmt.close();
            conn.close();
            }
             catch(SQLException e){
        for(Throwable t : e){t.printStackTrace();}
        
         }
            return al;
        }
    public static void select_table(){
         try{
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            String sqlst = "select * from accessoryTB";
            ResultSet result = stmt.executeQuery(sqlst);
            while(result.next()){
                System.out.println("num= "+result.getString("anum")+" name= "+result.getString("aname")+
                        " brand ="+result.getString("abrand")+" color= "+result.getString("acolor")+
                        " quantity ="+result.getString("aquantity")+" price= "+result.getString("aprice")
                        
                        );
            }
            System.out.println("*************************");
            stmt.close();
            conn.close();
        }
        catch(SQLException e){
        for(Throwable t : e){t.printStackTrace();}
        
         }
    }
    
        public static int  addNewAccessoryRecord(Accessory a){
        
             int result=0;
            try{
                Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            String cm = ",";
            String sq = "'";
           
            String sqlst=  "insert into accessoryTB values("+a.getAnum()+cm+sq+a.getAname()+sq+cm+sq+a.getAbrand()+sq
                    +cm+sq+a.getAcolor()+sq+cm+a.getAquantity()+cm+a.getAprice()+")";
             result = stmt.executeUpdate(sqlst);
             if(result==1){
                 System.out.println("Insert data succ");
             }
             else{
                 System.out.println("Problem With Insert data");
             }
             
            
           stmt.close();
            conn.close();
            }
             catch(SQLException e){
        for(Throwable t : e){t.printStackTrace();}
        
         }
            return result;
        }
      
        public static Accessory searchAccessoryTable(int aN){
            Accessory a = null;
            try{
                Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            String sqlst=  "select * from accessoryTB where anum = "+aN;
            ResultSet result = stmt.executeQuery(sqlst);
          
              while(result.next()){
                 a = new Accessory(result.getString("anum"),result.getString("aname"),result.getString("abrand"),result.getString("acolor")
                        ,result.getString("aquantity"),result.getString("aprice")
                        
                        );
            }
           stmt.close();
            conn.close();
            }
             catch(SQLException e){
        for(Throwable t : e){t.printStackTrace();}
        
         }
            return a;
        }
        
       public static int  updateRecord(Accessory a){
  
             int result=0;
            try{
                Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            String cm = ",";
            String sq = "'";
            String sqlst=  "update accessoryTB set aname= "+sq+a.getAname()+sq+cm+" abrand= "+sq+a.getAbrand()+sq+cm
                    +" acolor= "+sq+a.getAcolor()+sq+cm+" aquantity= "+a.getAquantity()+cm+" aprice= "+a.getAprice()+
                    " where anum = "+a.getAnum();
             result = stmt.executeUpdate(sqlst);
             if(result>=1){
                 System.out.println("update data succ");
             }
             else{
                 System.out.println("Problem With update data");
             }
             
            
           stmt.close();
            conn.close();
            }
             catch(SQLException e){
        for(Throwable t : e){t.printStackTrace();}
        
         }
            return result;
        }
       
       
       public static int  deleteRecord(Accessory a){
     
             int result=0;
            try{
                Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            String cm = ",";
            String sq = "'";
            String sqlst=  "delete from accessoryTB where anum = "+a.getAnum();
             result = stmt.executeUpdate(sqlst);
             if(result>=1){
                 System.out.println("delete data succ");
             }
             else{
                 System.out.println("Problem With delete data");
             }
             
            
           stmt.close();
            conn.close();
            }
             catch(SQLException e){
        for(Throwable t : e){t.printStackTrace();}
        
         }
                return result;
        }

    
        
        
    public static void main(String[] args){
        select_table();
        ArrayList<Accessory> all = new ArrayList<Accessory>();
        all = getDatabaseTable();

      
         
         int accessoryNumber = 1166;
         Accessory accessory2 = searchAccessoryTable(accessoryNumber);
         if(accessory2 == null)
             System.out.println("anum ="+accessoryNumber+" not exist in accessory table");
         else{
              System.out.println("anum ="+accessoryNumber+"  exist in accessory table");
             System.out.println(accessory2);
                }
         
         
          accessoryNumber = 333;
         accessory2 = searchAccessoryTable(accessoryNumber);
         if(accessory2 == null)
             System.out.println("anum ="+accessoryNumber+" not exist in accessory table");
         else{
             accessory2.setAquantity(15);
             accessory2.setAprice(6.500);
             int result2 = updateRecord(accessory2);
             if(result2 >=1)
                 System.out.println("Update OK");
             else
                 System.out.println("Update Not OK");
                }
         
         
             accessoryNumber = 1188;
         accessory2 = searchAccessoryTable(accessoryNumber);
         if(accessory2 == null)
             System.out.println("anum ="+accessoryNumber+" not exist in accessory table");
         else{
            
             int result3 = deleteRecord(accessory2);
             if(result3 >=1)
                 System.out.println("delete is OK");
             else
                 System.out.println("delete is Not OK");
                }
    }
}
