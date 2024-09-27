/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTEST2;

/**
 *
 * @author Admin
 */
class Barang{
    int id;
    String Nama;
    String Barang;
    String Jenis;
    int Jumlah;
    int Harga;
    String J_Bayar;
    Barang(int id, String nm, String br, String js, int jm, int hg, String jb)
    {
        this.id = id;
        this.Nama = nm;
        this.Barang = br;
        this.Jenis = js;
        this.Jumlah = jm;
        this.Harga = hg;
        this .J_Bayar = jb;

    }
    Barang(){
        this.id = 0;
        this.Nama = "";
        this.Barang = "";
        this.Jenis = "";
        this.Jumlah = 0 ;
        this.Harga = 0;
        this.J_Bayar = "";
        
        
    }

    Barang(int id, String nm) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
    public int getId()
    {
       return id;
    }
     
    public String getNm()
    {
       return Nama;
    }
     
    public String getBr()
    {
       return Barang;
    }
    
   public String getJs()
    {
       return Jenis;
    }

    public int getJm()
    {
       return Jumlah;
    }

    public int getHg()
    {
       return Harga;
    }

    public String getJb()
    {
       return J_Bayar;
    }
    void barangbeli(){
        System.out.println("Data Telah Tertambah");
    }
    void barangubah(){
        System.out.println("Data Telah DiUbah");
    }
    void barangberhasil(){
        System.out.println("Data Telah DiHapus");
    }
}