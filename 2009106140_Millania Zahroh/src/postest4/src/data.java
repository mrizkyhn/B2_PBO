/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MILLANIA
 */
public class data {
  
    public String nis;
    public String nama;
    public String grade;
    
    data(String nis, String nama, String grade) {
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
    
    
    
}
   
 
