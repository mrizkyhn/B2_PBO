/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTTEST6;

import POSTTEST5.*;
import java.util.Scanner;

/**
 *
 * @author AelAwyR
 */
public final class KamarVIP extends Kamar {

    public KamarVIP(int nomor, int harga, String Status) {
        super(nomor, harga, Status);
        this.ukuran = "Extra Large";
    }

    @Override
    public final void edit(Scanner input) {
        System.out.print("Masukan Nomor Kamar : ");
        this.nomor = input.nextInt();
        input.nextLine();
        System.out.print("Masukan Status Kamar : ");
        this.Status = input.nextLine();
        System.out.print("Masukan Harga Kamar : ");
        this.harga = input.nextInt();
        input.nextLine();
    }
}
