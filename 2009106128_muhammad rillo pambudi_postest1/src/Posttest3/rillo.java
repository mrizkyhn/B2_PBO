package Posttest3;

import java.util.ArrayList;
import java.util.Scanner;

public class rillo {
    public static void main(String[] args) {
        ArrayList<peserta> ListPeserta = new ArrayList<>();
        Scanner input_int = new Scanner(System.in);
        Scanner input_str = new Scanner(System.in);
        int menu;
        
        do {
            System.out.println("===== Menu Kursus Bahasa Inggris =====");
            System.out.println("[1] Tambah Peserta");
            System.out.println("[2] Lihat Peserta");
            System.out.println("[3] Edit Peserta");
            System.out.println("[4] Hapus Peserta");
            System.out.println("[5] Keluar");
            System.out.print("Input Menu : ");
            menu = input_int.nextInt();
            if(menu == 1) {
                System.out.println("===== Tambah Peserta =====");
                System.out.print("Masukkan Nama Peserta  : ");
                String namapeserta = input_str.nextLine();
                System.out.print("Masukkan Alamat Peserta  : ");
                String alamatpeserta = input_str.nextLine();
                System.out.print("Masukkan Jenis Peserta (Regular/Private) : ");
                String jenispeserta = input_str.nextLine();
                System.out.print("Masukkan Tanggal Lahir Peserta  : ");
                String tglpeserta = input_str.nextLine();
                ListPeserta.add(new peserta(namapeserta, alamatpeserta, jenispeserta, tglpeserta));
                System.out.println("Peserta telah ditambahkan!");
                System.out.print("Tekan Enter untuk melanjutkan...");
                input_str.nextLine();
            } else if(menu == 2) {
                System.out.println("===== Lihat Peserta =====");
                if(ListPeserta.isEmpty()) System.out.println("Data Kosong!");
                else {
                    System.out.println("===============================================");
                    for(int i = 0; i < ListPeserta.size(); i++) {
                        System.out.println("No Peserta             : " + (i+1));
                        System.out.println("Nama Peserta           : " + ListPeserta.get(i).getNama());
                        System.out.println("Alamat Peserta         : " + ListPeserta.get(i).getAlamat());
                        System.out.println("Jenis Kelas Peserta    : " + ListPeserta.get(i).getJeniskelas());
                        System.out.println("Tanggal Lahir Peserta  : " + ListPeserta.get(i).getTanggallahir());
                        System.out.println("===============================================");                    
                    }
                }
                System.out.print("Tekan Enter untuk melanjutkan...");
                input_str.nextLine();
            } else if(menu == 3) {                
                System.out.println("===== Edit Peserta =====");
                if(ListPeserta.isEmpty()) System.out.println("Data Kosong!");
                else {
                    System.out.println("===============================================");
                    for(int i = 0; i < ListPeserta.size(); i++) {
                        System.out.println("No Peserta             : " + (i+1));
                        System.out.println("Nama Peserta           : " + ListPeserta.get(i).getNama());
                        System.out.println("Alamat Peserta         : " + ListPeserta.get(i).getAlamat());
                        System.out.println("Jenis Kelas Peserta    : " + ListPeserta.get(i).getJeniskelas());
                        System.out.println("Tanggal Lahir Peserta  : " + ListPeserta.get(i).getTanggallahir());
                        System.out.println("===============================================");                    
                    }
                    System.out.print("Masukkan Nomor Peserta yang ingin diubah: ");
                    int no = input_int.nextInt();
                    System.out.print("Masukkan Nama Peserta  : ");
                    String namapeserta = input_str.nextLine();
                    System.out.print("Masukkan Alamat Peserta  : ");
                    String alamatpeserta = input_str.nextLine();
                    System.out.print("Masukkan Jenis Peserta (Regular/Private) : ");
                    String jenispeserta = input_str.nextLine();
                    System.out.print("Masukkan Tanggal Lahir Peserta  : ");
                    String tglpeserta = input_str.nextLine();
                    ListPeserta.set(no-1, new peserta(namapeserta, alamatpeserta, jenispeserta, tglpeserta));
                    System.out.println("Peserta telah diperbaharui!");
                }
                System.out.print("Tekan Enter untuk melanjutkan...");
                input_str.nextLine();
            } else if(menu == 4) {                
                System.out.println("===== Hapus Peserta =====");
                if(ListPeserta.isEmpty()) System.out.println("Data Kosong!");
                else {
                    System.out.println("===============================================");
                    for(int i = 0; i < ListPeserta.size(); i++) {
                        System.out.println("No Peserta             : " + (i+1));
                        System.out.println("Nama Peserta           : " + ListPeserta.get(i).getNama());
                        System.out.println("Alamat Peserta         : " + ListPeserta.get(i).getAlamat());
                        System.out.println("Jenis Kelas Peserta    : " + ListPeserta.get(i).getJeniskelas());
                        System.out.println("Tanggal Lahir Peserta  : " + ListPeserta.get(i).getTanggallahir());
                        System.out.println("===============================================");                    
                    }
                    System.out.print("Masukkan No Peserta yang ingin dihapus: ");
                    int no = input_int.nextInt();
                    ListPeserta.remove(no-1);
                    System.out.println("Peserta telah dihapus!");
                }
                System.out.print("Tekan Enter untuk melanjutkan...");
                input_str.nextLine();
            } else if(menu == 5) {                
                System.out.println("Terima Kasih!");
            } else {                
                System.out.println("Menu Salah!");
                System.out.print("Tekan Enter untuk melanjutkan...");
                input_str.nextLine();
            }
        } while(menu != 5);
    }    
}