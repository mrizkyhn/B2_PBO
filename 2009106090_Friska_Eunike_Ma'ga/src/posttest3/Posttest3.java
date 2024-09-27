/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest3;
//import posttest2.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class Posttest3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Input = new Scanner(System.in);
        String InputMenu;
        boolean Conti = true;
        ArrayList Order = new ArrayList<>();
        ArrayList HargaOrder = new ArrayList<>();
        ArrayList TipeOrder = new ArrayList<>();
        int ubahHarga;
        
        AlatMusik Gitar1 = new AlatMusik("Gitar","Gitar Akustik",2000000);
        AlatMusik Gitar2 = new AlatMusik("Gitar","Gitar Classic",1500000);
        AlatMusik Gitar3 = new AlatMusik("Gitar","Gitar Elektrik",3000000);
        
        AlatMusik Bass1 = new AlatMusik("Bass","Bass Akustik",2600000);
        AlatMusik Bass2 = new AlatMusik("Bass","Bass Elektrik Senar 4",3000000);
        AlatMusik Bass3 = new AlatMusik("Bass","Bass Elektrik Senar 5",4000000);

        AlatMusik Piano1 = new AlatMusik("Piano","Grand Piano",95000000);
        AlatMusik Piano2 = new AlatMusik("Piano","Piano Digital",13000000);
        AlatMusik Piano3 = new AlatMusik("Piano","Keyboard",9000000);

        AlatMusik Drum1 = new AlatMusik("Drum","Drum Akustik",12600000);
        AlatMusik Drum2 = new AlatMusik("Drum","Drum Elektrik",8000000);        
        
        
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
            System.out.println("5.Mengubah Data Barang");
            System.out.println("6.Exit");

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
                                        TipeOrder.add(Gitar1.getTipe());
                                        Order.add(Gitar1.getJenis());
                                        HargaOrder.add(Gitar1.getHarga());
//                                        System.out.println(Gitar1.tipe);
                                        System.out.println(Gitar1.getTipe());
//                                        System.out.println("Harga : " + Gitar1.harga);
                                        System.out.println("Harga : " + Gitar1.getHarga());
                                        break;
                                    case "2" :
                                        TipeOrder.add(Gitar2.getTipe());
                                        Order.add(Gitar2.getJenis());
                                        HargaOrder.add(Gitar2.getHarga());
                                        System.out.println(Gitar2.getTipe());
                                        System.out.println("Harga : " + Gitar2.getHarga());
                                        break;
                                    case "3" :
                                        TipeOrder.add(Gitar3.getTipe());
                                        Order.add(Gitar3.getJenis());
                                        HargaOrder.add(Gitar3.getHarga());
                                        System.out.println(Gitar3.getTipe());
                                        System.out.println("Harga : " + Gitar3.getHarga());
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
                                        TipeOrder.add(Bass1.getTipe());
                                        Order.add(Bass1.getJenis());
                                        HargaOrder.add(Bass1.getHarga());
                                        System.out.println(Bass1.getTipe());
                                        System.out.println("Harga : " + Bass1.getHarga());
                                    break;
                                case "2":
                                    TipeOrder.add(Bass2.getTipe());
                                        Order.add(Bass2.getJenis());
                                        HargaOrder.add(Bass2.getHarga());
                                        System.out.println(Bass2.getTipe());
                                        System.out.println("Harga : " + Bass2.getHarga());
                                    break;
                                case "3":
                                        TipeOrder.add(Bass3.getTipe());
                                        Order.add(Bass3.getJenis());
                                        HargaOrder.add(Bass3.getHarga());
                                        System.out.println(Bass3.getTipe());
                                        System.out.println("Harga : " + Bass3.getHarga());
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
                                        TipeOrder.add(Piano1.getTipe());
                                        Order.add(Piano1.getJenis());
                                        HargaOrder.add(Piano1.getHarga());
                                        System.out.println(Piano1.getTipe());
                                        System.out.println("Harga : " + Piano1.getHarga());
                                    break;
                                case "2":
                                    TipeOrder.add(Piano2.getTipe());
                                        Order.add(Piano2.getJenis());
                                        HargaOrder.add(Piano2.getHarga());
                                        System.out.println(Piano2.getTipe());
                                        System.out.println("Harga : " + Piano2.getHarga());
                                    break;
                                case "3":
                                    TipeOrder.add(Piano3.getTipe());
                                        Order.add(Piano3.getJenis());
                                        HargaOrder.add(Piano3.getHarga());
                                        System.out.println(Piano3.getTipe());
                                        System.out.println("Harga : " + Piano3.getHarga());
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
                                    TipeOrder.add(Drum1.getTipe());
                                        Order.add(Drum1.getJenis());
                                        HargaOrder.add(Drum1.getHarga());
                                        System.out.println(Drum1.getTipe());
                                        System.out.println("Harga : " + Drum1.getHarga());
                                    break;
                                case "2":
                                    TipeOrder.add(Drum2.getTipe());
                                        Order.add(Drum2.getJenis());
                                        HargaOrder.add(Drum2.getHarga());
                                        System.out.println(Drum2.getTipe());
                                        System.out.println("Harga : " + Drum2.getHarga());
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
                        System.out.println(TipeOrder.get(i));
                        System.out.println("Harga : Rp." +HargaOrder.get(i)+"\n");
                    }
                    //buat pesan jika data masih kosong
                    //buat total harga
                    
                    break;
                case "3" :
                    System.out.println("=== Ubah Pesanan ===");
