package posttest1;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

//    static void cls(){
//        try{
//            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
//        } catch(Exception E){
//            System.out.println(E);
//        }
//    }

    static void tampilBarang(ArrayList<Barang> kumpulanBarang){
        System.out.println("DATA BARANG");
        System.out.println("");
        for (int i = 0; i < kumpulanBarang.size(); i++){
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.println("                      " + (i + 1) + "                      ");
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.println("Nama    --> " + kumpulanBarang.get(i).getNama());
            System.out.println("Merk    --> " + kumpulanBarang.get(i).getMerk());
            System.out.println("Jenis   --> " + kumpulanBarang.get(i).getJenis());
            System.out.println("Harga   --> Rp" + kumpulanBarang.get(i).getHarga());
            System.out.println("Stock   --> " + kumpulanBarang.get(i).getStock());
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.println("");
        }
    }

    static void tambahBarang(ArrayList<Barang> kumpulanBarang){
        
        Scanner inputAngka = new Scanner(System.in);
        BufferedReader inputHuruf = new BufferedReader(new InputStreamReader(System.in));
        String nama = "", merk = "", jenis = "";
        try {
            System.out.print("Masukkan nama     : ");
            nama = inputHuruf.readLine();
            System.out.print("Masukkan merk     : ");
            merk = inputHuruf.readLine();
            System.out.print("Masukkan jenis    : ");
            jenis = inputHuruf.readLine();
        } catch(Exception e){
        }
        System.out.print("Masukkan harga    : ");
        int harga = inputAngka.nextInt();
        int stock;
        while (true){
            System.out.print("Masukkan stock    : ");
            stock = inputAngka.nextInt();
            if (stock >= 0){
                break;
            } else{
                System.out.println("Stock barang tidak bisa kurang dari 0!");
            }
        }
        Barang temp = new Barang(nama, merk, jenis, harga, stock);
        kumpulanBarang.add(temp);
        System.out.println("");
        System.out.println("Barang berhasil ditambahkan!");
        System.out.println("");
    }
    
    static void editBarang(ArrayList<Barang> kumpulanBarang) {
        Scanner inputAngka = new Scanner(System.in);
        BufferedReader inputHuruf = new BufferedReader(new InputStreamReader(System.in));
        tampilBarang(kumpulanBarang);
        System.out.print("Masukkan nomor barang: ");
        int nomorBarang = inputAngka.nextInt();
        System.out.println("");
        if ((nomorBarang - 1) < kumpulanBarang.size()){
            String namaBaru = "", merkBaru = "", jenisBaru = "";
            while (true) {
                System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                System.out.println("%            Edit Barang            %");
                System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                System.out.println("% <1> Nama                          %");
                System.out.println("% <2> Merk                          %");
                System.out.println("% <3> Jenis                         %");
                System.out.println("% <4> Harga                         %");
                System.out.println("% <5> Stock                         %");
                System.out.println("% <6> Kembali                       %");
                System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                System.out.print(" Masukkan pilihan edit: ");
                int menu = inputAngka.nextInt();
                System.out.println("");
                if (menu == 1){
                    try {
                        System.out.print("Masukkan nama baru: ");
                        namaBaru = inputHuruf.readLine();
                    } catch(Exception e){
                    }
                    kumpulanBarang.get(nomorBarang - 1).setNama(namaBaru);
                } else if(menu == 2){
                    try {
                        System.out.print("Masukkan merk baru: ");
                        merkBaru = inputHuruf.readLine();
                    } catch(Exception e){
                    }
                    kumpulanBarang.get(nomorBarang - 1).setMerk(merkBaru);
                } else if (menu == 3){
                    try {
                        System.out.print("Masukkan jenis baru: ");
                        jenisBaru = inputHuruf.readLine();
                    } catch(Exception e){
                    }
                    kumpulanBarang.get(nomorBarang - 1).setJenis(jenisBaru);
                } else if (menu == 4){
                    System.out.print("Masukkan harga baru: ");
                    int hargaBaru = inputAngka.nextInt();
                    kumpulanBarang.get(nomorBarang - 1).setHarga(hargaBaru);
                } else if (menu == 5){
                    System.out.print("Masukkan stock baru: ");
                    int stockBaru = inputAngka.nextInt();
                    if (stockBaru >= 0){
                        kumpulanBarang.get(nomorBarang - 1).setStock(stockBaru);
                    } else{
                        System.out.println("Stock barang tidak bisa kurang dari 0!");
                    }
                } else if (menu == 6){
                    break;
                } else{
                    System.out.println("Pilihan tidak ditemukan!");
                }
            }
        } else{
            System.out.println("Barang tidak ditemukan!");
        }

    }
    
    static void hapusBarang(ArrayList<Barang> kumpulanBarang){
        Scanner input = new Scanner(System.in);
        tampilBarang(kumpulanBarang);
        System.out.println("HAPUS BARANG");
        System.out.print("Masukkan nomor barang: ");
        int nomorBarang = input.nextInt();
        if ((nomorBarang - 1) < kumpulanBarang.size()){
            kumpulanBarang.remove(nomorBarang - 1);
            System.out.println("Barang berhasil dihapus!");
        } else{
            System.out.println("Nomor barang tidak ditemukan!");
        }
    }
    
    static void admin(ArrayList<Barang> kumpulanBarang){
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.println("%            Menu Admin            %");
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.println("% <1> Tampil Barang                %");
            System.out.println("% <2> Tambah Barang                %");
            System.out.println("% <3> Edit Barang                  %");
            System.out.println("% <4> Hapus Barang                 %");
            System.out.println("% <5> Kembali                      %");
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.print(" Masukkan pilihan menu: ");
            int menu = input.nextInt();
            System.out.println("");
            if (menu == 1) {
                if (!kumpulanBarang.isEmpty()){
                    tampilBarang(kumpulanBarang);
                } else{
                    System.out.println("Tidak ada barang!");
                }
            } else if (menu == 2) {
                tambahBarang(kumpulanBarang);
            } else if (menu == 3) {
                if (!kumpulanBarang.isEmpty()){
                    editBarang(kumpulanBarang);
                } else{
                    System.out.println("Tidak ada barang!");
                }
            } else if (menu == 4) {
                if (!kumpulanBarang.isEmpty()){
                    hapusBarang(kumpulanBarang);
                } else{
                    System.out.println("Tidak ada barang!");
                }
            } else if (menu == 5) {
                break;
            } else {
                System.out.println("");
                System.out.println("Menu tidak ditemukan!");
                System.out.println("");
            }
        }
    }
    
