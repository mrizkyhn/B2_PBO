package Posttest4;

public class Sintetis extends Sewa{
    private String Jenislapangan;
    private String Namapenyewa;
    private String Nomorlapangan;
    private String Harga;

    public Sintetis(String namapenyewa, String nomorlapangan, String jenislapangan, int harga) {    
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
}