//                    UbahData();
                    for(int i = 0; i < Order.size();i++){
                        System.out.println(Order.get(i));
                        System.out.println(TipeOrder.get(i));
                        System.out.println("Harga : Rp." +HargaOrder.get(i)+"\n");
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
                                        TipeOrder.set(Ubah,Gitar1.getTipe());
                                        Order.set(Ubah,Gitar1.getJenis());
                                        HargaOrder.set(Ubah,Gitar1.getHarga());
                                        System.out.println(Gitar1.getTipe());
                                        System.out.println("Harga : " + Gitar1.getHarga());
                                        break;
                                    case "2" :
                                        TipeOrder.set(Ubah,Gitar2.getTipe());
                                        Order.set(Ubah,Gitar2.getJenis());
                                        HargaOrder.set(Ubah,Gitar2.getHarga());
                                        System.out.println(Gitar2.getTipe());
                                        System.out.println("Harga : " + Gitar2.getHarga());
                                        break;
                                    case "3" :
                                        TipeOrder.set(Ubah,Gitar3.getTipe());
                                        Order.set(Ubah,Gitar3.getJenis());
                                        HargaOrder.set(Ubah,Gitar3.getHarga());
                                        System.out.println(Gitar3.getTipe());
                                        System.out.println("Harga : " + Gitar3.getHarga());
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
                                        TipeOrder.set(Ubah,Bass1.getTipe());
                                        Order.set(Ubah,Bass1.getJenis());
                                        HargaOrder.set(Ubah,Bass1.getHarga());
                                        System.out.println(Bass1.getTipe());
                                        System.out.println("Harga : " + Bass1.getHarga());
                                    break;
                                case "2":
                                    TipeOrder.set(Ubah,Bass2.getTipe());
                                        Order.set(Ubah,Bass2.getJenis());
                                        HargaOrder.set(Ubah,Bass2.getHarga());
                                        System.out.println(Bass2.getTipe());
                                        System.out.println("Harga : " + Bass2.getHarga());
                                    break;
                                case "3":
                                        TipeOrder.set(Ubah,Bass3.getTipe());
                                        Order.set(Ubah,Bass3.getJenis());
                                        HargaOrder.set(Ubah,Bass3.getHarga());
                                        System.out.println(Bass3.getTipe());
                                        System.out.println("Harga : " + Bass3.getHarga());
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
                                        TipeOrder.set(Ubah,Piano1.getTipe());
                                        Order.set(Ubah,Piano1.getJenis());
                                        HargaOrder.set(Ubah,Piano1.getHarga());
                                        System.out.println(Piano1.getTipe());
                                        System.out.println("Harga : " + Piano1.getHarga());
                                    break;
                                case "2":
                                    TipeOrder.set(Ubah,Piano2.getTipe());
                                        Order.set(Ubah,Piano2.getJenis());
                                        HargaOrder.set(Ubah,Piano2.getHarga());
                                        System.out.println(Piano2.getTipe());
                                        System.out.println("Harga : " + Piano2.getHarga());
                                    break;
                                case "3":
                                    TipeOrder.set(Ubah,Piano3.getTipe());
                                        Order.set(Ubah,Piano3.getJenis());
                                        HargaOrder.set(Ubah,Piano3.getHarga());
                                        System.out.println(Piano3.getTipe());
                                        System.out.println("Harga : " + Piano3.getHarga());
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
                                    TipeOrder.set(Ubah,Drum1.getTipe());
                                        Order.set(Ubah,Drum1.getJenis());
                                        HargaOrder.set(Ubah,Drum1.getHarga());
                                        System.out.println(Drum1.getTipe());
                                        System.out.println("Harga : " + Drum1.getHarga());
                                    break;
                                case "2":
                                    TipeOrder.set(Ubah,Drum2.getTipe());
                                        Order.set(Ubah,Drum2.getJenis());
                                        HargaOrder.set(Ubah,Drum2.getHarga());
                                        System.out.println(Drum2.getTipe());
                                        System.out.println("Harga : " + Drum2.getHarga());
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
                        System.out.println(TipeOrder.get(i));
                        System.out.println("Harga : Rp." +HargaOrder.get(i)+ "\n");
                    }
                    int Hapus;
                    System.out.println("Masukkan Index Barang yang ingin dihapus :");
                    Hapus = Input.nextInt();
                    System.out.println(Order.get(Hapus)+ " telah berhasil dihapus dari data Pesanan");
                    Order.remove(Hapus);
                    TipeOrder.remove(Hapus);
                    HargaOrder.remove(Hapus);
                    //Order.clear(); semua terhapus
                    break;
                
                case "5" :
                    System.out.println("=== Mengubah Data Harga Barang ===");
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
                                        System.out.println("Harga : " + Gitar1.getHarga());
                                        System.out.print("\nMasukkan harga baru : ");
                                        ubahHarga = Input.nextInt();
                                        Gitar1.setHarga(ubahHarga);
                                        break;
                                    case "2" :
                                        System.out.println("Harga : " + Gitar2.getHarga());
                                        System.out.print("\nMasukkan harga baru : ");
                                        ubahHarga = Input.nextInt();
                                        Gitar2.setHarga(ubahHarga);
                                        break;
                                    case "3" :
                                        System.out.println("Harga : " + Gitar3.getHarga());
                                        System.out.print("\nMasukkan harga baru : ");
                                        ubahHarga = Input.nextInt();
                                        Gitar3.setHarga(ubahHarga);
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
                                        System.out.println("Harga : " + Bass1.getHarga());
                                        System.out.print("\nMasukkan harga baru : ");
                                        ubahHarga = Input.nextInt();
                                        Bass1.setHarga(ubahHarga);
                                    break;
                                case "2":
                                        System.out.println("Harga : " + Bass2.getHarga());
                                        System.out.print("\nMasukkan harga baru : ");
                                        ubahHarga = Input.nextInt();
                                        Bass2.setHarga(ubahHarga);
                                    break;
                                case "3":
                                        System.out.println("Harga : " + Bass3.getHarga());
                                        System.out.print("\nMasukkan harga baru : ");
                                        ubahHarga = Input.nextInt();
                                        Bass3.setHarga(ubahHarga);
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
                                        System.out.println("Harga : " + Piano1.getHarga());
                                        System.out.print("\nMasukkan harga baru : ");
                                        ubahHarga = Input.nextInt();
                                        Piano1.setHarga(ubahHarga);
                                    break;
                                case "2":
                                        System.out.println("Harga : " + Piano2.getHarga());
                                        System.out.print("\nMasukkan harga baru : ");
                                        ubahHarga = Input.nextInt();
                                        Piano2.setHarga(ubahHarga);
                                    break;
                                case "3":
                                        System.out.println("Harga : " + Piano3.getHarga());
                                        System.out.print("\nMasukkan harga baru : ");
                                        ubahHarga = Input.nextInt();
                                        Piano3.setHarga(ubahHarga);
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
                                        System.out.println("Harga : " + Drum1.getHarga());
                                        System.out.print("\nMasukkan harga baru : ");
                                        ubahHarga = Input.nextInt();
                                        Drum1.setHarga(ubahHarga);
                                    break;
                                case "2":
                                        System.out.println("Harga : " + Drum2.getHarga());
                                        System.out.print("\nMasukkan harga baru : ");
                                        ubahHarga = Input.nextInt();
                                        Drum2.setHarga(ubahHarga);
                                    break;
                                }
                                break;             
                            default :
                                System.err.println("\n Pilihan Tidak Ada!!!");                    
                    }   
                    break;
                    
                case "6" :
                    Conti = false;
                    System.out.println("=== TERIMAKASIH ===");
                    break;                    
                default :
                    System.err.println("\n Pilihan Tidak Ada!!!");
            }
        }   
    }
}