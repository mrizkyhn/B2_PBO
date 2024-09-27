package posttest4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    
    void tampilBarang(ArrayList<Toko> kumpulanBarang){
        System.out.println("DATA BARANG TOKO");
        System.out.println("");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.printf("%-5s%-100s%-20s%-40s%-11s%s\n", "No", "Nama", "Merk", "Jenis", "Harga", "Stock");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        for (int i = 0; i < kumpulanBarang.size(); i++){
            kumpulanBarang.get(i).printData(i + 1);
        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n");
    }
    
    void tambahBarang(ArrayList<Toko> kumpulanBarang){
        Scanner inputAngka = new Scanner(System.in);
        BufferedReader inputHuruf = new BufferedReader(new InputStreamReader(System.in));
        String nama = "", merk = "", jenis = "";
        try {
            System.out.print("Masukkan nama     : ");
            nama = inputHuruf.readLine();
            System.out.print("Masukkan merk     : ");
            merk = inputHuruf.readLine();
            System.out.print("Masukkan jenis    : ");
            jenis = inputHuruf.readLine();
        } catch(Exception e){
        }
        System.out.print("Masukkan harga    : ");
        int harga = inputAngka.nextInt();
        int stock;
        while (true){
            System.out.print("Masukkan stock    : ");
            stock = inputAngka.nextInt();
            if (stock >= 0){
                break;
            } else{
                System.out.println("Stock barang tidak bisa kurang dari 0!");
            }
        }
        Toko temp = new Toko(nama, merk, jenis, harga, stock);
        kumpulanBarang.add(temp);
        System.out.println("\nBarang berhasil ditambahkan!\n");
    }
    
    void editBarang(ArrayList<Toko> kumpulanBarang) {
        Scanner inputAngka = new Scanner(System.in);
        BufferedReader inputHuruf = new BufferedReader(new InputStreamReader(System.in));
        tampilBarang(kumpulanBarang);
        System.out.print("Masukkan nomor barang: ");
        int nomorBarang = inputAngka.nextInt();
        System.out.println("");
        if ((nomorBarang - 1) < kumpulanBarang.size()) {
            String namaBaru = "", merkBaru = "", jenisBaru = "";
            int menu;
            do {
                System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                System.out.println("%            Edit Barang            %");
                System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                System.out.println("% <1> Nama                          %");
                System.out.println("% <2> Merk                          %");
                System.out.println("% <3> Jenis                         %");
                System.out.println("% <4> Harga                         %");
                System.out.println("% <5> Stock                         %");
                System.out.println("% <6> Kembali                       %");
                System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                System.out.print(" Masukkan pilihan edit: ");
                menu = inputAngka.nextInt();
                System.out.println("");
                switch (menu) {
                    case 1:
                        try {
                            System.out.print("Masukkan nama baru: ");
                            namaBaru = inputHuruf.readLine();
                        } catch(Exception e){
                        }
                        kumpulanBarang.get(nomorBarang - 1).setNama(namaBaru);
                        System.out.println("\nNama barang berhasil diubah!\n");
                        break;
                    case 2:
                        try {
                            System.out.print("Masukkan merk baru: ");
                            merkBaru = inputHuruf.readLine();
                        } catch(Exception e){
                        }
                        kumpulanBarang.get(nomorBarang - 1).setMerk(merkBaru);
                        System.out.println("\nMerk barang berhasil diubah!\n");
                        break;
                    case 3:
                        try {
                            System.out.print("Masukkan jenis baru: ");
                            jenisBaru = inputHuruf.readLine();
                        } catch(Exception e){
                        }
                        kumpulanBarang.get(nomorBarang - 1).setJenis(jenisBaru);
                        System.out.println("\nJenis barang berhasil diubah!\n");
                        break;
                    case 4:
                        System.out.print("Masukkan harga baru: ");
                        int hargaBaru = inputAngka.nextInt();
                        kumpulanBarang.get(nomorBarang - 1).setHarga(hargaBaru);
                        System.out.println("\nHarga barang berhasil diubah!\n");
                        break;
                    case 5:
                        System.out.print("Masukkan stock baru: ");
                        int stockBaru = inputAngka.nextInt();
                        if (stockBaru >= 0){
                            kumpulanBarang.get(nomorBarang - 1).setStock(stockBaru);
                            System.out.println("\nStock barang berhasil diubah!\n");
                        } else{
                            System.out.println("Stock barang tidak bisa kurang dari 0!");
                        }
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("Pilihan tidak ditemukan!");
                }
            } while(menu != 6);
        } else{
            System.out.println("Barang tidak ditemukan!\n");
        }
    }
    
    void hapusBarang(ArrayList<Toko> kumpulanBarang){
        Scanner input = new Scanner(System.in);
        tampilBarang(kumpulanBarang);
        System.out.println("HAPUS BARANG\n");
        System.out.print("Masukkan nomor barang: ");
        int nomorBarang = input.nextInt();
        if ((nomorBarang - 1) < kumpulanBarang.size()){
            kumpulanBarang.remove(nomorBarang - 1);
            System.out.println("\nBarang berhasil dihapus!\n");
        } else{
            System.out.println("\nNomor barang tidak ditemukan!\n");
        }
    }
    
    void admin(ArrayList<Toko> kumpulanBarang){
        Scanner input = new Scanner(System.in);
        int menu;
        do {
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.println("%            Menu Admin            %");
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.println("% <1> Tampil Barang                %");
            System.out.println("% <2> Tambah Barang                %");
            System.out.println("% <3> Edit Barang                  %");
            System.out.println("% <4> Hapus Barang                 %");
            System.out.println("% <5> Kembali                      %");
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.print(" Masukkan pilihan menu: ");
            menu = input.nextInt();
            System.out.println("");
            switch (menu) {
                case 1:
                    if (!kumpulanBarang.isEmpty()){
                        tampilBarang(kumpulanBarang);
                    } else{
                        System.out.println("Tidak ada barang!");
                    }
                    break;
                case 2:
                    tambahBarang(kumpulanBarang);
                    break;
                case 3:
                    if (!kumpulanBarang.isEmpty()){
                        editBarang(kumpulanBarang);
                    } else{
                        System.out.println("Tidak ada barang!");
                    }
                    break;
                case 4:
                    if (!kumpulanBarang.isEmpty()){
                        hapusBarang(kumpulanBarang);
                    } else{
                        System.out.println("Tidak ada barang!");
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("\nMenu tidak ditemukan!\n");
            }
        } while(menu != 5);
    }
}
