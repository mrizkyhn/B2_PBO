/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posttest4;

/**
 *
 * @author VAIO
 */
public class Lili extends Tanaman {
    private String warna;
    private int jumlah;
    private int harga;
    
    public Lili(String nama, String jenis, String warna, int ukuran, int jumlah, int harga ){
        super(nama, jenis, ukuran);
        this.warna = warna;
        this.jumlah = jumlah;
        this.harga = harga;
    }
    
    void display(){
        System.out.println("Warna Tanaman   : " + this.warna);
        System.out.println("Jumlah Tanaman  : " + this.jumlah);
        System.out.println("Harga Tanaman   : " + this.harga);
    
}
    
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}