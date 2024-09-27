package pkg2009106141_MuhammadRizkyHariNugroho_POSTTEST2;

import java.util.ArrayList;
import java.util.Scanner;

public class Tampilan {
    ArrayList<Handphone> temp;
     
    Tampilan()
    {
        //instansiasi
        temp = new ArrayList<>();
    }
    
    void tambahData(int id, String nm, String mrk, int st, int hg){
        temp.add(new Handphone(id,nm,mrk,st,hg));
    }

    void hapusData(int idd){
        temp.removeIf(item -> item.id ==(idd));

    }

    void ubahData(int idd, int id, String nm, String mrk, int st, int hg){

        int cek = -1;
        for(int i=0; i<temp.size(); i++){
            if (temp.get(i).id == idd){
                cek = i;
                System.out.println(cek);   
                temp.set(cek,new Handphone(id,nm,mrk,st,hg));
            }
        }
    }

    void tampilData()
    {
        for(Handphone handphone:temp)
        {
            System.out.println("\nid Handphone : "+handphone.getId()+""+", \nNama Handphone : "+handphone.getNm()+""+", \nMerk : "+handphone.getMrk()+", \nStok : "+handphone.getSt()+""+", \nHarga : "+handphone.getHg()+"");
            System.out.println("");
        }
    }
    
    public static void main(String args[]){
        Scanner inputan = new Scanner (System.in);
        int Ulang = 1;
        Tampilan td = new Tampilan();
        while(Ulang==1){
            System.out.println("=============================");
            System.out.println("|       Galaxy Store        |");
            System.out.println("=============================");
            System.out.println("| 1.Tambah Handphone        |");
            System.out.println("| 2.Lihat Daftar Handphone  |");
            System.out.println("| 3.Ubah Handphone          |");
            System.out.println("| 4.Hapus Handphone         |");
            System.out.println("| 5.Exit                    |");
            System.out.println("=============================");
            int pilihan;
            System.out.print("Masukan Pilihan [1-5] : ");
            pilihan = inputan.nextInt();
            if (pilihan == 1){
                int ID;
                String NAMA;
                String MERK;
                int STOK;
                int HARGA;

                System.out.print("ID                : ");
                ID = inputan.nextInt();

                System.out.print("Nama Handphone    : ");
                NAMA = inputan.next();

                System.out.print("Nama Merk         : ");
                MERK = inputan.next();
        
                System.out.print("Stok Handphone    : ");
                STOK = inputan.nextInt();

                System.out.print("Masukan Harga     : ");
                HARGA = inputan.nextInt();

                td.tambahData(ID,NAMA,MERK,STOK,HARGA);
            }
            else if (pilihan == 2){  
                td.tampilData();     
            }
            else if (pilihan == 3){
                int ID;
                String NAMA;
                String MERK;
                int STOK;
                int HARGA;
                int pilih;

                System.out.print("Pilih ID Handphone Yang Ingin Di Ubah : ");
                pilih = inputan.nextInt();

                System.out.print("ID                   : ");
                ID = inputan.nextInt();

                System.out.print("Nama Handphone Baru  : ");
                NAMA = inputan.next();

                System.out.print("Nama Merk Baru   : ");
                MERK = inputan.next();

                System.out.print("Stok Handphone Baru  : ");
                STOK = inputan.nextInt();

                System.out.print("Masukan Harga Baru   : ");
                HARGA = inputan.nextInt();
                td.ubahData(pilih,ID,NAMA,MERK,STOK,HARGA);
             }
            else if (pilihan == 4){
                int pil_hapus;
                System.out.print("Pilih ID Handphone    : ");
                pil_hapus = inputan.nextInt();
                td.hapusData(pil_hapus);
                 }
            else if (pilihan == 5){
            System.out.println("Terima Kasih");
            System.out.println();
            break;
                 }        
            }
        }
}
