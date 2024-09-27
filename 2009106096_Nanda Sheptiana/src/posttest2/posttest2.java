/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package posttest2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class posttest2 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        ArrayList<Barang> dataBarang = new ArrayList<>();
        InputStreamReader data = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(data);
        
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
                    System.out.print(" Masukkan nama barang     : ");
                    String nama = input.readLine();
                    System.out.print(" Masukkan id barang       : ");
                    String id = input.readLine();
                    System.out.print(" Masukkan kategori barang : ");
                    String kategori = input.readLine();
                    System.out.print(" Masukkan jumlah barang   : ");
                    int jumlah = Integer.parseInt(input.readLine());
                    System.out.print(" Masukkan harga barang    : ");
                    int harga = Integer.parseInt(input.readLine());

                    Barang barangBaru = new Barang(nama, id, kategori, jumlah, harga);
                    dataBarang.add(barangBaru);
                    break;

                case 2:
                    System.out.println("");
                    for (int i = 0; i < dataBarang.size(); i += 1) {
                        System.out.println("");
                        System.out.println("Barang ke-" + (i + 1));
                        dataBarang.get(i).display();
                    }
                    break;

                case 3:
                    System.out.print("Masukkan nama barang yang akan di update : ");
                    String name = input.readLine();

                    for (Barang barang : dataBarang){
                        if (barang.nama.equals(name)){
                            System.out.print(" Nama Barang      : ");
                            barang.setNama(input.readLine());
                            System.out.print(" Id Barang      : ");
                            barang.setId(input.readLine());
                            System.out.print(" Kategori Barang  : ");
                            barang.setKategori(input.readLine());
                            System.out.print(" Jumlah Barang    : ");
                            barang.setJumlah(Integer.parseInt(input.readLine()));
                            System.out.print(" Harga Barang     : ");
                            barang.setHarga(Integer.parseInt(input.readLine()));
                            break;
                        }
                    }

                    break;

                case 4:
                    System.out.print("Masukkan ID barang yang akan di hapus : ");
                    String idbarang = input.readLine();

                    for (int i = 0; i < dataBarang.size(); i++) {
                        if (dataBarang.get(i).id.equals(idbarang)) {
                            dataBarang.remove(i);
                            break;
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
