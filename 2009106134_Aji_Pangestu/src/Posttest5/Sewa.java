package posttest5;

abstract class Sewa implements GetterSetter{
    protected final String namapenyewa;
    protected String nomorlapangan, jenislapangan;
    protected int harga;   

    protected Sewa(String namapenyewa, String nomorlapangan,String jenislapangan,int harga) {
        this.namapenyewa    = namapenyewa;
        this.nomorlapangan  = nomorlapangan;
        this.jenislapangan  = jenislapangan;
        this.harga          = harga;
    }

    public String getNamapenyewa() {
        return namapenyewa;
    }

//    public void setNamapenyewa(String namapenyewa) {
//        this.namapenyewa = namapenyewa;
//    }

    public String getNomorlapangan() {
        return nomorlapangan;
    }

    public void setNomorlapangan(String nomorlapangan) {
        this.nomorlapangan = nomorlapangan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int Harga) {
        this.harga = Harga;
    }

    public String getJenislapangan() {
        return jenislapangan;
    }

    void setJenislapangan(String jenislapangan) {
        this.jenislapangan = jenislapangan;
    }
    
}

