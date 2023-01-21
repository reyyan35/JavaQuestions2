package _22_22_Haziran.Soru3;

public class Samsung extends Phone{
    @Override
    void options(String s1, String s2) {
        if (s1.equals("256 GB ve 5.5 inch")) cart.add("1000$");
        if (s1.equals("256 GB ve 7.5 inch")) cart.add("1200$");
        if (s1.equals("512 GB ve 5.5 inch")) cart.add("1300$");
        if (s1.equals("512 GB ve 6.5 inch")) cart.add("1400$");
    }
}
