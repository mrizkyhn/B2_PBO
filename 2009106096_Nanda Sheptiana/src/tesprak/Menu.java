/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tesprak;


public class Menu {
    String namaMakanan;
    String namaMinuman;
    int harga;
    int stok;
    
    static void buatMenu(){
        System.out.println(" ");
    }
    
    Menu(String namaMakanan, String nomorMinuman){
        this.namaMakanan = namaMakanan;
        this.namaMinuman = namaMinuman;
        this.harga = harga;
        this.stok = stok;
        buatMenu();
    }
    
    void display(){
        System.out.println("nama makanan = "+this.namaMakanan + "harga = "+this.harga +"stok "+this.stok);
        System.out.println("nama minuman = "+this.namaMinuman);
    }
}
