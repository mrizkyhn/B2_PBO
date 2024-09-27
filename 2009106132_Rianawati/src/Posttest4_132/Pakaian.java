package Posttest4_132;

import Posttest3_132.*;
import posttest2_132.*;

class Pakaian {


    String nama, bahan, warna;
    int harga, jumlah;
    
    public Pakaian(String nama, String bahan, String warna, int harga, int jumlah){
        this.nama = nama;
        this.bahan = bahan;
        this.warna = warna;
        this.harga = harga;
        this.jumlah = jumlah;
        
    }
       public String getNama() {
        return nama;
    }

       public String getBahan() {
        return bahan;
    }

       public String getWarna() {
        return warna;
    }

       public int getHarga() {
        return harga;
    }

       public int getJumlah() {
        return jumlah;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    void setBahan(String bahan) {
        this.bahan = bahan;
    }

    void setWarna(String warna) {
        this.warna = warna;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    void BerhasilDitambah(){
        System.out.println("\n=====================================");
        System.out.println(">>> Stok Telah Berhasil Di Tambah <<<");
        System.out.println("=====================================\n\n");
    }
    void BerhasilDiubah(){
        System.out.println("\n===================================");
        System.out.println(">>> Stok Telah Berhasil Di Ubah <<<");
        System.out.println("===================================\n");
    }
    void BerhasilDihapus(){
        System.out.println("\n====================================");
        System.out.println(">>> Stok Telah Berhasil Di Hapus <<<");
        System.out.println("====================================\n");
    }


}

