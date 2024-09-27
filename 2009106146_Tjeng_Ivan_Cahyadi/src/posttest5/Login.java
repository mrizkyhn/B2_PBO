package posttest5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Login {
    public boolean login(char as) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String username = "", password = "", enter = "";
        for (int i = 0; i < 3; i++) {
            try {
                System.out.print("Masukkan Username: ");
                username = input.readLine();
                System.out.print("Masukkan Password: ");
                password = input.readLine();
            } catch (Exception e){
            }
            System.out.println("\n");
            if (as == 'a') {
                if (username.equals("admin") && password.equals("admin")) {
                    return true;
                }
                System.out.println("Username atau Password salah!");
            } else if (as == 'k') {
                if (username.equals("kasir") && password.equals("kasir")) {
                    return true;
                }
                System.out.println("Username atau Password salah!");
            }
            System.out.println("");
        }
        System.out.println("Batas login tercapai!\n");
        try {
            System.out.print("Tekan enter untuk melanjutkan...");
            enter = input.readLine();
        } catch(Exception e){
        }
        System.out.println("");
        return false;
    }
}
