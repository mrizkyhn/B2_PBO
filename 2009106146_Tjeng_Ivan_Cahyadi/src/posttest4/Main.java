package posttest4;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        // Objek class Scanner untuk menerima input
        Scanner input = new Scanner(System.in);
        
        // 3 Objek class Toko
        Toko joker525 = new Toko("Remote TV Universal Joker TV-525+GIGA", "Joker", "Remote TV", 30000, 10);
        Toko lubyL2899 = new Toko("Senter Kepala Luby L-2899", "Luby", "Senter Kepala", 40000, 6);
        Toko vivoV23e = new Toko("Vivo V23e 8/128", "Vivo", "Smartphone", 3999999, 2);
        
        // ArrayList untuk menyimpang barang toko
        ArrayList<Toko> kumpulanBarang = new ArrayList<>(Arrays.asList(joker525, lubyL2899, vivoV23e));
        
        // Objek class Login
        Login login = new Login();
        
        // Objek class Admin
        Admin admin = new Admin();
        
        // Objek class Kasir
        Kasir kasir = new Kasir();
        
        while (true) {
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.println("% Selamat Datang di Akilektronika %");
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.println("% <1> Admin                       %");
            System.out.println("% <2> Kasir                       %");
            System.out.println("% <3> Keluar                      %");
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.print("Masukkan menu: ");
            int menu = input.nextInt();
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
