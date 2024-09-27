package POSTEST6;

import java.util.ArrayList;
import java.util.Scanner;

public class TampilData {

    ArrayList<Barang_Elektronik> tampung;
    ArrayList<Barang_Rtangga> tampung2;

    TampilData() {
        //instansiasi
        tampung = new ArrayList<>();
        tampung2 = new ArrayList<>();
    }

    static void END() {
        //instansiasi
        System.out.println("\n\n  >> Terima Kasih Telah Berkunjung <<\n\n");
    }

    void isiData(int id, String nm, String br, String js, int jm, int hg, String jb, int uk) {
        tampung.add(new Barang_Elektronik(id, nm, br, js, jm, hg, jb, uk));
    }

    void isiData2(int id, String nm, String br, String js, int jm, int hg, String jb, String st) {
        tampung2.add(new Barang_Rtangga(id, nm, br, js, jm, hg, jb, st));
    }

    void hapusData(int idd) {
        tampung.removeIf(item -> item.getId() == (idd));

    }

    void hapusData2(int idd) {
        tampung2.removeIf(item -> item.getId() == (idd));

    }

    void ubahData(int idd, int id, String nm, String br, String js, int jm, int hg, String jb, int uk) {

        int cek = -1;
        for (int i = 0; i < tampung.size(); i++) {
            if (tampung.get(i).getId() == idd) {
                cek = i;
                System.out.println(cek);
                tampung.set(cek, new Barang_Elektronik(id, nm, br, js, jm, hg, jb, uk));
            }
        }
    }

    void ubahData2(int idd, int id, String nm, String br, String js, int jm, int hg, String jb, String st) {

        int cek = -1;
        for (int i = 0; i < tampung2.size(); i++) {
            if (tampung2.get(i).getId() == idd) {
                cek = i;
                System.out.println(cek);
                tampung2.set(cek, new Barang_Rtangga(id, nm, br, js, jm, hg, jb, st));
            }
        }
    }

    void showData() {
        for (Barang_Elektronik barang_elektronik : tampung) {
            System.out.println("id brg : " + barang_elektronik.getId() + "" + ", Nama Pelanggan : " + barang_elektronik.getNm() + "" + ", Barang : " + barang_elektronik.getBr() + ", Jenis : " + barang_elektronik.getJs() + "" + ", Ukuran : " + barang_elektronik.getUkuran() + "" + ", Jumlah : " + barang_elektronik.getJm() + "" + ", Harga : " + barang_elektronik.getHg() + "" + ", Metode Bayar : " + barang_elektronik.getJb() + "");
        }
    }

    void showData2() {
        for (Barang_Rtangga barang_rtangga : tampung2) {
            System.out.println("id brg : " + barang_rtangga.getId() + "" + ", Nama Pelanggan : " + barang_rtangga.getNm() + "" + ", Barang : " + barang_rtangga.getBr() + ", Jenis : " + barang_rtangga.getJs() + "" + ", Status : " + barang_rtangga.getStatus() + "" + ", Jumlah : " + barang_rtangga.getJm() + "" + ", Harga : " + barang_rtangga.getHg() + "" + ", Metode Bayar : " + barang_rtangga.getJb());
        }
    }

