/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3;

import posttest2.*;

/**
 *
 * @author acer
 */
public class AlatMusik {
    private String jenis;
    private String tipe;
//    String merk;
    private int harga;
//    int stok;
    
//    public AlatMusik(String kategori,String tipe,String merk,int harga,int stok){
    public AlatMusik(String jenis,String tipe,int harga){
        this.jenis = jenis;
        this.tipe = tipe;
//        this.merk = merk;
        this.harga = harga;
//        this.stok = stok;
//      this.halaman = halaman;
    }
        public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public String getJenis(){
        return jenis;
    }
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    public int getHarga(){
        return harga;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }
    public String getTipe(){ 
        return tipe;
    }
    public void setTipe(String tipe){ 
        this.tipe = tipe;
    }
    void BacaPesanan(){
        System.out.println("Pembayaran telah dilakukan");
    }
    
}
