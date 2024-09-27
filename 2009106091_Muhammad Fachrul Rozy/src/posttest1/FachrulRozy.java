/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/**
 *
 * @author GEFORCE_i5
 */
public class FachrulRozy {
static ArrayList<Toko> Toko = new ArrayList<>();
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        //Author 
        Toko.add(new Toko());
        Toko.get(0).ID = 1;
        Toko.get(0).Ukuran = "Besar";
        Toko.get(0).Nama = "Paku";
        Toko.get(0).Jumlah = 23;
        Toko.get(0).Harga = 27000;
        Toko.add(new Toko());
        Toko.get(1).ID = 2;
        Toko.get(1).Ukuran = "kecil";
        Toko.get(1).Nama = "cat no drop";
        Toko.get(1).Jumlah = 19; 
        Toko.get(1).Harga = 22000; 
        
        while (true) {
            Toko();
        }
    }
    public static void Toko()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("|             TOKO BANGUNAN                 |");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("| 1. Masukkan Barang                             |");
        System.out.println("| 2. Tampil  Barang                              |");
        System.out.println("| 3. Edit Barang                                 |");
        System.out.println("| 4. Hapus Barang                                |");
        System.out.println("| 0. Selesai                                       |");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        String pilih;
        System.out.print("| Pilihan Yang ingin Di Masukkan (0-4): ");
        pilih = br.readLine();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        
        if(pilih.equals("1")){
            Buat();
        } else if (pilih.equals("2")){
            Tampilkan();
        } else if (pilih.equals("3")){
            Edit();
        } else if (pilih.equals("4")){
            Hapus();
        } else if (pilih.equals("0")){
            System.exit(1);
        } else {
            System.out.println(" Pilih 0-4 !!!");
        }    
    }
    public static void Tampilkan()throws IOException{
        System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("|                Semua Barang                 |");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        for (int i = 0; i < Toko.size(); i++){
            System.out.println("| Barang ke-" + (i + 1));
            System.out.println("| ID Barang           : " + Toko.get(i).ID);
            System.out.println("| Ukuran Barang       : " + Toko.get(i).Ukuran);
            System.out.println("| Nama Barang         : " + Toko.get(i).Nama);
            System.out.println("| Jumlah Barang       : " + Toko.get(i).Jumlah);
            System.out.println("| Harga Barang        : " + Toko.get(i).Harga);
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        }
        System.out.println(" ");
    }
    public static void Buat()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("|                Input Barang                 |");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.print("| ID Barang       : ");
        float input1 = Float.parseFloat(br.readLine());
        System.out.print("| Ukuran Barang   : ");
        String input2 = br.readLine();
        System.out.print("| Nama Barang     : ");
        String input3 = br.readLine();
        System.out.print("| Jumlah Barang   : ");
        int input4 = Integer.parseInt(br.readLine());
        System.out.print("| Harga Barang    : ");
        int input5 = Integer.parseInt(br.readLine());
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        
        Toko membuattoko = new Toko();
        membuattoko.ID = input1;
        membuattoko.Ukuran = input2;
        membuattoko.Nama = input3;
        membuattoko.Jumlah = input4;
        membuattoko.Harga = input5;
        Toko.add(membuattoko);
        
    }
    public static void Edit()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Tampilkan();
        
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("|                  Update                   |");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.print("| Masukkan Barang Keberapa Yang Ingin Di Ubah- ");
        int inputedit = Integer.parseInt(br.readLine());
        int indexe = inputedit-1;
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        
        System.out.print("| ID Barang       : ");
        float input1 = Float.parseFloat(br.readLine());
        System.out.print("| Ukuran Barang   : ");
        String input2 = br.readLine();
        System.out.print("| Nama Barang     : ");
        String input3 = br.readLine();
        System.out.print("| Jumlah Barang   : ");
        int input4 = Integer.parseInt(br.readLine());
        System.out.print("| Harga Barang    : ");
        int input5 = Integer.parseInt(br.readLine());
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        
        Toko.get(indexe).ID = input1;
        Toko.get(indexe).Ukuran = input2;
        Toko.get(indexe).Nama = input3;
        Toko.get(indexe).Jumlah = input4;
        Toko.get(indexe).Harga = input5;
        
        Tampilkan();
    }
    public static void Hapus()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Tampilkan();
        
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("|                  Delete                   |");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.print("| Masukan barang Keberapa Yang Ingin Di Hapus-");
        int inputhapus = Integer.parseInt(br.readLine());
        int indexd = inputhapus-1;
        
        Toko.remove(indexd);
        Tampilkan();
    }

    private static class Toko {

        private float ID;
        private String Ukuran;
        private String Nama;
        private int Jumlah;
        private int Harga;
        

        public Toko() {
        }
    }
    
}
