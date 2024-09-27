import java.util.ArrayList;
import java.util.Scanner;

public class cafe {

    static ArrayList<String> makanan;
    static ArrayList<String> minuman;
    static ArrayList<String> snack;
    static boolean isEditing = false;
    static Scanner input;

    public static void main(String[] args) {
        makanan = new ArrayList<>();
        minuman = new ArrayList<>();
        snack = new ArrayList<>();
        input = new Scanner(System.in);
        while (true) {
            showMenu();
        }
    }

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
        } catch (final Exception e) {
            System.out.println("Error karena: " + e.getMessage());
        }

    }

    static void showMenu() {
        System.out.println("=== DATA MENU CAFE ===");
        System.out.println("[1] Tampil Menu Cafe");
        System.out.println("[2] Tambah Menu Cafe");
        System.out.println("[3] Edit Menu Cafe");
        System.out.println("[4] Hapus Menu Cafe");
        System.out.println("[0] Keluar");
        System.out.println("---------------------");
        System.out.print("Pilih Menu[0/1/2/3/4] : ");

        String choice = input.nextLine();

        if (choice.equals("1")) {
            tampilMenu();
        } else if (choice.equals("2")) {
            tambahMenu();

        } else if (choice.equals("3")) {
            editMenu();

        } else if (choice.equals("4")) {
            hapusMenu();
        } else if (choice.equals("0")) {
            System.exit(0);
        } else {
            System.out.println("KAMU SALAH PILIH MENU");
            kembali();
        }
    }

    static void kembali() {
        System.out.println("");
        System.out.print("Tekan [Enter] untuk kembali..");
        input.nextLine();
        clearScreen();
    }

    static void tampilMenu() {
        clearScreen();
        System.out.println("<=== DAFTAR MENU CAFE ===>");
        System.out.println("[1] Makanan");
        System.out.println("[2] Minuman");
        System.out.println("[3] Snack");
        System.out.println("[0] Kembali");
        System.out.println("==========================");
        System.out.print(" Pilih [0/1/2/3] : ");

        String pilih = input.nextLine();

        if (pilih.equals("1")) {
            if (makanan.size() > 0) {
                System.out.println("DAFTAR MAKANAN CAFE");
                System.out.println("===================");
                int index = 0;
                for (String mkn : makanan) {
                    System.out.println(String.format("[%d]\t%s", index, mkn));
                    System.out.println("-------------------------------------------------------------");
                    index++;
                }
            } else {
                System.out.println(" TIDAK ADA DATA! ");
            }

            if (!isEditing) {
                kembali();
            }
        } else if (pilih.equals("2")) {
            if (minuman.size() > 0) {
                System.out.println("DAFTAR MINUMAN CAFE");
                System.out.println("===================");
                int index = 0;
                for (String mnm : minuman) {
                    System.out.println(String.format("[%d]\t%s", index, mnm));
                    System.out.println("-------------------------------------------------------------");
                    index++;
                }
            } else {
                System.out.println(" TIDAK ADA DATA! ");
            }

            if (!isEditing) {
                kembali();
            }
        } else if (pilih.equals("3")) {
            if (snack.size() > 0) {
                System.out.println("DAFTAR SNACK CAFE");
                System.out.println("===================");
                int index = 0;
                for (String snk : snack) {
                    System.out.println(String.format("[%d]\t%s", index, snk));
                    System.out.println("-------------------------------------------------------------");
                    index++;
                }
            } else {
                System.out.println(" TIDAK ADA DATA! ");
            }

            if (!isEditing) {
                kembali();
            }
        } else if (pilih.equals("0")) {
            kembali();
        } else {
            System.out.println("KAMU SALAH PILIH MENU");
            kembali();
        }
    }

    static void tambahMenu() {
        clearScreen();
        System.out.println("<=== TAMBAH MENU CAFE ===>");
        System.out.println("[1] Makanan");
        System.out.println("[2] Minuman");
        System.out.println("[3] Snack");
        System.out.println("[0] Kembali");
        System.out.println("==========================");
        System.out.print(" Pilih [0/1/2/3] : ");

        String pilih = input.nextLine();

        if (pilih.equals("1")) {
            System.out.print("\nMasukkan Makanan : ");
            String mkn = input.nextLine();
            makanan.add(mkn);
            isEditing = false;
            kembali();
        } else if (pilih.equals("2")) {
            System.out.print("\nMasukkan Minuman : ");
            String mnm = input.nextLine();
            minuman.add(mnm);
            isEditing = false;
            kembali();
        } else if (pilih.equals("3")) {
            System.out.print("\nMasukkan Snack   : ");
            String snk = input.nextLine();
            snack.add(snk);
            isEditing = false;
            kembali();
        } else if (pilih.equals("0")) {
            kembali();
        } else {
            System.out.println("KAMU SALAH PILIH MENU");
            kembali();
        }
    }

    static void editMenu() {
        isEditing = true;
        tampilMenu();

        System.out.println("<=== EDIT MENU CAFE ===>");
        System.out.println("[1] Makanan");
        System.out.println("[2] Minuman");
        System.out.println("[3] Snack");
        System.out.println("[0] Kembali");
        System.out.println("==========================");
        System.out.print(" Pilih [0/1/2/3] : ");

        String pilih = input.nextLine();
        if (pilih.equals("1")) {
            try {
                System.out.println("-----------------");
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
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            isEditing = false;
            kembali();
        } else if (pilih.equals("2")) {
            try {
                System.out.println("-----------------");
                System.out.print("Pilih Indeks -> ");
                int index = Integer.parseInt(input.nextLine());

                if (index > minuman.size()) {
                    throw new IndexOutOfBoundsException("Data anda salah !");
                } else {

                    System.out.print("Data makananminuman baru: ");
                    String newmnm = input.nextLine();

                    // update data
                    minuman.set(index, newmnm);

                    System.out.println(minuman.toString());
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            isEditing = false;
            kembali();
        } else if (pilih.equals("3")) {
            try {
                System.out.println("-----------------");
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
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            isEditing = false;
            kembali();
        } else if (pilih.equals("0")) {
            kembali();
        } else {
            System.out.println("KAMU SALAH PILIH MENU");
            kembali();
        }
    }

    static void hapusMenu() {
        isEditing = true;
        tampilMenu();

        System.out.println("<=== HAPUS MENU CAFE ===>");
        System.out.println("[1] Makanan");
        System.out.println("[2] Minuman");
        System.out.println("[3] Snack");
        System.out.println("[0] Kembali");
        System.out.println("==========================");
        System.out.print(" Pilih [0/1/2/3] : ");

        String pilih = input.nextLine();
        if (pilih.equals("1")) {
            System.out.println("-----------------");
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
            kembali();
        } else if (pilih.equals("2")) {
            System.out.println("-----------------");
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
            kembali();
        } else if (pilih.equals("3")) {
            System.out.println("-----------------");
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
            kembali();
        } else if (pilih.equals("0")) {
            kembali();
        } else {
            System.out.println("KAMU SALAH PILIH MENU");
            kembali();
        }
    }

}
