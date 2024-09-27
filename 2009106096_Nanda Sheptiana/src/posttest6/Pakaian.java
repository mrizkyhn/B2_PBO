/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

/**
 *
 * @author user
 */
public class Pakaian extends Barang {
    private String kategoriPakaian;
    private String warnaPakaian;
    private int hargaPokok;
    final public String dtpakaian = "Pakaian";
    
    public Pakaian(String nama, String id, int harga, int stokAwal, int stokAkhir, String kategoriPakaian, String warnaPakaian, int hargaPokok){
        super(nama, id, harga, stokAwal, stokAkhir);
        this.kategoriPakaian = kategoriPakaian;
        this.warnaPakaian = warnaPakaian;
        this.hargaPokok = hargaPokok;
    }

    
    @Override
    public void display(){
        super.display();
        System.out.println(" Kategori Barang      : "+this.dtpakaian);
        System.out.println(" Kategori Pakaian     : "+this.kategoriPakaian);
        System.out.println(" Warna Pakaian        : "+this.warnaPakaian);
        System.out.println(" Harga Pokok Pakaian  : "+this.hargaPokok);   
    }
    
    @Override
    public void brgpakaian(){
        System.out.println("Pendataan Barang Pakaian Selesai");
    }
    @Override
    public void brgperabotan() {
        System.out.println("Pendataan Barang Perabotan Selesai"); 
    }

    public String getKategoriPakaian() {
        return kategoriPakaian;
    }

    public String getWarnaPakaian() {
        return warnaPakaian;
    }

    public int getHargaPokok() {
        return hargaPokok;
    }

    public void setKategoriPakaian(String kategoriPakaian) {
        this.kategoriPakaian = kategoriPakaian;
    }

    public void setWarnaPakaian(String warnaPakaian) {
        this.warnaPakaian = warnaPakaian;
    }

    public void setHargaPokok(int hargaPokok) {
        this.hargaPokok = hargaPokok;
    }

    
}
