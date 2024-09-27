
package Posttest6;

import java.util.ArrayList;
import java.util.Scanner;

public class Tampilan {
    ArrayList<Android> temp;  
    ArrayList<Ios> temp_2;
     
    Tampilan()
    {
        //instansiasi
        temp = new ArrayList<>();
        temp_2 = new ArrayList<>();
    }
    
    public static void keluar() {
        System.out.println("\n\n  ===== Terima Kasih =====\n\n");
    }
    
    void tambahData(String P_Os,int id, String nm, String mrk, int st, int hg){
        temp.add(new Android(P_Os,id,nm,mrk,st,hg));
    }
    
    void tambahData2(String P_Os, int id, String nm, String mrk, int st, int hg){
        temp_2.add(new Ios(P_Os,id,nm,mrk,st,hg));
    }

    void hapusData(int idd){
        temp.removeIf(item -> item.getId() ==(idd));
    }
    
    void hapusData2(int idd){
        temp_2.removeIf(item -> item.getId() ==(idd));
    }

    void ubahData(int idd, String P_Os, int id, String nm, String mrk, int st, int hg){

        int cek = -1;
        for(int i=0; i<temp.size(); i++){
            if (temp.get(i).getId() == idd){
                cek = i;
                System.out.println(cek);   
                temp.set(cek,new Android(P_Os,id,nm,mrk,st,hg));
            }
        }
    }
    
    void ubahData2(int idd,String P_Os, int id, String nm, String mrk, int st, int hg){

        int cek = -1;
        for(int i=0; i<temp_2.size(); i++){
            if (temp_2.get(i).getId() == idd){
                cek = i;
                System.out.println(cek);   
                temp_2.set(cek,new Ios(P_Os,id,nm,mrk,st,hg));
            }
        }
    }

    void tampilData()
    {
        for(Android android:temp)
        {
            System.out.println("\nid Handphone : "+android.getId()+""+" \nNama Handphone : "+android.getNama()+""+" \nMerk : "+android.getMrk()+""+" \nOS : "+android.getOs()+""+" \nStok : "+android.getStok()+""+" \nHarga : "+android.getHarga()+"");
            System.out.println("");
        }
    }
    
    void tampilData2()
    {
        for(Ios ios:temp_2)
        {
            System.out.println("\nid Handphone : "+ios.getId()+""+" \nNama Handphone : "+ios.getNama()+""+" \nMerk : "+ios.getMrk()+""+" \nOS : "+ios.getOs()+""+" \nStok : "+ios.getStok()+""+" \nHarga : "+ios.getHarga()+"");
            System.out.println("");
        }
    }
    
