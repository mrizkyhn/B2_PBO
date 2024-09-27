
package Posttest3;

public class Barang {

    //property
    private String nama;
    private String merk;
    private int berat;
    private int stock;
    private int harga;
    int jumlah_pembelian_kue;
    int total_pembayaran;
 
    // constructor
    public Barang(String nama, String merk, int berat,int stock,int harga){
        this.nama = nama;
        this.merk = merk;
        this.berat = berat;
        this.stock = stock;
        this.harga = harga;
    }
    
    public void setNama(String nama){
     this.nama = nama;
    }
    public void setMerk(String merk){
     this.merk = merk;
    }
    public void setBerat(int berat){
     this.berat = berat;
    }
    public void setStock(int stock){
     this.stock = stock;
    }
    public void setHarga(int harga){
     this.harga = harga;
    }
    
    public String getNama(){
    return nama;
    }
    public String getMerk(){
    return merk;
    }
    public int getBerat(){
    return berat;
    }
    public int getStock(){
    return stock;
    }
    public int getHarga(){
    return harga;
    }
    // method 
    void print_data(){
        System.out.println("Nama Kue : " + getNama());
        System.out.println("Merk Kue : " + getMerk());
        System.out.println("Berat Kue : " + getBerat());
        System.out.println("Stock Kue : " + getStock());
        System.out.println("Harga Kue : " + getHarga());
    }
    
    static void tambah_data(){
        System.out.println("Data Telah Ditambahkan ");
    }
    static void update_data(){
        System.out.println("Data Telah Diupdate");
    }
    static void hapus_data(){
        System.out.println("Data Telah Dihapus ");
    }
     
    public int total_hargaDiskon(){
        int diskon = (5/100)*this.harga;
        int total = this.harga - diskon;
        return total;
        
    }
    void tampil_diskon(){
        System.out.println( "Harga Setelah Di Diskon 5% = " + total_hargaDiskon());
    }


}