//    static void tambahBarangBelanja(ArrayList<Barang> kumpulanBarang, ArrayList<Barang> kumpulanBarangBelanja){
//        
//    }
    
//    static void kasir(ArrayList<Barang> kumpulanBarang){
//        ArrayList<Barang> kumpulanBarangBelanja = new ArrayList<>();
//        Scanner input = new Scanner(System.in);
//        while (true) {
//            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
//            System.out.println("%            Menu Kasir            %");
//            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
//            System.out.println("% <1> Tampil Barang                %");
//            System.out.println("% <2> Tampil Barang Belanja        %");
//            System.out.println("% <3> Tambah Barang Belanja        %");
//            System.out.println("% <4> Ubah Jumlah Barang Belanja   %");
//            System.out.println("% <5> Hapus Barang Belanja         %");
//            System.out.println("% <6> Transaksi                    %");
//            System.out.println("% <7> Kembali                      %");
//            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
//            System.out.print(" Masukkan pilihan menu: ");
//            int menu = input.nextInt();
//            System.out.println("");
//            if (menu == 1) {
//                if (!kumpulanBarang.isEmpty()){
//                    tampilBarang(kumpulanBarang);
//                } else{
//                    System.out.println("Tidak ada barang!");
//                }
//            } else if (menu == 2) {
//                if (!kumpulanBarangBelanja.isEmpty()){
//                    tampilBarang(kumpulanBarangBelanja);
//                } else{
//                    System.out.println("Tidak ada barang!");
//                }
//            } else if (menu == 3) {
//                tambahBarangBelanja(kumpulanBarang, kumpulanBarangBelanja);
//            } else if (menu == 4) {
//                System.out.println("Fungsi Ubah Jumlah Barang Belanja");
//            } else if (menu == 5) {
//                System.out.println("Fungsi Hapus Barang Belanja");
//            } else if (menu == 6) {
//                System.out.println("Fungsi Transaksi");
//            } else if (menu == 7) {
//                break;
//            } else {
//                System.out.println("Menu tidak ditemukan!");
//            }
//        }
//    }
    
    static boolean login(char as) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String username = "", password = "", enter = "";
        for (int i = 0; i < 3; i++) {
            try {
                System.out.print("Masukkan Username: ");
                username = input.readLine();
                System.out.print("Masukkan Password: ");
                password = input.readLine();
            } catch (Exception e){
            }
            if (as == 'a') {
                if (username.equals("admin") && password.equals("admin")) {
                    return true;
                }
                System.out.println("");
                System.out.println("Username atau Password salah!");
                System.out.println("");
            } else if (as == 'k') {
                if (username.equals("kasir") && password.equals("kasir")) {
                    return true;
                }
                System.out.println("");
                System.out.println("Username atau Password salah!");
                System.out.println("");
            }
        }
        System.out.println("");
        System.out.println("Batas login tercapai!");
        System.out.println("");
        try {
            System.out.print("Tekan enter untuk melanjutkan...");
            enter = input.readLine();
        } catch(Exception e){
        }
        return false;
    }
    
    public static void main(String[] args) {
        Barang joker525 = new Barang("Remote TV Universal Joker TV-525+GIGA", "Joker", "Remote TV", 30000, 10);
        Barang lubyL2899 = new Barang("Senter Kepala Luby L-2899", "Luby", "Senter Kepala", 40000, 6);
        Barang vivoV23e = new Barang("Vivo V23e 8/128", "Vivo", "Smartphone", 3999999, 2);
        ArrayList<Barang> kumpulanBarang = new ArrayList<>(Arrays.asList(joker525, lubyL2899, vivoV23e));
        Scanner input = new Scanner(System.in);
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
                    if (login('a')) {
                        System.out.println("");
                        admin(kumpulanBarang);
                    }
                    break;
                case 2:
//                    if (login('k')) {
//                        System.out.println("");
//                        kasir(kumpulanBarang);
//                    }
//                    break;
                    System.out.println("Belum selesai dikerjakan!");
                case 3:
                    System.exit(0);
                default:
                    System.out.println("");
                    System.out.println("Menu tidak ditemukan!");
                    System.out.println("");
            }
        }
    }
}
