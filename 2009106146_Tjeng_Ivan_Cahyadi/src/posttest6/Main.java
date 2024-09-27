package posttest6;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Admin> kumpulanAdmin = new ArrayList<>();
    public static ArrayList<Kasir> kumpulanKasir = new ArrayList<>();
    public static ArrayList<Toko> kumpulanBarang = new ArrayList<>();
    public static ArrayList<Belanja> kumpulanBarangBelanja = new ArrayList<>();
    
    // Objek class Scanner untuk menerima input
    public static Scanner input = new Scanner(System.in);
    
    // temporary object admin
    public static Admin admin = new Admin();

    // temporary object kasir
    public static Kasir kasir = new Kasir();
    
    // Objek class WriteFile
    public static WriteFile write = new WriteFile();
    
    // Objek class ReadFile
    public static ReadFile read = new ReadFile();
    
    public static boolean loginSuperAdmin(String username, String password){
        return username.equals("superadmin") && password.equals("superadmin");
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        
        // object class admin
        Admin admin1 = new Admin();
        admin1.register("Johnny Wiriawan", "johnny1733@gmail.com", "+62853555125", "johnny", "johnny");
        Admin admin2 = new Admin();
        admin2.register("Lista Adriani", "lista99@gmail.com", "+62896555766", "lista", "lista");
        kumpulanAdmin.add(admin1);
        kumpulanAdmin.add(admin2);
        
        // object class admin
        Kasir kasir1 = new Kasir();
        kasir1.register("Maly Widoyo", "maly693@gmail.com", "+62878555461", "maly", "maly");
        Kasir kasir2 = new Kasir();
        kasir2.register("Fifi Indra", "fifi49@gmail.com", "+62898555560", "fifi", "fifi");
        kumpulanKasir.add(kasir1);
        kumpulanKasir.add(kasir2);
        
        // read csv file
        read.readFile();

        int menu;

        do {
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.println("% Selamat Datang di Akilektronika %");
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.println("% <1> Login                       %");
            System.out.println("% <2> Keluar                      %");
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
            switch(menu) {
                case 1:
                    System.out.print("Masukkan username: ");
                    String username = input.nextLine();
                    System.out.print("Masukkan password: ");
                    String password = input.nextLine();
                    System.out.println("");
                    if(kasir.login(username, password)) {
                        Kasir.kasir();
                    } else if (admin.login(username, password)) {
                        Admin.admin();
                    } else if (loginSuperAdmin(username, password)) {
                        SuperAdmin.superAdmin();
                    } else {
                        System.out.println("Username atau Password salah!\n");
                    }
                    break;
                case 2:
                    break;
                default:
                    System.out.println("\nMenu tidak ditemukan!\n");
            }
        } while(menu != 2);
    }
}