/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package italsim;

import java.text.DecimalFormat;

/**
 *
 * @author bodnart
 */
public class Ember {
    String nev;
    int tomeg;
    double alkoholGramm;
    
    public Ember(){
            
    }

    public Ember(String nev, int tomeg, double alkoholGramm) {
        this.nev = nev;
        this.tomeg = tomeg;
        this.alkoholGramm = alkoholGramm;
    }
    public void megissza( Ital ital){
        alkoholGramm = alkoholGramm + ital.getAlkoholGramm();
        
    }
    public String getVeralkoholEzrelek(){
        double veralkoholEzrelek = (alkoholGramm / tomeg);
        if (veralkoholEzrelek < 0){
            veralkoholEzrelek = 0;
        }
        DecimalFormat df = new DecimalFormat("#0.000");
        return df.format(veralkoholEzrelek);
    }
    public double getJozanido(){
        double jozanIdo = alkoholGramm / 9;
        return jozanIdo;
    }
    public void piheno(double ora){
        alkoholGramm = alkoholGramm - (ora * 9); 
   
    }
    public void kiirNev(){
        System.out.print(nev + " ");
    }
    public void kiirAlkoholSzint(){
        System.out.println("alkoholszintje: " + getVeralkoholEzrelek());
    }
}
