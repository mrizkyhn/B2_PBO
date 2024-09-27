/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CUAN
 */
public class cafe {
//    property/atribut
    String makanan;
    String minuman;
    String snack;
    String dessert;
    
//    metode khusus
    cafe(String makanan, String minuman, String snack, String dessert){
        this.makanan = makanan;
        this.minuman = minuman;
        this.snack = snack;
        this.dessert = dessert;
    }
//    metode
    void tampilMenu(){
        System.out.println("Menu Telah diTampilkan");
    }
    void tambahMenu(){
        System.out.println("Menu Baru diTerima");
    }
    void editMenu(){
        System.out.println("Menu Telah diPerbarui");
    }
    void hapusMenu(){
        System.out.println("Menu Telah diHapus");
    }
}
