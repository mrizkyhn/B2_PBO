/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posttest3;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    Scanner input = new Scanner(System.in);
    ArrayList <Parfum> ListParfum = new ArrayList<>();
    public void tambahBarang(){
    Parfum parfum = new Parfum();
    System.out.println("Nama Parfum : ");
    String namaParfum = br.readLine();
    System.out.println("Kode Parfum : ");
    int kode = br.readLine();
    System.out.println("Jumlah Parfum : ");
    int jumlah = br.readLine();
    System.out.println("Harga Parfum : ");
    double harga = Double.parseDouble(br.readLine());  

    parfum.setnamaParfum;
    parfum.setkode;
    parfum.setjumlah;
    parfum.setharga;
    
public static void main(String[]args){
    Parfum parfum = new Parfum();
    
    System.out.println("Nama Parfum     :" + parfum.getnamaParfum());
    System.out.println("Kode Parfum     :" + parfum.getkode());
    System.out.println("Jumlah Parfum   :" + parfum.getjumlah());
    System.out.println("Harga Parfum Setelah Diskon = Rp. " + parfum.getharga());
    System.out.println();
}