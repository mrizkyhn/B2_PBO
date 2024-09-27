package POSTEST4;


public class Barang_Rtangga extends Barang{
    private String Status;

    public Barang_Rtangga(int id, String nm, String br, String js, int jm, int hg, String jb,String Status) {
        super(id, nm, br, js, jm, hg, jb);
        this.Status = Status;
    }

    public Barang_Rtangga() {
        this.Status = "";
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
        
    } void barangbeli(){
        System.out.println("Data Barang Rumah tangga Telah Tertambah");
    }
    void barangubah(){
        System.out.println("Data Barang Rumah tangga Telah DiUbah");
    }
    void barangberhasil(){
        System.out.println("Data Barang Rumah tangga Telah DiHapus");
    }
    
    
}
