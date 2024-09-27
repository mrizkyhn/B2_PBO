
package Posttest3;

class Studyclub {
    public String nama;
    private int nim;
    private String prodi;
    private String alasan;
    
    public int getNim(){
        return nim;
    }
    public void setNim(int nim){
        this.nim = nim;
    }
    public String getProdi(){
        return prodi;
    }
    public void setProdi(String prodi){
        this.prodi = prodi;
    }
    public String getAlasan(){
        return alasan;
    }
    public void setAlasan(String alasan){
        this.alasan = alasan;
    }
    public Studyclub(String nama, int nim, String prodi, String alasan){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.alasan = alasan;
        
    }
    void lihat(){
        System.out.println(this.nama);
    }
    void tambah(){
        System.out.println("data peserta telah ditambahkan");
    }
    void hapus(){
       System.out.println("data peserta telah dihapus"); 
    }
    void edit(){
        System.out.println("data peserta telah diedit");
    }
}
