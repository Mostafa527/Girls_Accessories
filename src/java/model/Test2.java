
package model;


public class Test2 {

    public static void main(String[] args) {
        Accessory a1 = new Accessory(1234,"abc","usa","Blue",10,12.5);
        Accessory a2 = new Accessory(4567,"abc","uk","Blue",13,13.5);
        if(a1.compareTo(a2)>0)
            System.out.println("a1 is greater than a2");
        else{
             if(a1.compareTo(a2)<0)
                System.out.println("a1 is smaller than a2");
             else
                  System.out.println("a1 equal to a2");
        
        }
        
      
        
    }
    
}
