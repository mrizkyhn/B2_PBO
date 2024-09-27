/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest6;

/**
 *
 * @author Hp
 */
public abstract class bengkel {
    
 protected int Id,Jumlah;
   protected String Barang;


    void display(){
        System.out.println("Id Produk     : " + this.Id);
        System.out.println("Nama Produk   : " + this.Barang);
        System.out.println("Jumlah Produk : " + this.Jumlah);
}

   public bengkel(int id, int jumlah, String barang) {
    Id = id;
    Jumlah = jumlah;
    Barang = barang;
}
public void setBarang(String Barang){
      this.Barang = Barang;
   }
public void setJumlah(int Jumlah){
    this.Jumlah=Jumlah;
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
     public abstract void Masukkan();
  public abstract void Keluar();
}

