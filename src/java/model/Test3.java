
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;


public class Test3 {

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
          
          HashSet<Accessory> hs = new HashSet<Accessory>();
          //hs.add(c1);
          //hs.add(c2);
          System.out.println("******************hs*********************");
          hs.addAll(al); 
          for(Accessory a: hs)
               System.out.println(a); 
          
           System.out.println("******************ts*********************");
            TreeSet<Accessory> ts = new TreeSet<Accessory>();
            ts.addAll(al); 
          for(Accessory a : ts)
               System.out.println(a);
          
          HashMap<Integer,String> hm = new HashMap<Integer,String>();
          for(Accessory a : al)
              hm.put(a.anum, a.aname);
          
          System.out.println(hm);
          for(Integer i : hm.keySet())
              System.out.println("key="+i+" Value="+hm.get(i));
          
               Accessory a8 = new Accessory(4567,"klm","usa","Blue",10,14.0);
                Accessory a9 = new Accessory(1234,"abc","uk","Red",13,12.7);
              HashMap <String,Double> hmemp = new HashMap<String,Double>();
        for(Accessory acc : al)
            hmemp.put(acc.abrand, acc.aprice);
       
        for(String key : hmemp.keySet())
            System.out.println("key="+key+" "+hmemp.get(key));
          

    }
    
}
