package posttest4;

public class Belanja extends Barang {
    // PROPERTY
    private int jumlahBarang;
    
    // CONSTRUCTOR
    public Belanja(String nama, String merk, int harga, int jumlahBarang){
        super(nama, merk, harga);
        this.jumlahBarang = jumlahBarang;
    }
    
    // GETTER
    public int getJumlahBarang() {
        return jumlahBarang;
    }
    
    // SETTER
    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }
    
    // PAJAK BARANG
    public final double pajakBarang() {
        double pajak = 0.0;
        pajak += harga * 0.11;
        return pajak;
    }
    
    // OVERLOADING
    // JIKA JUMLAH BARANG LEBIH DARI SATU
    public final double pajakBarang(int jumlahBarang) {
        double pajak = 0.0;
        for (int i = 0; i < jumlahBarang; i++) {
            pajak += harga * 0.11;
        }
        return pajak;
    }
    
    // PRINT DATA
    @Override
    public void printData(int nomor){
        System.out.printf("%-5s%-100s%-20s%-11s%s\n", String.valueOf(nomor), nama, merk, String.valueOf(harga), String.valueOf(jumlahBarang));
    }
    
    // SUBTOTAL
    public final double subtotalBarangBelanja() {
        double subtotal = 0.0;
        if (jumlahBarang > 1) {
            subtotal += jumlahBarang * harga + pajakBarang(jumlahBarang);
        } else {
            subtotal += jumlahBarang * harga + pajakBarang();
        }
        return subtotal;
    }
}
