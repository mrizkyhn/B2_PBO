/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;
import posttest5.*;
import posttest4.*;
import posttest3.*;
import posttest2.*;

public abstract class Bangunan {
    protected String nama;
    protected int harga;
    
    public Bangunan(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }
    
    protected abstract void pesan();
    
    public String getNama() {
        return nama;
    }
    public int getHarga() {
        return harga;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    void display(){
      System.out.println("Nama           : " + this.nama);
      System.out.println("Harga          : " + this.harga);
      pesan();
    }
    
    void input(){
        System.out.println("Data Toko Bangunan berhasil ditambah");
    }
    void udata(){
        System.out.println("Data Toko Bangunan berhasil diedit");
    }
    void hdata(){
        System.out.println("Data Toko Bangunan berhasil dihapus");
    }    
}

/**
 *
 * @author GEFORCE_i5
 */

