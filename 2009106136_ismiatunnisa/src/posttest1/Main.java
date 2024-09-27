package pkg2009106136_ismiatunnisa;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static ArrayList ListStudyClub = new ArrayList();
    static boolean isRunning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    static void ShowMenu() throws IOException{
        System.out.println("======Menu=====");
        System.out.println("[1] Show All Study Club");
        System.out.println("[2] Tambah Study Club");
        System.out.println("[3] Edit Study Club");
        System.out.println("[4] Hapus Study Club");
        System.out.println("[5] Exit");
        System.out.println("Pilih menu>");
        
        int PilihMenu = Integer.valueOf(input.readLine());
        switch(PilihMenu){
            case 1:
                showAllStudyClub();
                break;
            case 2:
                TambahStudyClub();
                break;
            case 3:
                EditStudyClub();
                break;
            case 4:
                HapusStudyClub();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan anda tidak tersedia");
        }
    }
        static void showAllStudyClub(){
            if(ListStudyClub.isEmpty()){
                System.out.println("Belum ada data");
            } else {
                for(int i = 0; i < ListStudyClub.size(); i++){
                    System.out.println(String.format("[%d] %s",i, ListStudyClub.get(i)));
                }
            }     
        }
        static void TambahStudyClub() throws IOException{
            System.out.println("Nama Study Club:");
            String namastudyclub = input.readLine();
            ListStudyClub.add(namastudyclub);
        }
        static void EditStudyClub() throws IOException{
            showAllStudyClub();
            System.out.print("Pilih nomor Study Club:");
            int indexStudyClub = Integer.valueOf(input.readLine());
            
            System.out.println("Nama Study Club Baru:");
            String namaBaru = input.readLine();
            
            ListStudyClub.set(indexStudyClub, namaBaru);
        }
        static void HapusStudyClub() throws IOException{
            showAllStudyClub();
            System.out.print("Pilih nomer Study Club Yang Ingin dihapus:");
            int indexStudyClub = Integer.valueOf(input.readLine());
            
            ListStudyClub.remove(indexStudyClub);
        }
        public static void main(String[] args)throws IOException{
            do{
                ShowMenu();
            }while (isRunning);
        }
    }

