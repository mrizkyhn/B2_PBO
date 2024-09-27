
package Posttest6;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static Posttest6.admin.dataMakanan;

public class kasir {

    static int index;
    static ArrayList<penjualan> dataPenjualan = new ArrayList<>();
    static BufferedReader dataInput = new BufferedReader(new InputStreamReader(System.in));
    static Scanner input1 = new Scanner(System.in);
    static Scanner input = new Scanner(System.in);
    

    
    static void menu_kasir() throws IOException {
        transaksi checkout = new transaksi();
        System.out.println("Penjualan Kue Lebaran");
        System.out.println("1. Read Data");
        System.out.println("2. Create Data");
        System.out.println("3. Update Data");
        System.out.println("4. Delete Data");
        System.out.println("5. Belanja");
        System.out.println("6. Back Menu");
        System.out.print("Pilih nomor: ");
        index = input.nextInt();
        switch (index) {
            case 1:
                ReadbarangPenjualan();
                break;
            case 2:
                CreatebarangPenjualan();
                break;
            case 3:
                UpdatebarangBelanja();
                break;
            case 4:
                DeletebarangBelanja();
                break;
            case 5:
                checkout.bayar();
                break;
            case 6:
                main.menu();
                break;
            default:
                System.out.println("Masukkan Pilihan Nomor Yang Tepat!!!");
                menu_kasir();
        }
    }  
    
    static boolean keranjang(makanan_ringan dataSimpan){

        for (int i = 0; i < dataPenjualan.size(); i++) {
            if (dataPenjualan.get(i).getNama()==(dataSimpan.getNama())){
                return true;
            }
        }
        return false;
    }

    static void CreatebarangPenjualan() throws IOException {
        System.out.println("===================================================================================");
        System.out.printf("%-5s%-25s%-15s%-10s%-15s%-15s\n", "No", "Nama", "Merk", "Berat", "Stock", "Harga");
        System.out.println("===================================================================================");
        for (int i = 0; i < dataMakanan.size(); i++){
            System.out.printf("%-5s%-25s%-15s%-10s%-15s%-15s\n",String.valueOf(i + 1), dataMakanan.get(i).getNama(),dataMakanan.get(i).getMerk(), String.valueOf(dataMakanan.get(i).getBerat()), String.valueOf(dataMakanan.get(i).getStock()), String.valueOf(dataMakanan.get(i).getHarga()));
        }
        System.out.println("===================================================================================");

        System.out.print("Pilih barang yang akan dibeli: ");
        int indeks = input.nextInt();
        
        if (indeks <= dataMakanan.size()){
            System.out.print("Masukkan Jumlah Barang Yang Akan Dibeli: ");
            int jumlah = input.nextInt();
            
            if (jumlah <= dataMakanan.get(indeks - 1).getStock()){
               System.out.println("");
               if (!(keranjang(dataMakanan.get(indeks - 1)))){
               penjualan simpan = new penjualan(dataMakanan.get(indeks - 1).getNama(), dataMakanan.get(indeks - 1).getMerk(), dataMakanan.get(indeks - 1).getHarga(), jumlah);
               dataPenjualan.add(simpan);
               dataMakanan.get(indeks - 1).setStock(dataMakanan.get(indeks - 1).getStock() - jumlah);
               System.out.println("Barang belanja berhasil ditambahkan!");
               System.out.println("\nMasukan lagi? [y/n]");
               String lagi = input.next();
               if (lagi.equalsIgnoreCase("y")) {
               CreatebarangPenjualan();
                } else {
                  menu_kasir();
                }
               }
            }else{
                for (int i = 0; i < dataPenjualan.size(); i++) {
                    if (dataPenjualan.get(i).getNama() == (dataMakanan.get(indeks - 1).getNama())){
                        dataPenjualan.get(i).setJumlah(dataPenjualan.get(i).getJumlah() + jumlah);
                            dataMakanan.get(indeks - 1).setStock(dataMakanan.get(indeks - 1).getStock() - jumlah);
                            break;
                    }
                }
                System.out.println("Data Penjualan berhasil ditambahkan!");
                }
        }else{
            System.out.println("");
            System.out.println("Barang tidak ditemukan!");
        }
    }
    
    static void ReadbarangPenjualan() throws IOException {
        System.out.println("===================================================================================");
        System.out.printf("%-5s%-25s%-15s%-15s%-15s\n", "No", "Nama", "Merk", "Jumlah", "Harga");
        System.out.println("===================================================================================");
        for (int i = 0; i < dataPenjualan.size(); i++){
            System.out.printf("%-5s%-25s%-15s%-15s%-15s\n",String.valueOf(i + 1), dataPenjualan.get(i).getNama(),dataPenjualan.get(i).getMerk(), String.valueOf(dataPenjualan.get(i).getJumlah()), String.valueOf(dataPenjualan.get(i).getHarga()));
        }
        System.out.println("===================================================================================");
        menu_kasir();
    }

    static void UpdatebarangBelanja() throws IOException {
        System.out.print("Masukkan pilihan barang: ");
        int indeks = input.nextInt();
        if (indeks <= dataPenjualan.size()) {
            for (int i = 0; i < dataMakanan.size(); i++) {
                if (dataPenjualan.get(indeks - 1).getNama()==(dataMakanan.get(i).getNama())){
                    System.out.println("");
                    System.out.println("Stock barang yang tersedia: " + (dataMakanan.get(i).getStock() + dataPenjualan.get(indeks - 1).getJumlah()));
                    System.out.println("");
                    System.out.print("Masukkan Jumlah Barang Baru Yang Akan Dibeli: ");
                    int jumlah = input.nextInt();
                    System.out.println("");
                    if (jumlah <= (dataMakanan.get(i).getStock() + dataPenjualan.get(indeks - 1).getJumlah())){
                        dataMakanan.get(i).setStock(dataMakanan.get(i).getStock() + dataPenjualan.get(indeks - 1).getJumlah() - jumlah);
                        dataPenjualan.get(indeks - 1).setJumlah(jumlah);
                        System.out.println("Jumlah barang belanja berhasil diubah!");
                        menu_kasir();
                    } else{
                        System.out.println("Jumlah barang tidak mencukupi!");
                        menu_kasir();
                    }
                }
            }
        } else {
            System.out.println("");
            System.out.println("Barang Tidak Ditemukan!");
            menu_kasir();
        }
    }
    
    static void DeletebarangBelanja() throws IOException {
        System.out.print("Masukkan nomor barang: ");
        int indeks = input.nextInt();
        System.out.println("");
        if (indeks <= dataPenjualan.size()){
            for (int i = 0; i < dataMakanan.size(); i++) {
                if (dataMakanan.get(i).getNama()==(dataPenjualan.get(indeks - 1).getNama())){
                    dataMakanan.get(i).setStock(dataMakanan.get(i).getStock() + dataPenjualan.get(indeks - 1).getJumlah());
                    break;
                }
            }
            dataPenjualan.remove(indeks - 1);
            System.out.println("Barang berhasil dihapus!");
            menu_kasir();
        } else{
            System.out.println("Nomor barang tidak ditemukan!");
            menu_kasir();
        }
    
    }

}