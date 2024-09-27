
package Posttest4;

import java.util.Formatter;  

public class Android extends Handphone{
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
    void barangbeli(){
        System.out.println("Data Handphone Android Telah Tertambah");
    }
    void barangubah(){
        System.out.println("Data Handphone Android Telah DiUbah");
    }
    void barangberhasil(){
        System.out.println("Data Handphone Android Telah DiHapus");
    }
}
