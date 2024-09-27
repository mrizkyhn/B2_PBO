/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postest;

import java.util.Scanner;

public class Parfum {
    String namaParfum;
    int kode, harga, jumlah, diskon, total;
    public Scanner str = new Scanner(System.in);
    public Scanner in = new Scanner(System.in);
    public void setBarang(){
        this.kode = 100;
    }
    public void setBarang(int kode){
        this.kode = 1 + kode;
        System.out.print("Masukkan Nama Parfum   : ");
        this.namaParfum = str.nextLine();
        System.out.print("Masukkan Harga Parfum  : ");
        this.harga = in.nextInt();
        this.jumlah = 1;
        System.out.print("Masukkan Diskon Parfum  : ");
        this.diskon = in.nextInt();
        this.total = this.harga*this.jumlah/100*this.diskon/100;
    }
    public void setBarang(int kode,int jumlah){
        this.kode = 1 + kode;
        System.out.print("Masukkan Nama Parfum  : ");
        this.namaParfum = str.nextLine();
        System.out.print("Masukkan Harga Parfum  : ");
        this.harga = in.nextInt();
        this.jumlah = jumlah;
        System.out.print("Masukkan Diskon Parfum  : ");
        this.diskon = in.nextInt();
        this.total = this.harga*this.jumlah/100*this.diskon/100;
    }
    public int getId(){
        return this.kode;
    }
    public void tampil(){
        System.out.println("Kode Penjualan : "+this.kode);
        System.out.println("Nama Parfum  : "+this.namaParfum);
        System.out.println("Harga Parfum : "+this.harga);
        System.out.println("Jumlah Parfum: "+this.jumlah);
        System.out.println("Diskon       : "+this.diskon+"%");
        System.out.println("Total Harga  : "+this.total);
    }
    public static void main(String[] args){
        int i = 0,menu = 0,a,jumlah,kode,diskon;
        Parfum[] Parfum = new Parfum[1026];
        Parfum [0] = new Parfum ();
        Parfum [0].setBarang();
        while(menu!= 6){
            System.out.print("Tampilan Menu Awal :\n");
            System.out.print("1.create\n2.read\n3.update\n4.delete\n5.exit\n ");
            System.out.print("Pilih Menu : ");
            menu = Parfum[0].in.nextInt();
            if(menu == 1){
                jumlah = 0;
                while(jumlah < 1){
                    System.out.print("Masukkan Jumlah Barang : ");
                    jumlah = Parfum[0].in.nextInt();    
                }
                i++;
                Parfum[i] = new Parfum();
                if(jumlah > 1)
                    Parfum[i].setBarang(Parfum[i-1].getId(),jumlah);
                else
                    Parfum[i].setBarang(Parfum[i-1].getId());
            }else if(menu == 2){
                if(i < 1)
                    System.out.println("Barang kosong");
                else{
                    System.out.print("Masukkan Kode Parfum Yang Diread : ");
                    kode = Parfum[0].in.nextInt();
                    a = 1;
                    while(a<= i){
                        if(Parfum[a].getId()==kode)
                            break;
                        a++;
                    }
                    if(a<= i)
                        Parfum[a].tampil();
                    else
                        System.out.println("Barang Tidak Ditemukan");
                }
            }else if(menu == 3){
                    if(i < 1)
                        System.out.println("Barang Kosong");
                    else{
                        System.out.print("Masukkan Kode Parfum Yang Diupdate : ");
                        kode = Parfum[0].in.nextInt();
                        a = 1;
                        while(a<= i){
                            if(Parfum[a].getId()==kode)
                                break;
                            a++;
                        }
                        if(a<= i){
                            Parfum[a].tampil();
                            jumlah = 0;
                            while(jumlah < 1){
                                System.out.print("Masukkan Jumlah Barang : ");
                                jumlah = Parfum[0].in.nextInt(); 
                            }
                            if(jumlah > 1)
                                Parfum[a].setBarang(Parfum[i-1].getId(),jumlah);
                            else
                                Parfum[a].setBarang(Parfum[i-1].getId());
                            }
                        else
                            System.out.println("Barang Tidak Ditemukan");
                    }
            }else if(menu == 4){
                    if(i < 1)
                        System.out.println("Barang Kosong");
                    else{
                        System.out.print("Masukkan Kode Parfum Yang Didelete : ");
                        kode = Parfum[0].in.nextInt();
                        a = 1;
                        while(a<= i){
                            if(Parfum[a].getId()==kode)
                                break;
                            a++;
                        }
                        if(a<= i){
                            while(a < i){
                                Parfum[a]=Parfum[a+1];
                                a++;
                            }
                            i--;
                            System.out.println("Barang Berhasil Dihapus");
                        }
                        else
                            System.out.println("Barang Tidak Ditemukan");
                    }
                    }else if(menu == 5)
                    System.out.println("Keluar...");
                    else
                    System.out.println("Menu Tidak Ditemukan");
        }
    }   
}