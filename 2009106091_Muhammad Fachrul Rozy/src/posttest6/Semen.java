/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;
import posttest5.*;
import posttest4.*;
/**
 *
 * @author GEFORCE_i5
 */
final class Semen extends Bangunan{
  private final String nama;
  private String harga;
  private String ukuran;
  private String jumlah;
  
  public Semen(String nama, int harga, String jumlah, String ukuran){
      super(nama, harga);
      this.nama = nama;
      this.jumlah = jumlah;
      this.ukuran = ukuran;
  }

    public String getjumlah() {
        return jumlah;
    }

    public void setjumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getUkuran() {
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
      pesan();
}
  
  protected void pesan(){
      System.out.println("Barang BAngunan sudah di pesan");
  }
  
  public void pembeli(){
      System.out.println("Barang Bangunan Dibeli oleh orang");
  }
  public void pembeli(String orang){
      System.out.println("Barang Bangunan Dibeli oleh   : "+orang);
  }

    
  
}