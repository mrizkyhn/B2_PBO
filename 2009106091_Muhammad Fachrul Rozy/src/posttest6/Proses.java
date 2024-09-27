/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

/**
 *
 * @author GEFORCE_i5
 */
public class Proses implements Pemesanan{
    
    @Override
    public void pesankan(){
        System.out.println("Barang Bangunan sedang di proses");
    }
    
    public void batal() {
        System.out.println("Pesanan di Batalkan");
    }
}

