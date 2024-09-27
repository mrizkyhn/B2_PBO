package posttest6;

import java.util.ArrayList;

public interface Account {
    void register(String nama_user, String email_user, String nomor_telepon_user, String username, String password);
    boolean login(String username, String password);
}
