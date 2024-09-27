/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posttest5;

/**
 *
 * @author VAIO
 */
public abstract class Tanaman {
    protected String nama;
    protected String jenis;
    protected int ukuran;
    
    public Tanaman(String nama, String jenis, int ukuran){
        this.nama = nama;
        this.jenis = jenis;
        this.ukuran = ukuran;
    }
    void display() {
        System.out.println("Nama Tanaman    : " + this.nama);
        System.out.println("Jenis Tanaman   : " + this.jenis);
        System.out.println("Ukuran Tanaman  : " + this.ukuran);
        
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getUkuran() {
        return ukuran;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }
    
    public abstract void TanamanMasuk();
    public abstract void TanamanKeluar();
}