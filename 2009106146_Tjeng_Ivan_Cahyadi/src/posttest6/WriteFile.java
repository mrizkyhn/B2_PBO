package posttest6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import static posttest6.Main.kumpulanBarang;

public class WriteFile {
    public void writeFile() throws FileNotFoundException {
        File csvFile = new File("barangToko.csv");
        PrintWriter out = new PrintWriter(csvFile);
        for (Toko barang : kumpulanBarang) {
            out.printf("%s,%s,%s,%s,%d,%d\n", barang.getId(), barang.getNama(), barang.getMerk(), barang.getJenis(), barang.getHarga(), barang.getStock());
        }
        out.flush();
        out.close();
    }
}
