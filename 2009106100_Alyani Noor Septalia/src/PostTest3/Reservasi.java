package posttest3;

class Reservasi{
    private String tanggal; 
    private String jam; 
    private String nama;
    private int pax;


    public Reservasi(String tanggal, String jam, String nama, int pax){
        setTanggal(tanggal);
        setJam(jam);
        setNama(nama);
        setPax(pax);
    }


    public String toString(){
        return getTanggal()+"       "+getNama()+"          "+getJam()+"         "+getPax();
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getPax() {
        return pax;
    }

    public void setPax(int pax) {
        this.pax = pax;
    }
}




