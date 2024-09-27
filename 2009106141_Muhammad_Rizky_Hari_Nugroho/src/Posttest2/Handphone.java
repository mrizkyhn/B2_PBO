package pkg2009106141_MuhammadRizkyHariNugroho_POSTTEST2;

public class Handphone {
    int id;
    String Nama;
    String Merk;
    int Stok;
    int Harga;
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
     
    public int getId()
    {
       return id;
    }
     
    public String getNm()
    {
       return Nama;
    }
     
    public String getMrk()
    {
       return Merk;
    }

    public int getSt()
    {
       return Stok;
    }
    
    public int getHg()
    {
       return Harga;
    }

}
