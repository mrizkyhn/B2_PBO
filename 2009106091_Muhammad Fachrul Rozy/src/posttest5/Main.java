package posttest5;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;  


public class Main {

    private static String nama;
    public static void main(String[] args)throws NumberFormatException, IOException {
        InputStreamReader prepare = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(prepare);
        ArrayList<Alatlistrik> Alatlistrik = new ArrayList<>();
        ArrayList<Semen> Semen = new ArrayList<>();
        String nama;
        int index;
        int pilihan;
      while(true){
        System.out.println("==============================================");
        System.out.println("============ TOKO BANGUNAN ==============");
        System.out.println("============  SINAR JAYA    ==============");
        System.out.println("==============================================");
        System.out.println("----------------------------------------------------");
        System.out.println("1. Masukkan Data Barang Bangunan");
            System.out.println("2. Lihat Data Toko Bangunan"); 
            System.out.println("3. Ubah Data Barang Bangunan");
            System.out.println("4. Hapus Data Barang Bangunan");
            System.out.println("5. EXIT");
        System.out.println("----------------------------------------------------");
        System.out.println("Pilih[1-5] = ");
        int h = Integer.valueOf(input.readLine());
        switch (h){
        case 1:
            System.out.println("[Menambahkan Data]");
            System.out.println("1. Alat Listrik");
            System.out.println("2. Semen");
            System.out.println("Masukan pilihan : ");
            pilihan = Integer.parseInt(input.readLine());
            if (pilihan == 1) {
                System.out.println("Masukan Nama Barang : ");
                nama = input.readLine();
                System.out.println("Masukan Ukuran Barang : ");
                String ukuran = input.readLine();
                System.out.println("Masukan Bahan Barang  : ");
                String bahan = input.readLine();
                System.out.println("Masukan Harga Barang : ");
                String harga = input.readLine();
                System.out.println("Masukan Jumlah Stok Baru : ");
                String os = input.readLine();
                Alatlistrik.add(new Alatlistrik(nama, ukuran, bahan, harga, os));
            } else if (pilihan ==2) {
                System.out.println("Masukan Nama Barang : ");
                nama = input.readLine();
                System.out.println("Masukan Ukuran Barang : ");
                String ukuran = input.readLine();
                System.out.println("Masukan Bahan Barang : ");
                String bahan = input.readLine();
                System.out.println("Masukan Harga Barang : ");
                String harga = input.readLine();
                System.out.println("Masukan Jumlah Stok Baru : ");
                String os = input.readLine();
                Alatlistrik.add(new Alatlistrik(nama, ukuran, bahan, harga ,os));
                    }
                    break;

                
        case 2:
            System.out.println("[Lihat daftar]");
            System.out.println("1. Alat Listrik");
            System.out.println("2. Semen");
            System.out.println("Masukan pilihan : ");
            pilihan = Integer.parseInt(input.readLine());
            if (pilihan == 1) {
                for (int i = 0; i < Alatlistrik.size(); i++) {
                System.out.println("-----------------------------------------------------");
                System.out.println("List Barang Alat Listrik ke - " + (i + 1));
                Alatlistrik.get(i).display();
                System.out.println("-----------------------------------------------------");
                        }
            } else {
                for (int i = 0; i < Semen.size(); i++) {
                System.out.println("-----------------------------------------------------");
                System.out.println("List Barang Semen ke - " + (i + 1));
                Semen.get(i).display();
                System.out.println("-----------------------------------------------------");
                        }
                    }
                    break;
                
        case 3:
            System.out.println("[Mengedit daftar]");
            System.out.println("1. Alat Listrik");
            System.out.println("2. Semen");
            System.out.println("Masukan pilihan : ");
            pilihan = Integer.parseInt(input.readLine());
            if (pilihan == 1) {
                System.out.println("Masukan Nama Barang Yang Ingin Di Edit  : ");
           nama = input.readLine();
            for (Alatlistrik i : Alatlistrik) {
            if (i.getnama().equals(nama)) {
                System.out.println("Masukan Nama Barang Baru : ");
                i.setnama(input.readLine());
                System.out.println("Masukan Ukuran Barang Baru : ");
                i.setukuran(input.readLine());
                System.out.println("Masukan Bahan Barang Baru : ");
                i.setbahan(input.readLine());
                System.out.println("Masukan Harga Barang Baru : ");
                i.setharga(input.readLine());
                System.out.println("Masukan Jumlah Stok Baru : ");
                i.setOs(input.readLine());
        }
    }
            } else {
                System.out.println("Masukan Nama Barang Yang Ingin Di Edit : ");
           nama = input.readLine();
            for (Semen i : Semen) {
                if (i.getnama().equals(nama)) {
                    System.out.println("Masukan Nama baru : ");
                    i.setnama(input.readLine());
                    System.out.println("Masukan Ukuran baru : ");
                    i.setukuran(input.readLine());
                    System.out.println("Masukan Bahan baru : ");
                    i.setbahan(input.readLine());
                    System.out.println("Masukan Harga baru : ");
                    i.setharga(input.readLine());
                    System.out.println("Masukan Jumlah Stok Baru : ");
                    i.setOs(input.readLine());
            }
        }
    }
            break;
                
        case 4:
            System.out.println("[Hapus daftar]");
            System.out.println("1. Alat Listrik");
            System.out.println("2. Semen");
            System.out.println("Masukan pilihan : ");
            pilihan = Integer.parseInt(input.readLine());
            if (pilihan == 1) {            
                System.out.println("Hapus Data Barang Bangunan Alat Listrik yang ke berapa = ");
                index = Integer.parseInt(input.readLine());
                index--;
                Alatlistrik.get(index).hapusdaftar();
                Alatlistrik.remove(index);
            } else {                
                System.out.println("Hapus Data Barang Bangunan Semen yang ke berapa = ");
                index = Integer.parseInt(input.readLine());
                index--;
                Semen.get(index).hapusdaftar();
                Semen.remove(index);
        }
                break;
        case 5:
            System.out.println("Keluar");
            System.exit(0);
        default:
            System.out.println("Pilihan salah");
            break; 
            } 
        }
   }
}
 