package _18_H_Hoca_odev_2.Part_1_;

import java.util.Scanner;

public class User {
    private int ID;
    private String username;
    private String password;
    private boolean active;
    private boolean signedIn;
    private userRole role;
    static int idsayac=1;

    public User(String username, String password, boolean active, boolean signedIn, userRole role) {
        setID(idsayac++);
        setUsername(username);
        setPassword(password);
        setActive(active);
        setSignedIn(signedIn);
        setRole(role);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length()<6){
            System.out.println("Geçersiz password, yeniden giriniz");
            Scanner oku=new Scanner(System.in);
            System.out.print("6 HANEDEN UZUN ŞİFRE GİRİNİZ= ");
            String passwordnew=oku.nextLine();
            this.password=passwordnew;
        }
        else this.password = password;


    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedIn() {
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

    public userRole getRole() {
        return role;
    }

    public void setRole(userRole role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "ID=" + ID +
                ", username=" + username  +
                ", password=" + password  +
                ", active=" + active +
                ", signedIn=" + signedIn +
                ", role=" + role+'\n';
    }
}

