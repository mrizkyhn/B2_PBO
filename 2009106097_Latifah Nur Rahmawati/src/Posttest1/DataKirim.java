package Posttest1;

import java.util.Scanner;
import java.util.ArrayList;

public class DataKirim {
    ArrayList<InputData> dataKirim = new ArrayList<InputData>();

    void tambahData(InputData data){
        this.dataKirim.add(data);
    }

    void hapusData(int kodebrg){
        this.dataKirim.removeIf(item -> item.kodebarang == kodebrg);
    }

    void tampilData(){
        System.out.println("-------------------------------------------");
        for(InputData item: this.dataKirim){
            item.print();
        }
    }
}
