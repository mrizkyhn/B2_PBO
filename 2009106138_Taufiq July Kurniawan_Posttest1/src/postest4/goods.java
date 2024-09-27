/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest4;

/**
 *
 * @author Hp
 */
public class goods extends bengkel{
     private int Harga;
     private String Merek;




   public goods(int Id, int Jumlah, String Merek, String Barang, int Harga) {
      super(Id, Jumlah, Barang);
      this.Merek = Merek;
      this.Harga = Harga;
    }
    void display(){

        System.out.println("Merek Barang  : " + this.Merek);
        System.out.println("Harga Barang  : " + this.Harga);
}

   public void setHarga(int Harga){
      this.Harga= Harga;
   }
   public void setMerek(String Merek){
      this.Merek =Merek;
   }

   public int GetHarga(){
      return Harga;
   }
   public String GetMerek(){
      return Merek;
   }
}
