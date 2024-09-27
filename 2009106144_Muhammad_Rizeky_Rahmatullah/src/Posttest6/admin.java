
package Posttest6;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class admin {
    static int index;
    static makanan_ringan kue1 = new makanan_ringan("Lidah Kucing", "Butterfly", 120000, 10, 500);
    static makanan_ringan kue2 = new makanan_ringan("Kastangel", "Butterfly", 130000, 5, 500);
    static makanan_ringan kue3 = new makanan_ringan("Putri Salju", "Butterfly", 110000, 12, 500);
    static ArrayList<makanan_ringan> dataMakanan = new ArrayList<>(Arrays.asList(kue1,kue2,kue3));
    static BufferedReader dataInput = new BufferedReader(new InputStreamReader(System.in));
    static Scanner input1 = new Scanner(System.in);
    static Scanner input = new Scanner(System.in);
    
    static void menu_admin() throws IOException {
        System.out.println("Penjualan Kue Lebaran");
        System.out.println("1. Read Data");
        System.out.println("2. Create Data");
        System.out.println("3. Update Data");
        System.out.println("4. Delete Data");
        System.out.println("5. Back Menu");
        System.out.print("Pilih nomor: ");
        index = input.nextInt();
        switch (index) {
            case 1:
                Readbarang();
                break;
            case 2:
                Createbarang();
                break;
            case 3:
                Updatebarang();
                break;
            case 4:
                Deletebarang();
                break;
            case 5:
                main.menu();
                break;
            default:
                System.out.println("Masukkan Pilihan Nomor Yang Tepat!!!");
                menu_admin();
        }
    }  

    static void Createbarang() throws IOException {
        System.out.print("Masukkan Nama : ");
        String nama = dataInput.readLine();
        System.out.print("Masukkan Merk : ");
        String merk = dataInput.readLine();
        System.out.print("Masukkan Berat : ");
        int berat = input1.nextInt();
        System.out.print("Masukkan Stock : ");
        int stock = input1.nextInt();
        System.out.print("Masukkan Harga : ");
        int harga = input1.nextInt();
        
        makanan_ringan simpan = new makanan_ringan();
        simpan.setNama(nama);
        simpan.setMerk(merk);
        simpan.setBerat(berat);
        simpan.setStock(stock);
        simpan.setHarga(harga);
        
        dataMakanan.add(simpan);
        
        System.out.println("\nMasukan lagi? [y/n]");
        String lagi = input.next();
        if (lagi.equalsIgnoreCase("y")) {
             Createbarang();
         } else {
            makanan.tambah_data();
            menu_admin();
         }
    }

    static void Readbarang() throws IOException {
        System.out.println("===================================================================");
        System.out.printf("%-5s%-20s%-15s%-10s%-10s%-10s\n", "No", "Nama", "Merk", "Berat", "Stock", "Harga");
        System.out.println("===================================================================");
        for (int i = 0; i < dataMakanan.size(); i++){
            System.out.printf("%-5s%-20s%-15s%-10s%-10s%-10s\n",String.valueOf(i + 1), dataMakanan.get(i).getNama(),dataMakanan.get(i).getMerk(), String.valueOf(dataMakanan.get(i).getBerat()), String.valueOf(dataMakanan.get(i).getStock()), String.valueOf(dataMakanan.get(i).getHarga()));
        }
        System.out.println("===================================================================");
        menu_admin();
    }

    static void Updatebarang() throws IOException {

        System.out.print("Masukkan Indeks : ");
        int indeks = input1.nextInt();
        System.out.print("Masukkan Nama : ");
        String nama = dataInput.readLine();
        System.out.print("Masukkan Merk : ");
        String merk = dataInput.readLine();
        System.out.print("Masukkan Berat : ");
        int berat = input1.nextInt();
        System.out.print("Masukkan Stock : ");
        int stock = input1.nextInt();
        System.out.print("Masukkan Harga : ");
        int harga = input1.nextInt();
        
        dataMakanan.set(indeks - 1, new makanan_ringan(nama,merk,harga,stock,berat));
        makanan.update_data();
        menu_admin();
    }
    
    static void Deletebarang() throws IOException {
        System.out.println("===================================================================");
        System.out.printf("%-5s%-20s%-15s%-10s%-10s%-10s\n", "No", "Nama", "Merk", "Berat", "Stock", "Harga");
        System.out.println("===================================================================");
        for (int i = 0; i < dataMakanan.size(); i++){
            System.out.printf("%-5s%-20s%-15s%-10s%-10s%-10s\n",String.valueOf(i + 1), dataMakanan.get(i).getNama(),dataMakanan.get(i).getMerk(), String.valueOf(dataMakanan.get(i).getBerat()), String.valueOf(dataMakanan.get(i).getStock()), String.valueOf(dataMakanan.get(i).getHarga()));
        }
        System.out.println("===================================================================");
        System.out.print("Pilih Nomor : ");
        int indeks = input.nextInt();
        if ((indeks - 1) < dataMakanan.size()){
            dataMakanan.remove(indeks - 1);
            System.out.println("");
            makanan.hapus_data();
            System.out.println("");
        } else{
            System.out.println("");
            System.out.println("Barang tidak ditemukan!");
            System.out.println("");
        }
         
    menu_admin();
    
    }

}
