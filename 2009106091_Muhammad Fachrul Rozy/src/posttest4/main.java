/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;
import posttest3.*;
import posttest2.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 

public class main{
    static ArrayList<bangunan> bangunan = new ArrayList<bangunan>();
    static ArrayList<alatlistrik> alatlistrik = new ArrayList<>();
    static ArrayList<semen> semen = new ArrayList<>();
    private static String ukuran;
    
    public static void main(String[] args)throws Exception {
        
      while(true){
          bangunan();
      }
    }  
   public static void bangunan() throws IOException{
       InputStreamReader home = new InputStreamReader(System.in);
       BufferedReader input = new BufferedReader(home);
            System.out.println("");
            System.out.println("========TOKO BANGUNAN SINAR JAYA========");
            System.out.println("----------------------------------------------------");
            System.out.println("1. Masukkan Data Barang Bangunan");
            System.out.println("2. Lihat Data Toko Bangunan"); 
            System.out.println("3. Ubah Data Barang Bangunan");
            System.out.println("4. Hapus Data Barang Bangunan");
            System.out.println("5. EXIT");
            System.out.println("----------------------------------------------------");
            System.out.println("Pilih Yang Anda Inginkan[1-5] = ");
        int pilih = Integer.valueOf(input.readLine());
            switch (pilih){
            case 1:
                    data();
                    break;
            case 2:
                    ldaftar();
                    break;
            case 3:
                    ubah();
                    break;
            case 4:
                    hapus();
                    break;
            case 5:
                    backmenu();
                    break;
            default:
                bangunan(); 
            } 
        }

public static void data() throws IOException{
            InputStreamReader tambah = new InputStreamReader(System.in);
            BufferedReader input = new BufferedReader(tambah);
            
            String nama;
            int harga;
            int pilihan;
            
    System.out.println("1. Alat Listrik");
    System.out.println("2. Semen");
    System.out.println("Masukan pilihan : ");
    pilihan = Integer.parseInt(input.readLine());
    if (pilihan == 1) {
        System.out.println("Masukan nama : ");
        nama = input.readLine();
        System.out.println("Masukan Harga : ");
        harga = Integer.parseInt(input.readLine());
        System.out.println("Masukan Merek : ");
        String merek = input.readLine();
        System.out.println("Masukan Bahan : ");
        String bahan = input.readLine();
        alatlistrik.add(new alatlistrik(merek, nama, harga, bahan ));
        } else {
        if (pilihan == 2) {
        System.out.println("Masukan nama : ");
        nama = input.readLine();
        System.out.println("Masukan Harga : ");
        harga = Integer.parseInt(input.readLine());
        System.out.println("Masukan Merek : ");
        String ukuran = input.readLine();
        System.out.println("Masukan Jumlah : ");
        String jumlah = input.readLine();
        semen.add(new semen(nama, harga, jumlah, ukuran));
        }
        

}           
}

public static void ldaftar()throws IOException{    
    InputStreamReader tambah = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(tambah);
    int pilihan;
    System.out.println("1. Alat Listrik");
    System.out.println("2. Semen");
    System.out.println("Masukan pilihan : ");
    pilihan = Integer.parseInt(input.readLine());
    if (pilihan == 1) {
                        for (int i = 0; i < alatlistrik.size(); i++) {
                            System.out.println("Alat Listrik ke - " + (i + 1));
                            alatlistrik.get(i).display();
                        }
                    } else {
                        for (int i = 0; i < semen.size(); i++) {
                            System.out.println("Semen ke - " + (i + 1));
                            semen.get(i).display();
                        }
                    }

            }

public static void ubah()throws IOException{
    InputStreamReader tambah = new InputStreamReader (System.in);
    BufferedReader input = new BufferedReader (tambah);
    int pilihan;
    String nama;
    int harga;
    String merek;
    String jumlah;
    String ukuran;
    ldaftar();
    System.out.println("1. Alat Listrik");
    System.out.println("2. Semen");
    System.out.println("Masukan pilihan : ");
    pilihan = Integer.parseInt(input.readLine());
    System.out.println("Ubah Data Bangunan Toko Sinar Jaya");
    if (pilihan == 1) {
                        System.out.println("Masukan Nama Barang Bangunan : ");
                        nama = input.readLine();
                        for (alatlistrik i : alatlistrik) {
                            if (i.getnama().equals(nama)) {
                                System.out.println("Masukan nama baru : ");
                                i.setnama(input.readLine());
                                System.out.println("Masukan harga baru : ");
                                i.setharga(Integer.parseInt(input.readLine()));
                                System.out.println("Masukan Merek baru : ");
                                i.setmerek(input.readLine());
                            }
                        }
                    } else {
                        System.out.println("Masukan Nama Barang Bangunan : ");
                        nama = input.readLine();
                        for (semen i : semen) {
                            if (i.getnama().equals(nama)) {
                                System.out.println("Masukan nama baru : ");
                                i.setnama(input.readLine());
                                System.out.println("Masukan harga baru : ");
                                i.setharga(Integer.parseInt(input.readLine()));
                                System.out.println("Masukan Jumlah baru : ");
                                i.setjumlah(input.readLine());
                                System.out.println("Masukan Ukuran baru : ");
                                i.setukuran(input.readLine());
                            }
                        }
                    }
}

public static void hapus() throws IOException{
    ldaftar();
    InputStreamReader tambah = new InputStreamReader (System.in);
    BufferedReader input = new BufferedReader (tambah);
    int pilihan;
    int t;
    System.out.println("1. Alat Listrik");
    System.out.println("2. Semen");
    System.out.println("Masukan pilihan : ");
    pilihan = Integer.parseInt(input.readLine());
    if (pilihan == 1) {
        System.out.println("Input Nomor Barang Yang Ingin Anda Hapus = ");
        t = Integer.parseInt(input.readLine());
        t--;
    
        alatlistrik.get(t).hapus();
        alatlistrik.remove(t);
    } else {
    System.out.println("Input Nomor Barang Yang Ingin Anda Hapus = ");
    t = Integer.parseInt(input.readLine());
    t--;
    
    semen.get(t).hapus();
    semen.remove(t);

    }
}

public static void backmenu() throws IOException{
    InputStreamReader tambah = new InputStreamReader (System.in);
    BufferedReader input = new BufferedReader(tambah);
    
    int a;
    System.out.println("THANK YOU");
    System.out.println("Klik 1 Jika Ingin melanjutkan");
    a = Integer.parseInt(input.readLine());
    bangunan();
    }



} 