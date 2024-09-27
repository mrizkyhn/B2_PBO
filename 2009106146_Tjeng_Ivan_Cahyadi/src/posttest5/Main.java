package posttest5;

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        // Objek class Scanner untuk menerima input
        Scanner input = new Scanner(System.in);
        
        // Objek class Login
        Login login = new Login();
        
        // Objek class Admin
        Admin admin = new Admin();
        
        // Objek class Kasir
        Kasir kasir = new Kasir();
        
        // Objek class ReadFile
        ReadFile read = new ReadFile();
        
        // ArrayList untuk menyimpang barang toko
        ArrayList<Toko> kumpulanBarang = new ArrayList<>();
        
        read.readFile(kumpulanBarang);
        
        int menu;
        
        while (true) {
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.println("% Selamat Datang di Akilektronika %");
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.println("% <1> Admin                       %");
            System.out.println("% <2> Kasir                       %");
            System.out.println("% <3> Keluar                      %");
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            while (true) {
                try {
                    System.out.print("Masukkan menu: ");
                    menu = Integer.parseInt(input.nextLine());
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println("\nMenu berupa bilangan bulat!\n");
                }
            }
            System.out.println("");
            switch (menu) {
                case 1:
                    if (login.login('a')) {
                        admin.admin(kumpulanBarang);
                    }
                    break;
                case 2:
                    if (login.login('k')) {
                        kasir.kasir(kumpulanBarang);
                    }
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("\nMenu tidak ditemukan!\n");
            }
        }
    }
}
