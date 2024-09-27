package posttest6;

public abstract class User implements Account {
    private String nama_user;
    private String email_user;
    private String nomor_telepon_user;
    private String username;
    private String password;
    
    // GETTER
    public String getNamaUser() {
        return nama_user;
    }

    public String getEmailUser() {
        return email_user;
    }

    public String getNomorTeleponUser() {
        return nomor_telepon_user;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    
    // SETTER
    public void setNamaUser(String nama_user) {
        this.nama_user = nama_user;
    }

    public void setEmailUser(String email_user) {
        this.email_user = email_user;
    }

    public void setNomorTeleponUser(String nomor_telepon_user) {
        this.nomor_telepon_user = nomor_telepon_user;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
