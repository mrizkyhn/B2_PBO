
package postest2;


public class pesertaprivate {
    public String nama;
    public String jeniskelas;
    public String alamat;
    public String tanggallahir;

   //Constructor
    public pesertaprivate(String nama, String jeniskelas, String alamat, String tanggallahir) {
        this.nama = nama;
        this.jeniskelas = jeniskelas;
        this.alamat = alamat;
        this.tanggallahir = tanggallahir;
    }


//Method
    void addDataPeserta(){
        system.out.println("data berhasil di tambah kan ");
}
    void deleteDataPeserta(){
        system.out.println("data berhasil di hapus");
}

}
