/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;

/**
 *
 * @author user
 */
public abstract class Barang {
    protected String nama;
    protected String id;
    protected int stokAwal ;
    protected int stokAkhir;
    protected int harga;
    
    public Barang(String nama, String id, int stokAwal, int stokAkhir, int harga) {
        this.nama = nama;
        this.id = id;
        this.stokAwal = stokAwal;
        this.stokAkhir = stokAkhir;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    public int getStokAwal() {
        return stokAwal;
    }

    public int getStokAkhir() {
        return stokAkhir;
    }

    public int getHarga() {
        return harga;
    }
    
    public void display() {
        System.out.println(" Nama Barang      : " + this.nama);
        System.out.println(" id Barang        : " + this.id);
        System.out.println(" Stok Akhir Barang  : " + this.stokAkhir);
        System.out.println(" Stok Awal Barang  : " + this.stokAwal);
        System.out.println(" Harga Barang     : " + this.harga);
    }    
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setStokAwal(int stokAwal) {
        this.stokAwal = stokAwal;
    }
    public void setStokAkhir(int stokAkhir) {
        this.stokAkhir = stokAkhir;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public abstract void brgpakaian();
    public abstract void brgperabotan();
}
