

public class Barang {

    //property
    String nama;
    String merk;
    int berat;
    int stock;
    int harga;
 
    // constructor
    public Barang(String nama, String merk, int berat,int stock,int harga){
        this.nama = nama;
        this.merk = merk;
        this.berat = berat;
        this.stock = stock;
        this.harga = harga;
    }


    public String getnama(){
        return nama;
    }
    public String getmerk(){
        return merk;
    }
    public int getberat(){
        return berat;
    }
    public int getstock(){
        return stock;
    }
    public int getharga(){
        return harga;
    }
    
    // method 
    void print_data(){
        System.out.println("Nama Kue : " + this.nama);
        System.out.println("Merk Kue : " + this.merk);
        System.out.println("Berat Kue : " + this.berat);
        System.out.println("Stock Kue : " + this.stock);
        System.out.println("Harga Kue : " + this.harga);
    }

     
}