package Posttest6;

import java.util.Formatter;  

public final class Android extends Handphone implements Fitur{
    private String Os;
    
    public Android(String P_Os, int id, String nm, String mrk, int st, int hg) {
        super(id, nm, mrk, st, hg);
        this.Os = P_Os;
    }

    public Android(String P_Os) {
        this.Os = P_Os;
    }
    public Android() {
        this.Os = "";
    }

  
    
    public String getOs() {
        return Os;
    }

    public void setOs(String Os) {
        this.Os = Os;
    }
    final void barangbeli(){
        System.out.println("Data Handphone Android Telah Tertambah");
    }
    final void barangubah(){
        System.out.println("Data Handphone Android Telah DiUbah");
    }
    final void barangberhasil(){
        System.out.println("Data Handphone Android Telah DiHapus");
    }
    
    @Override
    public void _5G(){
        System.out.println("Handphone Ini Telah di Bekali Teknologi 5G");
    }
    @Override
    public void fast_charging(){
        System.out.println("Handphone Ini Telah di Bekali Teknologi Fast Charging 25 Watt\n");
    }
}
