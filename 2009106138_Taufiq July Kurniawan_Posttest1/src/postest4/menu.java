/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import postest4.bengkel;
import postest4.goods;
import postest4.product;

/**
 *
 * @author Hp
 */
public class menu {

    private static boolean found;
    public static void main(String[] args) {
      List<goods> brg = new ArrayList<goods>();
      List<product> prd = new ArrayList<product>();
      Scanner Str = new Scanner(System.in);
      Scanner Intr = new Scanner(System.in);

      int pilih;
      do{
         System.out.println("*------ Rextor Speed Shop ------*");
         System.out.println("* [1] Tambah Data               *");
         System.out.println("* [2] Lihat Data                *");
         System.out.println("* [3] Hapus Data                *");
         System.out.println("* [4] Perbarui Data             *");
         System.out.println("* [0] Keluar                    *");
         System.out.println("*-------------------------------*");
         System.out.print("Pilih Menu : ");
         pilih = Intr.nextInt();
         System.out.print("\n");

 switch(pilih){
            case 1:
               int p;

               System.out.println("     TAMBAH DATA PRODUK ATAU BARANG  ");
               System.out.println("        1. Tambah Data Produk        "); 
               System.out.println("        2. Tambah Stok Spare Part    ");
               System.out.println("Pilih :");
               p = Intr.nextInt();
                if (p==1){
               System.out.println("*-----------     TAMBAH DATA PRODUK BENGKEL    -----------*");
               System.out.println("Masukkan ID Produk          : "); int Id = Intr.nextInt();
               System.out.println("Masukkan Jumlah Produk      : "); int Jumlah = Intr.nextInt();
               System.out.println("Masukkan Nama Produk        : "); String Barang = Str.nextLine();
               System.out.println("Masukkan harga / Produk     : "); int Harga = Str.nextInt();
               System.out.println("*----------------------------------------------------------*");
                prd.add(new product(Id,Jumlah,Barang,Harga));
               } else{

               System.out.println("*-----------     TAMBAH DATA SPARE PART     ------------*");
               System.out.println("Masukkan ID Barang          : "); int Id = Intr.nextInt();
               System.out.println("Masukkan Jumlah Barang      : "); int Jumlah = Intr.nextInt();
               System.out.println("Masukkan Nama Barang        : "); String Barang = Str.nextLine();
               System.out.println("Masukkan Produk Barang      : "); String Merek = Str.nextLine();
               System.out.println("Masukkan harga / Barang     : "); int Harga = Intr.nextInt();
               System.out.println("*-----------------------------------------------------------*");
                brg.add(new goods(Id,Jumlah,Merek,Barang,Harga));
}

               
            break;

            case 2:
               
               System.out.println("    LIHAT DATA PRODUK ATAU BARANG    ");
               System.out.println("        1. Lihat Data Spare part     "); 
               System.out.println("        2. Lihat Data produk         ");
               System.out.println("Pilih :");
               p = Intr.nextInt();

               
               if (p==1){
               Iterator<goods> i = brg.iterator();
               for (goods M : brg) {
                   System.out.println("------  Stok Spare Part  ---------");
                   System.out.println(" ");
                   System.out.println("\tID         : " + M.GetId());
                   System.out.println("\tJumlah     : " + M.GetJumlah());
                   System.out.println("\tbarang     : " + M.GetBarang());
                   System.out.println("\tproduk     : " + M.GetMerek());
                   System.out.println("\tHarga      : " + M.GetHarga());
                   System.out.println("+---------------------------------+");
               }
            }else{
               Iterator<product> i = prd.iterator();
               for (product M : prd) {
                   System.out.println("----Produk Spare Part Yang Tersedia-----");
                   System.out.println(" ");
                   System.out.println("\tID         : " + M.GetId());
                   System.out.println("\tJumlah     : " + M.GetJumlah());
                   System.out.println("\tNama       : " + M.GetBarang());
                   System.out.println("\tHarga      : " + M.GetHarga());
                   System.out.println("+-------------------------------------+");
               }
            }
               System.out.println("+----------------------------------------------+");
            break;

            

            case 3:
               System.out.println("     HAPUS DATA PRODUK ATAU BARANG   ");
               System.out.println("         1. Hapus Data Spare Part    "); 
               System.out.println("         2. Hapus Data Produk        ");
               System.out.println("Pilih :");
               p = Intr.nextInt();
               if (p==1){
               Iterator<goods> i = brg.iterator();
               for (goods M : brg) {
                   System.out.println("------  Stok Spare Part  ---------");
                   System.out.println(" ");
                   System.out.println("\tID         : " + M.GetId());
                   System.out.println("\tJumlah     : " + M.GetJumlah());
                   System.out.println("\tbarang     : " + M.GetBarang());
                   System.out.println("\tproduk     : " + M.GetMerek());
                   System.out.println("\tHarga      : " + M.GetHarga());
                   System.out.println("+---------------------------------+");
               }
                boolean found = false;
                    System.out.println("Masukkan ID data ingin dihapus :");
               int Id = Intr.nextInt();
                i = brg.iterator();
               while(i.hasNext()){
                  goods e = i.next();
                  if(e.GetId() == Id)  {
                     i.remove();
                     found = true;
                  }
               }
               if(!found){
                  System.out.println("Data tidak ditemukan...");
               }else{
                  System.out.println("Data berhasil dihapus...!");
               }
            }else{
               Iterator<product> i = prd.iterator();
               for (product M : prd) {
                   System.out.println("----Produk Spare Part Yang Tersedia-----");
                   System.out.println(" ");
                   System.out.println("\tID         : " + M.GetId());
                   System.out.println("\tJumlah     : " + M.GetJumlah());
                   System.out.println("\tNama       : " + M.GetBarang());
                   System.out.println("\tHarga      : " + M.GetHarga());
                   System.out.println("+-------------------------------------+");
               }

                boolean found = false;
                    System.out.println("Masukkan ID data ingin dihapus :");
               int Id = Intr.nextInt();
                i = prd.iterator();
               while(i.hasNext()){
                  product e = i.next();
                  if(e.GetId() == Id)  {
                     i.remove();
                     found = true;
                  }
               }
               if(!found){
                  System.out.println("Data tidak ditemukan....");
               }else{
                  System.out.println("Data berhasil dihapus...!");
               }
        }
            break;
            
         case 4:

               System.out.println("     UBAH DATA PRODUK ATAU BARANG    ");
               System.out.println("          1. Ubah Data Spare Part    "); 
               System.out.println("          2. Ubah Data Produk        ");
               System.out.println("Pilih :");
               p = Intr.nextInt();
               if (p==1){
               Iterator<goods> i = brg.iterator();
               for (goods M : brg) {
                   System.out.println("------  Stok Spare Part  ---------");
                   System.out.println(" ");
                   System.out.println("\tID         : " + M.GetId());
                   System.out.println("\tJumlah     : " + M.GetJumlah());
                   System.out.println("\tbarang     : " + M.GetBarang());
                   System.out.println("\tproduk     : " + M.GetMerek());
                   System.out.println("\tHarga      : " + M.GetHarga());
                   System.out.println("+---------------------------------+");
               }
               boolean found = false;
               found = false;

               System.out.println("Masukkan ID data yang ingin di Update :");
               int Id = Intr.nextInt();
               ListIterator<goods>li = brg.listIterator();
               while(li.hasNext()){
                  goods e = li.next();
                  if(e.GetId() == Id)  {
                     System.out.println("Masukkan Nama Barang Baru    : ");String Barang = Str.nextLine();
                     System.out.println("Masukkan Produk Baru         : ");String Merek = Str.nextLine();
                     System.out.println("Masukkan Jumlah Baru         : ");int Jumlah = Intr.nextInt();
                     System.out.println("Masukkan Harga Baru          : ");int Harga = Intr.nextInt();
                     System.out.println("+-----------------------------------------------------------+");                     
                     li.set(new goods(Id,Jumlah,Barang,Merek,Harga));
                     found = true;
                  }
               }
               if(!found){
                  System.out.println("Data tidak ditemukan...");
               }else{
                  System.out.println("Data berhasil di Update...!!!");
               }
              }else{
               Iterator<product> i = prd.iterator();
               for (product M : prd) {
                   System.out.println("----Produk Spare Part Yang Tersedia-----");
                   System.out.println(" ");
                   System.out.println("\tID         : " + M.GetId());
                   System.out.println("\tJumlah     : " + M.GetJumlah());
                   System.out.println("\tNama       : " + M.GetBarang());
                   System.out.println("\tHarga      : " + M.GetHarga());
                   System.out.println("+-------------------------------------+");
               }
               boolean found = false;
               found = false;
               System.out.println("Masukkan ID data yang ingin di Update :");
               int Id = Intr.nextInt();
               ListIterator<product>li = prd.listIterator();
               while(li.hasNext()){
                  product e = li.next();
                  if(e.GetId() == Id)  {
                     System.out.println("Masukkan Nama Produk Baru    : ");String Barang = Str.nextLine();
                     System.out.println("Masukkan Jumlah Produk Baru  : ");int Jumlah = Intr.nextInt();
                     System.out.println("Masukkan Harga Produk Baru   : ");int Harga = Intr.nextInt();
                     System.out.println("+-----------------------------------------------------------+");                     
                     li.set(new product(Id,Jumlah,Barang,Harga));
                     found = true;
                  }
               }
}
               if(!found){
                  System.out.println("Data tidak ditemukan");
               }else{
                   System.out.println("Data berhasil diupdate!\n");
               }               
            break;

            default:
              System.out.println("Terima kasih Telah Berkunjung Admin RSS");
              System.out.println("\tSelamat Beraktivitas Kembali");
            break;
        }
      }while(pilih!=0);
        
    }
    
}
