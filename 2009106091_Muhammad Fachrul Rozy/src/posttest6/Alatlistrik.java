/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;
import posttest5.*;
import posttest4.*;

/**
 *
 * @author ACER
 */
final class Alatlistrik extends Bangunan{
  private final String nama;
  private String harga;
  private String merek;
  private String bahan;
  
  public Alatlistrik(String nama, int harga, String merek, String bahan){
      super(nama, harga);
      this.nama = nama;
      this.bahan = bahan;
      this.merek = merek;
  }

    public String getbahan() {
        return bahan;
    }

    public void setbahan(String bahan) {
        this.bahan = bahan;
    }

    public String getmerek() {
        return merek;
    }

    public void setmerek(String merek) {
        this.merek = merek;
    }
    
    @Override
  public void display(){
      System.out.println("Nama           : " + this.nama);
      System.out.println("Harga          : " + this.harga);
      System.out.println("Bahan           : " + this.bahan);
      System.out.println("Merek         : " + this.merek);
      pesan();
}
  
  protected void pesan(){
      System.out.println("Barang Bangunan sudah di pesan");
  }
  
    public void pembeli(){
      System.out.println("Barang Bangunan Dibeli oleh orang");
  }
  public void pembeli(String orang){
      System.out.println("Barang Bangunan Dibeli oleh   : "+orang);
  }

}

/**
 *
 * @author GEFORCE_i5
 */

