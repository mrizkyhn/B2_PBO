
package Posttest5;

import java.io.IOException;
import java.util.Scanner;

public class main {
    
    static int pilihan;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        menu();
    }
    
    static void menu() throws IOException {
        System.out.println("Menu Penjualan Kue Lebaran");
        System.out.println("1. Admin");
        System.out.println("2. Kasir");
        System.out.println("3. Exit");
        System.out.print("Pilih nomor: ");
        pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                admin.menu_admin();
                break;
            case 2:
                kasir.menu_kasir();
                break;
            case 3:
                System.out.println("Anda Telah Keluar Dari Program ");
                break;
            default:
                System.out.println("Masukkan Pilihan Nomor Yang Tepat!!!");
                menu();
        }
    } 
}

