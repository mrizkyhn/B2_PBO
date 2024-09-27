/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest6;

/**
 *
 * @author Hp
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


public final class menu {
       
    static List<goods> brg = new ArrayList<goods>();
    static List<product> prd = new ArrayList<product>();
    private static boolean found;
    public final static void main(String[] args) {
        // Data Produk
    prd.add(new product(1,3,"pasca Jaya, ABP Mandiri,  Van Java",3000000));
    prd.add(new product(2,2,"Multi, Jaya Utama,",4000000));
    prd.add(new product(3,1,"Balfiltracts",5000000));

    //Data Barang
    brg.add(new goods(1,3,"Pasca Jaya","Aki",400000));
    brg.add(new goods(2,3,"Van Java","Velg",1000000));
    brg.add(new goods(3,3,"Balfiltracts","Kampar Rem",300000));
    menu();
    }
    public static void menu() {
      Scanner Str = new Scanner(System.in);
      Scanner Int = new Scanner(System.in);
    
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
         pilih = Int.nextInt();
         System.out.print("\n");

 switch(pilih){
            case 1:
               int p;

               System.out.println("     TAMBAH DATA PRODUK ATAU BARANG  ");
               System.out.println("        1. Tambah Data Produk        "); 
               System.out.println("        2. Tambah Stok Spare Part    ");
               System.out.println("Pilih :");
               p = Int.nextInt();
                if (p==1){
               
               System.out.println("*-----------     TAMBAH DATA PRODUK BENGKEL    -----------*");
               System.out.println("Masukkan ID Produk          : "); int Id = Int.nextInt();
               System.out.println("Masukkan Jumlah Produk      : "); int Jumlah = Int.nextInt();
               System.out.println("Masukkan Nama Produk        : "); String Barang = Str.nextLine();
               System.out.println("Masukkan harga / Produk     : "); int Harga = Str.nextInt();
               System.out.println("*----------------------------------------------------------*");
               prd.add(new product(Id,Jumlah,Barang,Harga));
            //    product tambah = new product(Id, Jumlah, Barang, Harga);
            //    tambah.Masukkan();
            //    product.add(tambah);
               } else{
            
              

               System.out.println("*-----------     TAMBAH DATA SPARE PART     ------------*");
               System.out.println("Masukkan ID Barang          : "); int Id = Int.nextInt();
               System.out.println("Masukkan Jumlah Barang      : "); int Jumlah = Int.nextInt();
               System.out.println("Masukkan Nama Barang        : "); String Barang = Str.nextLine();
               System.out.println("Masukkan Produk Barang      : "); String Merek = Str.nextLine();
               System.out.println("Masukkan harga / Barang     : "); int Harga = Int.nextInt();
               System.out.println("*-----------------------------------------------------------*");
               brg.add(new goods(Id,Jumlah,Merek,Barang,Harga));
            //    goods tambah = new goods(Id, Jumlah, Merek, Barang, Harga);
            //    tambah.Masukkan();
            //    goods.add(tambah);
}

               
            break;

            case 2:
               
               System.out.println("    LIHAT DATA PRODUK ATAU BARANG    ");
               System.out.println("        1. Lihat Data Spare part     "); 
               System.out.println("        2. Lihat Data produk         ");
               System.out.println("Pilih :");
               p = Int.nextInt();

               
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
               p = Int.nextInt();
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
               int Id = Int.nextInt();
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
               int Id = Int.nextInt();
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
               p = Int.nextInt();
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
               int Id = Int.nextInt();
               ListIterator<goods>li = brg.listIterator();
               while(li.hasNext()){
                  goods e = li.next();
                  if(e.GetId() == Id)  {
                     System.out.println("Masukkan Nama Barang Baru    : ");String Barang = Str.nextLine();
                     System.out.println("Masukkan Produk Baru         : ");String Merek = Str.nextLine();
                     System.out.println("Masukkan Jumlah Baru         : ");int Jumlah = Int.nextInt();
                     System.out.println("Masukkan Harga Baru          : ");int Harga = Int.nextInt();
                     System.out.println("+-----------------------------------------------------------+");                     
                     li.set(new goods(Id,Jumlah,Barang,Merek,Harga));
                     found = true;
                  }
               }
               if(!found){
                  System.out.println("");
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
               int Id = Int.nextInt();
               ListIterator<product>li = prd.listIterator();
               while(li.hasNext()){
                  product e = li.next();
                  if(e.GetId() == Id)  {
                     System.out.println("Masukkan Nama Produk Baru    : ");String Barang = Str.nextLine();
                     System.out.println("Masukkan Jumlah Produk Baru  : ");int Jumlah = Int.nextInt();
                     System.out.println("Masukkan Harga Produk Baru   : ");int Harga = Int.nextInt();
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