    public static void main(String args[]){
        Scanner inputan = new Scanner (System.in);
        Android android = new Android();
        Ios ios = new Ios();
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
            int pilihan,pilihan2;
            System.out.print("Masukan Pilihan [1-5] : ");
            pilihan = inputan.nextInt();
            System.out.println("\n=============================");
            System.out.println("|         Jenis OS          |");
            System.out.println("=============================");
            System.out.println("| 1.Android                 |");
            System.out.println("| 2.Ios                     |");
            System.out.println("=============================");
            System.out.print("Masukan Pilihan [ 1-2 ] : ");
            pilihan2 = inputan.nextInt();
            if (pilihan2 == 1){

                if (pilihan == 1){
                    int ID;
                    String NAMA;
                    String MERK;
                    String OS;
                    int STOK;
                    int HARGA;
                    
                    System.out.print("ID                : ");
                    ID = inputan.nextInt();

                    System.out.print("Nama Handphone    : ");
                    NAMA = inputan.next();

                    System.out.print("Nama Merk         : ");
                    MERK = inputan.next();
                    
                    System.out.print("OS                : ");
                    OS = inputan.next();

                    System.out.print("Stok Handphone    : ");
                    STOK = inputan.nextInt();

                    System.out.print("Masukan Harga     : ");
                    HARGA = inputan.nextInt();

                    td.tambahData(OS,ID,NAMA,MERK,STOK,HARGA);
                    Android tambahh = new Android();
                    android._5G();
                    ios.fast_charging();
                    tambahh.barangbeli();
                }
                else if (pilihan == 2){  
                    td.tampilData();    

                }
                else if (pilihan == 3){
                    int ID;
                    String NAMA;
                    String MERK;
                    String OS;
                    int STOK;
                    int HARGA;
                    int pilih;

                    System.out.print("Pilih ID Handphone Yang Ingin Di Ubah : ");
                    pilih = inputan.nextInt();

                    System.out.print("ID                   : ");
                    ID = inputan.nextInt();

                    System.out.print("Nama Handphone Baru  : ");
                    NAMA = inputan.next();

                    System.out.print("Nama Merk Baru       : ");
                    MERK = inputan.next();
                    
                    System.out.print("OS Baru              : ");
                    OS = inputan.next();

                    System.out.print("Stok Handphone Baru  : ");
                    STOK = inputan.nextInt();

                    System.out.print("Masukan Harga Baru   : ");
                    HARGA = inputan.nextInt();

                    td.ubahData(pilih,OS,ID,NAMA,MERK,STOK,HARGA);
                    Android ubahs = new Android();
                    android._5G();
                    ios.fast_charging();
                    ubahs.barangubah();
                 }
                else if (pilihan == 4){
                    int pil_hapus;
                    System.out.print("Pilih ID Data : ");
                    pil_hapus = inputan.nextInt();
                    td.hapusData(pil_hapus);
                    Android haps = new Android();
                    haps.barangberhasil();
                }
                else if (pilihan == 5){
                    keluar();
                    System.exit(0);
                    }

                }

            else if (pilihan2 == 2){

                if (pilihan == 1){
                    int ID;
                    String NAMA;
                    String MERK;
                    String OS;
                    int STOK;
                    int HARGA;

                    System.out.print("ID                : ");
                    ID = inputan.nextInt();

                    System.out.print("Nama Handphone    : ");
                    NAMA = inputan.next();

                    System.out.print("Nama Merk         : ");
                    MERK = inputan.next();
                    
                    System.out.print("OS                : ");
                    OS = inputan.next();

                    System.out.print("Stok Handphone    : ");
                    STOK = inputan.nextInt();

                    System.out.print("Masukan Harga     : ");
                    HARGA = inputan.nextInt();

                    td.tambahData2(OS,ID,NAMA,MERK,STOK,HARGA);
                    Ios tambahh = new Ios();
                    android._5G();
                    ios.fast_charging();
                    tambahh.barangbeli();
                }
                else if (pilihan == 2){  
                    td.tampilData2();    

                }
                else if (pilihan == 3){
                    int ID;
                    String NAMA;
                    String MERK;
                    String OS;
                    int STOK;
                    int HARGA;
                    int pilih;

                    System.out.print("Pilih ID Handphone Yang Ingin Di Ubah : ");
                    pilih = inputan.nextInt();

                    System.out.print("ID                   : ");
                    ID = inputan.nextInt();

                    System.out.print("Nama Handphone Baru  : ");
                    NAMA = inputan.next();

                    System.out.print("Nama Merk Baru       : ");
                    MERK = inputan.next();
                    
                    System.out.print("OS Baru              : ");
                    OS = inputan.next();

                    System.out.print("Stok Handphone Baru  : ");
                    STOK = inputan.nextInt();

                    System.out.print("Masukan Harga Baru   : ");
                    HARGA = inputan.nextInt();
                    
                    td.ubahData(pilih,OS,ID,NAMA,MERK,STOK,HARGA);
                    Android ubahs = new Android();
                    android._5G();
                    ios.fast_charging();
                    ubahs.barangubah();
                 }
                else if (pilihan == 4){
                    int pil_hapus;
                    System.out.print("Pilih ID Data : ");
                    pil_hapus = inputan.nextInt();
                    td.hapusData(pil_hapus);
                    Android haps = new Android();
                    haps.barangberhasil();
                }
                else if (pilihan == 5){
                    System.out.println();
                    System.exit(0);
                    }

                }

            else if (pilihan2 == 2){

                if (pilihan == 1){
                    int ID;
                    String NAMA;
                    String MERK;
                    String OS;
                    int STOK;
                    int HARGA;

                    System.out.print("ID                : ");
                    ID = inputan.nextInt();

                    System.out.print("Nama Handphone    : ");
                    NAMA = inputan.next();

                    System.out.print("Nama Merk         : ");
                    MERK = inputan.next();
                    
                    System.out.print("OS                : ");
                    OS = inputan.next();

                    System.out.print("Stok Handphone    : ");
                    STOK = inputan.nextInt();

                    System.out.print("Masukan Harga     : ");
                    HARGA = inputan.nextInt();

                    td.tambahData2(OS, ID,NAMA,MERK,STOK,HARGA);
                    Ios ubahs = new Ios();
                    android._5G();
                    ios.fast_charging();
                    ubahs.barangubah();
                 }
                else if (pilihan == 4){
                    int pil_hapus;
                    System.out.print("Pilih ID Data : ");
                    pil_hapus = inputan.nextInt();
                    td.hapusData2(pil_hapus);
                    Ios haps = new Ios();
                    haps.barangberhasil();
                }
                else if (pilihan == 5){
                    System.out.println();
                    System.exit(0);
                    }
                }
            }
        }
    }