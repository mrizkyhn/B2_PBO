/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import postest2.RSS;

/**
 *
 * @author Hp
 */
public class spare {
 public static void main(String[] args) {
      List <RSS> prt = new ArrayList <RSS>();
      Scanner Str = new Scanner(System.in);
      Scanner Intr = new Scanner(System.in);

      int pilih;
      do{
         System.out.println("*------ Rextor Speed Shop ------*");
         System.out.println("* [1] Lihat Data                *");
         System.out.println("* [2] Tambah Data               *");
         System.out.println("* [3] Hapus Data                *");
         System.out.println("* [4] Perbarui Data             *");
         System.out.println("* [5] Keluar                    *");
         System.out.println("*-------------------------------*");
         System.out.print("Pilih Menu : ");
         pilih = Intr.nextInt();
         System.out.print("\n");

        switch(pilih){
            case 1:
            //Lihat data
               Iterator<RSS> i = prt.iterator();
               System.out.println("|---------Stok Spare Part--------|");
               for (RSS b : prt) {
                   System.out.println(" ");
                   System.out.println("ID Barang     : " + b.setId());
                   System.out.println("Jumlah Barang : " + b.setjumlah());
                   System.out.println("Nama Barang   : " + b.setBarang());
                   System.out.println("Merek Barang  : " + b.setMerek());
                   System.out.println("Harga Barang  : " + b.setHarga());
                }
               System.out.println("*--------------------------------*\n");
            break;
            
            case 2:
            //Tambah Data 
               System.out.print("Masukkan ID Barang     : "); int ID = Intr.nextInt();
               System.out.print("Masukkan Jumlah Barang : "); int Jumlah = Intr.nextInt();
               System.out.print("Masukkan Nama Barang   : "); String Barang = Str.nextLine();
               System.out.print("Masukkan Merek Barang   : "); String Merek = Str.nextLine();
               System.out.print("Masukkan harga         : "); int Harga = Intr.nextInt();
               prt.add(new RSS(ID,Jumlah,Barang,Merek,Harga));
            break;

            case 3:
            //Hapus Data 
               System.out.println("|---------Stok Spare Part--------|");
               for (RSS b : prt) {
                   System.out.println(" ");
                   System.out.println("ID Barang     : " + b.setId());
                   System.out.println("Jumlah Barang : " + b.setjumlah());
                   System.out.println("Nama Barang   : " + b.setBarang());
                   System.out.println("Merek Barang  : " + b.setMerek());
                   System.out.println("Harga Barang  : " + b.setHarga());
                }
               System.out.println("*--------------------------------*\n");
               boolean found = false;
                    System.out.print("Masukkan ID yang ingin dihapus!   :");
               int Id = Intr.nextInt();
                    System.out.println("||-----------------------------------||");
                    System.out.print("\n");
               i = prt.iterator();
               while(i.hasNext()){
                  RSS e = i.next();
                  if(e.setId() == Id) {
                     i.remove();
                     found = true;
                  }
               }
               
               if(!found){
                  System.out.println("Data tidak ditemukan\n");
               }else{
                  System.out.println("Data berhasil dihapus!\n");
               }
                  System.out.print("\n");
               System.out.println("||------------------------------------||\n");
            break;
            
            case 4:
            //Update data
               System.out.println("|---------Stok Spare Part--------|");
               for (RSS b : prt) {
                   System.out.println(" ");
                   System.out.println("ID Barang     : " + b.setId());
                   System.out.println("Jumlah Barang : " + b.setjumlah());
                   System.out.println("Nama Barang   : " + b.setBarang());
                   System.out.println("Merek Barang  : " + b.setMerek());
                   System.out.println("Harga Barang  : " + b.setHarga());
                }
               System.out.println("*--------------------------------*\n");
               found = false;
                    System.out.print("Masukkan ID yang ingin diupdate :");
               Id = Intr.nextInt();
               
               ListIterator<RSS>li = prt.listIterator();
               while(li.hasNext()){
                  RSS e = li.next();
                  if(e.setId() == Id)  {
                     System.out.print("Masukkan Nama Barang Baru : ");
                        Barang = Str.nextLine();
                     System.out.print("Masukkan Merek Baru       : ");
                        Merek = Str.nextLine();
                     System.out.print("Masukkan Jumlah Baru      : ");
                        Jumlah = Intr.nextInt();
                     System.out.print("Masukkan Harga Baru       : ");
                        Harga = Intr.nextInt();
                     
                     li.set(new RSS(Id,Jumlah,Barang,Merek,Harga));
                     found = true;
                    }
                }
               
               if(!found){
                  System.out.println("Data tidak ditemukan");}
                else{
                  System.out.println("Data berhasil diupdate!\n");}
               break;
            
            default:
              System.out.println("Terima kasih Telah Berkunjung Admin RSS");
              System.out.println("\tSelamat Beraktivitas Kembali");
            break; }
        }while(pilih!=5);
    }
    
}
