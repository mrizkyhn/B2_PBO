package posttest4;

abstract class Barang {
    // PROPERTY
    protected String nama, merk;
    protected int harga;
    
    // CONSTRUCTOR
    protected Barang(String nama, String merk, int harga) {
        this.nama = nama;
        this.merk = merk;
        this.harga = harga;
    }
    
    // GETTER
    protected String getNama() {
        return nama;
    }
    
    protected String getMerk() {
        return merk;
    }
    
    protected int getHarga() {
        return harga;
    }
    
    // SETTER
    protected void setNama(String nama) {
        this.nama = nama;
    }
    
    protected void setMerk(String merk) {
        this.merk = merk;
    }
    
    protected void setHarga(int harga) {
        this.harga = harga;
    }
    
    // ABSTRACT METHOD
    protected abstract void printData(int nomor);
}
