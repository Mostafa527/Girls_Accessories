
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;


public class Test4 {

    public static void main(String[] args) {
           Accessory a1 = new Accessory(1234,"abc","usa","Blue",10,12.5);
        Accessory a2 = new Accessory(4567,"abc","uk","Blue",13,12.5);
        ArrayList<Accessory> al = new ArrayList<Accessory>();
        al.add(a1);al.add(a2);
        al.add(new Accessory(4444,"BBB","KSA","Red",40,6.5));
        al.add(new Accessory(5555,"AAA","UAE","Blue",30,7.5));
         al.add(new Accessory(6666,"CCC","Oman","Yellow",20,5.5));
          al.add(new Accessory(7777,"klm","Qatar","Green",22,14.0));
          
          System.out.println("******************Before Sort*********************");
          
        for(Accessory a : al)
            System.out.println(a);
        
        Accessory a3 = new Accessory(8888,"klm","Chil","Red",15,14.0);
        if(al.contains(a3))
            System.out.println("Contains"); 
        else
             System.out.println("Not Contains");
         Collections.sort(al); 
          System.out.println("******************After Sort*********************");
          for(Accessory a : al)
            System.out.println(a);

            Collections.sort(al,new SortByBrandUp());
              System.out.println("******************After Sort using  Comparator SortByBrandUp*********************");
         for(Accessory a : al)
            System.out.println(a);
          
             Collections.sort(al,new SortByBrandDn());
              System.out.println("******************After Sort using  Comparator SortByBrandDn*********************");
            for(Accessory a : al)
                System.out.println(a);
          
                Collections.sort(al,new SortByQuantityUp());
              System.out.println("******************After Sort using  Comparator SortByQuantityUp*********************");
          for(Accessory a : al)
                System.out.println(a);
          
             Collections.sort(al,new SortByQuantityDn());
              System.out.println("******************After Sort using  Comparator SortByQuantityDn*********************");
           for(Accessory a : al)
                System.out.println(a);
          
         
              System.out.println("******************compareTo*********************");
              TreeSet<Accessory> ts1 = new TreeSet<Accessory>();
              ts1.addAll(al);
         for(Accessory a : ts1)
                System.out.println(a);
          
                 System.out.println("******************Comparator*********************");
              TreeSet<Accessory> ts2 = new TreeSet<Accessory>(new SortByBrandUp());
              ts2.addAll(al);
          for(Accessory a : ts2)
            System.out.println(a);

    }
    
}
