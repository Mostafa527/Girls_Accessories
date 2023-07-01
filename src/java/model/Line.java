package model;

import java.io.Serializable;
import java.text.NumberFormat;

public class Line implements Serializable
{
    private Accessory a;
    private int q;
    
    public Line() {
         a = null;
         q = 0;
    }

    public Accessory getA() {
        return a;
    }

    public void setA(Accessory a) {
        this.a = a;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }
    public void incQ(){
        q++;
    }
    public void decQ(){
        if(q > 1)
            q--;
    }
    public double getTotal()
    { 
        double total = a.getAprice() * q;
        return total;
    }
    
    public String getTotalCurrencyFormat() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(this.getTotal());
    }

    @Override
    public String toString() {
        return "Line{" + "a=" + a + ", q=" + q + '}';
    }

   
     
}