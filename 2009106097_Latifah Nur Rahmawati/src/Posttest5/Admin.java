package Posttest5;

final public class Admin extends Karyawan {
    final public String nama;
    final public int id;
    
    public Admin(String profesi, String nama, int id){
        super(profesi);
        this.nama = nama;
        this.id = id;
    }
        
    @Override
    public void bagian(){
        System.out.println("Admin");
    }
    
    public int pegawai(int jumlahpegawai){
        return jumlahpegawai;
    }
    
    public void display(){
        System.out.println("Sebagai : "+this.profesi);
        System.out.println(this.nama);
        System.out.println("Id      : "+this.id);
    }
    
}