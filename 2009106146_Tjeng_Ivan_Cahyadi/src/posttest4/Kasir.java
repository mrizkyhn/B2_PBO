package posttest4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Kasir {
    
    int stockBarang(ArrayList<Toko> kumpulanBarang) {
        int totalStockBarang = 0;
        for (Toko barang : kumpulanBarang) {
            totalStockBarang += barang.getStock();
        }
        return totalStockBarang;
    }
    
    boolean existBarangBelanja(ArrayList<Belanja> kumpulanBarangBelanja, Toko barangDibeli) {
        for (Belanja barang : kumpulanBarangBelanja) {
            if (barang.getNama().equals(barangDibeli.getNama())){
                return true;
            }
        }
        return false;
    }
    
    void tampilBarangBelanja(ArrayList<Belanja> kumpulanBarangBelanja){
        System.out.println("DATA BARANG BELANJA");
        System.out.println("");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.printf("%-5s%-100s%-20s%-11s%s\n", "No", "Nama", "Merk", "Harga", "Jumlah Barang");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        for (int i = 0; i < kumpulanBarangBelanja.size(); i++){
            kumpulanBarangBelanja.get(i).printData(i + 1);
        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n");
    }
    
    void tambahBarangBelanja(ArrayList<Toko> kumpulanBarang, ArrayList<Belanja> kumpulanBarangBelanja, Admin admin){
        admin.tampilBarang(kumpulanBarang);
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nomor barang yang dibeli: ");
        int nomorBarang = input.nextInt();
        if (nomorBarang > 0 && nomorBarang <= kumpulanBarang.size()){
            while (true){
                System.out.print("Masukkan jumlah barang yang dibeli: ");
                int jumlahBarang = input.nextInt();
                if (jumlahBarang > 0 && jumlahBarang <= kumpulanBarang.get(nomorBarang - 1).getStock()){
                    System.out.println("");
                    if (!(existBarangBelanja(kumpulanBarangBelanja, kumpulanBarang.get(nomorBarang - 1)))){
                        Belanja temp = new Belanja(kumpulanBarang.get(nomorBarang - 1).getNama(), kumpulanBarang.get(nomorBarang - 1).getMerk(), kumpulanBarang.get(nomorBarang - 1).getHarga(), jumlahBarang);
                        kumpulanBarangBelanja.add(temp);
                        kumpulanBarang.get(nomorBarang - 1).setStock(kumpulanBarang.get(nomorBarang - 1).getStock() - jumlahBarang);
                        System.out.println("Barang belanja berhasil ditambahkan!");
                        break;
                    } else{
                        for (int i = 0; i < kumpulanBarangBelanja.size(); i++) {
                            if (kumpulanBarangBelanja.get(i).getNama().equals(kumpulanBarang.get(nomorBarang - 1).getNama())){
                                kumpulanBarangBelanja.get(i).setJumlahBarang(kumpulanBarangBelanja.get(i).getJumlahBarang() + jumlahBarang);
                                kumpulanBarang.get(nomorBarang - 1).setStock(kumpulanBarang.get(nomorBarang - 1).getStock() - jumlahBarang);
                                break;
                            }
                        }
                        System.out.println("Barang belanja berhasil ditambahkan!");
                        break;
                    }
                } else{
                    System.out.println("\nStock barang tidak mencukupi!");
                    break;
                }
            }
        } else{
            System.out.println("\nBarang tidak ditmeukan!");
        }
    }
    
    void ubahJumlahBarangBelanja(ArrayList<Toko> kumpulanBarang, ArrayList<Belanja> kumpulanBarangBelanja) {
        Scanner input = new Scanner(System.in);
        tampilBarangBelanja(kumpulanBarangBelanja);
        System.out.println("UBAH JUMLAH BARANG BELANJA");
        System.out.print("Masukkan nomor barang: ");
        int nomorBarang = input.nextInt();
        if (nomorBarang <= kumpulanBarangBelanja.size() && nomorBarang > 0) {
            for (Toko barang : kumpulanBarang) {
                if (kumpulanBarangBelanja.get(nomorBarang - 1).getNama().equals(barang.getNama())) {
                    System.out.println("\nStock barang yang tersedia: " + (barang.getStock() + kumpulanBarangBelanja.get(nomorBarang - 1).getJumlahBarang()) + "\n");
                    System.out.print("Masukkan jumlah barang baru: ");
                    int jumlahBarang = input.nextInt();
                    System.out.println("");
                    if (jumlahBarang > 0 && jumlahBarang <= (barang.getStock() + kumpulanBarangBelanja.get(nomorBarang - 1).getJumlahBarang())) {
                        barang.setStock(barang.getStock() + kumpulanBarangBelanja.get(nomorBarang - 1).getJumlahBarang() - jumlahBarang);
                        kumpulanBarangBelanja.get(nomorBarang - 1).setJumlahBarang(jumlahBarang);
                        System.out.println("Jumlah barang belanja berhasil diubah!");
                        break;
                    } else{
                        System.out.println("Jumlah barang tidak mencukupi!");
                        break;
                    }
                }
            }
        } else {
            System.out.println("\nBarang belanja tidak ditemukan!");
        }
    }
    
    void hapusBarangBelanja(ArrayList<Toko> kumpulanBarang, ArrayList<Belanja> kumpulanBarangBelanja) {
        Scanner input = new Scanner(System.in);
        tampilBarangBelanja(kumpulanBarangBelanja);
        System.out.println("HAPUS BARANG");
        System.out.print("Masukkan nomor barang: ");
        int nomorBarang = input.nextInt();
        System.out.println("");
        if (nomorBarang <= kumpulanBarangBelanja.size() && nomorBarang > 0){
            for (Toko barang : kumpulanBarang) {
                if (barang.getNama().equals(kumpulanBarangBelanja.get(nomorBarang - 1).getNama())) {
                    barang.setStock(barang.getStock() + kumpulanBarangBelanja.get(nomorBarang - 1).getJumlahBarang());
                    break;
                }
            }
            kumpulanBarangBelanja.remove(nomorBarang - 1);
            System.out.println("Barang berhasil dihapus!");
        } else{
            System.out.println("Nomor barang tidak ditemukan!");
        }
    }
    
    void tampilBadanTransaksi(ArrayList<Belanja> kumpulanBarangBelanja){
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.printf("%-5s%-100s%-15s%-20s%-20s%-11s\n", "No", "Nama", "Jumlah Barang", "Harga (Satuan)", "Pajak (Total)", "Subtotal");
        for (int i = 0; i < kumpulanBarangBelanja.size(); i++) {
            if (kumpulanBarangBelanja.get(i).getJumlahBarang() > 1) {
                System.out.printf("%-5s%-100s%-15s%-20s%-20s%-11s\n", String.valueOf(i + 1), kumpulanBarangBelanja.get(i).getNama(), String.valueOf(kumpulanBarangBelanja.get(i).getJumlahBarang()), ("Rp" + String.valueOf((double)kumpulanBarangBelanja.get(i).getHarga())), ("Rp" + String.valueOf(kumpulanBarangBelanja.get(i).pajakBarang(kumpulanBarangBelanja.get(i).getJumlahBarang()))), ("Rp" + String.valueOf(kumpulanBarangBelanja.get(i).subtotalBarangBelanja())));
            } else {
                System.out.printf("%-5s%-100s%-15s%-20s%-20s%-11s\n", String.valueOf(i + 1), kumpulanBarangBelanja.get(i).getNama(), String.valueOf(kumpulanBarangBelanja.get(i).getJumlahBarang()), ("Rp" + String.valueOf((double)kumpulanBarangBelanja.get(i).getHarga())), ("Rp" + String.valueOf(kumpulanBarangBelanja.get(i).pajakBarang())), ("Rp" + String.valueOf(kumpulanBarangBelanja.get(i).subtotalBarangBelanja())));
            }
        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }
    
    double totalTransaksi(ArrayList<Belanja> kumpulanBarangBelanja){
        double total = 0.0;
        for (Belanja barang : kumpulanBarangBelanja) {
            total += barang.subtotalBarangBelanja();
        }
        return total;
    }
    
    void transaksi(ArrayList<Belanja> kumpulanBarangBelanja){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date tanggal = new Date();
        Scanner inputAngka = new Scanner(System.in);
        BufferedReader inputHuruf = new BufferedReader(new InputStreamReader(System.in));
        String confirm = "", namaPembeli = "", alamatPembeli = "", nomorTeleponPembeli = "";
        double uangPembeli = 0.0;
        tampilBadanTransaksi(kumpulanBarangBelanja);
        System.out.println("Total\tRp" + totalTransaksi(kumpulanBarangBelanja));
        System.out.println("PERHATIKAN!");
        System.out.println("Jika memilih ya, maka transaksi tidak dapat dibatalkan!");
        try {
            System.out.print("Konfirmasi transaksi(y/n): ");
            confirm = inputHuruf.readLine();
        } catch(Exception e){
        }
        if (confirm.equals("y")) {
            try {
                System.out.print("Masukkan nama pembeli: ");
                namaPembeli = inputHuruf.readLine();
            } catch(Exception e){
            }
            try {
                System.out.print("Masukkan alamat pembeli: ");
                alamatPembeli = inputHuruf.readLine();
            } catch(Exception e){
            }
            try {
                System.out.print("Masukkan nomor telepon pembeli: ");
                nomorTeleponPembeli = inputHuruf.readLine();
            } catch(Exception e){
            }
            while (true) {
                System.out.print("Masukkan uang pembeli: ");
                uangPembeli = inputAngka.nextDouble();
                if (uangPembeli < totalTransaksi(kumpulanBarangBelanja)) {
                    System.out.println("Uang pembeli tidak cukup!");
                } else{
                    break;
                }
            }
            System.out.println("\n                                                                              FAKTUR PENJUALAN                                                                              ");
            System.out.println("                                                                                 " + sdf.format(tanggal) + "                                                                                 \n");
            System.out.printf("%-144s", "Akilektronika");
            System.out.print("Kepada Yth: " + namaPembeli + "\n");
            System.out.printf("%-144s", "Jl. Nasi Berantas No. 666");
            System.out.print(alamatPembeli + "\n");
            System.out.printf("%-144s", "Telp. 1234567 Namek");
            System.out.print(nomorTeleponPembeli + "\n\n");
            tampilBadanTransaksi(kumpulanBarangBelanja);
            System.out.printf("\n%-144s", "");
            System.out.print("Total         : Rp" + String.valueOf(totalTransaksi(kumpulanBarangBelanja)) + "\n");
            System.out.printf("%-144s", "");
            System.out.print("Dibayar       : Rp" + String.valueOf(uangPembeli) + "\n");
            System.out.printf("%-144s", "");
            System.out.print("Dibayar       : Rp" + String.valueOf((uangPembeli - totalTransaksi(kumpulanBarangBelanja))) + "\n");
            kumpulanBarangBelanja.clear();
        }
    }
    
    void kasir(ArrayList<Toko> kumpulanBarang){
        ArrayList<Belanja> kumpulanBarangBelanja = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        // Objek class Admin
        Admin admin = new Admin();

        while (true) {
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.println("%            Menu Kasir            %");
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.println("% <1> Tampil Barang                %");
            System.out.println("% <2> Tampil Barang Belanja        %");
            System.out.println("% <3> Tambah Barang Belanja        %");
            System.out.println("% <4> Ubah Jumlah Barang Belanja   %");
            System.out.println("% <5> Hapus Barang Belanja         %");
            System.out.println("% <6> Transaksi                    %");
            System.out.println("% <7> Kembali                      %");
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.print(" Masukkan pilihan menu: ");
            int menu = input.nextInt();
            System.out.println("");
            if (menu == 1) {
                if (!kumpulanBarang.isEmpty()){
                    admin.tampilBarang(kumpulanBarang);
                } else{
                    System.out.println("Tidak ada barang toko!");
                }
            } else if (menu == 2) {
                if (!kumpulanBarangBelanja.isEmpty()){
                    tampilBarangBelanja(kumpulanBarangBelanja);
                } else{
                    System.out.println("Tidak ada barang belanja!");
                }
            } else if (menu == 3) {
                if (stockBarang(kumpulanBarang) > 0 && !kumpulanBarang.isEmpty()){
                    tambahBarangBelanja(kumpulanBarang, kumpulanBarangBelanja, admin);
                } else{
                    System.out.println("Tidak ada stock barang toko yang tersisa!");
                }
            } else if (menu == 4) {
                if (!kumpulanBarangBelanja.isEmpty()){
                    ubahJumlahBarangBelanja(kumpulanBarang, kumpulanBarangBelanja);
                } else {
                    System.out.println("Tidak ada barang belanja!");
                }
            } else if (menu == 5) {
                if (!kumpulanBarangBelanja.isEmpty()){
                    hapusBarangBelanja(kumpulanBarang, kumpulanBarangBelanja);
                } else{
                    System.out.println("Tidak ada barang belanja!");
                }
            } else if (menu == 6) {
                if (!kumpulanBarangBelanja.isEmpty()){
                    transaksi(kumpulanBarangBelanja);
                } else{
                    System.out.println("Tidak ada barang belanja!");
                }
            } else if (menu == 7) {
                BufferedReader inputHuruf = new BufferedReader(new InputStreamReader(System.in));
                String confirm = "";
                try {
                    System.out.print("Konfirmasi untuk keluar(y/n): ");
                    confirm = inputHuruf.readLine();
                } catch(Exception e){
                }
                if (confirm.equals("y")) {
                    for (int i = 0; i < kumpulanBarangBelanja.size(); i++) {
                        for (int j = 0; j < kumpulanBarang.size(); j++) {
                            if (kumpulanBarangBelanja.get(i).getNama().equals(kumpulanBarang.get(j).getNama())) {
                                kumpulanBarang.get(j).setStock(kumpulanBarangBelanja.get(i).getJumlahBarang() + kumpulanBarang.get(j).getStock());
                            }
                        }
                    }
                    System.out.println("");
                    break;
                }
            } else {
                System.out.println("Menu tidak ditemukan!");
            }
            System.out.println("");
        }
    }
}
