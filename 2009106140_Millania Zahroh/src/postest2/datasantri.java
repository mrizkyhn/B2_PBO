/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MILLANIA
 */
public class datasantri {
    //    property/atribut
    String nis;
    String nama;
    String grade;

    
//    metode khusus
    datasantri(String nis, String nama, String grade){
        this.nis = nis;
        this.nama = nama;
        this.grade = grade;

    }

//    metode
    void pendataanDatasantri(){
        System.out.println("DATA SANTRI");
    }
    void jumlahhafalan(){
        System.out.println("JUMLAH HAFALAN");
    }
    void updateGrade(){
        System.out.println("UPDATEGRADE");
    }
}
