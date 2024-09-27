/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;
public abstract class Bangunan {
    protected String nama, ukuran, bahan,os, harga;
    
    public Bangunan(String nama, String ukuran, String bahan, String harga){
        this.nama = nama;
        this.ukuran = ukuran;
        this.bahan = bahan;
        this.harga = harga;
    }
    
    void tambahdaftar(){
        System.out.println("\nDaftar berhasil ditambah");
    }
    
    void hapusdaftar(){
        System.out.println("Daftar berhasil dihapus");
    }

    public String getnama() {
        return nama;
    }

    public String getukuran() {
        return ukuran;
    }

    public String getbahan() {
        return bahan;
    }

    public String getharga() {
        return harga;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public void setukuran(String tipe) {
        this.ukuran = ukuran;
    }

    public void setbahan(String bahan) {
        this.bahan = bahan;
    }

    public void setharga(String harga) {
        this.harga = harga;
        
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOs() {
        return os;
    }
    
    protected abstract void baik();
    
    /**
     *
     */
    public void display(){
        System.out.println("Nama Barang     : " + this.nama);
        System.out.println("Ukuran Barang     : " + this.ukuran);
        System.out.println("Bshan Barang  : " + this.bahan);
        System.out.println("Harga Barang  : " + this.harga);
        baik();
    }
}