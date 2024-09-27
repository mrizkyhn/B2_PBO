package posttest5;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadFile {
    public void readFile(ArrayList<Toko> kumpulanBarang) throws FileNotFoundException {
        String id, nama, merk, jenis;
        int harga, stock;
        File csvFile = new File("barangToko.csv");
        if (!csvFile.exists()) {
            FileOutputStream fos = new FileOutputStream("barangToko.csv");
        } else {
            Scanner input = new Scanner(csvFile);
            input.useDelimiter(",|\n");
            while (input.hasNext()) {
                id = input.next();
                nama = input.next();
                merk = input.next();
                jenis = input.next();
                harga = input.nextInt();
                stock = input.nextInt();
                kumpulanBarang.add(new Toko(id, nama, merk, jenis, harga, stock));
            }
        }
    }
}
