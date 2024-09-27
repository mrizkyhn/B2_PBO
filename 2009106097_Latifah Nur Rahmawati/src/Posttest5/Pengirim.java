package Posttest5;

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
}
