package Posttest6;

import Posttest5.*;

public abstract class Karyawan {
    public String profesi;
    
    public Karyawan(String profesi){
        this.profesi = profesi;
    }
    
    public void display(){
        System.out.println("Sebagai : "+this.profesi);
    }
    
    public abstract void bagian();
    public abstract int pegawai(int jumlahpegawai);
    
}
