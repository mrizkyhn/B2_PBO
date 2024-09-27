/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTTEST3;

import POSTTEST2.*;
import java.util.Scanner;

/**
 *
 * @author AelAwyR
 */
public class Kamar {
    
    private int nomor;
    private String ukuran;
    private int harga;
    private String Status;
    
    
    
    public Kamar(int nomor, String ukuran, int harga, String Status){
        
        this.nomor = nomor;
        this.ukuran = ukuran;
        this.Status = Status;
        this.harga = harga;
        
        
}

    public int getNomor() {
        return nomor;
    }

    public void setNomor(int nomor) {
        this.nomor = nomor;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
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