package Posttest5;

import Posttest4.*;

public class Penerima extends Pelanggan {
    private String namapenerima;
    private String alamatpenerima;
    private int idpenerima;
    private int notelppenerima;

    public Penerima(int noresi,String nama, String alamat, int id, int notelp){
        super(noresi);
        this.namapenerima = nama;
        this.alamatpenerima = alamat;
        this.idpenerima = id;
        this.notelppenerima = notelp;
    }
    
    //Overloading
    public void input(){
        System.out.println("No Resi Barang      : "+super.getNoresi());
        System.out.println("Id Pengirim         : "+this.idpenerima);
        System.out.println("Nama Pengirim       : "+this.namapenerima);
        System.out.println("No Telp Pengirim    : "+this.notelppenerima);
        System.out.println("Alamat Pengirim     : "+this.alamatpenerima);
    }
}
