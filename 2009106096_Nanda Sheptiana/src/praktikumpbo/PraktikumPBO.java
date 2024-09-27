/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikumpbo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Scanner;


class databarang{
    String nama;
    String kategori;
    int id;
    int jumlah;
    int harga;
    
    public databarang(String nama, String kategori, int id, int jumlah, int harga) {
        this.nama = nama;
        this.id = id;
        this.kategori = kategori;
        this.jumlah = jumlah;
        this.harga = harga;
    }
    
    public String getnama(){
        return nama;
    }
    public int getid(){
        return id;
    }
    public String getkategori(){
        return kategori;
    }
    public int getjumlah(){
        return jumlah;
    }
    public int getharga(){
        return harga;
    }
}

public class PraktikumPBO {
    static ArrayList<databarang> barang = new ArrayList<databarang>();
    
    public static void main(String[] args) {
        menu();
    }
        static void menu(){
            Scanner input = new Scanner(System.in);
        System.out.println("-------- DATA BARANG --------");
        System.out.println("| 1. Tambahkan Data Barang  |");
        System.out.println("| 2. Tampilkan Data Barang  |");
        System.out.println("| 3. Update Data Barang     |");
        System.out.println("| 4. Hapus Data Barang      |");
        System.out.println("| 5. Keluar                 |");
        System.out.println("-----------------------------");
        System.out.print("Menu [1-5] : ");
        int menu = input.nextInt();
        System.out.println();
        
        switch(menu){
            case 1:
                tambahbrg();
                break;
            case 2:
                tampilbrg();
                break;
            case 3:
                updatebrg();
                break;
            case 4:
                hapusbrg();
                break;
            case 5:
                System.out.println("ANDA TELAH KELUAR DARI PROGRAM");
                break;
        }
    }
      
    
    static void tambahbrg() {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print(" Masukkan nama barang     : ");
        String nama = input1.nextLine();
        System.out.print(" Masukkan id barang       : ");
        int id = input2.nextInt();
        System.out.print(" Masukkan kategori barang : ");
        String kategori = input1.nextLine();
        System.out.print(" Masukkan jumlah barang   : ");
        int jumlah = input2.nextInt();
        System.out.print(" Masukkan harga barang    : ");
        int harga = input2.nextInt();
        
        barang.add(new databarang(nama, kategori, id, jumlah, harga));
        
        backtomenu();
    }
        
    static void tampilbrg() {
        Iterator<databarang> i = barang.iterator();
        for (databarang l : barang) {
            System.out.println("");
            System.out.println(" Nama Barang      : " + l.getnama());
            System.out.println(" id Barang        : " + l.getid());
            System.out.println(" Kategori Barang  : " + l.getkategori());
            System.out.println(" Jumlah Barang    : " + l.getjumlah());
            System.out.println(" Harga Barang     : " + l.getharga());
            System.out.println("");
        }
        backtomenu();
    }
    
    static void updatebrg() {
        boolean cari = false;
        
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("Masukkan ID barang yang akan di update : ");
        int id = input2.nextInt();
        
        ListIterator<databarang>list = barang.listIterator();
        while(list.hasNext()){
            databarang a = list.next();
            if(a.getid() == id){
                System.out.print(" Nama Barang      : ");
                String nama = input1.nextLine();
                System.out.print(" Kategori Barang  : ");
                String kategori = input1.nextLine();
                System.out.print(" Jumlah Barang    : ");
                int jumlah = input2.nextInt();
                System.out.print(" Harga Barang     : ");
                int harga = input2.nextInt();
                
                list.set(new databarang(nama, kategori, id, jumlah, harga));
                cari = true;
            }
        }
        
        if(!cari){
            System.out.println("");
            System.out.println(" !DATA BARANG TIDAK ADA!");
        }else{
            System.out.println("");
            System.out.println(" DATA BARANG BERHASIL DI UPDATE");
        }
        
        backtomenu();
    }
    
    static void hapusbrg() {
        boolean cari = false;
        Iterator<databarang> i = barang.iterator();
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ID barang yang akan di hapus : ");
        int id = input.nextInt();
        i = barang.iterator();
        while(i.hasNext()){
            databarang x = i.next();
            if(x.getid() == id){
                i.remove();
                cari = true;
            }
        }
        
        if(!cari){
            System.out.println("");
            System.out.println(" !DATA BARANG TIDAK ADA!");
        }else{
            System.out.println("");
            System.out.println(" DATA BARANG BERHASIL DI HAPUS");
        }
        
        backtomenu();
    }
    
    static void backtomenu(){
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println(" MASUKKAN Y UNTUK BALIK KE MENU !!!");
        input.next();
        menu();
    }
}
