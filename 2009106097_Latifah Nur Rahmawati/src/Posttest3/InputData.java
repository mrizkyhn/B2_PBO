package Posttest3;

import Posttest2.*;
import Posttest1.*;
import java.util.Scanner;
import java.util.ArrayList;

public class InputData {
    String namapengirim;
    String namapenerima;
    String alamatpengirim;
    String alamatpenerima;
    String tipebarang;
    int kodepospenerima;
    int kodebarang;
    int beratbarang;
    int ongkoskirim;
    int notelppengirim;
    int notelppenerima;
 
    InputData(String nmpngrm,String almtpngrm,int nopngrm,String nmpnrma,
    String almtpnrma,int nopnrma,int kodepos,int kodebrg,String tipebrg,int beratbrg,int ongkir){
        this.namapengirim = nmpngrm;
        this.alamatpengirim = almtpngrm;
        this.notelppengirim = nopngrm;
        this.namapenerima = nmpnrma;
        this.alamatpenerima = almtpnrma;
        this.notelppenerima = nopnrma;
        this.kodepospenerima = kodepos;
        this.kodebarang = kodebrg;
        this.tipebarang = tipebrg;
        this.beratbarang = beratbrg;
        this.ongkoskirim = ongkir;
    }

    void print(){
        System.out.println("Nama Pengirim       : " + this.namapengirim);
        System.out.println("Alamat Pengirim     : " + this.alamatpengirim);
        System.out.println("No Telp Pengirim    : " + this.notelppengirim);
        System.out.println("Nama Penerima       : " + this.namapenerima);
        System.out.println("Alamat Penerima     : " + this.alamatpenerima);
        System.out.println("No Telp Penerima    : " + this.notelppenerima);
        System.out.println("Kode Pos Penerima   : " + this.kodepospenerima);
        System.out.println("Kode Barang         : " + this.kodebarang);
        System.out.println("Tipe Barang         : " + this.tipebarang);
        System.out.println("Berat Barang        : " + this.beratbarang);
        System.out.println("Ongkos Kirim        : " + this.ongkoskirim);
    }
}
