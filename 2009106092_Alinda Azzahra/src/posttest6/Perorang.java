//Nama  : Alinda Azzahra
//NIM   : 2009106092
//Kelas : Informatika B 2020
//
//Sistem Pendataan Zakat Fitrah
package posttest6;

public final class Perorang extends Zakat{
    protected final String orang;
    
    public Perorang(String orang, String nama, int usia, String jenkel, String telp, String alamat, String harga){
        super(nama, usia, jenkel, telp, alamat, harga);
        this.orang = orang;
    }
    
    @Override
    final void display(){
        super.display();
        System.out.println("Bayar untuk    : "+this.orang);
    }
    
    @Override
    public void Simpan(){
        System.out.println("Data berhasil disimpan");
    }

    public String getOrang() {
        return orang;
    }

    public void setOrang(String orang) {
    }
}
