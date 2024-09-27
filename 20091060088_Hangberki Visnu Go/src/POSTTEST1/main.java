package POSTTEST1;


import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author AelAwyR
 */
public class main {
static Scanner input = new Scanner(System.in);
static ArrayList<Kamar> room = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while(true){
            System.out.println("SELAMAT DATANG!!!");
        System.out.println("HOTEL H&M");
        System.out.println("");
        System.out.println("Silahkan Pilih menu :");
        System.out.println("1. Masukan Data Kamar Baru");
        System.out.println("2. Menampilkan Status Kamar");
        System.out.println("3. Memperbarui Status Kamar");
        System.out.println("4. Menghapus Data Kamar");
        System.out.println("5. Keluar");
        System.out.println("");
        System.out.print("Masukan Pilihan Anda : ");
        int menu = input.nextInt();
        switch(menu){
            case 1 -> tambahkan();
            case 2 -> tampil();
            case 3 -> edit();
            case 4 -> hapus();
            case 5 -> System.exit(0);
            default -> System.out.println("Input Tidak Valid!!!");
            
        }
        }
        
        
    }
    
    static void tambahkan(){
        Kamar kamar_baru = new Kamar();
        System.out.println("SILAHKAN ISI FORM DIBAWAH !!!");
        System.out.println("");
        System.out.print("Masukan Nomor Kamar : ");
        kamar_baru.nomor = input.nextInt();
        input.nextLine();
        System.out.println("");
        System.out.print("Masukan Ukuran Kamar : ");
        kamar_baru.ukuran = input.nextLine();
        System.out.println("");
        System.out.print("Masukan Status Kamar : ");
        kamar_baru.Status = input.nextLine();
        System.out.println("");
        System.out.print("Masukan Harga Kamar : ");
        kamar_baru.harga = input.nextInt();
        input.nextLine();
        room.add(kamar_baru);
    }
    
    static void tampil(){
        for(int i = 0; i<room.size();i++){
            System.out.print(i+1);
            System.out.println(". ");
            System.out.print("Nomor Kamar : ");
            System.out.println(room.get(i).nomor);
            System.out.println("");
            System.out.print("Ukuran Kamar : ");
            System.out.println(room.get(i).ukuran);
            System.out.println("");
            System.out.print("Status Kamar : ");
            System.out.println(room.get(i).Status);
            System.out.println("");
            System.out.print("Harga Kamar semalam : Rp.");
            System.out.println(room.get(i).harga);
            System.out.println("");
        }
    }
    static void edit(){
        System.out.print("Masukan id Kamar : ");
        int id_kamar = input.nextInt();
        id_kamar--;
        System.out.print("Masukan Nomor Kamar : ");
        room.get(id_kamar).nomor = input.nextInt();
        input.nextLine();
        System.out.println("");
        System.out.print("Masukan Ukuran Kamar : ");
        room.get(id_kamar).ukuran = input.nextLine();
        System.out.println("");
        System.out.print("Masukan Status Kamar : ");
        room.get(id_kamar).Status = input.nextLine();
        System.out.println("");
        System.out.print("Masukan Harga Kamar : ");
        room.get(id_kamar).harga = input.nextInt();
        input.nextLine();
    }
    
    static void hapus(){
        System.out.print("Masukan id Kamar : ");
        int id_kamar = input.nextInt();
        id_kamar--;
        room.remove(id_kamar);
    }
}
