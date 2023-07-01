package model;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.ArrayList;

public class Cart implements Serializable {
    private ArrayList<Line> list;
    
    public Cart(){
        list = new ArrayList<Line>();
    }
    public ArrayList<Line> getList() { 
        return list;
    }
    public int getCount() { 
        return list.size();
    }
    
    public void addLine(Line line) {
        int anum = line.getA().getAnum();
        int quantity = line.getQ();
        for(Line ln : list){
            if(ln.getA().getAnum() == anum){
                ln.incQ();
                return;
            }
        }
        System.out.println("addline="+line);
        list.add(line);
        line.setQ(1);
    }
    public void increamentQuantity(int anum) {
        for(Line ln : list){
            if(ln.getA().getAnum() == anum )
                ln.incQ();
        }
    }
    public void decreamentQuantity(int anum)
    {
        for(Line ln : list){
            if(ln.getA().getAnum() == anum )
                ln.decQ();
        }
    }
    
    public void removeC(int anum)
    {
        for(Line ln : list){
            if(ln.getA().getAnum() == anum ){
                list.remove(ln);
                return;
            }
        }
    }
    public double getCartTotal()
    { 
        double total = 0;
        for (int i = 0; i < list.size(); i++) {
            total+=list.get(i).getTotal();
            
        }
        return total;
    }
    public int getCartTotalQuantity()
    { 
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            total+=list.get(i).getQ();
        }
        return total;
    }
    
    public String getCartTotalCurrencyFormat()
    {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(this.getCartTotal());
    }
    
    
    @Override
    public String toString() {
        return "Cart{" + "list=" + list + '}';
    }
    
}