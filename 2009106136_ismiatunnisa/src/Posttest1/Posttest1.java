package pkg2009106136_ismiatunnisa;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static ArrayList StudyClubWeb = new ArrayList();
    static ArrayList StudyClubNet = new ArrayList();
    static ArrayList StudyClubRbt = new ArrayList();
    static boolean isRunning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    static void ShowMenu() throws IOException{
        System.out.println("======Menu Study Club=====");
        System.out.println("[1] WEB PROGRAMMING");
        System.out.println("[2] NETWORK");
        System.out.println("[3] ROBOTIC");
        System.out.println("[0] Exit");
        System.out.println("Pilih menu>");
        
        int PilihMenu = Integer.valueOf(input.readLine());
        switch(PilihMenu){
            case 1:
                WebProgramming();
                break;
            case 2:
                Network();
                break;
            case 3:
                Robotic();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan anda tidak tersedia");
        }
    }
        static void WebProgramming(){
            System.out.println("======Menu WEB PROGRAMMING=====");
            System.out.println("[1] Lihat Pendaftar");
            System.out.println("[2] Tambah Pendaftar");
            System.out.println("[3] Edit Pendaftar");
            System.out.println("[4] Hapus Pendaftar");
            System.out.println("[0] Back to Menu Study Club");
            System.out.println("Pilih menu>");
            
            int Pilih = Integer.valueOf(input.readLine());
            switch(Pilih){
                case 1:
                    LihatWeb();
                    break;
                case 2:
                    TambahWeb();
                    break;
                case 3:
                    EditWeb();
                    break;
                case 4:
                    HapusWeb();
                    break;
                case 5:
                    ShowMenu();
                    break;
                default:
                    System.out.println("Pilihan anda tidak tersedia");
               }
        }
        static void LihatWeb() throws IOException{
            if(StudyClubWeb.isEmpty()){
                System.out.println("Belum ada data");
            } else {
                for(int i = 0; i < StudyClubWeb.size(); i++){
                    System.out.println(String.format("[%d] %s",i, StudyClubWeb.get(i)));
                }
            }
            WebProgramming();
        }
        static void TambahWeb() throws IOException{
            System.out.println("Nama Lengkap:");
            String namastudyclub = input.readLine();
            StudyClubWeb.add(namastudyclub);
            WebProgramming();
        }
        static void EditWeb() throws IOException{
            LihatWeb();
            System.out.print("Pilih nomor nama pendaftar Study Club:");
            int indexStudyClub = Integer.valueOf(input.readLine());
            
            System.out.println("Nama Pendaftar Baru:");
            String namaBaru = input.readLine();
            
            StudyClubWeb.set(indexStudyClub, namaBaru);
            WebProgramming();
        }
        static void HapusWeb() throws IOException{
            LihatWeb();
            System.out.print("Pilih nomer nama pendaftar Yang Ingin dihapus:");
            int indexStudyClub = Integer.valueOf(input.readLine());
            
            StudyClubWeb.remove(indexStudyClub);
            WebProgramming();
        }
        static void Network(){
            System.out.println("======Menu Network=====");
            System.out.println("[1] Lihat Pendaftar");
            System.out.println("[2] Tambah Pendaftar");
            System.out.println("[3] Edit Pendaftar");
            System.out.println("[4] Hapus Pendaftar");
            System.out.println("[0] Back to Menu Study Club");
            System.out.println("Pilih menu>");
            
            int Pilih = Integer.valueOf(input.readLine());
            switch(Pilih){
                case 1:
                    LihatNet();
                    break;
                case 2:
                    TambahNet();
                    break;
                case 3:
                    EditWeb();
                    break;
                case 4:
                    HapusNet();
                    break;
                case 5:
                    ShowMenu();
                    break;
                default:
                    System.out.println("Pilihan anda tidak tersedia");
               }
        }
        static void LihatNet() throws IOException{
            if(StudyClubNet.isEmpty()){
                System.out.println("Belum ada data");
            } else {
                for(int i = 0; i < StudyClubNet.size(); i++){
                    System.out.println(String.format("[%d] %s",i, StudyClubNet.get(i)));
                }
            }
            Network();
        }
        static void TambahNet() throws IOException{
            System.out.println("Nama Lengkap:");
            String namastudyclub = input.readLine();
            StudyClubNet.add(namastudyclub);
            Network();
        }
        static void EditNet() throws IOException{
            LihatWeb();
            System.out.print("Pilih nomor nama pendaftar Study Club:");
            int indexStudyClub = Integer.valueOf(input.readLine());
            
            System.out.println("Nama Pendaftar Baru:");
            String namaBaru = input.readLine();
            
            StudyClubNet.set(indexStudyClub, namaBaru);
            Network();
        }
        static void HapusNet() throws IOException{
            LihatWeb();
            System.out.print("Pilih nomer nama pendaftar Yang Ingin dihapus:");
            int indexStudyClub = Integer.valueOf(input.readLine());
            
            StudyClubNet.remove(indexStudyClub);
            Network();
        }
        
        static void Robotic(){
            System.out.println("======Menu Robotic=====");
            System.out.println("[1] Lihat Pendaftar");
            System.out.println("[2] Tambah Pendaftar");
            System.out.println("[3] Edit Pendaftar");
            System.out.println("[4] Hapus Pendaftar");
            System.out.println("[0] Back to Menu Study Club");
            System.out.println("Pilih menu>");
            
            int Pilih = Integer.valueOf(input.readLine());
            switch(Pilih){
                case 1:
                    LihatRbt();
                    break;
                case 2:
                    TambahRbt();
                    break;
                case 3:
                    EditRbt();
                    break;
                case 4:
                    HapusRbt();
                    break;
                case 5:
                    ShowMenu();
                    break;
                default:
                    System.out.println("Pilihan anda tidak tersedia");
               }
        }
        static void LihatRbt() throws IOException{
            if(StudyClubRbt.isEmpty()){
                System.out.println("Belum ada data");
            } else {
                for(int i = 0; i < StudyClubRbt.size(); i++){
                    System.out.println(String.format("[%d] %s",i, StudyClubRbt.get(i)));
                }
            }
            Robotic();
        }
        static void TambahRbt() throws IOException{
            System.out.println("Nama Lengkap:");
            String namastudyclub = input.readLine();
            StudyClubRbt.add(namastudyclub);
            Robotic();
        }
        static void EditRbt() throws IOException{
            LihatWeb();
            System.out.print("Pilih nomor nama pendaftar Study Club:");
            int indexStudyClub = Integer.valueOf(input.readLine());
            
            System.out.println("Nama Pendaftar Baru:");
            String namaBaru = input.readLine();
            
            StudyClubRbt.set(indexStudyClub, namaBaru);
            Robotic();
        }
        static void HapusRbt() throws IOException{
            LihatWeb();
            System.out.print("Pilih nomer nama pendaftar Yang Ingin dihapus:");
            int indexStudyClub = Integer.valueOf(input.readLine());
            
            StudyClubRbt.remove(indexStudyClub);
            Robotic();
        }
        
        public static void main(String[] args)throws IOException{
            do{
                ShowMenu();
            }while (isRunning);
        }
    }



