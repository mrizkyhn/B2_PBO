/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package posttest3;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*- - - - - - - - Batas atas Posttest 3 - - - - - - - - */
class Login {
    private String username;
    private int password;

    // ini method setter
    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(int password){
        this.password = password;
    }

    // ini method getter
    public String getUsername(){
        return this.username;
    }

    public int getPassword(){
        return this.password;
    }
}
/*- - - - - - - - Batas bawah Posttest 3 - - - - - - - - */

/*- - - - - - - - Batas atas Posttest 2 - - - - - - - - */
class Peminjaman{
    int idPm;
    String namaPm;
    int noBkpm;
    String tlPm;
    
    void buatPeminjaman(){
        System.out.println(" Peminjaman Telah Dilakukan");
    }

    Peminjaman (int idPm, String namaPm, int noBkpm, String tlPm){
        this.idPm = idPm;
        this.namaPm = namaPm;
        this.noBkpm = noBkpm;
        this.tlPm = tlPm;
        buatPeminjaman();
    }
    
    void display(){
        System.out.println(" ID Peminjam : "+this.idPm);
        System.out.println(" Nama Peminjam : "+this.namaPm);
        System.out.println(" No buku yang dipinjam : "+this.noBkpm);
        System.out.println(" Tanggal Peminjaman : "+this.tlPm);
    }
}   
/*- - - - - - - - Batas Bawah Posttest 2 - - - - - - - - */

/*- - - - - - - - Batas atas Posttest 1 - - - - - - - - */
public class main135_3 {

    static Scanner input = new Scanner(System.in);
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Integer> indeks = new ArrayList<Integer>();
    static ArrayList<String> judul = new ArrayList<String>();
    static ArrayList<String> pengarang = new ArrayList<String>();
    static ArrayList<Integer> ttb = new ArrayList<Integer>();
        
