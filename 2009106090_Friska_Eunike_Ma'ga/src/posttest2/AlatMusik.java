/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest2;

/**
 *
 * @author acer
 */
public class AlatMusik {
    String jenis;
    String tipe;
//    String merk;
    int harga;
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
    
    void BacaPesanan(){
        System.out.println("Pembayaran telah dilakukan");
    }
    
}
