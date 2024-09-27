package postttest1;
import java.util.ArrayList;
import java.util.Scanner;

public class Indro099{
    static ArrayList<String> martabak = new ArrayList<String>();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
    menu();
    }    
        static void menu(){
            System.out.println("");
            System.out.println("========Data Menu Martabak========");
            System.out.println("----------------------------------------------------");
            System.out.println("1. Masukkan Data Martabak");
            System.out.println("2. Lihat Data Martabak"); 
            System.out.println("3. Ubah Data Martabak");
            System.out.println("4. Hapus Data Martabak");
            System.out.println("5. EXIT");
            System.out.println("----------------------------------------------------");
            System.out.println("Pilih[1-5] = ");
            int pilih = input.nextInt();
            switch (pilih){
            case 1:
                    idata();
                    break;
            case 2:
                    ldata();
                    break;
            case 3:
                    udata();
                    break;
            case 4:
                    hdata();
                    break;
            case 5:
                    System.out.println("Terima Kasih");
                    break;
            default:
                menu(); 
            } 
        }

    static void idata(){
                System.out.println("Nama Martabak = ");
                String nama = input.next();
                martabak.add(nama);
                backmenu();
            }

    static void ldata(){
                for(int i = 0 ; i < martabak.size();i++){
                System.out.println("martabak["+ i +"] : "+ martabak.get(i));
                }
                backmenu();
    }

    static void udata(){
                for(int i = 0 ; i < martabak.size();i++){
                System.out.println("martabak["+ i +"] : "+ martabak.get(i));}
                System.out.println("input Slot index = ");
                int a = input.nextInt();
                System.out.println("Change to = ");
                String iv = input.next();
                martabak.set(a, iv);
                backmenu();
    }

    static void hdata(){
                System.out.println("input Slot index = ");
                int t = input.nextInt();
                martabak.remove(t);
                backmenu();
    }

    static void backmenu(){
                System.out.println("Tekan Y lalu Tekan ENTER untuk melanjutkan");
                input.next();
                menu();
    }



} 