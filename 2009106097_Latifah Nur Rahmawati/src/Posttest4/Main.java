package Posttest4;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        
        System.out.println("Program Jasa Pengiriman Barang");
        System.out.println("Latifah Nur Rahmawati");
        System.out.println("2009106097");
        System.out.println("Informatika B 2020\n\n");

        System.out.println("==============================================");
        System.out.println("||      Jasa Pengiriman Barang              ||");
        System.out.println("==============================================");
        System.out.println("||  [1] Input Data Pengiriman Barang        ||");
        System.out.println("||  [2] Tampil Data Pengiriman Barang       ||");
        System.out.println("||  [3] Edit Data                           ||");
        System.out.println("||  [4] Hapus Data                          ||");
        System.out.println("||  [5] Keluar                              ||");
        System.out.println("==============================================");

        Scanner pilihan = new Scanner(System.in);
        System.out.println("\n\t\tMasukkan Pilihan : ");
        int pilih = pilihan.nextInt();
        switch(pilih){
            case(1):
                ArrayList<Pelanggan> dataInput = new ArrayList<Pelanggan>();
                
                System.out.println("Input Data Pengiriman Barang");
                Scanner input = new Scanner(System.in);
                System.out.println("\n----------------- Masukkan Data -----------------");
                System.out.println("Masukkan No Resi Barang     : ");
                int a = input.nextInt();
                System.out.println("Masukkan Id Pengirim        : ");
                int b = input.nextInt();
                System.out.println("Masukkan Nama Pengirim      : ");
                String c = input.next();
                System.out.println("Masukkan No Telp Pengirim   : ");
                int d = input.nextInt();
                System.out.println("Masukkan Alamat Pengirim    : ");
                String e = input.next();
                System.out.println("Masukkan Id Penerima        : ");
                int f = input.nextInt();
                System.out.println("Masukkan Nama Penerima      : ");
                String g = input.next();
                System.out.println("Masukkan No Telp Penerima   : ");
                int h = input.nextInt();
                System.out.println("Masukkan Alamat Penerima    : ");
                String i = input.next();
                System.out.println("Masukkan Kode Pos           : ");
                int j = input.nextInt();
                System.out.println("Masukkan Kode Barang        : ");
                int k = input.nextInt();
                System.out.println("Masukkan Tipe Barang        : ");
                String l = input.next();
                System.out.println("Masukkan Berat Barang       : ");
                double m = input.nextDouble();
                System.out.println("Masukkan Ongkos Kirim       : ");
                int n = input.nextInt();
                
                

            case(2):
                System.out.println("Tampil Data Pengiriman Barang");
                Pelanggan data = new Pelanggan(1);
                data.tampilkanData();

            case(3):
                System.out.println("Edit Data Pengiriman Barang");

            case(4):
                System.out.println("Hapus Data Pengiriman Barang");

            case(5):
                System.exit(pilih);                  
        }

    }
}
