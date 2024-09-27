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
public class alatlistrik extends bangunan {
    String merek;
    String bahan;

    public alatlistrik(String merek, String nama, int harga, String bahan) {
        super(nama, harga);
        this.merek = merek;
        this.bahan = bahan;
    }

    public String getmerek() {
        return merek;
    }

    public void setmerek(String merek) {
        this.merek = merek;
    }
     public String getbahan() {
        return bahan;
    }

    public void setbahan(String bahan) {
        this.bahan = bahan;
    }
     @Override
  public void display(){
      System.out.println("Nama           : " + this.nama);
      System.out.println("Harga          : " + this.harga);
      System.out.println("Rasa           : " + this.merek);
      System.out.println("Ukuran         : " + this.bahan);
}
    public void pembeli(){
      System.out.println("Barang Bangunan Dibeli oleh orang");
  }
  public void pembeli(String orang){
      System.out.println("Barang Bangunan Dibeli oleh   : "+orang);
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
    

