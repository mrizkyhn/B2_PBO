package posttest5;

public class cafe {
//    property/atribut
    private String makanan;
    private String minuman;
    private String snack;
    private String dessert;
    
//    metode khusus
    cafe(String makanan, String minuman, String snack, String dessert){
        this.makanan = makanan;
        this.minuman = minuman;
        this.snack = snack;
        this.dessert = dessert;
    }
//    metode
    void tampilMenu(){
        System.out.println("MENU TELAH DITAMPILKAN!!!!");
    }
    void tambahMenu(){
        System.out.println("MENU TELAH DITAMBAH!!!!");
    }
    void editMenu(){
        System.out.println("MENU TELAH DIPERBARUI!!!!");
    }
    void hapusMenu(){
        System.out.println("MENU TELAH DIHAPUS!!!!");
    }

    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    public String getMinuman() {
        return minuman;
    }

    public void setMinuman(String minuman) {
        this.minuman = minuman;
    }

    public String getSnack() {
        return snack;
    }

    public void setSnack(String snack) {
        this.snack = snack;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }
}
