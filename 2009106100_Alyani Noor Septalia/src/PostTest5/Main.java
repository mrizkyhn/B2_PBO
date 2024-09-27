package PostTest5;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        ArrayList<Reservasi> r = new ArrayList<>();
        ArrayList<Pembayaran> p = new ArrayList<>();

        int pilih, create, read, update, delete;
        Scanner string = new Scanner(System.in);
        Scanner angka = new Scanner(System.in);

        do {
            System.out.println(" ");
            System.out.println("            --- Sistem Reservasi Restoran ---         ");
            System.out.println("------------------------------------------------------");
            System.out.println("            [1] Buat Reservasi/Pembayaran");
            System.out.println("            [2] Lihat Daftar Reservasi/Pembayaran");
            System.out.println("            [3] Update Reservasi/Pembayaran");
            System.out.println("            [4] Hapus Reservasi/Pembayaran");
            System.out.println("            [0] Exit");
            System.out.print("                      >> Pilihan : ");
            pilih = angka.nextInt();
            System.out.println("------------------------------------------------------");

            switch(pilih) {
                case 1:
                    System.out.println("                Buat Reservasi/Pembayaran");
                    System.out.println("                [1] Reservasi");
                    System.out.println("                [2] Pembayaran ");
                    System.out.print("                  >> Pilihan : ");
                    create = angka.nextInt();
                    System.out.println("======================================================");
                    if (create == 1) {
                        System.out.println("                >> Buat Reservasi <<");

                        System.out.print("Tanggal reservasi (DD/MM/YYYY) : ");
                        String tanggal = string.next();

                        System.out.print("Jam reservasi (HH.MM) : ");
                        String jam = string.next();

                        System.out.print("Nama pembuat reservasi : ");
                        String namaReservator = string.next();

                        System.out.print("Pax : ");
                        int pax = angka.nextInt();

                        Reservasi reservasi = new Reservasi(tanggal, jam, namaReservator, pax);

                        r.add(reservasi);

                        System.out.println("                 Reservasi berhasil dibuat!");

                    } else if (create == 2) {
                        System.out.println("                >> Buat Pembayaran <<");

                        System.out.print("Kode booking (DDMMYY+Pax) : ");
                        int kodeBooking = angka.nextInt();

                        System.out.print("Nama : ");
                        String namaBayar = string.next();

                        System.out.print("DP yang dibayarkan : ");
                        int createDP = angka.nextInt();

                        System.out.print("Metode Pembayaran : ");
                        String metodeBayar = string.next();

                        Pembayaran pembayaran = new Pembayaran(kodeBooking, namaBayar, createDP, metodeBayar);

                        p.add(pembayaran);

                        System.out.println("                 Pembayaran berhasil dibuat!");
                    }
                    break;
                case 2:
                    System.out.println("                Lihat Reservasi/Pembayaran");
                    System.out.println("                [1] Lihat reservasi");
                    System.out.println("                [2] Lihat pembayaran");
                    System.out.print("                  >> Pilihan : ");
                    read = angka.nextInt();
                    if (read == 1) {
                        System.out.println("======================================================");
                        System.out.println("                >> Daftar Reservasi << ");
                        System.out.println("Tanggal\t\t\tJam\t\t Nama\t\t\t  Pax");
                        System.out.println("------------------------------------------------------");
                        DataReservasiFinal dr = new DataReservasiFinal();
                        dr.tampilDataReservasi();
                        for (Reservasi reservasi : r) {
                            System.out.println(reservasi);
                        }
                        System.out.println("------------------------------------------------------");
                    } else if (read == 2) {
                        System.out.println("======================================================");
                        System.out.println("                >> Daftar Pembayaran << ");
                        System.out.println("Kode Booking\tNama\t\t\tDP\t\t\tMetode Pembayaran");
                        System.out.println("------------------------------------------------------");
                        DataPembayaranFinal db = new DataPembayaranFinal();
                        db.tampilDataPembayaran();
                        for (Pembayaran pembayaran : p) {
                            System.out.println(pembayaran);
                        }
                        System.out.println("------------------------------------------------------");
                    }
                    break;
                case 3:
                    System.out.println("                Update Reservasi/Pembayaran");
                    System.out.println("                [1] Update Reservasi");
                    System.out.println("                [2] Update Pembayaran");
                    System.out.print("                  >> Pilihan : ");
                    update = angka.nextInt();
                    System.out.println("======================================================");
                    if (update == 1) {
                        System.out.println("                >> Update Reservasi <<");

                        System.out.print("Urutan yang ingin diganti : ");
                        int updateReservasi = angka.nextInt();

                        System.out.print("Tanggal reservasi (DD/MM/YYYY) : ");
                        String tanggal = string.next();

                        System.out.print("Jam reservasi (HH.MM) : ");
                        String jam = string.next();

                        System.out.print("Nama pembuat reservasi : ");
                        String namaReservator = string.next();

                        System.out.print("Pax : ");
                        int pax = angka.nextInt();

                        if (updateReservasi == 1) {
                            System.out.println("\n                Tidak bisa di update");
                            System.out.println("\t\tUrutan ke-1 merupakan data final!!!");
                        } else {
                            Reservasi reservasi = new Reservasi(tanggal, jam, namaReservator, pax);

                            r.set(updateReservasi - 2, reservasi);

                            statusUpdateReservasi(updateReservasi);
                        }
                    } else if (update == 2) {
                        System.out.println("                >> Update Pembayaran <<");

                        System.out.print("Urutan yang ingin diganti : ");
                        int updateBayar = angka.nextInt();

                        System.out.print("Kode booking (DDMMYY+Pax) : ");
                        int kodeBooking = angka.nextInt();

                        System.out.print("Nama : ");
                        String namaBayar = string.next();

                        System.out.print("DP yang dibayarkan : ");
                        int createDP = angka.nextInt();

                        System.out.print("Metode Pembayaran : ");
                        String metodeBayar = string.next();

                        if (updateBayar == 1) {
                            System.out.println("\n                Tidak bisa diupdate");
                            System.out.println("\t\tUrutan ke-1 merupakan data final!!!");
                        } else {
                            Pembayaran pembayaran = new Pembayaran(kodeBooking, namaBayar, createDP, metodeBayar);

                            p.set(updateBayar - 2, pembayaran);

                            statusUpdateBayar(updateBayar);
                        }
                    }
                    break;
                case 4:
                    System.out.println("                Hapus Reservasi/Pembayaran");
                    System.out.println("                [1] Hapus Reservasi");
                    System.out.println("                [2] Hapus Pembayaran");
                    System.out.print("                  >> Pilihan : ");
                    delete = angka.nextInt();
                    System.out.println("======================================================");
                    if (delete == 1) {
                        System.out.println("                >> Hapus Reservasi << ");
                        System.out.print("Urutan yang ingin dihapus : ");
                        int deleteReservasi = angka.nextInt();
                        r.remove(deleteReservasi - 2);
                        class HapusReservasi extends InheritanceReservasi {
                            @Override
                            public void statusHapusReservasi() {
                                System.out.println("\tUrutan reservasi ke-" + deleteReservasi + " berhasil dihapus!");
                            }
                        }
                        if (deleteReservasi == 1) {
                            System.out.println("\n                Tidak bisa dihapus");
                            System.out.println("\t\tUrutan ke-1 merupakan data final!!!");
                        } else {
                            HapusReservasi hr = new HapusReservasi();
                            hr.statusHapusReservasi();
                        }
                    } else if (delete == 2) {
                        System.out.println("                >> Hapus Pembayaran <<");
                        System.out.print("Urutan yang ingin dihapus : ");
                        int deletePembayaran = angka.nextInt();
                        p.remove(deletePembayaran - 2);
                        class HapusBayar extends InheritancePembayaran {
                            @Override
                            public void statusHapusBayar() {
                                System.out.println("\tUrutan pembayaran ke-" + deletePembayaran + " berhasil dihapus!");
                            }
                        }
                        if (deletePembayaran == 1) {
                            System.out.println("\n                Tidak bisa dihapus");
                            System.out.println("\t\tUrutan ke-1 merupakan data final!!!");
                        } else {
                            HapusBayar hb = new HapusBayar();
                            hb.statusHapusBayar();
                        }
                    }
                    break;
             }
            }while (pilih != 0);
        }

    private static void statusUpdateReservasi(int updateReservasi) {
        System.out.println("\tData reservasi urutan ke-"+updateReservasi+" berhasil di update!");
    }

    private static void statusUpdateBayar(int updateBayar) {
        System.out.println("\tData pembayaran urutan ke-"+updateBayar+" berhasil di update!");
    }

}

