package PostTest2;

class Reservasi{
    String tanggal, jam, nama;
    int pax;

    public Reservasi(String tanggal, String jam, String nama, int pax){
        this.tanggal = tanggal;
        this.jam = jam;
        this.nama = nama;
        this.pax = pax;
    }

    public String toString(){
        return this.tanggal+"     "+this.jam+"     "+this.nama+"          "+this.pax;
    }
}
