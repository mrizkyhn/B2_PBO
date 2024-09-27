/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posttest5_132;

import Posttest4_132.*;

/**
 *
 * @author Lenovo Gk
 */
final class Hijab extends Pakaian {
    private int biaya_tambah;
    private int diskon;

    public Hijab(String nama, String bahan, String warna, int harga, int jumlah, int diskon) {
        super(nama, bahan, warna, harga, jumlah);
        this.diskon = 30;
        }

    
    void BerhasilPesan() {
        System.out.println("\n*================================*");
        System.out.println("| Nama            : " + this.nama);
        System.out.println("| Bahan           : " + this.bahan);
        System.out.println("| Warna           : " + this.warna);
        System.out.println("| Harga           : " + this.harga);
        System.out.println("| Jumlah          : " + this.jumlah);
        System.out.println("*================================*");
        System.out.println("|        Berhasil Dipesan        |");
        System.out.println("*================================*\n");
    }
    
    void BatalPesan() {
        System.out.println("\n*================================*");
        System.out.println("| Nama            : " + this.nama);
        System.out.println("| Bahan           : " + this.bahan);
        System.out.println("| Warna           : " + this.warna);
        System.out.println("| Harga           : " + this.harga);
        System.out.println("| Jumlah          : " + this.jumlah);
        System.out.println("*================================*");
        System.out.println("|        Berhasil Dibatal        |");
        System.out.println("*================================*\n");
    }                      
    
    void UbahPesanan() {
        System.out.println("\n*================================*");
        System.out.println("| Nama            : " + this.nama);
        System.out.println("| Bahan           : " + this.bahan);
        System.out.println("| Warna           : " + this.warna);
        System.out.println("| Harga           : " + this.harga);
        System.out.println("| Jumlah          : " + this.jumlah);
        System.out.println("*================================*");
        System.out.println("|        Berhasil Diubah         |");
        System.out.println("*================================*\n");
    }
    
    public void overloading(int diskon_harga){
        final int diskon_tambahan = 10;
        System.out.println("| Diskon Yang Didapat : " + this.diskon);
        diskon_harga = this.harga * this.diskon/100;
        System.out.println("| Total Biaya    : \n| \t\t" + diskon_harga + " Rupiah");
        System.out.println("*================================*\n");
                           
    }
    
}