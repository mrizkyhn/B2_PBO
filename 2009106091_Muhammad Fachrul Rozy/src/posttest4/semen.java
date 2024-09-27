/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;
import posttest3.*;
import posttest2.*;
/**
 *
 * @author GEFORCE_i5
 */
public class semen extends bangunan{
  private String jumlah;
  private String ukuran;
  
  public semen(String nama, int harga, String jumlah, String ukuran){
      super(nama, harga);
      this.jumlah = jumlah;
      this.ukuran = ukuran;
  }

    public String getjumlah() {
        return jumlah;
    }

    public void setjumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getukuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }
    
        @Override
  public void display(){
      System.out.println("Nama           : " + this.nama);
      System.out.println("Harga          : " + this.harga);
      System.out.println("Jumlah           : " + this.jumlah);
      System.out.println("Ukuran         : " + this.ukuran);
}
  public void pembeli(){
      System.out.println("Toko Barang Bangunan Dibeli oleh orang");
  }
  public void pembeli(String orang){
      System.out.println("Barang Bangunan Dibeli oleh   : "+orang);
  }

    void setukuran(String readLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getnama() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setnama(String readLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setharga(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


