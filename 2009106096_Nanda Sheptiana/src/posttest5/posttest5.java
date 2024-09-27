/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package posttest5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public final class posttest5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws NumberFormatException, IOException {
        final ArrayList<Barang> dataBarang = new ArrayList<>();
        final ArrayList<Pakaian> dataPakaian = new ArrayList<>();
        final ArrayList<Perabotan> dataPerabotan = new ArrayList<>();
        InputStreamReader data = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(data);
        int pilih;
        
        while (true) {
            System.out.println("");
            System.out.println("-------- DATA BARANG --------");
            System.out.println("| 1. Tambahkan Data Barang  |");
            System.out.println("| 2. Tampilkan Data Barang  |");
            System.out.println("| 3. Update Data Barang     |");
            System.out.println("| 4. Hapus Data Barang      |");
            System.out.println("| 5. Keluar                 |");
            System.out.println("-----------------------------");
            System.out.print("Menu [1-5] : ");
            int menu = Integer.parseInt(input.readLine());
            System.out.println("");

            switch(menu){
                case 1:
                    System.out.println("");
                    System.out.println("------------------");
                    System.out.println("|  1. Pakaian    |");
                    System.out.println("|  2. Perabotan  |");
                    System.out.println("------------------");
                    System.out.print("Masukkan pilihan : ");
                    pilih = Integer.parseInt(input.readLine());
                    if(pilih == 1){
                        System.out.print(" Masukkan nama pakaian       : "); 
                        String nama = input.readLine();
                        System.out.print(" Masukkan id pakaian         : ");
                        String id = input.readLine();
                        System.out.print(" Masukkan stok awal barang   : ");
                        int stokAwal = Integer.parseInt(input.readLine());
                        System.out.print(" Masukkan stok akhir barang  : ");
                        int stokAkhir = Integer.parseInt(input.readLine());
                        System.out.print(" Masukkan kategori pakaian   : ");
                        String kategoriPakaian = input.readLine();
                        System.out.print(" Masukkan warna pakaian      : ");
                        String warnaPakaian = input.readLine();
                        System.out.print(" Masukkan harga jual         : ");
                        int harga = Integer.parseInt(input.readLine());
                        System.out.print(" Masukkan harga pokok        : ");
                        int hargaPokok = Integer.parseInt(input.readLine());
                        System.out.println("");
                        
                        Pakaian pakaianBaru = new Pakaian(nama, id, harga, stokAwal, stokAkhir, kategoriPakaian, warnaPakaian, hargaPokok);
                        pakaianBaru.brgpakaian();
                        dataPakaian.add(pakaianBaru);
                        
                    } else {
                        
                        System.out.print(" Masukkan nama perabotan       : "); 
                        String nama = input.readLine();
                        System.out.print(" Masukkan id perabotan         : ");
                        String id = input.readLine();
                        System.out.print(" Masukkan stok awal barang     : ");
                        int stokAwal = Integer.parseInt(input.readLine());
                        System.out.print(" Masukkan stok akhir barang    : ");
                        int stokAkhir = Integer.parseInt(input.readLine());
                        System.out.print(" Masukkan kategori perabotan   : ");
                        String kategoriPerabotan = input.readLine();
                        System.out.print(" Masukkan harga jual           : ");
                        int harga = Integer.parseInt(input.readLine());
                        System.out.print(" Masukkan harga pokok          : ");
                        int hargaPokok = Integer.parseInt(input.readLine());
                        System.out.println("");

                        Perabotan perabotanBaru = new Perabotan(nama, id, harga, stokAwal, stokAkhir, kategoriPerabotan, hargaPokok);
                        perabotanBaru.brgperabotan();
                        dataPerabotan.add(perabotanBaru);
                    }
                    
                    break;

                case 2:
                    System.out.println("");
                    System.out.println("------------------");
                    System.out.println("|  1. Pakaian    |");
                    System.out.println("|  2. Perabotan  |");
                    System.out.println("------------------");
                    System.out.print("Masukkan pilihan : ");
                    pilih = Integer.parseInt(input.readLine());
                    if(pilih == 1){
                        for (int i = 0; i < dataPakaian.size(); i += 1) {
                            System.out.println("");
                            System.out.println("Barang ke-" + (i + 1));
                            dataPakaian.get(i).display();
                        }
                    } else{
                        for (int i = 0; i < dataPerabotan.size(); i += 1) {
                            System.out.println("");
                            System.out.println("Barang ke-" + (i + 1));
                            dataPerabotan.get(i).display();
                        }
                    }
                    break;

                case 3:
                    System.out.println("");
                    System.out.println("------------------");
                    System.out.println("|  1. Pakaian    |");
                    System.out.println("|  2. Perabotan  |");
                    System.out.println("------------------");
                    System.out.print("Masukkan pilihan : ");
                    pilih = Integer.parseInt(input.readLine());
                    if(pilih == 1){
                        System.out.print(" Masukkan nama pakaian yang akan di update : ");
                        String name = input.readLine();

                        for (Pakaian pakaian : dataPakaian){
                            if (pakaian.getNama().equals(name)){
                                System.out.print(" Masukkan nama pakaian       : "); 
                                pakaian.setNama(input.readLine());
                                System.out.print(" Masukkan id pakaian         : ");
                                pakaian.setId(input.readLine());
                                System.out.print(" Masukkan stok awal barang   : ");
                                pakaian.setStokAwal(Integer.parseInt(input.readLine()));
                                System.out.print(" Masukkan stok akhir barang  : ");
                                pakaian.setStokAkhir(Integer.parseInt(input.readLine()));
                                System.out.print(" Masukkan kategori pakaian   : ");
                                pakaian.setKategoriPakaian(input.readLine());
                                System.out.print(" Masukkan warna pakaian      : ");
                                pakaian.setWarnaPakaian(input.readLine());
                                System.out.print(" Masukkan harga jual         : ");
                                pakaian.setHarga(Integer.parseInt(input.readLine()));
                                System.out.print(" Masukkan harga pokok        : ");
                                pakaian.setHargaPokok(Integer.parseInt(input.readLine()));
                            }
                        }
                    } else{
                        System.out.print(" Masukkan nama perabotan yang akan di update : ");
                        String name = input.readLine();

                        for (Perabotan perabotan : dataPerabotan){
                            if (perabotan.getNama().equals(name)){
                                System.out.print(" Masukkan nama perabotan       : "); 
                                perabotan.setNama(input.readLine());
                                System.out.print(" Masukkan id perabotan         : ");
                                perabotan.setId(input.readLine());
                                System.out.print(" Masukkan stok awal barang     : ");
                                perabotan.setStokAwal(Integer.parseInt(input.readLine()));
                                System.out.print(" Masukkan stok akhir barang    : ");
                                perabotan.setStokAkhir(Integer.parseInt(input.readLine()));
                                System.out.print(" Masukkan kategori perabotan   : ");
                                perabotan.setKategoriPerabotan(input.readLine());
                                System.out.print(" Masukkan harga jual           : ");
                                perabotan.setHarga(Integer.parseInt(input.readLine()));
                                System.out.print(" Masukkan harga pokok          : ");
                                perabotan.setHargaPokok(Integer.parseInt(input.readLine()));
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.println("");
                    System.out.println("------------------");
                    System.out.println("|  1. Pakaian    |");
                    System.out.println("|  2. Perabotan  |");
                    System.out.println("------------------");
                    System.out.print("Masukkan pilihan : ");
                    pilih = Integer.parseInt(input.readLine());
                    
                    if(pilih == 1){
                        System.out.print("Masukkan ID pakaian yang akan di hapus : ");
                        String idpakaian = input.readLine();

                        for (int i = 0; i < dataPakaian.size(); i++) {
                            if (dataPakaian.get(i).getId().equals(idpakaian)) {
                                dataPakaian.remove(i);
                                break;
                            }
                        }
                    } else{
                        System.out.print("Masukkan ID perabotan yang akan di hapus : ");
                        String idperabotan = input.readLine();

                        for (int i = 0; i < dataPerabotan.size(); i++) {
                            if (dataPerabotan.get(i).getId().equals(idperabotan)) {
                                dataPerabotan.remove(i);
                                break;
                            }
                        }
                    }
                    break;                    
                    
                case 5:
                    System.out.println("");
                    System.out.println("ANDA TELAH KELUAR DARI PROGRAM");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Menu tidak ada");
                    break;
            }
        }
    }
}
