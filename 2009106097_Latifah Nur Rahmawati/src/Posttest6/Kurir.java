package Posttest6;

import Posttest5.*;

public class Kurir extends Karyawan {
    public Kurir(String profesi){
        super(profesi);
    }
    
    public void bagian(){
        System.out.println("Kurir");
    }
    
    public int pegawai(int jumlahpegawai){
        return jumlahpegawai;
    }
}
