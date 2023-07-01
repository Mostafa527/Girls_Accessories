
package model;

import java.util.Objects;
import java.util.Comparator;

public class Accessory implements Comparable<Accessory>{
    int anum;
    String aname,abrand,acolor;
    double aquantity,aprice;

    public Accessory() {
    }

    public Accessory(int anum, String aname, String abrand, String acolor, double aquantity, double aprice) {
        this.anum = anum;
        this.aname = aname;
        this.abrand = abrand;
        this.acolor = acolor;
        this.aquantity = aquantity;
        this.aprice = aprice;
    }
       public Accessory(String anum, String aname, String abrand, String acolor, String aquantity, String aprice) {
        this.anum = Integer.parseInt(anum);
        this.aname = aname;
        this.abrand = abrand;
        this.acolor = acolor;
        this.aquantity = Double.parseDouble(aquantity);
        this.aprice = Double.parseDouble(aprice);
    }

    public int getAnum() {
        return anum;
    }

    public void setAnum(int anum) {
        this.anum = anum;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAbrand() {
        return abrand;
    }

    public void setAbrand(String abrand) {
        this.abrand = abrand;
    }

    public String getAcolor() {
        return acolor;
    }

    public void setAcolor(String acolor) {
        this.acolor = acolor;
    }

    public double getAquantity() {
        return aquantity;
    }

    public void setAquantity(double aquantity) {
        this.aquantity = aquantity;
    }

    public double getAprice() {
        return aprice;
    }

    public void setAprice(double aprice) {
        this.aprice = aprice;
    }

    @Override
    public String toString() {
        return "Accessory{" + "anum=" + anum + ", aname=" + aname + ", abrand=" + abrand + ", acolor=" + acolor + ", aquantity=" + aquantity + ", aprice=" + aprice + '}';
    }
    
    

    @Override
    public int hashCode() {
       Double p = new Double(aprice);
       return aname.hashCode() + p.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Accessory)) {
            return false;
        }
        final Accessory a2 = (Accessory) obj;
        if(this.aname.equals(a2.aname)&&this.aprice == a2.aprice)
            return true;
        else
            return false;
    }

    @Override
    public int compareTo(Accessory a) {
        Double p1 = this.aprice;
        Double p2 = a.aprice;
        return p2.compareTo(p1);
//         return this.cname.compareTo(c.cname);
//            Integer n1= this.cnum;
//            Integer n2 = c.cnum;
//            return n1.compareTo(n2);
    }
    
 
}
class SortByBrandUp implements Comparator<Accessory>{

    @Override
    public int compare(Accessory a1,Accessory a2) {
        return a1.abrand.compareTo(a2.abrand);
    }


}
class SortByBrandDn implements Comparator<Accessory>{

    @Override
    public int compare(Accessory a1,Accessory a2) {
        return a2.abrand.compareTo(a1.abrand);
    }

}

class SortByQuantityUp implements Comparator<Accessory>{

    @Override
    public int compare(Accessory a1,Accessory a2) {
        Double q1=a1.aquantity;
         Double q2=a2.aquantity;
        return q1.compareTo(q2);
    }


}
class SortByQuantityDn implements Comparator<Accessory>{

    @Override
    public int compare(Accessory a1,Accessory a2) {
            Double q1=a1.aquantity;
         Double q2=a2.aquantity;
        return q2.compareTo(q1);
    }

}
