/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest1;

import posttest2.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Posttest1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        String InputMenu;
        boolean Conti = true;
        ArrayList Order = new ArrayList<>();
        ArrayList HargaOrder = new ArrayList<>();
        
        while (Conti){
            System.out.println("---------------------------------");
            System.out.println("Program Penjualan Alat Musik");
            System.out.println("---------------------------------\n");

            System.out.println("--- Menu CRUD ---\n");
//            System.out.println("1.Melihat data Barang");
            System.out.println("1.Membuat Pesanan");
            System.out.println("2.Melihat Pesanan");
            System.out.println("3.Mengubah Pesanan");
            System.out.println("4.Menghapus Pesanan");
            System.out.println("5.Exit");

            System.out.println("\nMasukkan pilihan anda : ");
            InputMenu = Input.next();

            switch (InputMenu){
//                case "1" :
//                    System.out.println("=== Data Barang ===");
//                    BacaBarang();
//                    break;
                case "1" :
                    System.out.println("=== Buat Pesanan ===");
//                    TambahData();
     
                    System.out.println("Tambah data");

                    System.out.println("\t---Data Barang---");
                    System.out.println("1.Gitar");
                    System.out.println("2.Bass");
                    System.out.println("3.Keyboard");
                    System.out.println("4.Drum");

                    Scanner Barang = new Scanner(System.in);
                    String Category;
                    String Gitar;
                    String Bass;
                    String Piano;
                    String Drum;
                    System.out.println("\nMasukkan pilihan anda (1-4) : ");
                    Category = Barang.next();        

                    switch (Category){
                            case "1" :
                                System.out.println("\t=== Gitar ===");
                                System.out.println("1.Gitar Akustik");
                                System.out.println("2.Gitar Classic");
                                System.out.println("3.Gitar Elektrik");
                                System.out.println("\nMasukkan pilihan anda (1-3) : ");
                                Gitar = Barang.next();
//                                System.out.println(Gitar);
                                switch(Gitar){
                                    case "1" :
                                        Order.add("Gitar Akustik");
                                        HargaOrder.add(2000000);
                                        System.out.println("Gitar Akustik");
                                        System.out.println("Harga : Rp.2.000.000");
                                        break;
                                    case "2" :
                                        Order.add("Gitar Classic");
                                        HargaOrder.add(1500000);
                                        System.out.println("Gitar Classic");
                                        System.out.println("Harga : Rp.1.500.000");
                                        break;
                                    case "3" :
                                        Order.add("Gitar Elektrik");
                                        HargaOrder.add(3000000);
                                        System.out.println("Gitar Elektrik");
                                        System.out.println("Harga : Rp.3.000.000");
                                        break;
                                    default:
                                        System.err.println("\n Pilihan Tidak Ada!!!");
                                        break;
                                
                                    }
                                
                                break;
                            case "2" :
                                System.out.println("\t=== Bass ===");
                                System.out.println("1.Bass Akustik");
                                System.out.println("2.Bass 4 Senar");
                                System.out.println("3.Bass 5 Senar");
                                System.out.println("\nMasukkan pilihan anda (1-3) : ");
                                Bass = Barang.next();
                                switch(Bass){
                                    case "1":
                                    Order.add("Bass Akustik");
                                    HargaOrder.add(2600000);
                                    System.out.println("Bass Akustik");
                                    System.out.println("Harga : Rp.2.600.000");
                                    break;
                                case "2":
                                    Order.add("Bass 4 Senar");
                                    HargaOrder.add(3000000);
                                    System.out.println("Bass 4 Senar");
                                    System.out.println("Harga : Rp.3.000.000");
                                    break;
                                case "3":
                                    Order.add("Bass 5 Senar");
                                    HargaOrder.add(4000000);
                                    System.out.println("Bass 5 Senar");
                                    System.out.println("Harga : Rp.4.000.000");
                                    break;
                                default:
                                    System.err.println("\n Pilihan Tidak Ada!!!");
                                    break;
                                }
                                break;
                            case "3" :
                                System.out.println("=== Piano ===");                    
                                System.out.println("1.Grand Piano ");
                                System.out.println("2.Piano Digital");
                                System.out.println("3.Keyboard");
                                System.out.println("\nMasukkan pilihan anda (1-3) : ");
                                Piano = Barang.next();                  
                                switch(Piano){
                                    case "1":
                                    Order.add("Grand Piano");
                                    HargaOrder.add(95000000);
                                    System.out.println("Grand Piano");
                                    System.out.println("Harga : Rp.95.000.000");
                                    break;
                                case "2":
                                    Order.add("Piano Digital");
                                    HargaOrder.add(13000000);
                                    System.out.println("Piano Digital");
                                    System.out.println("Harga : Rp.13.000.000");
                                    break;
                                case "3":
                                    Order.add("Keyboard");
                                    HargaOrder.add(9000000);
                                    System.out.println("Keyboard");
                                    System.out.println("Harga : Rp.9.000.000");
                                    break;
                                default:
                                    System.err.println("\n Pilihan Tidak Ada!!!");
                                    break;
                                }
                                break;

                            case "4" :
                                System.out.println("=== Drum ===");
                                System.out.println("1.Drum Akustik");
                                System.out.println("2.Drum Elektrik");                                
                                System.out.println("\nMasukkan pilihan anda (1-2) : ");
                                Drum = Barang.next();
                                switch(Drum){
                                    case "1":
                                    Order.add("Drum Akustik");
                                    HargaOrder.add(12600000);
                                    System.out.println("Drum Akustik");
                                    System.out.println("Harga : Rp.12.600.000");
                                    break;
                                case "2":
                                    Order.add("Drum Elektrik");
                                    HargaOrder.add(8000000);
                                    System.out.println("Drum Elektrik");
                                    System.out.println("Harga : Rp.8.000.000");
                                    break;
                                }
                                break;               
                            default :
                                System.err.println("\n Pilihan Tidak Ada!!!");
                    }
                    
                    break;
                case "2" :
                    System.out.println("=== Lihat Pesanan ===");
//                    BacaData();
                    for(int i = 0; i < Order.size();i++){
                        System.out.println(Order.get(i));
                        System.out.println("Harga : Rp." +HargaOrder.get(i));
                    }
                    //buat pesan jika data masih kosong
                    //buat total harga
                    
                    break;
                case "3" :
                    System.out.println("=== Ubah Pesanan ===");
//                    UbahData();
                    for(int i = 0; i < Order.size();i++){
                        System.out.println(Order.get(i));
                        System.out.println("Harga : Rp." +HargaOrder.get(i));
                    }
                    System.out.println("Masukkan Index Barang yang ingin diubah :");
                    int Ubah;
                    Ubah = Input.nextInt();
                    
                    System.out.println("\t---Data Barang---");
                    System.out.println("1.Gitar");
                    System.out.println("2.Bass");
                    System.out.println("3.Keyboard");
                    System.out.println("4.Drum");

//                    Scanner Barang = new Scanner(System.in);
                    System.out.println("\nMasukkan pilihan anda (1-4) : ");
                    Category = Input.next(); 
                    
                    switch (Category){
                            case "1" :
                                System.out.println("\t=== Gitar ===");
                                System.out.println("1.Gitar Akustik");
                                System.out.println("2.Gitar Classic");
                                System.out.println("3.Gitar Elektrik");
                                System.out.println("\nMasukkan pilihan anda (1-3) : ");
                                Gitar = Input.next();
//                                System.out.println(Gitar);
                                switch(Gitar){
                                    case "1" :
                                        Order.set(Ubah,"Gitar Akustik");
                                        HargaOrder.set(Ubah,2000000);
                                        System.out.println("Gitar Akustik");
                                        System.out.println("Harga : Rp.2.000.000");
                                        break;
                                    case "2" :
                                        Order.set(Ubah,"Gitar Classic");
                                        HargaOrder.set(Ubah,1500000);
                                        System.out.println("Gitar Classic");
                                        System.out.println("Harga : Rp.1.500.000");
                                        break;
                                    case "3" :
                                        Order.set(Ubah,"Gitar Elektrik");
                                        HargaOrder.set(Ubah,3000000);
                                        System.out.println("Gitar Elektrik");
                                        System.out.println("Harga : Rp.3.000.000");
                                        break;
                                    default:
                                        System.err.println("\n Pilihan Tidak Ada!!!");
                                        break;
                                
                                    }
                                
                                break;
                            case "2" :
                                System.out.println("\t=== Bass ===");
                                System.out.println("1.Bass Akustik");
                                System.out.println("2.Bass 4 Senar");
                                System.out.println("3.Bass 5 Senar");
                                System.out.println("\nMasukkan pilihan anda (1-3) : ");
                                Bass = Input.next();
                                switch(Bass){
                                    case "1":
                                    Order.set(Ubah,"Bass Akustik");
                                    HargaOrder.set(Ubah,2600000);
                                    System.out.println("Bass Akustik");
                                    System.out.println("Harga : Rp.2.600.000");
                                    break;
                                case "2":
                                    Order.set(Ubah,"Bass 4 Senar");
                                    HargaOrder.set(Ubah,3000000);
                                    System.out.println("Bass 4 Senar");
                                    System.out.println("Harga : Rp.3.000.000");
                                    break;
                                case "3":
                                    Order.set(Ubah,"Bass 5 Senar");
                                    HargaOrder.set(Ubah,4000000);
                                    System.out.println("Bass 5 Senar");
                                    System.out.println("Harga : Rp.4.000.000");
                                    break;
                                default:
                                    System.err.println("\n Pilihan Tidak Ada!!!");
                                    break;
                                }
                                break;
                            case "3" :
                                System.out.println("=== Piano ===");                    
                                System.out.println("1.Grand Piano ");
                                System.out.println("2.Piano Digital");
                                System.out.println("3.Keyboard");
                                System.out.println("\nMasukkan pilihan anda (1-3) : ");
                                Piano = Input.next();                  
                                switch(Piano){
                                    case "1":
                                    Order.set(Ubah,"Grand Piano");
                                    HargaOrder.set(Ubah,95000000);
                                    System.out.println("Grand Piano");
                                    System.out.println("Harga : Rp.95.000.000");
                                    break;
                                case "2":
                                    Order.set(Ubah,"Piano Digital");
                                    HargaOrder.set(Ubah,13000000);
                                    System.out.println("Piano Digital");
                                    System.out.println("Harga : Rp.13.000.000");
                                    break;
                                case "3":
                                    Order.set(Ubah,"Keyboard");
                                    HargaOrder.set(Ubah,9000000);
                                    System.out.println("Keyboard");
                                    System.out.println("Harga : Rp.9.000.000");
                                    break;
                                default:
                                    System.err.println("\n Pilihan Tidak Ada!!!");
                                    break;
                                }
                                break;

                            case "4" :
                                System.out.println("=== Drum ===");
                                System.out.println("1.Drum Akustik");
                                System.out.println("2.Drum Elektrik");                                
                                System.out.println("\nMasukkan pilihan anda (1-2) : ");
                                Drum = Input.next();
                                switch(Drum){
                                    case "1":
                                    Order.set(Ubah,"Drum Akustik");
                                    HargaOrder.set(Ubah,12600000);
                                    System.out.println("Drum Akustik");
                                    System.out.println("Harga : Rp.12.600.000");
                                    break;
                                case "2":
                                    Order.set(Ubah,"Drum Elektrik");
                                    HargaOrder.set(Ubah,8000000);
                                    System.out.println("Drum Elektrik");
                                    System.out.println("Harga : Rp.8.000.000");
                                    break;
                                }
                                break;               
                            default :
                                System.err.println("\n Pilihan Tidak Ada!!!");
                    }
                    System.out.println("Barang pada index ke-" +Ubah+ " telah berhasil diubah");
                    break;
                    
                    
                    //pakai Order.set(Ubah,data);
//                    break;
                case "4" :
                    System.out.println("=== Hapus Pesanan ===");
//                    HapusData();
                    for(int i = 0; i < Order.size();i++){
                        System.out.println(Order.get(i));
                        System.out.println("Harga : Rp." +HargaOrder.get(i));
                    }
                    int Hapus;
                    System.out.println("Masukkan Index Barang yang ingin dihapus :");
                    Hapus = Input.nextInt();
                    System.out.println(Order.get(Hapus)+ " telah berhasil dihapus dari data Pesanan");
                    Order.remove(Hapus);
                    //Order.clear(); semua terhapus
                    break;
                case "5" :
                    Conti = false;
                    System.out.println("=== TERIMAKASIH ===");
                    break;                    
                default :
                    System.err.println("\n Pilihan Tidak Ada!!!");
            }
        }   
    }
    public static void BacaBarang(){
//        System.out.println("Tambah data");
//        
//        System.out.println("\t---Data Barang---");
//        System.out.println("1.Gitar");
//        System.out.println("2.Bass");
//        System.out.println("3.Keyboard");
//        System.out.println("4.Drum");
//        
//        Scanner Barang = new Scanner(System.in);
//        String Category;
//        String Gitar;
//        String Bass;
//        String Keyboard;
//        String Drum;
//        System.out.println("\nMasukkan pilihan anda (1-4) : ");
//        Category = Barang.next();        
//        
//        switch (Category){
//                case "1" :
//                    System.out.println("\t=== Gitar ===");
//                    System.out.println("1.Gitar Akustik");
//                    System.out.println("2.Gitar Classic");
//                    System.out.println("3.Gitar Elektrik");
//                    System.out.println("\nMasukkan pilihan anda (1-3) : ");
//                    Gitar = Barang.next();
//                    if (Gitar == "1"){
//                        System.out.println("Gitar Akustik");
//                        System.out.println("Harga : Rp.2.000.000");
//                    }else if (Gitar == "2"){
//                        System.out.println("Gitar Classic");
//                        System.out.println("Harga : Rp.1.500.000");
//                    }else if (Gitar == "3"){
//                        System.out.println("Gitar Elektrik");
//                        System.out.println("Harga : Rp.3.000.000");
//                    }else{
//                        System.err.println("\n Pilihan Tidak Ada!!!");
//                    }
//                    break;
//                case "2" :
//                    System.out.println("\t=== Bass ===");
//                    System.out.println("1.Bass Akustik");
//                    System.out.println("2.Bass 4 Senar");
//                    System.out.println("3.Bass 5 Senar");
//                    System.out.println("\nMasukkan pilihan anda (1-3) : ");
//                    Bass = Barang.next();
//                    if (Bass == "1"){
//                        System.out.println("Bass Akustik");
//                        System.out.println("Harga : Rp.2.600.000");
//                    }else if (Bass == "2"){
//                        System.out.println("Bass 4 Senar");
//                        System.out.println("Harga : Rp.3.000.000");
//                    }else if (Bass == "3"){
//                        System.out.println("Bass 5 Senar");
//                        System.out.println("Harga : Rp.4.000.000");
//                    }else{
//                        System.err.println("\n Pilihan Tidak Ada!!!");
//                    }
//                    break;
//                case "3" :
//                    System.out.println("=== Keyboard ===");                    
//                    System.out.println("1.Keyboard Akustik");
//                    System.out.println("2.Keyboard Senar");
//                    System.out.println("3.Keyboard Senar");
//                    System.out.println("\nMasukkan pilihan anda (1-3) : ");
//                    Keyboard = Barang.next();                  
//                    break;
//
//                case "4" :
//                    System.out.println("=== Drum ===");
//                    System.out.println("1.Drum Akustik");
//                    System.out.println("2.Drum 4 Senar");
//                    System.out.println("3.Drum 5 Senar");
//                    System.out.println("\nMasukkan pilihan anda (1-3) : ");
//                    Drum = Barang.next();
//                    break;               
//                default :
//                    System.err.println("\n Pilihan Tidak Ada!!!");
//            }        
        }
