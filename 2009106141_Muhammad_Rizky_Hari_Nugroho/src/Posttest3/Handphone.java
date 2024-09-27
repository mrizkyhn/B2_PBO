package Posttest3;

public class Handphone {
    private int id;
    private String Nama;
    private String Merk;
    private int Stok;
    private int Harga;
    Handphone(int id, String nm, String mrk, int st, int hg)
    {
        this.id = id;
        this.Nama = nm;
        this.Merk = mrk;
        this.Stok = st;
        this.Harga = hg;

    }

    Handphone(int id, String nm) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    //Setter & Getter
    public void setId(int id){
        this.id = id;
    }
    
    public int getId()
    {
       return id;
    }
    
    public void setNm(String nm){
        this.Nama = nm;
    }
    
    public String getNm()
    {
       return Nama;
    }
    
    public void setMrk(String mrk){
        this.Merk = mrk;
    }
    
    public String getMrk()
    {
       return Merk;
    }

    public void setSt(int st){
        this.Stok = st;
    }
    
    public int getSt()
    {
       return Stok;
    }
    
    public void setHg(int hg){
        this.Harga = hg;
    }
    
    public int getHg()
    {
       return Harga;
    }

}
