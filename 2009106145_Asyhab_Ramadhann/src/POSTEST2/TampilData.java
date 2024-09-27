/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POSTEST2;

import java.util.ArrayList;
import java.util.Scanner;


class penjualan{
    
    void pendataan(){
    }
    void penjualan(){
    }
}

public class TampilData{
    
    ArrayList<Barang> tampung;
    
    TampilData()
    {
        //instansiasi
        tampung = new ArrayList<>();
    }
     

    void isiData(int id, String nm, String br, String js, int jm, int hg, String jb){
        tampung.add(new Barang(id,nm,br,js,jm,hg, jb));
    }

    void hapusData(int idd){
        tampung.removeIf(item -> item.id ==(idd));

    }

    void ubahData(int idd, int id, String nm, String br, String js, int jm, int hg, String jb){

        int cek = -1;
        for(int i=0; i<tampung.size(); i++){
            if (tampung.get(i).id == idd){
                cek = i;
                System.out.println(cek);   
                tampung.set(cek,new Barang(id,nm,br,js,jm,hg,jb));
            }
        }
    }

    void showData()
    {
        for(Barang barang:tampung)
        {
            System.out.println("id brg : "+barang.getId()+""+", Nama Pelanggan : "+barang.getNm()+""+", Barang : "+barang.getBr()+", Jenis : "+barang.getJs()+""+", Jumlah : "+barang.getJm()+""+", Harga : "+barang.getHg()+""+", Metode Bayar : "+barang.getJb()+"");
        }
    }
 
    public static void main(String args[]){
        
    Scanner inputan = new Scanner (System.in);
    int Ngulang = 1;
    TampilData td = new TampilData();
    while(Ngulang==1){
        System.out.println("-----------------------------");
        System.out.println("|  Perabotan Rumah Tangga   |");
        System.out.println("-----------------------------");
        System.out.println("| 1.Tambah Data             |");
        System.out.println("| 2.Tampil Data             |");
        System.out.println("| 3.Ubah   Data             |");
        System.out.println("| 4.Hapus  Data             |");
        System.out.println("| 5.Exit                    |");
        System.out.println("-----------------------------");
        int pilihan;
        System.out.print("Masukan Pilihan [ 1-5 ] : ");
        pilihan = inputan.nextInt();
        if (pilihan == 1){
            int ID;
            String NAMA;
            String BARANG;
            String JENIS;
            int JUMLAH;
            int HARGA;
            String METODE;

            System.out.print("ID                : ");
            ID = inputan.nextInt();

            System.out.print("Nama Pembeli      : ");
            NAMA = inputan.next();

            System.out.print("Nama Barang       : ");
            BARANG = inputan.next();

            System.out.print("Jenis Barang      : ");
            JENIS = inputan.next();

            System.out.print("Jumlah Barang     : ");
            JUMLAH = inputan.nextInt();

            System.out.print("Masukan Harga     : ");
            HARGA = inputan.nextInt();

            System.out.print("Metode Pembayaran : ");
            METODE = inputan.next();
            td.isiData(ID,NAMA,BARANG,JENIS,JUMLAH,HARGA,METODE);
            Barang tambahh = new Barang();
            tambahh.barangbeli();
        }
        else if (pilihan == 2){  
            td.showData();     

        }
        else if (pilihan == 3){
            int ID;
            String NAMA;
            String BARANG;
            String JENIS;
            int JUMLAH;
            int HARGA;
            String METODE;
            int pilih;

            System.out.print("Pilih ID Data Yang Ingin Di Ubah : ");
            pilih = inputan.nextInt();

            System.out.print("ID                 : ");
            ID = inputan.nextInt();

            System.out.print("Nama Pembeli Baru  : ");
            NAMA = inputan.next();

            System.out.print("Nama Barang Baru   : ");
            BARANG = inputan.next();

            System.out.print("Jenis Barang Baru  : ");
            JENIS = inputan.next();

            System.out.print("Jumlah Barang Baru : ");
            JUMLAH = inputan.nextInt();

            System.out.print("Masukan Harga Baru : ");
            HARGA = inputan.nextInt();

            System.out.print("Metode Pembayaran  : ");
            METODE = inputan.next();
            td.ubahData(pilih,ID,NAMA,BARANG,JENIS,JUMLAH,HARGA,METODE);
            Barang ubahs = new Barang();
            ubahs.barangubah();
         }
        else if (pilihan == 4){
            int pil_hapus;
            System.out.print("Pilih ID Data : ");
            pil_hapus = inputan.nextInt();
            td.hapusData(pil_hapus);
            Barang haps = new Barang();
            haps.barangberhasil();
        }
        else if (pilihan == 5){
            System.out.println();
            System.exit(0);
            }
        }
    }
    private Barang Barang(int id, String nm, String br, String js, int jm, int hg, String jb) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}