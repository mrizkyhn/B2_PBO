public class toefl {
    
    private String nama;
    private String alamat;
    private String jeniskelas;
    private String nilai;
    
    public toefl(String nama,String alamat,String jeniskelas,String nilai){
            this.nama = nama;
            this.alamat = alamat;
            this.jeniskelas = jeniskelas;
            this.nilai = nilai;
}



public void toefl() {
     System.out.println("\n\t\t peserta toefl\n");
     System.out.println("=======================================");
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJeniskelas() {
        return jeniskelas;
    }

    public void setJeniskelas(String jeniskelas) {
        this.jeniskelas = jeniskelas;
    }

    public String getNilai() {
        return nilai;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }
}




