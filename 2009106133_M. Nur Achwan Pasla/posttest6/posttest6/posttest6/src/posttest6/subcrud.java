/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest6;

/**
 *
 * @author CUAN
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;


public class subcrud implements crud {
    
    
    static ArrayList<String> dessert;
    static ArrayList<String> makanan;
    static ArrayList<String> minuman;
    static ArrayList<String> snack;
    static boolean isEditing = false;
    Scanner input = new Scanner(System.in);
    
    static void clearScreen() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                // clear screen untuk windows
                new ProcessBuilder("cmd", "/c", "cls")
                        .inheritIO()
                        .start()
                        .waitFor();
            } else {
                // clear screen untuk Linux, Unix, Mac
                Runtime.getRuntime().exec("clear");
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final IOException | InterruptedException e) {
            System.out.println("Error karena: " + e.getMessage());
        }

    }
    
    public void kembali() {
        System.out.println("");
        System.out.print("Tekan [Enter] untuk kembali..");
        input.nextLine();
        clearScreen();
    }

    @Override
    public void tampilMenu() throws Exception {
        
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        clearScreen();
        System.out.println("<=== DAFTAR MENU CAFE ===>");
        System.out.println("[1] Makanan");
        System.out.println("[2] Minuman");
        System.out.println("[3] Snack");
        System.out.println("[4] Dessert");
        System.out.println("[0] Kembali");
        System.out.println("==========================");
        System.out.print(" Pilih [0/1/2/3/4] : ");

        int pilihan = Integer.parseInt(br.readLine());
        try{
            switch (pilihan) {
        
            case 1:
                if (makanan.size() > 0) {
                    System.out.println("DAFTAR MAKANAN CAFE");
                    System.out.println("===================");
                    int index = 0;
                    for (String mkn : makanan) {
                        System.out.println(String.format("[%d]\t%s", index, mkn));
                        System.out.println("===================");
                        index++;
                    }
                } else {
                    System.out.println(" TIDAK ADA DATA! ");
                    kembali();
                }   if (!isEditing) {
                    cafe Kafe;
                    Kafe = new cafe("makanan", "minuman", "desert", "snack");
                    Kafe.tampilMenu();
                    kembali();
                }   break;
            case 2:
                if (minuman.size() > 0) {
                    System.out.println("DAFTAR MINUMAN CAFE");
                    System.out.println("===================");
                    int index = 0;
                    for (String mnm : minuman) {
                        System.out.println(String.format("[%d]\t%s", index, mnm));
                        System.out.println("===================");
                        index++;
                    }
                } else {
                    System.out.println(" TIDAK ADA DATA! ");
                    kembali();
                }   if (!isEditing) {
                    cafe Kafe;
                    Kafe = new cafe("makanan", "minuman", "desert", "snack");
                    Kafe.tampilMenu();
                    kembali();
                }   break;
            case 3:
                if (snack.size() > 0) {
                    System.out.println("DAFTAR SNACK CAFE");
                    System.out.println("===================");
                    int index = 0;
                    for (String snk : snack) {
                        System.out.println(String.format("[%d]\t%s", index, snk));
                        System.out.println("===================");
                        index++;
                    }
                } else {
                    System.out.println(" TIDAK ADA DATA! ");
                    kembali();
                }   if (!isEditing) {
                    cafe Kafe;
                    Kafe = new cafe("makanan", "minuman", "desert", "snack");
                    Kafe.tampilMenu();
                    kembali();
                }   break;
            case 4:
                if (dessert.size() > 0) {
                    System.out.println("DAFTAR DESSERT CAFE");
                    System.out.println("===================");
                    int index = 0;
                    for (String snk : dessert) {
                        System.out.println(String.format("[%d]\t%s", index, snk));
                        System.out.println("===================");
                        index++;
                    }
                } else {
                    System.out.println(" TIDAK ADA DATA! ");
                    kembali();
                }   if (!isEditing) {
                    cafe Kafe;
                    Kafe = new cafe("makanan", "minuman", "desert", "snack");
                    Kafe.tampilMenu();
                    kembali();
                }   break;
            case 0:
                kembali();
                break;
            default:
                System.out.println("KAMU SALAH PILIH MENU");
                kembali();
                break;
        }
        } catch(NullPointerException e){
            System.out.println(e);
        }
        
        
    }

    @Override
    public void tambahMenu() {
        clearScreen();
        System.out.println("<=== TAMBAH MENU CAFE ===>");
        System.out.println("[1] Makanan");
        System.out.println("[2] Minuman");
        System.out.println("[3] Snack");
        System.out.println("[4] Dessert");
        System.out.println("[0] Kembali");
        System.out.println("==========================");
        System.out.print(" Pilih [0/1/2/3/4] : ");

        String pilih = input.nextLine();

        if (pilih.equals("1")) {
            System.out.print("\nMasukkan Makanan : ");
            String mkn = input.nextLine();
            
            isEditing = false;
            cafe Kafe;
            Kafe = new cafe("makanan", "minuman", "desert", "snack");
            Kafe.setMakanan(mkn);
            
            Kafe.tambahMenu();
            kembali();
        } else if (pilih.equals("2")) {
            System.out.print("\nMasukkan Minuman : ");
            String mnm = input.nextLine();
            minuman.add(mnm);
            isEditing = false;
            cafe Kafe;
            Kafe = new cafe("makanan", "minuman", "desert", "snack");
            Kafe.tambahMenu();
            kembali();
        } else if (pilih.equals("3")) {
            System.out.print("\nMasukkan Snack   : ");
            String snk = input.nextLine();
            snack.add(snk);
            isEditing = false;
            cafe Kafe;
            Kafe = new cafe("makanan", "minuman", "desert", "snack");
            Kafe.tambahMenu();
            kembali();
        } else if (pilih.equals("4")) {
            System.out.print("\nMasukkan Dessert   : ");
            String dst = input.nextLine();
            dessert.add(dst);
            isEditing = false;
            cafe Kafe;
            Kafe = new cafe("makanan", "minuman", "desert", "snack");
            Kafe.tambahMenu();
            kembali();
        } else if (pilih.equals("0")) {
            kembali();
        } else {
            System.out.println("KAMU SALAH PILIH MENU");
            kembali();
        }
    }

    @Override
    public void editMenu() throws Exception {
        
        isEditing = true;
        tampilMenu();
        
        if (makanan.equals(makanan)) {
            try {
                System.out.print("Pilih Indeks -> ");
                int index = Integer.parseInt(input.nextLine());

                if (index > makanan.size()) {
                    throw new IndexOutOfBoundsException("Data anda salah !");
                } else {

                    System.out.print("Data makanan baru: ");
                    String newmkn = input.nextLine();

                    // update data
                    makanan.set(index, newmkn);

                    System.out.println(makanan.toString());
                }
            } catch (IndexOutOfBoundsException | NumberFormatException e) {
                System.out.println(e.getMessage());
            }

            isEditing = false;
            cafe Kafe;
            Kafe = new cafe("makanan", "minuman", "desert", "snack");
            Kafe.editMenu();
            kembali();
        } else if (minuman.equals(minuman)) {
            try {
                System.out.print("Pilih Indeks -> ");
                int index = Integer.parseInt(input.nextLine());

                if (index > minuman.size()) {
                    throw new IndexOutOfBoundsException("Data anda salah !");
                } else {

                    System.out.print("Data minuman baru: ");
                    String newmnm = input.nextLine();

                    // update data
                    minuman.set(index, newmnm);

                    System.out.println(minuman.toString());
                }
            } catch (IndexOutOfBoundsException | NumberFormatException e) {
                System.out.println(e.getMessage());
            }

            isEditing = false;
            cafe Kafe;
            Kafe = new cafe("makanan", "minuman", "desert", "snack");
            Kafe.editMenu();
            kembali();
        } else if (snack.equals(snack)) {
            try {
                System.out.print("Pilih Indeks -> ");
                int index = Integer.parseInt(input.nextLine());

                if (index > snack.size()) {
                    throw new IndexOutOfBoundsException("Data anda salah !");
                } else {

                    System.out.print("Data snack baru: ");
                    String newsnk = input.nextLine();

                    // update data
                    snack.set(index, newsnk);

                    System.out.println(snack.toString());
                }
            } catch (IndexOutOfBoundsException | NumberFormatException e) {
                System.out.println(e.getMessage());
            }

            isEditing = false;
            cafe Kafe;
            Kafe = new cafe("makanan", "minuman", "desert", "snack");
            Kafe.editMenu();
            kembali();
        } else if (dessert.equals(dessert)) {
            try {
                System.out.print("Pilih Indeks -> ");
                int index = Integer.parseInt(input.nextLine());

                if (index > dessert.size()) {
                    throw new IndexOutOfBoundsException("Data anda salah !");
                } else {

                    System.out.print("Data dessert baru: ");
                    String newdst = input.nextLine();

                    // update data
                    dessert.set(index, newdst);

                    System.out.println(dessert.toString());
                }
            } catch (IndexOutOfBoundsException | NumberFormatException e) {
                System.out.println(e.getMessage());
            }

            isEditing = false;
            cafe Kafe;
            Kafe = new cafe("makanan", "minuman", "desert", "snack");
            Kafe.editMenu();
            kembali();
        } 
    }

    @Override
    public void hapusMenu() {
        isEditing = true;
//        tampilMenu();
        
        if (makanan.equals(makanan)) {
            System.out.print("Pilih Indeks> ");
            int index = Integer.parseInt(input.nextLine());

            try {
                if (index > makanan.size()) {
                    throw new IndexOutOfBoundsException("Kamu memasukan data yang salah!");
                } else {

                    System.out.println("Kamu akan menghapus Index ke " + index);
                    makanan.remove(index);
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }

            isEditing = false;
            cafe Kafe;
            Kafe = new cafe("makanan", "minuman", "desert", "snack");
            Kafe.hapusMenu();
            kembali();
        } else if (minuman.equals(minuman)) {
            System.out.print("Pilih Indeks> ");
            int index = Integer.parseInt(input.nextLine());

            try {
                if (index > minuman.size()) {
                    throw new IndexOutOfBoundsException("Kamu memasukan data yang salah!");
                } else {

                    System.out.println("Kamu akan menghapus Index ke " + index);
                    minuman.remove(index);
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }

            isEditing = false;
            cafe Kafe;
            Kafe = new cafe("makanan", "minuman", "desert", "snack");
            Kafe.hapusMenu();
            kembali();
        } else if (snack.equals(snack)) {
            System.out.print("Pilih Indeks> ");
            int index = Integer.parseInt(input.nextLine());

            try {
                if (index > snack.size()) {
                    throw new IndexOutOfBoundsException("Kamu memasukan data yang salah!");
                } else {

                    System.out.println("Kamu akan menghapus Index ke " + index);
                    snack.remove(index);
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }

            isEditing = false;
            cafe Kafe;
            Kafe = new cafe("makanan", "minuman", "desert", "snack");
            Kafe.hapusMenu();
            kembali();
        } else if (dessert.equals(dessert)) {
            System.out.print("Pilih Indeks> ");
            int index = Integer.parseInt(input.nextLine());

            try {
                if (index > dessert.size()) {
                    throw new IndexOutOfBoundsException("Kamu memasukan data yang salah!");
                } else {

                    System.out.println("Kamu akan menghapus Index ke " + index);
                    dessert.remove(index);
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }

            isEditing = false;
            cafe Kafe;
            Kafe = new cafe("makanan", "minuman", "desert", "snack");
            Kafe.hapusMenu();
            kembali();
        } 
    }
    
}
