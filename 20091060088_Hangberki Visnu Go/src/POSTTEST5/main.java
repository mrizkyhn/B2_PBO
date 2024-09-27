package POSTTEST5;

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
    static ArrayList<KamarRegular> kamarRegular = new ArrayList<>();
    static ArrayList<KamarVIP> kamarVIP = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) {
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
            switch (menu) {
                case 1 ->
                    tambahkan();
                case 2 ->
                    tampil();
                case 3 ->
                    edit();
                case 4 ->
                    hapus();
                case 5 ->
                    System.exit(0);
                default ->
                    System.out.println("Input Tidak Valid!!!");
            }
        }

    }

    static void tambahkan() {
        System.out.println("Silahkan pilih jenis :");
        System.out.println("1. Regular");
        System.out.println("2. VIP");
        System.out.print("Masukan Pilihan Anda : ");
        int menu = input.nextInt();
        if (menu < 1 || menu > 2) {
            System.out.println("Input Tidak Valid!!!");
            return;
        }

        int nomorKamarBaru;
        String ukuranKamarBaru;
        int hargaKamarBaru;
        String statusKamarBaru;

        System.out.println("SILAHKAN ISI FORM DIBAWAH !!!");
        System.out.println("");
        System.out.print("Masukan Nomor Kamar : ");
        nomorKamarBaru = input.nextInt();
        input.nextLine();
        System.out.print("Masukan Status Kamar : ");
        statusKamarBaru = input.nextLine();
        System.out.print("Masukan Harga Kamar : ");
        hargaKamarBaru = input.nextInt();
        input.nextLine();

        if (menu == 1) {
            System.out.print("Masukan Ukuran Kamar : ");
            ukuranKamarBaru = input.nextLine();
            System.out.println("");
            KamarRegular kamarBaru = new KamarRegular(nomorKamarBaru, hargaKamarBaru, statusKamarBaru, ukuranKamarBaru);
            kamarRegular.add(kamarBaru);
        } else if (menu == 2) {
            KamarVIP kamarBaru = new KamarVIP(nomorKamarBaru, hargaKamarBaru, statusKamarBaru);
            kamarVIP.add(kamarBaru);
        }
    }

    static void tampil() {
        System.out.println("Kamar Regular : ");
        for (int i = 0; i < kamarRegular.size(); i++) {
            System.out.print(i + 1);
            System.out.println(". ");
            kamarRegular.get(i).tampil();
        }
        System.out.println("");
        System.out.println("Kamar VIP : ");
        for (int i = 0; i < kamarVIP.size(); i++) {
            System.out.print(i + 1);
            System.out.println(". ");
            kamarVIP.get(i).tampil();
        }
    }

    static void edit() {
        System.out.println("Silahkan pilih jenis :");
        System.out.println("1. Regular");
        System.out.println("2. VIP");
        System.out.print("Masukan Pilihan Anda : ");
        int menu = input.nextInt();
        if (menu < 1 || menu > 2) {
            System.out.println("Input Tidak Valid!!!");
            return;
        }
        
        System.out.print("Masukan id Kamar : ");
        int id_kamar = input.nextInt();
        id_kamar--;
        
        if (menu == 1) {
            kamarRegular.get(id_kamar).edit(input);
        } else if (menu == 2) {
            kamarVIP.get(id_kamar).edit(input);
        }
    }

    static void hapus() {
        System.out.println("Silahkan pilih jenis :");
        System.out.println("1. Regular");
        System.out.println("2. VIP");
        System.out.print("Masukan Pilihan Anda : ");
        int menu = input.nextInt();
        if (menu < 1 || menu > 2) {
            System.out.println("Input Tidak Valid!!!");
            return;
        }
        
        System.out.print("Masukan id Kamar : ");
        int id_kamar = input.nextInt();
        id_kamar--;
        
        if (menu == 1) {
            kamarRegular.remove(id_kamar);
        } else if (menu == 2) {
            kamarVIP.remove(id_kamar);
        }
    }
}
