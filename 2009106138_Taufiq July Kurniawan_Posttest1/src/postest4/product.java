/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest4;

/**
 *
 * @author Hp
 */
public class product extends bengkel{
     private int Harga;
     
   public product(int Id, int Jumlah, String Barang, int Harga) {
            super(Id, Jumlah, Barang);
      this.Harga = Harga;
    }
    void display(){

        System.out.println("Harga Produk  : " + this.Harga);
}

   public void setHarga(int Harga){
      this.Harga= Harga;
   }

   public int GetHarga(){
      return Harga;
   }
}
