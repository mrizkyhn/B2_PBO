
public abstract class datasantri {

    static void display() {
        datasantri data = new data (" jumlah santri");
    }
    public int nis;
    public String nama;
    public String grade;
    
   public datasantri(int nis, String nama, String grade) {
         this.nis= nis;
         this.nama = nama;
         this.grade=grade;
    }
    
    public void setNis(int nis){
        this.nis = nis;
        
    }
     public int getNis(){
        return nis;
    }
    public void setNama(String nama){
        this.nama= nama;
    }
    public String getNama (){
        return nama;
    }
    public void setGrade(String grade){
    }
    public String getGrade(){
        return grade;
    }

    void pendataanDatasantri() {
        System.out.println("DATA SANTRI");
    }

    void jumlahhafalan() {
        System.out.println("JUMLAH HAFALAN");
    }

    void  updateGrade() {
        System.out.println("UPDATEGRADE");
        
    }

    private static class data extends datasantri {

        private final int _jumlah_santri;

        public data(int nis, String nama, String grade) {
            super(nis, nama, grade);
        }

        public  void data(int _jumlah_santri) {
           
            this._jumlah_santri = _jumlah_santri;
             System.out.println(" ");
        }
    }
    
    
    
}
