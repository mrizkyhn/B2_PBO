
package Posttest2;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class admin {
    static int index;
    static Barang kue1 = new Barang("Lidah Kucing", "Butterfly", 500, 10, 120000);
    static Barang kue2 = new Barang("Kastangel", "Butterfly", 500, 5, 130000);
    static Barang kue3 = new Barang("Putri Salju", "Butterfly", 500, 12, 110000);
    static ArrayList<Barang> dataBarang = new ArrayList<>(Arrays.asList(kue1,kue2,kue3));
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
        
        dataBarang.add(new Barang(nama,merk,berat,stock,harga));
        
        System.out.println("\nMasukan lagi? [y/n]");
        String lagi = input.next();
        if (lagi.equalsIgnoreCase("y")) {
             Createbarang();
         } else {
            Barang.tambah_data();
             menu_admin();
         }
    }

    static void Readbarang() throws IOException {
        System.out.println("-----------------");
        for(Barang barang: admin.dataBarang){
            barang.print_data();
            System.out.println("-----------------");
        }
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
        
        dataBarang.set(indeks, new Barang(nama,merk,berat,stock,harga));
       
        menu_admin();
    }
    
    static void Deletebarang() throws IOException {
        System.out.print("Masukkan Indeks : ");
        int indeks = input.nextInt();
        dataBarang.remove(indeks);
        Barang.hapus_data();
    
    menu_admin();
    
    }

}