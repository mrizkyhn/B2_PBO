/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTTEST2;

import java.util.Scanner;

/**
 *
 * @author AelAwyR
 */
public class Kamar {
    
    int nomor;
    String ukuran;
    int harga;
    String Status;
    
    public Kamar(int nomor, String ukuran, int harga, String Status){
        
        this.nomor = nomor;
        this.ukuran = ukuran;
        this.Status = Status;
        this.harga = harga;
        
        
}
    
    public void tampil(){
        System.out.print("Nomor Kamar : ");
            System.out.println(this.nomor);
            System.out.println("");
            System.out.print("Ukuran Kamar : ");
            System.out.println(this.ukuran);
            System.out.println("");
            System.out.print("Status Kamar : ");
            System.out.println(this.Status);
            System.out.println("");
            System.out.print("Harga Kamar semalam : Rp.");
            System.out.println(this.harga);
            System.out.println("");
    }
    
    public void edit(Scanner input){
        System.out.print("Masukan Nomor Kamar : ");
        this.nomor = input.nextInt();
        input.nextLine();
        System.out.println("");
        System.out.print("Masukan Ukuran Kamar : ");
        this.ukuran = input.nextLine();
        System.out.println("");
        System.out.print("Masukan Status Kamar : ");
        this.Status = input.nextLine();
        System.out.println("");
        System.out.print("Masukan Harga Kamar : ");
        this.harga = input.nextInt();
        input.nextLine();
    }
    
}