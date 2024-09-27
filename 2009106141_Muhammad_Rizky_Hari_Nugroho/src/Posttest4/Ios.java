
package Posttest4;

import java.util.Formatter;  
public class Ios extends Handphone{
    private String Os;

    public Ios(String P_Os, int id, String nm, String mrk, int st, int hg) {
        super(id, nm, mrk, st, hg);
        this.Os = P_Os;
    }

    public Ios(String P_Os) {
        this.Os = P_Os;
    }
    public Ios() {
        this.Os = "";
    }

   
    public String getOs() {
        return Os;
    }

    public void setOs(String Os) {
        this.Os = Os;
    }

    void barangbeli(){
        System.out.println("Data Handphone Ios tangga Telah Tertambah");
    }
    void barangubah(){
        System.out.println("Data Handphone Ios tangga Telah DiUbah");
    }
    void barangberhasil(){
        System.out.println("Data Handphone Ios tangga Telah DiHapus");
    }
}
