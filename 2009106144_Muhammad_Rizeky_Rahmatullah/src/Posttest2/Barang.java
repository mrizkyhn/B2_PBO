
package Posttest2;

public class Barang {

    //property
    String nama;
    String merk;
    int berat;
    int stock;
    int harga;
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

    // method 
    void print_data(){
        System.out.println("Nama Kue : " + this.nama);
        System.out.println("Merk Kue : " + this.merk);
        System.out.println("Berat Kue : " + this.berat);
        System.out.println("Stock Kue : " + this.stock);
        System.out.println("Harga Kue : " + this.harga);
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
