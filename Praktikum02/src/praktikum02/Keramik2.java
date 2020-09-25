/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum02;

/**
 *
 * @author EfaSetiyani
 */
public class Keramik2 {
    //atribut
    double panjang;
    double lebar;
    double hargaPerBox;
    double isiPerBox;
    double luas;
    double jumlahBox;
    double total;
    double output;
  
    
    //construction
    Keramik2(double p, double l, double h, double i){
        this.panjang = p;
        this.lebar = l;
        this.hargaPerBox = h;
        this.isiPerBox = i;    
    }
    
    //method
    double hitungLuas(){
    luas = (panjang * lebar)/10000;
    System.out.println("Luas Keramik adalah " + luas + " meter persegi per pcs");
    return luas;
    }
        
    double hitungKebutuhan(){
    jumlahBox = 100/luas/isiPerBox;
    System.out.println("Kebutuhan keramik adalah " + Math.ceil(jumlahBox) + " box");
    return jumlahBox; 
    }
        
    double hitungTotal(){
    total = jumlahBox * hargaPerBox;
    System.out.println("Harga totalnya adalah " + Math.ceil(total) + " rupiah");
    return total;  
    }
}
  
