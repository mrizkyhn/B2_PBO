/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest6;

/**
 *
 * @author Hp
 */
public class goods extends bengkel implements interbengkel{
    private int Harga;
    private String Merek;
    private boolean Jambuka;
    private boolean Jamtutup;




  public goods(int Id, int Jumlah, String Merek, String Barang, int Harga) {
     super(Id, Jumlah, Barang);
     this.Merek = Merek;
     this.Harga = Harga;

   }
public void JamBuka(){
    
        Jambuka = true;
        System.out.println("Bengkel Sudah Di buka..." + Open);
}

public void JamTutup(){
        Jambuka = false;
        System.out.println("Bengkel Sudah Di Tutup..." + Close);
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
  public final void Masukkan(){
      System.out.println("Barang Masuk!!!");
  }
  public final void Keluar(){
    System.out.println("Barang Keluar!!!");
    }
public static void add(String merek2) {
    }

public static void add(goods tambah) {
    }
}

