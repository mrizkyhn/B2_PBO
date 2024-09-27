/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3;

/**
 *
 * @author GEFORCE_i5
 */
public class bangunan {
    String nama;
    int harga;
    
    public bangunan(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }

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
    
    void data(){
        System.out.println("Data Barang Toko Bangunan Sinar Jaya Berhasil Ditambah ");
    }
    void ubah(){
        System.out.println("Data Barang Toko Bangunan Sinar Jaya Berhasil Diedit ");
    }
    void hapus(){
        System.out.println("Data Barang Toko Bangunan Sinar Jaya Berhasil Dihapus ");
    }    
}


