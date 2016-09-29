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
public class ItalSim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ember[] emberek = new Ember[5];
        emberek[0] = new Ember("Fafejű", 95, 0);
        emberek[1] = new Ember("Buda", 120, 13);
        emberek[2] = new Ember("Emma", 45, 9);
        emberek[3] = new Ember("Bobóka", 48, 0);
        emberek[4] = new Ember("Renátó", 68, 34);
        
        Ital[] italok = new Ital[5];
        italok[0] = new Ital("Söröcske", 4, 0.5);
        italok[1] = new Ital("Viszkikóla", 8, 0.2);
        italok[2] = new Ital("Borocska", 12, 0.2);
        italok[3] = new Ital("Diana sósborszesz", 40, 0.01);
        italok[4] = new Ital("Pálinka", 55, 0.05);
        for(int i =0; i < emberek.length; i++){
            emberek[i].kiirNev();
            emberek[i].kiirAlkoholSzint();
        }
       
        System.out.println("Mindenki iszik egy Welcome páleszt!");
        for(int i = 0; i < emberek.length; i++){
            
            emberek[i].megissza(italok[4]);
            emberek[i].megissza(italok[0]);
            emberek[i].getVeralkoholEzrelek();
            emberek[i].kiirNev();
            emberek[i].kiirAlkoholSzint();

        }
        
       
        emberek[3].kiirNev();System.out.print("ezt iszik: ");italok[3].kiirItal();
        emberek[3].megissza(italok[3]);
        emberek[1].kiirNev();System.out.print("ezt iszik: ");italok[0].kiirItal();
        emberek[1].megissza(italok[0]);
        emberek[4].kiirNev();System.out.print("ezt iszik: ");italok[2].kiirItal();
        emberek[4].megissza(italok[2]);
        emberek[0].kiirNev();System.out.print("ezt iszik: ");italok[1].kiirItal();
        emberek[0].megissza(italok[1]);
        emberek[2].kiirNev();System.out.print("ezt iszik: ");italok[4].kiirItal();
        emberek[2].megissza(italok[4]);
        
        for(int i = 0; i < emberek.length; i++){
            emberek[i].getVeralkoholEzrelek();
            emberek[i].kiirNev();
            emberek[i].kiirAlkoholSzint();
        }
        System.out.println("Egy fél órát pihentek");
        for(int i = 0; i < emberek.length; i++){
            emberek[i].piheno(0.5);
            emberek[i].getVeralkoholEzrelek();
            emberek[i].kiirNev();
            emberek[i].kiirAlkoholSzint();
        }
        System.out.println("Ki vezethet haza és hány óra múlva?");
       
            double temp = Double.MAX_VALUE;
            int j = 0;
        for(int i = 0; i < emberek.length; i++){
            emberek[i].getVeralkoholEzrelek();
            emberek[i].kiirNev();
            emberek[i].kiirAlkoholSzint();
            System.out.println("Ennyi idő alatt józanodik ki: " + emberek[i].getJozanido());
            if (temp > emberek[i].getJozanido()){
               temp = emberek[i].getJozanido(); 
               j = i;
            }
        }
            DecimalFormat df = new DecimalFormat("#0.00");
            System.out.print(df.format(temp) + " óra múlva ");
            emberek[j].kiirNev();
            System.out.println("vezethet haza" );        
           
        
        
        
    }

}