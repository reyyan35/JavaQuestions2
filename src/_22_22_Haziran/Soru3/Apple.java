package _22_22_Haziran.Soru3;

public class Apple extends Phone{
    @Override
    void options(String s1,String s2) {
        if (s1.equals("64 GB ve 5.5 inch")) cart.add("750$");
        if (s1.equals("64 GB ve 6.5 inch")) cart.add("850$");
        if (s1.equals("128 GB ve 5.5 inch")) cart.add("950$");
        if (s1.equals("128 GB ve 6.5 inch")) cart.add("1200$");
    }
}
