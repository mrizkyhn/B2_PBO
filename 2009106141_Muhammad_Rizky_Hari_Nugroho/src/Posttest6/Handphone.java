package Posttest6;

import java.util.Formatter;  

public abstract class Handphone {
     //Atribut
    protected  int id;
    protected  String Nama;
    protected  String Merk;
    protected  int Stok;
    protected  int Harga;
    
    Handphone(int id, String nm, String mrk, int st, int hg)
    {
        this.id = id;
        this.Nama = nm;
        this.Merk = mrk;
        this.Stok = st;
        this.Harga = hg;

    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public int getStok() {
        return Stok;
    }

    public void setStok(int Stok) {
        this.Stok = Stok;
    }

    public int getHarga() {
        return Harga;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }

    
    Handphone(){
        this.id        = 0;
        this.Nama      = "-";
        this.Merk      = "-";
        this.Stok      = 0;
        this.Harga     = 0;
    }
        
        
    public void setId(int id){
        this.id = id;
}

    public int getId()
    {
       return id;
    }

    public void setNm(String nm){
        this.Nama = nm;
    }
    
    public String getNm()
    {
       return Nama;
    }
    
    public void setMrk(String mrk){
        this.Merk = mrk;
    }
    
    public String getMrk()
    {
       return Merk;
    }

    public void setSt(int st){
        this.Stok = st;
    }
    
    public int getSt()
    {
       return Stok;
    }
    
    public void setHg(int hg){
        this.Harga = hg;
    }
    
    public int getHg()
{
       return Harga;
    }
    void barangbeli(){
        System.out.println("Data Telah Tertambahh");
    }
    void barangubah(){
        System.out.println("Data Telah DiUbah");
    }
    void barangberhasil(){
        System.out.println("Data Telah DiHapus");
    }
}

