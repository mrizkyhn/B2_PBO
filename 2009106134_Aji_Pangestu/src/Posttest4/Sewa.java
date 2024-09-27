package Posttest4;

public class Sewa {
    protected String namacalonkepaladaerah, namacalonwakil, nomorurut; 
    private String namapenyewa;
    private String nomorlapangan;
    private String jenislapangan;
    private int harga;

    public Sewa(String namapenyewa, String nomorlapangan, int harga) {
        this.namapenyewa    = namapenyewa;
        this.nomorlapangan  = nomorlapangan;
        this.jenislapangan  = jenislapangan;
        this.harga          = harga;
    }

    public String getNamapenyewa() {
        return namapenyewa;
    }

    public void setNamapenyewa(String namapenyewa) {
        this.namapenyewa = namapenyewa;
    }

    public String getNomorlapangan() {
        return nomorlapangan;
    }

    public void setNomorlapangan(String nomorlapangan) {
        this.nomorlapangan = nomorlapangan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(String Harga) {
        this.harga = harga;
    }

    Object getJenislapangan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setJenislapangan(String readLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
