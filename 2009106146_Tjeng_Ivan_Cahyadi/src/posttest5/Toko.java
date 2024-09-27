package posttest5;

public final class Toko extends Barang {
    // PROPERTY
    private String jenis;
    private int stock;
    
    // CONSTRUCTOR
    public Toko(String id, String nama, String merk, String jenis, int harga, int stock){
        super(id, nama, merk, harga);
        this.jenis = jenis;
        this.stock = stock;
    }
    
    // GETTER
    public String getJenis() {
        return jenis;
    }
    
    public int getStock() {
        return stock;
    }
    
    // SETTER
    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    // PRINT DATA
    @Override
    public void printData(int nomor){
        System.out.printf("%-5s%-100s%-20s%-40s%-11s%s\n", String.valueOf(nomor), nama, merk, jenis, String.valueOf(harga), String.valueOf(stock));
    }
}