    public static void main(String args[]) {
        Barang_Elektronik MM = new Barang_Elektronik();
        Barang_Rtangga NN = new Barang_Rtangga();
        Scanner inputan = new Scanner(System.in);
        int Ngulang = 1;
        TampilData td = new TampilData();
        while (Ngulang == 1) {
            System.out.println("-------------------------------");
            System.out.println("|         Perabotan           |");
            System.out.println("-------------------------------");
            System.out.println("| 1.Tambah Data               |");
            System.out.println("| 2.Tampil Data               |");
            System.out.println("| 3.Ubah   Data               |");
            System.out.println("| 4.Hapus  Data               |");
            System.out.println("| 0.Exit                      |");
            System.out.println("-------------------------------");
            int pilihan, pilihan2;
            System.out.print("Masukan Pilihan [ 1-5 ] : ");
            pilihan = inputan.nextInt();
            System.out.println("\n---------------------------------");
            System.out.println("|         Tipe Perabot          |");
            System.out.println("--------------------------------|");
            System.out.println("| 1.Elektronik                  |");
            System.out.println("| 2.Rumah Tangga                |");
            System.out.println("---------------------------------");
            System.out.print("Masukan Pilihan [ 1-2 ] : ");
            pilihan2 = inputan.nextInt();

            if (pilihan2 == 1) {

                if (pilihan == 1) {
                    MM.wellcome();
                    MM.wellcome2();
                    int ID;
                    String NAMA;
                    String BARANG;
                    String JENIS;
                    int JUMLAH;
                    int HARGA;
                    int UKURAN;
                    String METODE;

                    System.out.print("ID                : ");
                    ID = inputan.nextInt();

                    System.out.print("Nama Pembeli      : ");
                    NAMA = inputan.next();

                    System.out.print("Nama Barang       : ");
                    BARANG = inputan.next();

                    System.out.print("Jenis Barang      : ");
                    JENIS = inputan.next();

                    System.out.print("Masukan Ukuran    : ");
                    UKURAN = inputan.nextInt();

                    System.out.print("Jumlah Barang     : ");
                    JUMLAH = inputan.nextInt();

                    System.out.print("Masukan Harga     : ");
                    HARGA = inputan.nextInt();

                    System.out.print("Metode Pembayaran : ");
                    METODE = inputan.next();
                    td.isiData(ID, NAMA, BARANG, JENIS, JUMLAH, HARGA, METODE, UKURAN);
                    Barang_Elektronik tambahh = new Barang_Elektronik();
                    tambahh.barangbeli();
                } else if (pilihan == 2) {
                    td.showData();

                } else if (pilihan == 3) {
                    MM.wellcome();
                    MM.wellcome2();
                    int ID;
                    String NAMA;
                    String BARANG;
                    String JENIS;
                    int JUMLAH;
                    int HARGA, UKURAN;
                    String METODE;
                    int pilih;

                    System.out.print("Pilih ID Data Yang Ingin Di Ubah : ");
                    pilih = inputan.nextInt();

                    System.out.print("ID                 : ");
                    ID = inputan.nextInt();

                    System.out.print("Nama Pembeli Baru  : ");
                    NAMA = inputan.next();

                    System.out.print("Nama Barang Baru   : ");
                    BARANG = inputan.next();

                    System.out.print("Jenis Barang Baru  : ");
                    JENIS = inputan.next();

                    System.out.print("Ukuran Barang Baru : ");
                    UKURAN = inputan.nextInt();

                    System.out.print("Jumlah Barang Baru : ");
                    JUMLAH = inputan.nextInt();

                    System.out.print("Masukan Harga Baru : ");
                    HARGA = inputan.nextInt();

                    System.out.print("Metode Pembayaran  : ");
                    METODE = inputan.next();
                    td.ubahData(pilih, ID, NAMA, BARANG, JENIS, JUMLAH, HARGA, METODE, UKURAN);
                    Barang_Elektronik ubahs = new Barang_Elektronik();
                    ubahs.barangubah();
                } else if (pilihan == 4) {
                    MM.wellcome();
                    MM.wellcome2();
                    int pil_hapus;
                    System.out.print("Pilih ID Data : ");
                    pil_hapus = inputan.nextInt();
                    td.hapusData(pil_hapus);
                    Barang_Elektronik haps = new Barang_Elektronik();
                    haps.barangberhasil();
                } else if (pilihan == 0) {
                    END();
                    System.exit(0);
                }

            } else if (pilihan2 == 2) {

                if (pilihan == 1) {
                    NN.wellcome();
                    NN.wellcome2();
                    int ID;
                    String NAMA;
                    String BARANG;
                    String JENIS;
                    int JUMLAH;
                    int HARGA;
                    String STATUS;
                    String METODE;

                    System.out.print("ID                : ");
                    ID = inputan.nextInt();

                    System.out.print("Nama Pembeli      : ");
                    NAMA = inputan.next();

                    System.out.print("Nama Barang       : ");
                    BARANG = inputan.next();

                    System.out.print("Jenis Barang      : ");
                    JENIS = inputan.next();

                    System.out.print("Masukan Status    : ");
                    STATUS = inputan.next();

                    System.out.print("Jumlah Barang     : ");
                    JUMLAH = inputan.nextInt();

                    System.out.print("Masukan Harga     : ");
                    HARGA = inputan.nextInt();

                    System.out.print("Metode Pembayaran : ");
                    METODE = inputan.next();
                    td.isiData2(ID, NAMA, BARANG, JENIS, JUMLAH, HARGA, METODE, STATUS);
                    Barang_Rtangga tambahh = new Barang_Rtangga();
                    tambahh.barangbeli();
                } else if (pilihan == 2) {
                    td.showData2();

                } else if (pilihan == 3) {
                    NN.wellcome();
                    NN.wellcome2();
                    int ID;
                    String NAMA;
                    String BARANG;
                    String JENIS;
                    int JUMLAH;
                    int HARGA;
                    String STATUS;
                    String METODE;
                    int pilih;

                    System.out.print("Pilih ID Data Yang Ingin Di Ubah : ");
                    pilih = inputan.nextInt();

                    System.out.print("ID                 : ");
                    ID = inputan.nextInt();

                    System.out.print("Nama Pembeli Baru  : ");
                    NAMA = inputan.next();

                    System.out.print("Nama Barang Baru   : ");
                    BARANG = inputan.next();

                    System.out.print("Jenis Barang Baru  : ");
                    JENIS = inputan.next();

                    System.out.print("Status Barang Baru : ");
                    STATUS = inputan.next();

                    System.out.print("Jumlah Barang Baru : ");
                    JUMLAH = inputan.nextInt();

                    System.out.print("Masukan Harga Baru : ");
                    HARGA = inputan.nextInt();

                    System.out.print("Metode Pembayaran  : ");
                    METODE = inputan.next();
                    td.ubahData2(pilih, ID, NAMA, BARANG, JENIS, JUMLAH, HARGA, METODE, STATUS);
                    Barang_Rtangga ubahs = new Barang_Rtangga();
                    ubahs.barangubah();
                } else if (pilihan == 4) {
                    NN.wellcome();
                    NN.wellcome2();
                    int pil_hapus;
                    System.out.print("Pilih ID Data : ");
                    pil_hapus = inputan.nextInt();
                    td.hapusData2(pil_hapus);
                    Barang_Rtangga haps = new Barang_Rtangga();
                    haps.barangberhasil();
                } else if (pilihan == 0) {
                    END();
                    System.exit(0);
                }

            }

        }

    }
}
