/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

/**
 *
 * @author user
 */
public class Dtpakaian {
    public static String brgpakaian;
    
    public static void datapakaian(){
        System.out.println("DATA BARANG PAKAIAN");
    }
    
    public static String spesifikasi(){
        return " Barang : "+brgpakaian;
    }
    
    public void tambahpakaian(){
        System.out.println("");
        System.out.println("data barang pakaian berhasil ditambahkan");
    }
    
    public void updatepakaian(){
        System.out.println("");
        System.out.println("data barang pakaian berhasil diupdate");
    }
    
    public void hapuspakaian(){
        System.out.println("");
        System.out.println("data barang pakaian berhasil dihapus");
    }
    
}
