package DoublePosttest5;

public class Matras extends Sewa{
    private String Jenislapangan;
    private String Namapenyewa;
    private String Nomorlapangan;
    private String Harga;

    public Matras(String namapenyewa, String nomorlapangan, String jenislapangan, int harga) {    
        super(namapenyewa, nomorlapangan, harga);
        this.Jenislapangan = jenislapangan;
    }

    @Override
    public String getJenislapangan() {
        return Jenislapangan;
    }

    @Override
    public void setJenislapangan(String jenislapangan) {
        this.Jenislapangan = jenislapangan;
    }
    public void display() {
        System.out.println("Namapenyewa     : " + this.Namapenyewa);
        System.out.println("Nomorlapangan   : " + this.Nomorlapangan);
        System.out.println("Jenislapangan   : " + this.Jenislapangan);
        System.out.println("Harga           : " + this.Harga);
    }

    protected void printData(int nomor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    @Override
//    public void setHarga(int harga) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void setNamapenyewa(String namapenyewa) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
