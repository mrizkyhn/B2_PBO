/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/**
 *
 * @author GEFORCE_i5
 */
public class main {
    static ArrayList<bangunan> bangunan = new ArrayList<>();
    
    public static void main(String[] args)throws Exception {
        
      while(true){
          bangunan();
      }
    }  
   public static void bangunan() throws IOException{
       InputStreamReader home = new InputStreamReader(System.in);
       BufferedReader input = new BufferedReader(home);
            System.out.println("");
            System.out.println("$$$$$$$$$  TOKO BANGUNAN SINAR JAYA $$$$$$$$$$$$$$$$");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("1. Masukkan Barang ");
            System.out.println("2. Tampil Barang "); 
            System.out.println("3. Edit Barang ");
            System.out.println("4. Hapus barang ");
            System.out.println("5. Keluar");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("Pilih Yang Ingin Anda Masukkan {1-5} = ");
        int pilih = Integer.valueOf(input.readLine());
            switch (pilih){
            case 1:
                    data();
                    break;
            case 2:
                    ldaftar();
                    break;
            case 3:
                    ubah();
                    break;
            case 4:
                    hapus();
                    break;
            case 5:
                    backmenu();
                    break;
            default:
                bangunan(); 
            } 
        }

public static void data() throws IOException{
            InputStreamReader tambah = new InputStreamReader(System.in);
            BufferedReader input = new BufferedReader(tambah);
            
            String nama;
            int harga;
            
    System.out.println("Masukkan Nama Barang Bangunan : ");
    nama = input.readLine();
    System.out.println("Masukkan Harga Barang Bangunan : ");
    harga = Integer.parseInt(input.readLine());
    
    if("".equals(nama) || "".equals(harga)){
        System.out.println("Data Eror");
        return;
    }
        bangunan baru = new bangunan (nama, harga);
        baru.nama = nama;
        baru.harga = harga;
        bangunan.add(baru);
        baru.data();
}           

public static void ldaftar()throws IOException{
            for(int i = 0 ; i < bangunan.size();i++){
                System.out.println(i+1);
                System.out.println("Nama Barang Bangunan   : " + bangunan.get(i).nama);
                System.out.println("Harga Barang Bangunan  : " + bangunan.get(i).harga);
            }
}

public static void ubah()throws IOException{
    InputStreamReader tambah = new InputStreamReader (System.in);
    BufferedReader input = new BufferedReader (tambah);
    ldaftar();
    System.out.println("Ubah Data Barang Toko Bangunan Sinar Jaya");
    String nama;
    int harga;
    int index;
    System.out.println("Masukkan Data Barang yang ingin Anda ubah");
    index = Integer.parseInt(input.readLine());
    index--;
    
    System.out.println("Masukkan nama Barang : ");
    nama = input.readLine();
    System.out.println("Masukkan harga Barang : ");
    harga = Integer.parseInt(input.readLine());
    
    bangunan.get(index).nama = nama;
    bangunan.get(index).harga = harga;
}

    private static void hapus() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void backmenu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
