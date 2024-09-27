package posttest5;

public final class Matras extends Sewa{
    private String Jenislapangan;
    private String Namapenyewa;
    private String Nomorlapangan;
    private int Harga;

    public Matras(String namapenyewa, String nomorlapangan, String jenislapangan, int harga) {    
        super(namapenyewa, nomorlapangan,jenislapangan, harga);
        this.Jenislapangan = jenislapangan;
    }


    public void display() {
        System.out.println("Namapenyewa     : " + this.Namapenyewa);
        System.out.println("Nomorlapangan   : " + this.Nomorlapangan);
        System.out.println("Jenislapangan   : " + this.Jenislapangan);
        System.out.println("Harga           : " + this.Harga);
    }
    @Override
    public String getJenislapangan() {
        return Jenislapangan;
    }
    @Override
    public void setJenislapangan(String Jenislapangan) {
        this.Jenislapangan = Jenislapangan;
    }
    @Override
    public String getNamapenyewa() {
        return Namapenyewa;
    }
    public void setNamapenyewa(String Namapenyewa) {
        this.Namapenyewa = Namapenyewa;
    }
    @Override
    public String getNomorlapangan() {
        return Nomorlapangan;
    }
    @Override
    public void setNomorlapangan(String Nomorlapangan) {
        this.Nomorlapangan = Nomorlapangan;
    }
    @Override
    public int getHarga() {
        return Harga;
    }

    @Override
    public void setHarga(int Harga) {
        this.Harga = Harga;
    }
    void printData(){
    };

}
