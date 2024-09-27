/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posttest3;

public class Parfum {
    private String namaParfum;
    private int kode;
    private int jumlah;
    private double harga;

    //setter
    public void setnamaParfum(){
        this.namaParfum = namaParfum;
    }
    public void setkode(){
        this.kode = kode;
    }
    public void setjumlah(){
        this.jumlah = jumlah;
    }
    public void setharga(){
        this.harga = harga;
    }
    
    //  getter  
    public String getnamaParfum(){
        return namaParfum;
    }
    public int getkode(){
        return kode;
    }
    public int getjumlah(){
        return jumlah;
    }
    public double getharga(){
        return harga;
    }
    
    public double hargaDiskon(){
        double diskon = 0.05 * getharga();
        double total = getharga() - diskon;
        
        return total;
    }
   
    public void keterangan(){
        System.out.println("Harga Parfum Sesudah Diskon 5% = Rp. " + hargaDiskon());
    }
}
