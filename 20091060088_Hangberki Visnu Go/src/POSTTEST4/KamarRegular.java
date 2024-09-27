/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTTEST4;

import java.util.Scanner;

/**
 *
 * @author AelAwyR
 */
public class KamarRegular extends Kamar {

    public KamarRegular(int nomor, int harga, String Status, String ukuran) {
        super(nomor, harga, Status);
        this.ukuran = ukuran;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

}
