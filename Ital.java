/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package italsim;

/**
 *
 * @author bodnart
 */
public class Ital {
    String nev;
    double tomenyseg;
    double mennyiseg;
    
    public Ital() {
    }
    public Ital(String nev, double tomenyseg, double mennyiseg) {
        this.nev = nev;
        this.tomenyseg = tomenyseg;
        this.mennyiseg = mennyiseg;
    }
    
    public double getAlkoholGramm(){
        double alkoholGramm = (mennyiseg * 1000) * (tomenyseg / 100) * 0.8;
        return alkoholGramm;
    }
    public void kiirItal(){
        System.out.println(nev + ".");
    }
    
}
