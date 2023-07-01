
package databaseIO;

import  databaseIO.TestAccessoryDB;
import model.*;



public class Test {

    public static void main(String[] args) {
      int num = 255;
         String name = "Brazilian accessory";
         String brand = "Brazilian";
         String color = "Red";
         double quantity =3.88;
         double price = 8.8800;
             String cm = ",";
            String sq = "'";
              String sqlst=  "insert into accessoryTB values("+num+cm+sq+name+sq+cm+sq+brand+sq
                           +cm+sq+color+sq+cm+quantity+cm+price+")";
               
               
               
                     
          int accessoryNumber = 333;
         Accessory acc = TestAccessoryDB.searchAccessoryTable(accessoryNumber);
         if(acc == null)
             System.out.println("anum ="+accessoryNumber+" not exist in accessory table");
         else{
             acc.setAquantity(20);
             acc.setAprice(7.500);
             int result2 = TestAccessoryDB.updateRecord(acc);
             if(result2 >=1)
                 System.out.println("Update OK");
             else
                 System.out.println("Update Not OK");
                }
                 String sqlst2=  "update accessoryTB set aname= "+sq+acc.getAname()+sq+cm+" abrand= "+sq+acc.getAbrand()+sq+cm
                    +" acolor= "+sq+acc.getAcolor()+sq+cm+" aquantity= "+acc.getAquantity()+cm+" aprice= "+acc.getAprice()+
                    " where anum = "+acc.getAnum();
            System.out.println(sqlst2);
    }
    
}
