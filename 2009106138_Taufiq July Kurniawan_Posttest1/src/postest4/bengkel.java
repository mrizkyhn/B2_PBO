/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest4;

/**
 *
 * @author Hp
 */
public class bengkel {
   protected int Id,Jumlah;
   protected String Barang;


   public bengkel(int Id,int Jumlah, String Barang){
      this.Id = Id;
      this.Jumlah = Jumlah;
      this.Barang = Barang;

   }
    void display(){
        System.out.println("Id Produk     : " + this.Id);
        System.out.println("Nama Produk   : " + this.Barang);
        System.out.println("Jumlah Produk : " + this.Jumlah);
}

   public void setId(int Id){
      this.Id=Id;
   }
   public void setJumlah(int Jum){
      this.Jumlah=Jumlah;
   }

   public void setBarang(String Barang){
      this.Barang = Barang;
   }
   public int GetId(){
      return Id;
   }
   public int GetJumlah(){
      return Jumlah;
   }

   public String GetBarang(){
      return Barang;
   } 
}
