/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postest1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Postest1 {
    private static List<List> arrayDatasantri = new ArrayList<>();
    private static  Scanner input = new Scanner(System.in);
    private static char pilihan;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        


        while(true){
            mainMenu();
        }
    }

    private static void mainMenu(){
        System.out.println("\nPendataan dan Perhitungan hafalan (Indeks Prestasi Semester)");
        System.out.println("1. Pendataan Datasantri");
        System.out.println("2. Jumlah hafalan");
        System.out.println("3. Update Grade");
        System.out.println("4. Keluar");
        System.out.print("Masukkan pilihan Anda : ");
        pilihan = input.next().charAt(0);

        switch (pilihan){
            case '1':
                pendataanDatasantri();
                break;
            case '2':
                jumlahhafalan();
                break;
            case '3':
                updateGrade();
                break;
            case '4':
                System.exit(0);
                break;
            default:
                System.out.print("Masukkan pilihan antara 1 - 4");
                break;
        }
    }

    private static void pendataanDatasantri(){
        System.out.print("Masukkan Jumlah Data Santri : ");
        int jumlahDatasantri = input.nextInt();
        for(int i = 0; i < jumlahDatasantri; i++){
            List<String> arrayInput = new ArrayList<>();
            Scanner ds = new Scanner(System.in);
            System.out.println();
            System.out.print("Masukkan nis santri : ");
            String nisSantri = ds.nextLine();
            System.out.print("Masukkan Nama santri : ");
            String namaSantri = ds.nextLine();
            System.out.print("Masukkan Grade santri : ");
            String gradeSantri = ds.nextLine().toUpperCase();
            while (!(gradeSantri.equals("A") || gradeSantri.equals("B") || gradeSantri.equals("C") || gradeSantri.equals("D") || gradeSantri.equals("E"))) {
                System.out.print("Masukkan Grade Santri A atau B atau C atau D atau E ");
                gradeSantri = input.nextLine().toUpperCase();
            }
            System.out.print("Masukkan Jumlah hafalan : ");
            int jumlahhafalan = ds.nextInt();

            arrayInput.add(nisSantri);
            arrayInput.add(namaSantri);
            arrayInput.add(gradeSantri);
            arrayInput.add(String.valueOf(jumlahhafalan));
            arrayDatasantri.add(arrayInput);
        }
    }

    private static void perhitunganIPS(){
        if(arrayDatasantri.size() < 1){
            System.out.println("Belum ada data santri yang dimasukkan");
            return;
        }else{
            System.out.println(" jumlah hafalan santri adalah: ");
            int gradesantri = 0;
            double totalGradesantri = 0;
            double countsantri = 0;
            for(int i = 0; i < arrayDatasantri.size(); i++){
                String nsSantri = (arrayDatasantri.get(i)).get(0).toString();
                String nmSantri = (arrayDatasantri.get(i)).get(1).toString();
                String grSantri = (arrayDatasantri.get(i)).get(2).toString().toUpperCase();
                String jumlahhafalan = (arrayDatasantri.get(i)).get(3).toString();

                System.out.println(nsSantri + "    " + nmSantri + "    " + grSantri + "    " + jumlahhafalan );
                int grade;
                switch (grSantri){
                    case "A":
                        grade = 4;
                        break;
                    case "B":
                        grade = 3;
                        break;
                    case "C":
                        grade = 2;
                        break;
                    case "D":
                        grade = 1;
                        break;
                    default:
                        grade = 0;
                        break;
                }
                gradesantri = grade * Integer.parseInt(jumlahhafalan);
                totalGradesantri = totalGradesantri + gradesantri;
                countsantri = countsantri + Integer.parseInt(jumlahhafalan);
            }

            double juz = totalGradesantri / countsantri;
            System.out.println("Jumlah Hafalan anda adalah " + juz);
        }
    }

    private static void updateGrade(){
        if(arrayDatasantri.size() < 1){
            System.out.println("Belum ada data santri yang dimasukkan");
            return;
        }else{
            System.out.print("Masukkan nis santri : ");
            String nisSantri = input.next();
            for(int i = 0; i < arrayDatasantri.size(); i++){
                List<String> arrayInput = new ArrayList<>();
                String nissantri = null;
                nisSantri = (arrayDatasantri.get(i)).get(0).toString();
                String nmsantri = (arrayDatasantri.get(i)).get(1).toString();
                String jumlahhafalan = (arrayDatasantri.get(i)).get(3).toString();
                if(nissantri.equals(nisSantri)){
                    if(!nissantri.isEmpty()){
                        Scanner update = new Scanner(System.in);
                        System.out.print("Masukkan Grade Santri : ");
                        String grsantri = update.nextLine().toUpperCase();
                        while (!(grsantri.equals("A") || grsantri.equals("B") || grsantri.equals("C") || grsantri.equals("D") || grsantri.equals("E"))){
                            System.out.println("Silakan masukkan Grade antara A, B, C, D, dan E");
                            grsantri = update.nextLine().toUpperCase();
                            break;
                        }

                        arrayInput.add(nisSantri);
                        arrayInput.add(nmsantri);
                        arrayInput.add(grsantri);
                        arrayInput.add(String.valueOf(jumlahhafalan));

                        arrayDatasantri.set(i, arrayInput);

                        for(int j = 0; j < arrayDatasantri.size(); j++){
                            String updatenissantri = (arrayDatasantri.get(j)).get(0).toString();
                            String updateNmsantri = (arrayDatasantri.get(j)).get(1).toString();
                            String updateGrsantri = (arrayDatasantri.get(j)).get(2).toString().toUpperCase();
                            String updatejumlahhafalan = (arrayDatasantri.get(j)).get(3).toString();

                            System.out.println(updatenissantri + "    " + updateNmsantri + "    " + updateGrsantri + "    " + updatejumlahhafalan);
                            System.out.println();
                        }
                    }else
                        System.out.println("\nnis santri tidak ditemukan. ");
                }
            }
        }
    }

    

   

    
        
    
    

