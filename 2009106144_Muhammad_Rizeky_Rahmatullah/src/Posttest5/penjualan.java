
package Posttest5;

public class penjualan extends makanan {
    // PROPERTY
    private int jumlah;
    public final double diskon = 0.1;
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

    public void diskonHarga() {
        
        int total = 0;
        
        total = harga * jumlah;
        
        if (total >= 500000){
            double hargaDiskon = total * diskon;
            total =(int) (total - hargaDiskon);
            System.out.println("Total diskon 10% "+ total);
        }
    }
    
    @Override
    public void printData() {
        System.out.println("Nama : " + nama);
        System.out.println("Merk : " + merk);
        System.out.println("Harga : " + harga);
        System.out.println("Jumlah : " + jumlah);
    }
}