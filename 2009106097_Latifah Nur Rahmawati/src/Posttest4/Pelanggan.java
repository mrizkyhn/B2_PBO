package Posttest4;

public class Pelanggan {
    private int noresi;

    public Pelanggan(int noresi){
        this.noresi = noresi;
    }

    public void tampilkanData(){
        System.out.println("No Resi Barang      : "+this.noresi);
    }

    public int getNoresi() {
        return noresi;
    }

    public void setNoresi(int noresi) {
        this.noresi = noresi;
    }
    
}
