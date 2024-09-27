
package Posttest4;

public class penjualan extends makanan {
    // PROPERTY
    private int jumlah;
    
    // CONSTRUCTOR
    public penjualan(String nama, String merk, int harga, int jumlah){
        super(nama, merk, harga);
        this.jumlah = jumlah;
    }

    public int getJumlah() {
        return jumlah;
    }
    
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    public void printData() {
        System.out.println("Nama : " + nama);
        System.out.println("Merk : " + merk);
        System.out.println("Harga : " + harga);
        System.out.println("Jumlah : " + jumlah);
    }
}
