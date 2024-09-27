

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

    static int index;
    static ArrayList<Barang> dataBarang = new ArrayList<>();
    static BufferedReader dataInput = new BufferedReader(new InputStreamReader(System.in));
    static Scanner input1 = new Scanner(System.in);
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) throws IOException {

        menu();
    }

    static void menu() throws IOException {
        System.out.println("Penjualan Kue Lebaran");
        System.out.println("1. Read Data");
        System.out.println("2. Create Data");
        System.out.println("3. Update Data");
        System.out.println("4. Delete Data");
        System.out.println("5. Exit");
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
                System.out.println("Anda Telah Keluar Dari Program ");
                break;
            default:
                System.out.println("Masukkan Pilihan Nomor Yang Tepat!!!");
                menu();
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
        String again = input.next();
        if (again.equalsIgnoreCase("y")) {
             Createbarang();
         } else {
             menu();
         }
    }

    static void Readbarang() throws IOException {
        System.out.println("-----------------");
        for(Barang barang: main.dataBarang){
            barang.print_data();
            System.out.println("-----------------");
        }

        menu();
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
       
        menu();
    }
    
    static void Deletebarang() throws IOException {
        System.out.print("Masukkan Indeks : ");
        int indeks = input.nextInt();
        
        dataBarang.remove(indeks);
    
    menu();
    }

}







    

