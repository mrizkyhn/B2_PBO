
package Posttest2;

public class Kurir {
    private int id_kurir;
    private String nama;
    private String alamat;
    private double no_telp;

    public int setid_kurir(){
        return id_kurir;
    }
    public String setnama(){
        return nama;
    }
    public String setalamat(){
        return alamat;
    }
    public double setno_telp(){
        return no_telp;
    }

    public void getid_kurir(int id){
        this.id_kurir = id;
    }
    public void getnama(String nama){
        this.nama = nama;
    }
    public void getalamat(String alamat){
        this.alamat = alamat;
    }
    public void getno_telp(double no){
        this.no_telp = no;
    }
 
}