//    public static void TambahData(){
//        ArrayList Pesanan = new ArrayList<>();
//        
//        System.out.println("Tambah data");
//        
//        System.out.println("\t---Data Barang---");
//        System.out.println("1.Gitar");
//        System.out.println("2.Bass");
//        System.out.println("3.Keyboard");
//        System.out.println("4.Drum");
//        
//        Scanner Barang = new Scanner(System.in);
//        String Category;
//        String Gitar;
//        String Bass;
//        String Keyboard;
//        String Drum;
//        System.out.println("\nMasukkan pilihan anda (1-4) : ");
//        Category = Barang.next();        
//        
//        switch (Category){
//                case "1" :
//                    System.out.println("\t=== Gitar ===");
//                    System.out.println("1.Gitar Akustik");
//                    System.out.println("2.Gitar Classic");
//                    System.out.println("3.Gitar Elektrik");
//                    System.out.println("\nMasukkan pilihan anda (1-3) : ");
//                    Gitar = Barang.next();
//                    if (Gitar == "1"){
//                        Pesanan.add("Gitar Akustik");
//                        System.out.println("Gitar Akustik");
//                        System.out.println("Harga : Rp.2.000.000");
//                    }else if (Gitar == "2"){
//                        System.out.println("Gitar Classic");
//                        System.out.println("Harga : Rp.1.500.000");
//                    }else if (Gitar == "3"){
//                        System.out.println("Gitar Elektrik");
//                        System.out.println("Harga : Rp.3.000.000");
//                    }else{
//                        System.err.println("\n Pilihan Tidak Ada!!!");
//                    }
//                    break;
//                case "2" :
//                    System.out.println("\t=== Bass ===");
//                    System.out.println("1.Bass Akustik");
//                    System.out.println("2.Bass 4 Senar");
//                    System.out.println("3.Bass 5 Senar");
//                    System.out.println("\nMasukkan pilihan anda (1-3) : ");
//                    Bass = Barang.next();
//                    if (Bass == "1"){
//                        System.out.println("Bass Akustik");
//                        System.out.println("Harga : Rp.2.600.000");
//                    }else if (Bass == "2"){
//                        System.out.println("Bass 4 Senar");
//                        System.out.println("Harga : Rp.3.000.000");
//                    }else if (Bass == "3"){
//                        System.out.println("Bass 5 Senar");
//                        System.out.println("Harga : Rp.4.000.000");
//                    }else{
//                        System.err.println("\n Pilihan Tidak Ada!!!");
//                    }
//                    break;
//                case "3" :
//                    System.out.println("=== Keyboard ===");                    
//                    System.out.println("1.Keyboard Akustik");
//                    System.out.println("2.Keyboard Senar");
//                    System.out.println("3.Keyboard Senar");
//                    System.out.println("\nMasukkan pilihan anda (1-3) : ");
//                    Keyboard = Barang.next();                  
//                    break;
//
//                case "4" :
//                    System.out.println("=== Drum ===");
//                    System.out.println("1.Drum Akustik");
//                    System.out.println("2.Drum 4 Senar");
//                    System.out.println("3.Drum 5 Senar");
//                    System.out.println("\nMasukkan pilihan anda (1-3) : ");
//                    Drum = Barang.next();
//                    break;               
//                default :
//                    System.err.println("\n Pilihan Tidak Ada!!!");
//        }        
//        
//        
//        }
//    public static void BacaData(){
//        System.out.println("Tambah data");
//        }
//    public static void UbahData(){
//        System.out.println("Tambah data");
//        }
//    public static void HapusData(){
//        System.out.println("Tambah data");
//        }
}