  public static void main(String[] args) {
    int pilihan;
    int pass;
    
    indeks.add(1);
    judul.add("One Piece");
    pengarang.add("Eiichiro Oda");
    ttb.add(1997);
    
// - - - - - - - - - - L
    Login admin = new Login();
    admin.setUsername("Madya"); // Username untuk Login sebagai admin || Setter Class Login
    admin.setPassword(135); // Password untuk Login sebagai admin
    
    System.out.println("--------------------------------------");
    System.out.print("Login sebagai admin ? (1/0) : ");
    pilihan = input.nextInt();
    
    if (pilihan == 1){
        System.out.print("Masukkan Password untuk login sebagai admin : ");
        pass = scan.nextInt();

        if(pass == 135) {
            System.out.println("Selamat datang admin '"+ admin.getUsername()+"'"); // 1|| Getter class Login
            menuadmin(); } 
        else{
            System.out.println("Password Salah!"); }

    } else if (pilihan == 0){
        menuuser();

    } else {
        System.out.println("Pilih 0 untuk menu peminjaman");
        return;
    }
  }

// Menu Utama Admin
  static void menuadmin(){
    char ulang;
    int pilih;

    do {
        System.out.println("\t\t-- Menu Utama --");
        System.out.println(" 1. Tambahkan Komik");
        System.out.println(" 2. Daftar Komik");
        System.out.println(" 4. Ubah Data Komik");
        System.out.println(" 5. Hapus Data Komik");
        System.out.println(" 6. Keluar \n");
        System.out.print("Masukkan Pilihan : ");
        pilih = input.nextInt();
        
        switch(pilih)
        {
            case 1:
                tambahKomik();
                break;
            case 2:
                daftarKomik();
                break;
            case 3:
                peminjamanKomik();
                break;
            case 4:
                updateKomik();
                break;
            case 5:
                hapusKomik();
                break;
            case 6:
                System.out.println("Anda telah keluar program !");
                break;
            default:
                System.out.println("Anda memasukan pilihan yang salah !");
        }
        
        if(pilih == 6){
           ulang ='T';
        } else {
            System.out.print("\nKembali ke Menu Utama ? [Y/T] : ");
            ulang = input.next().charAt(0);  
            System.out.println("-----------------------------------------------------------------");
        }

    } while (ulang !='T');
}

// Menu Utama User
  static void menuuser(){
    char ulang1;
    int pilih1;

    do {
        System.out.println("\t   Peminjaman Komik/Manga M1355");
        System.out.println("\t\t-- Menu Utama --");
        System.out.println(" 1. Daftar Komik");
        System.out.println(" 2. Peminjaman Komik"); // Menu tambahan dari posttest 2
        System.out.println(" 3. Keluar \n");
        System.out.print("Masukkan Pilihan : ");
        pilih1 = input.nextInt();
        System.out.println("");
        
        switch(pilih1)
        {
            case 1:
                daftarKomik();
                break;
            case 2:
                peminjamanKomik();
                break;
            case 3:
                System.out.println("Anda telah keluar program !");
                break;
            default:
                System.out.println("Anda memasukan pilihan yang salah !");
        }
        
        if(pilih1 == 3){
           ulang1 ='T';
        } else {
            System.out.print("\nKembali ke Menu Utama ? [Y/T] : ");
            ulang1 = input.next().charAt(0);  
            System.out.println("-----------------------------------------------------------------");
        }

    } while (ulang1 !='T');
        
}

// 1. Tambahkan Komik
  public static void tambahKomik(){
    System.out.println("-----------------------------------------------------------------");
    System.out.println("\t\t  -- Menu Penambahan Komik --\n");

    System.out.print(" Indeks Komik : ");
    int id_tk = input.nextInt();
    indeks.add(id_tk);
    
    input.nextLine();
    System.out.print(" Judul Komik : ");
    String jd_tk = input.nextLine();
    judul.add(jd_tk);
    
    System.out.print(" Pengarang: ");
    String png_tk = input.nextLine();
    pengarang.add(png_tk);
    
    System.out.print(" Tahun Terbit : ");
    int ttb_tk = input.nextInt();
    ttb.add(ttb_tk);
    
    System.out.println("-----------------------------------------------------------------");
    
    
  } 

// 2. Daftar Komik
  static void daftarKomik(){
     System.out.println("-----------------------------------------------------------------");
     System.out.println("\t\t\t-- Daftar Komik --\n");
     
     indeks.isEmpty();
     if (indeks.isEmpty() == false){
        for (int i = 0; i < indeks.size(); i++) {
            System.out.println(" Indeks Komik : " +indeks.get(i));
            for (int j = 0; j < judul.size(); j++) {
                System.out.println(" Judul Komik : " +judul.get(j));
                for (int k = 0; k < pengarang.size(); k++) {
                    System.out.println(" Pengarang : " +pengarang.get(k));
                    for (int l = 0; l < ttb.size(); l++) {
                        System.out.println(" Tahun Terbit : " +ttb.get(l));
                    }    
                }
            }
        }
     } else {
        System.out.println("Daftar Komik Kosong !");
     }
     
    System.out.println("-----------------------------------------------------------------");
  }

// 3. Peminjaman Komik = = = Menu tambahan dari posttest2
  static void peminjamanKomik(){
     System.out.println("-----------------------------------------------------------------");
     System.out.println("\t\t\t-- Peminjaman Komik --\n");
     
     indeks.isEmpty();
     if (indeks.isEmpty() == false){
        for (int i = 0; i < indeks.size(); i++) {
            System.out.println(" Indeks Komik : " +indeks.get(i));
            for (int j = 0; j < judul.size(); j++) {
                System.out.println(" Judul Komik : " +judul.get(j));
                for (int k = 0; k < pengarang.size(); k++) {
                    System.out.println(" Pengarang : " +pengarang.get(k));
                    for (int l = 0; l < ttb.size(); l++) {
                        System.out.println(" Tahun Terbit : " +ttb.get(l));
                    }    
                }
            }
        }
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat contoh4 = new SimpleDateFormat("EEEE, d MMMM yyyy");
        String Tanggal4 = contoh4.format(cal.getTime());
        
        System.out.println("");
        Peminjaman pm1 = new Peminjaman (1,"Madya",1,Tanggal4);
        pm1.display();
     } else {
        System.out.println(" Daftar Peminjam Kosong !");
     }  
     
          
    System.out.println("-----------------------------------------------------------------");
  }

// 4. Update Data Komik
  static void updateKomik(){
    System.out.println("-----------------------------------------------------------------");
    System.out.println("\t\t\t-- Menu Ubah Data Komik --\n");

    // Indeks    
    System.out.print("Indeks Komik : ");
    int id_uk1 = input.nextInt();
    System.out.print("");
    System.out.print("Masukkan Indeks Baru : ");
    int id_uk2 = input.nextInt();
    int id_uk3 = id_uk1 - 1;
    indeks.set(id_uk3,id_uk2);

    // Judul Komik
    input.nextLine();
    System.out.print("Masukkan Judul Baru : ");
    String jd_uk1 = input.nextLine();
    judul.set(id_uk3,jd_uk1);

    // Nama Pengarang Komik
    System.out.print("Nama Pengarang Baru : ");
    String png_uk1 = input.nextLine();
    pengarang.set(id_uk3,png_uk1);

    // Tahun Terbit Komik
    System.out.print("Tahun Terbit Baru : ");
    int ttb_uk1 = input.nextInt();
    ttb.set(id_uk3,ttb_uk1);

  }

//5. Hapus Data Komik
  static void hapusKomik(){
    System.out.println("-----------------------------------------------------------------");
    System.out.println("\t\t\t-- Menu Hapus Data Komik --\n");
    
    System.out.print("Indeks Komik : ");
    int id_hk1 = input.nextInt();
    int id_hk2 = id_hk1 - 1;
    indeks.remove(id_hk2);
    judul.remove(id_hk2);
    pengarang.remove(id_hk2);
    ttb.remove(id_hk2);
    
  }
}

