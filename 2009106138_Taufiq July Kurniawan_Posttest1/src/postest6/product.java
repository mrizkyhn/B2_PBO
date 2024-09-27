/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest6;

/**
 *
 * @author Hp
 */
public class product extends bengkel implements interbengkel{
    private int Harga;

    private boolean Jambuka;
    private boolean Jamtutup;

    
  public product(int Id, int Jumlah, String Barang, int Harga) {
           super(Id, Jumlah, Barang);
     this.Harga = Harga;
   }
   void display(){

       System.out.println("Harga Produk  : " + this.Harga);
}
public void JamBuka(){
    
        Jambuka = true;
        System.out.println("Bengkel Sudah Di buka..." + Open);
}

public void JamTutup(){
        Jambuka = false;
        System.out.println("Bengkel Sudah Di Tutup..." + Close);
}
  public void setHarga(int Harga){
     this.Harga= Harga;
  }

  public int GetHarga(){
     return Harga;
  }
  public final void Masukkan(){
      System.out.println("Barang Masuk!!!");
  }
  public final void Keluar(){
    System.out.println("Barang Keluar!!!");
    }
public static void add(product tambah) {
    }
}
