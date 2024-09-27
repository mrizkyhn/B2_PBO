package Postestpbo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Postest1 {

    // deklarasi variabel global
    static String fileName;
    static ArrayList<String> ecraft;
    static boolean isEditing = false;
    static Scanner input;

    public static void main(String[] args) {
        ecraft = new ArrayList<>();
        input = new Scanner(System.in);

        String filePath = System.console() == null ? "/src/ecraft.txt" : "/ecraft.txt";
        fileName = System.getProperty("user.dir") + filePath;

        System.out.println("FILE: " + fileName);

    // run the program (main loop)
        while (true) {
            showMenu();
        }
        
    }
    
    static void clearScreen(){
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
    

    static void showMenu() {
        System.out.println("=== Ecraft ===");
        System.out.println("[1] Lihat ecraft");
        System.out.println("[2] Tambah ecraft");
        System.out.println("[3] Edit ecraft");
        System.out.println("[4] Hapus ecraft");
        System.out.println("[5] Barang rekomendasi");
        System.out.println("[0] Keluar");
        System.out.println("---------------------");
        System.out.print("Pilih menu> ");

        String selectedMenu = input.nextLine();

        switch (selectedMenu) {
            case "1":
                showecraft();
                break;
            case "2":
                addecraft();
                break;
            case "3":
                editecraft();
                break;
            case "4":
                deleteecraft();
                break;
            case "5":
                Barang barangkaltim = new Barang("Tas","Kalimantan Timur","Gajah Duduk",50000);
                Barang barangkalsel = new Barang("Baju","Kalimantan Selatan","Consina",35000);
                
                System.out.println(barangkaltim.getJenis());
                System.out.println(barangkaltim.getAsal());
                System.out.println(barangkaltim.getMerk());
                System.out.println(barangkaltim.getHarga());
                System.out.println("======================");
                System.out.println(barangkalsel.getJenis());
                System.out.println(barangkalsel.getAsal());
                System.out.println(barangkalsel.getMerk());
                System.out.println(barangkaltim.getHarga());
                
                barangkaltim.setJenis("Sarung");
                barangkaltim.setAsal("Samarinda Seberang");
                barangkaltim.setMerk("Wadimor");
                barangkaltim.setHarga(2000000);
                barangkalsel.setJenis("Topi");
                barangkalsel.setAsal("Banjarmasin");
                barangkalsel.setMerk("Arai");
                barangkalsel.setHarga(300000);
                
                System.out.println("Barang rekomendasi Setelah di setter");
                System.out.println(barangkaltim.getJenis());
                System.out.println(barangkaltim.getAsal());
                System.out.println(barangkaltim.getMerk());
                System.out.println(barangkaltim.getHarga());
                System.out.println("======================");
                System.out.println(barangkalsel.getJenis());
                System.out.println(barangkalsel.getAsal());
                System.out.println(barangkalsel.getMerk());
                System.out.println(barangkaltim.getHarga());
                
                barangkaltim.readybarang();
                barangkaltim.noreadybarang();
                backToMenu();                
                
                
           
            case "0":
                System.exit(0);
            default:
                System.out.println("Kamu salah pilih menu!");
                backToMenu();
                break;
        }
    }

    static void backToMenu() {
        System.out.println("");
        System.out.print("Tekan [Enter] untuk kembali..");
        input.nextLine();
        clearScreen();
    }

    static void readecraft() {
         try {
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);

        // load isi file ke dalam array todoLists
            ecraft.clear();
            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                ecraft.add(data);
        }

    } catch (FileNotFoundException e) {
        System.out.println("Error karena: " + e.getMessage());
    }
   
    }

    static void showecraft() {
        clearScreen();
        readecraft();
        if (ecraft.size() <= 0) {
            System.out.println("Tidak ada data!");
        } else {
            System.out.println("TODO LIST:");
            int index = 0;
            for (String data : ecraft) {
                System.out.println(String.format("[%d] %s", index, data));
                index++;
            }
        }

    if (!isEditing) {
        backToMenu();
    }
    }

    static void addecraft() {
        clearScreen();

        System.out.println("Apa yang ingin kamu kerjakan?");
        System.out.print("Jawab: ");
        String newecraft = input.nextLine();

        try {
            try ( // tulis file
                    FileWriter fileWriter = new FileWriter(fileName, true)) {
                fileWriter.append(String.format("%s%n", newecraft));
            }
            System.out.println("Berhasil ditambahkan!");
    } catch (IOException e) {
        System.out.println("Terjadi kesalahan karena: " + e.getMessage());
    }

    backToMenu();
    }

    static void editecraft() {
        isEditing = true;
        showecraft();

        try {
            System.out.println("-----------------");
            System.out.print("Pilih Indeks> ");
            int index = Integer.parseInt(input.nextLine());

            if (index > ecraft.size()) {
                throw new IndexOutOfBoundsException("Kamu memasukan data yang salah!");
        } else {

            System.out.print("Data baru: ");
            String newData = input.nextLine();

            // update data
            ecraft.set(index, newData);

            System.out.println(ecraft.toString());

            try {
                // write new data
                try (FileWriter fileWriter = new FileWriter(fileName, false)) {
                    // write new data
                    for (String data : ecraft) {
                        fileWriter.append(String.format("%s%n", data));
                    }
                }

                System.out.println("Berhasil diubah!");
            } catch (IOException e) {
                System.out.println("Terjadi kesalahan karena: " + e.getMessage());
            }
        }
    } catch (IndexOutOfBoundsException | NumberFormatException e) {
        System.out.println(e.getMessage());
    }

    isEditing = false;
    backToMenu();
    }

    static void deleteecraft() {
        isEditing = true;
        showecraft();

        System.out.println("-----------------");
        System.out.print("Pilih Indeks> ");
        int index = Integer.parseInt(input.nextLine());

        try {
            if (index > ecraft.size()) {
            throw new IndexOutOfBoundsException("Kamu memasukan data yang salah!");
        } else {

            System.out.println("Kamu akan menghapus:");
            System.out.println(String.format("[%d] %s", index, ecraft.get(index)));
            System.out.println("Apa kamu yakin?");
            System.out.print("Jawab (y/t): ");
            String jawab = input.nextLine();

            if (jawab.equalsIgnoreCase("y")) {
                // hapus data
                ecraft.remove(index);

                // tulis ulang file
                try {
                    // write new data
                    try (FileWriter fileWriter = new FileWriter(fileName, false)) {
                        // write new data
                        for (String data : ecraft) {
                            fileWriter.append(String.format("%s%n", data));
                        }
                    }

                    System.out.println("Berhasil dihapus!");
                } catch (IOException e) {
                    System.out.println("Terjadi kesalahan karena: " + e.getMessage());
                }
            }
        }
    } catch (IndexOutOfBoundsException e) {
        System.out.println(e.getMessage());
    }

    isEditing = false;
    backToMenu();
    }

}