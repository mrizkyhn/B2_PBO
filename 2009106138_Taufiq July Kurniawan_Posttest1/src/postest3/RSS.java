/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest3;

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
   public void setId(int Id){
      this.Id=Id;
   }
   public void setJumlah(int Jumlah){
      this.Jumlah=Jumlah;
   }
   public void setHarga(int Harga){
      this.Harga= Harga;
   }
   public void setMerek(String Merek){
      this.Merek =Merek;
   }
   public void setBarang(String Barang){
      this.Barang = Barang;
   }
   public int GetId(){
      return Id;
   }
   public int Getjumlah(){
      return Jumlah;
   }
   public int GetHarga(){
      return Harga;
   }
   public String GetMerek(){
      return Merek;
   }
   public String GetBarang(){
      return Barang;
   }
 void Didata() {
        System.out.println(" Ada Di data");
    }

    void Mendata() {
        System.out.println("Bisa Mendata");
    }      
}
