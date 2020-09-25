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
public class Praktikum02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //instansiasi
        
        Keramik2 A = new Keramik2 (30,30,54000,10);
        A.hitungLuas();
        A.hitungKebutuhan();
        A.hitungTotal();
        
        Keramik2 B = new Keramik2 (40,40,65000,5);
        B.hitungLuas();
        B.hitungKebutuhan();
        B.hitungTotal();
        
        Keramik2 C = new Keramik2 (30,40,60000,8);
        C.hitungLuas();
        C.hitungKebutuhan();
        C.hitungTotal();
    }
}
