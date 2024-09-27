package Posttest6;

import Posttest5.*;
import Posttest4.*;

public class Pengirim extends Pelanggan {
    private String namapengirim;
    private String alamatpengirim;
    private int idpengirim;
    private int notelppengirim;

    public Pengirim(int noresi,String nama, String alamat, int id, int notelp){
        super(noresi);
        this.namapengirim = nama;
        this.alamatpengirim = alamat;
        this.idpengirim = id;
        this.notelppengirim = notelp;
    }

    //Overriding
    @Override
    public void tampilkanData(){
        super.tampilkanData();
        System.out.println("Id Pengirim         : "+this.idpengirim);
        System.out.println("Nama Pengirim       : "+this.namapengirim);
        System.out.println("No Telp Pengirim    : "+this.notelppengirim);
        System.out.println("Alamat Pengirim     : "+this.alamatpengirim);
    }

    public void kirim(){
        System.out.println("Barang Anda Berhasil Di Kirim");
    }
    
    public void belum(){
        System.out.println("Barang Anda Belum Di Kirim");
    }
    
        
    
    public String getNamapengirim() {
        return namapengirim;
    }

    public void setNamapengirim(String namapengirim) {
        this.namapengirim = namapengirim;
    }

    public String getAlamatpengirim() {
        return alamatpengirim;
    }

    public void setAlamatpengirim(String alamatpengirim) {
        this.alamatpengirim = alamatpengirim;
    }

    public int getIdpengirim() {
        return idpengirim;
    }

    public void setIdpengirim(int idpengirim) {
        this.idpengirim = idpengirim;
    }

    public int getNotelppengirim() {
        return notelppengirim;
    }

    public void setNotelppengirim(int notelppengirim) {
        this.notelppengirim = notelppengirim;
    }
    

}
