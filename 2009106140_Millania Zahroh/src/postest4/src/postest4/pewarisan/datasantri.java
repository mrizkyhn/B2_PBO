
package postest4.pewarisan;

public class datasantri {
    String nis;
    String nama;
    String grade;
    
    datasantri(String nis, String nama, String grade) {
         this.nis= nis;
         this.nama = nama;
         this.grade=grade;
    }
    
    public void setNis(String nis){
        this.nis = nis;
        
    }
     public String getNis(){
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

    void updateGrade() {
        System.out.println("UPDATEGRADE");
        
    }

    void gender() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void umur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
