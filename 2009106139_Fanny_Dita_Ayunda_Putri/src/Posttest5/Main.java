/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posttest5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.io.*;

public final class Main {
    static ArrayList<Lili> Tanaman = new ArrayList<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static void tambahTanaman() throws IOException {
        Lili lili = new Lili("Auratum Lili","Bakung","Kuning",5,2,12000);
        System.out.print("Masukkan Nama Tanaman     = ");
        String nama = br.readLine();
        System.out.print("Masukkan Jenis Tanaman    = ");
        String jenis = br.readLine();
        System.out.print("Masukkan Warna Tanaman    = ");
        String warna = br.readLine();
        System.out.print("Masukkan Ukuran Tanaman   = ");
        int ukuran = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Jumlah Tanaman   = ");
        int jumlah = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Harga Tanaman    = ");
        int harga = Integer.parseInt(br.readLine());

        lili.setNama(nama);
        lili.setJenis(jenis);
        lili.setWarna(warna);
        lili.setUkuran(ukuran);
        lili.setJumlah(jumlah);
        lili.setHarga(harga);
        lili.equals(lili);
        
    }

    static void liatTanaman() {
        for (int i = 0; i < Tanaman.size(); i++) {
            System.out.println("=========================================");
            System.out.println("Nama Tanaman     = " + Tanaman.get(i).getNama());
            System.out.println("Jenis Tanaman    = " + Tanaman.get(i).getJenis());    
            System.out.println("Warna Tanaman    = " + Tanaman.get(i).getWarna());
            System.out.println("Ukuran Tanaman   = " + Tanaman.get(i).getUkuran());
            System.out.println("Jumlah Tanaman   = " + Tanaman.get(i).getJumlah());
            System.out.println("Harga Tanaman    = " + Tanaman.get(i).getHarga());
        }
    }

    public final static void main(String[] args) throws IOException {
        while (true) {
            System.out.print("Tampilan Menu Awal :\n");
            System.out.print("1.Menambahkan \n2.Menampilkan \n3.Exit \n ");
            System.out.print("Pilih Menu : ");
            int pilihan = Integer.parseInt(br.readLine());
            if (pilihan == 1) {
                tambahTanaman();
            } else if (pilihan == 2) {
                liatTanaman();
            } else if (pilihan == 3) {
                System.exit(0);
            }
        }
    }
}