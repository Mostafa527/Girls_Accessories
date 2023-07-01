
package model;


public class Test {

    public static void main(String[] args) {
        String s1="A";
        String s2="abc";
        if(s1==s2)
            System.out.println("s1 is Equal to s2 ");
        else
              System.out.println("s1 is Not Equal to s2");
        
        String s3 = new String("Ali");
        String s4 = new String("Ah");
        if(s3.equals(s4))
              System.out.println("s3 is Equal to s4");
          else
              System.out.println("s3 is Not Equal to s4");
        Accessory a1 = new Accessory(1234,"abc","usa","Blue",10,12.5);
        Accessory a2 = new Accessory(4567,"abc","uk","Blue",13,12.5);
         if(a1.equals(a2))
              System.out.println("a1 is Equal to a2");
          else
              System.out.println("a1 is Not Equal to a2 ");
        
        Double d1 = 10.0;
        System.out.println(d1.hashCode());
        double n1 = 10.0;
       Double n2 = new Double(n1);
       System.out.println(n2.hashCode());
         System.out.println(a1.hashCode());
         System.out.println(a2.hashCode());
        
       String k1 = new String("Ahamd");
        String k2 = new String("Abdulla");
        if(k1.compareTo(k2)>0)
              System.out.println("k1 is greater than k2");
        else{
            if(k1.compareTo(k2)<0)
                    System.out.println("k1 is smaller than k2");
            else
              System.out.println("K1 is equal to K2");
        }
      
        
    }
    
}
