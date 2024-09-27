/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3;


public class Barang {
    private String nama;
    private String kategori;
    private String id;
    private int jumlah;
    private int harga;
    
    public Barang(String nama, String kategori, String id, int jumlah, int harga) {
        this.nama = nama;
        this.id = id;
        this.kategori = kategori;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public String getKategori() {
        return kategori;
    }

    public String getId() {
        return id;
    }

    public int getJumlah() {
        return jumlah;
    }

    public int getHarga() {
        return harga;
    }
    
    void display() {
        System.out.println(" Nama Barang      : " + this.nama);
        System.out.println(" id Barang        : " + this.id);
        System.out.println(" Kategori Barang  : " + this.kategori);
        System.out.println(" Jumlah Barang    : " + this.jumlah);
        System.out.println(" Harga Barang     : " + this.harga);
    }    
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setKategori(String kategori){
        this.kategori = kategori;
    }
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }
}
