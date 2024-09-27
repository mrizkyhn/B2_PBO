/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posttest6;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Lili> Tanaman = new ArrayList<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void tambahTanaman() throws IOException {
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

        lili.setWarna(warna);
        lili.setJumlah(jumlah);
        lili.setHarga(harga);
        lili.equals(lili);
        
    }

    public static void liatTanaman() {
        for (int i = 0; i < Tanaman.size(); i++) {
            System.out.println("=========================================");   
            System.out.println("Warna Tanaman    = " + Tanaman.get(i).getWarna());
            System.out.println("Jumlah Tanaman   = " + Tanaman.get(i).getJumlah());
            System.out.println("Harga Tanaman    = " + Tanaman.get(i).getHarga());
        }
    }

    public static void main(String[] args) throws IOException {
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