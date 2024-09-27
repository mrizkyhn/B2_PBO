package posttest5;

public class kasir extends karyawan {
    private String nama_kasir;
    private int umur;
    
    
    public kasir(String nama_karyawan, String alamat, String tanggal_lahir, int umur, Double tinggi, Double berat_badan) {
        super(nama_karyawan, alamat, tanggal_lahir, umur, tinggi, berat_badan);
    }
    
    kasir (String nama_kasir, int umur){
        this.nama_kasir = nama_kasir;
        this.umur = umur;
    }
    
    public kasir (){
        this.nama_kasir = "Pasla";
        this.umur = 16;
    }

    public String getNama_kasir() {
        return nama_kasir;
    }

    public void setNama_kasir(String nama_kasir) {
        this.nama_kasir = nama_kasir;
    }

    @Override
    public int getUmur() {
        return umur;
    }

    @Override
    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    
}
