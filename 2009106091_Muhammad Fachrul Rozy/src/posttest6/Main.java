/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;
import posttest5.*;
import posttest4.*;
import posttest3.*;
import posttest2.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 

/**
 *
 * @author GEFORCE_i5
 */
public class Main {
    static ArrayList<Bangunan> Bangunan = new ArrayList<Bangunan>();
    static ArrayList<Alatlistrik> Alatlistrik = new ArrayList<>();
    static ArrayList<Semen> Semen = new ArrayList<>();
    
    public static void main(String[] args)throws Exception {
        
      while(true){
          menu();
      }
    }  
   public static void menu() throws IOException{
       InputStreamReader home = new InputStreamReader(System.in);
       BufferedReader input = new BufferedReader(home);
            System.out.println("");
            System.out.println("$$$$$$$TOKO BANGUNAN SINAR JAYA$$$$$$$");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("1. Masukkan Data Barang Yang Ingin di Masukkan");
            System.out.println("2. Lihat Data Barang Bangunan"); 
            System.out.println("3. Ubah Data Barang Bangunan");
            System.out.println("4. Hapus Data Barang Bangunan");
            System.out.println("5. Pesan Barang Bangunan Ysng Ingin Di Beli");
            System.out.println("6. KELUAR");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Pilih[1-6] = ");
        int pilih = Integer.valueOf(input.readLine());
            switch (pilih){
            case 1:
                    input();
                    break;
            case 2:
                    tambah();
                    break;
            case 3:
                    udata();
                    break;
            case 4:
                    hdata();
                    break;
            case 5:
                    pesan();
                    break;
            case 6:
                    backmenu();
                    break;
            default:
                menu(); 
            } 
        }

public static void input() throws IOException{
            InputStreamReader tambah = new InputStreamReader(System.in);
            BufferedReader input = new BufferedReader(tambah);
            
            String nama;
            int harga;
            int pilihan;
            
    System.out.println("1. Alatlistrik");
    System.out.println("2. Semen");
    System.out.println("Masukan pilihan Yang Ingin Anda Pilih : ");
    pilihan = Integer.parseInt(input.readLine());
    if (pilihan == 1) {
        System.out.println("Masukan Nama Barang : ");
        nama = input.readLine();
        System.out.println("Masukan Harga Barang : ");
        harga = Integer.parseInt(input.readLine());
        System.out.println("Masukan Merek Barang: ");
        String merek = input.readLine();
        System.out.println("Masukan Bahan Barang : ");
        String bahan = input.readLine();
        Alatlistrik.add(new Alatlistrik(nama, harga, merek, bahan));
        } else {
        if (pilihan == 2) {
        System.out.println("Masukan Nama Barang : ");
        nama = input.readLine();
        System.out.println("Masukan Harga Barang : ");
        harga = Integer.parseInt(input.readLine());
        System.out.println("Masukan Jumlah Barang: ");
        String jumlah = input.readLine();
        System.out.println("Masukan Ukuran Barang : ");
        String ukuran = input.readLine();
        Semen.add(new Semen(nama, harga, jumlah, ukuran));
        }
        

}           
}

public static void tambah()throws IOException{    
    InputStreamReader tambah = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(tambah);
    int pilihan;
    System.out.println("1. Alatlistrik");
    System.out.println("2. Semen");
    System.out.println("Masukan pilihan : ");
    pilihan = Integer.parseInt(input.readLine());
    if (pilihan == 1) {
                        for (int i = 0; i < Alatlistrik.size(); i++) {
                            System.out.println("Alat Listrik ke - " + (i + 1));
                            Alatlistrik.get(i).display();
                        }
                    } else {
                        for (int i = 0; i < Semen.size(); i++) {
                            System.out.println("Semen ke - " + (i + 1));
                            Semen.get(i).display();
                        }
                    }

            }

public static void udata()throws IOException{
    InputStreamReader tambah = new InputStreamReader (System.in);
    BufferedReader input = new BufferedReader (tambah);
    int pilihan;
    String nama;
    int harga;
    String rasa;
    String ukuran;
    tambah();
    System.out.println("1. Alat Listrik");
    System.out.println("2. Semen");
    System.out.println("Masukan pilihan : ");
    pilihan = Integer.parseInt(input.readLine());
    System.out.println("Ubah Data Barang Toko Bangunan Sinar Jaya");
    if (pilihan == 1) {
                        System.out.println("Masukan Nama Barang Bangunan : ");
                        nama = input.readLine();
                        for (Alatlistrik i : Alatlistrik) {
                            if (i.getNama().equals(nama)) {
                                System.out.println("Masukan Nama Barang Bangunan baru : ");
                                i.setNama(input.readLine());
                                System.out.println("Masukan Harga Barang Bangunan baru : ");
                                i.setHarga(Integer.parseInt(input.readLine()));
                                System.out.println("Masukan Merek Barang Bangunan baru : ");
                                i.setmerek(input.readLine());
                                System.out.println("Masukan Bahan Barang Bangunan baru : ");
                                i.setbahan(input.readLine());
                            }
                        }
                    } else {
                        System.out.println("Masukan Nama Barang Bangunan : ");
                        nama = input.readLine();
                        for (Semen i : Semen) {
                            if (i.getNama().equals(nama)) {
                                System.out.println("Masukan Nama Barang Bangunan baru : ");
                                i.setNama(input.readLine());
                                System.out.println("Masukan Harga Barang Bangunan baru : ");
                                i.setHarga(Integer.parseInt(input.readLine()));
                                System.out.println("Masukan Jumlah Barang Bangunan baru : ");
                                i.setjumlah(input.readLine());
                                System.out.println("Masukan Ukuran Barang Bangunan baru : ");
                                i.setUkuran(input.readLine());
                            }
                        }
                    }
}

public static void hdata() throws IOException{
    tambah();
    InputStreamReader tambah = new InputStreamReader (System.in);
    BufferedReader input = new BufferedReader (tambah);
    int pilihan;
    int t;
    System.out.println("1. Alat Listrik");
    System.out.println("2. Semen");
    System.out.println("Masukan pilihan : ");
    pilihan = Integer.parseInt(input.readLine());
    if (pilihan == 1) {
        System.out.println("Input Nomor Barang Yang Ingin Anda Hapus = ");
        t = Integer.parseInt(input.readLine());
        t--;
    
        Alatlistrik.get(t).hdata();
        Alatlistrik.remove(t);
    } else {
    System.out.println("Input Nomor Barang Yang Ingin Anda Hapus = ");
    t = Integer.parseInt(input.readLine());
    t--;
    
    Semen.get(t).hdata();
    Semen.remove(t);

    }
}

public static void backmenu() throws IOException{
    InputStreamReader tambah = new InputStreamReader (System.in);
    BufferedReader input = new BufferedReader(tambah);
    
    int a;
    System.out.println("THANK YOU TELAH BERBELANJA DI TOKO BANGUNAN SINAR JAYA");
    System.out.println("Tekan 1 lalu Tekan ENTER untuk melanjutkan");
    a = Integer.parseInt(input.readLine());
    menu();
    }

public static void pesan() throws IOException{
    InputStreamReader tambah = new InputStreamReader (System.in);
    BufferedReader input = new BufferedReader(tambah);
    
    int berapa;
    
    Pemesanan bangunan = new Proses();
    
    Kasir luxxy = new Kasir(bangunan);
    
    System.out.println("Buat Pesanan Barang Bangunan");
    System.out.println("Mau Berapa Barang Yang Ingin Di Pesan?");
    berapa = Integer.parseInt(input.readLine());
    luxxy.pesanb();
    
}


}
