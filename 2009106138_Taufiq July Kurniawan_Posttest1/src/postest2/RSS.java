/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest2;

/**
 *
 * @author Hp
 */
public class RSS {
 int Id,Jumlah,Harga;
   String Merek,Barang;


   public RSS(int Id,int Jumlah, String Merek, String Barang, int Harga){
      this.Id = Id;
      this.Jumlah = Jumlah;
      this.Merek = Merek;
      this.Barang = Barang;
      this.Harga = Harga;
   }
    void display(){
        System.out.println("Id Barang     : " + this.Id);
        System.out.println("Merek Barang  : " + this.Merek);
        System.out.println("Nama Barang   : " + this.Barang);
        System.out.println("Jumlah Barang : " + this.Jumlah);
        System.out.println("Harga Barang  : " + this.Harga);
}
   public int setId(){
      return Id;
   }
   public int setjumlah(){
      return Jumlah;
   }
   public int setHarga(){
      return Harga;
   }
   public String setMerek(){
      return Merek;
   }
   public String setBarang(){
      return Barang;
   }

 void Didata() {
        System.out.println(" Ada Di data");
    }

    void Mendata() {
        System.out.println("Bisa Mendata");
    }      
}
