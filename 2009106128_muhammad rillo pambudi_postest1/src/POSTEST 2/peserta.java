
package postest2;


public class peserta {
    public String nama;
    public String alamat;
    public String jeniskelas;
    public String tanggallahir;

    //constructor
    public peserta(String nama, String alamat, String jeniskelas, String tanggallahir) {
        this.nama = nama;
        this.alamat = alamat;
        this.jeniskelas = jeniskelas;
        this.tanggallahir = tanggallahir;
        
    }

    //method
    void addDataPeserta(){
        System.out.println("data berhasil di tambah kan ");
}
    void deleteDataPeserta(){
        System.out.println("data berhasil di hapus");
}

}