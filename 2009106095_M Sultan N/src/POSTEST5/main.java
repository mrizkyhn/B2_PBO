package POSTEST5;
import POSTEST4.*;
import POSTEST3.*;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static ArrayList<String> pengaduan = new ArrayList<String>();
    static ArrayList<String> Masyarakat = new ArrayList<String>();
    static ArrayList<String> Pria = new ArrayList<String>();
    static ArrayList<String> Wanita = new ArrayList<String>();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
    menu();
    } 
        static void menu(){
            System.out.println("");
            System.out.println("=========PENGADUAN========");
            System.out.println("========MASYARAKAT========");
            System.out.println("----------------------------------------------------");
            System.out.println("1. Masukkan Pengaduan");
            System.out.println("2. Daftar Pengaduan"); 
            System.out.println("3. Ubah Pengaduan");
            System.out.println("4. Hapus Pengaduan");
            System.out.println("5. Keluar");
            System.out.println("----------------------------------------------------");
            System.out.println("Pilih[1-5] = ");
            int p = input.nextInt();
            switch (p){
            case 1:
                    Masukkan();
                    break;
            case 2:
                    Daftar();
                    break;
            case 3:
                    Ubah();
                    break;
            case 4:
                    Hapus();
                    break;
            case 5:
                    System.out.println("PENGADUAN SELESAI");
                    break;
            default:
                menu(); 
            } 
        }

    static void Masukkan(){
                System.out.println("Pengaduan = ");
                String pick = input.next();
                pengaduan.add(pick);
                backmenu();
            }

    static void Daftar(){
                for(int i = 0 ; i < pengaduan.size();i++){
                System.out.println("pengaduan["+ i +"] : "+ pengaduan.get(i));
                }
                backmenu();
    }

    static void Ubah(){
                for(int i = 0 ; i < pengaduan.size();i++){
                System.out.println("pengaduan["+ i +"] : "+ pengaduan.get(i));}
                System.out.println("masukkan index = ");
                int a = input.nextInt();
                System.out.println("ubah menjadi = ");
                String iv = input.next();
                pengaduan.set(a, iv);
                backmenu();
    }

    static void Hapus(){
                for(int i = 0 ; i < pengaduan.size();i++){
                System.out.println("pengaduan["+ i +"] : "+ pengaduan.get(i));
                }
        
                System.out.println("masukkan index yang ingin di hapus = ");
                int t = input.nextInt();
                pengaduan.remove(t);
                backmenu();
    }

    static void backmenu(){
                System.out.println("masukkan Y & Enter Untuk melanjutkan");
                input.next();
                menu();
    }


    
}