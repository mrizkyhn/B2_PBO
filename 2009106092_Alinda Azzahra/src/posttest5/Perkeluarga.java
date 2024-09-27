//Nama  : Alinda Azzahra
//NIM   : 2009106092
//Kelas : Informatika B 2020
//
//Sistem Pendataan Zakat Fitrah
package posttest5;

public final class Perkeluarga extends Zakat{
    private String keluarga;
    private int jumAnggota;
    
    public Perkeluarga(String keluarga, int jumAnggota, String nama, int usia, String jenkel, String telp, String alamat, String harga){
        super(nama, usia, jenkel, telp, alamat, harga);
        this.keluarga = keluarga;
        this.jumAnggota = jumAnggota;
    }
    
    @Override
    final void display(){
        super.display();
        System.out.println("Bayar untuk    : "+this.keluarga);
        System.out.println("Jumlah Anggota : "+this.jumAnggota);
    }

    public String getKeluarga() {
        return keluarga;
    }

    public void setKeluarga(String keluarga) {
        this.keluarga = keluarga;
    }

    public int getJumAnggota() {
        return jumAnggota;
    }

    public void setJumAnggota(int jumAnggota) {
        this.jumAnggota = jumAnggota;
    }
    
    @Override
    public void Simpan(){
        System.out.println("Data berhasil disimpan");
    }
}
