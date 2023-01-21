package _18_H_Hoca_odev_2.Part_1_;

import java.util.ArrayList;

public class UserMain {
    public static void main(String[] args) {
        ArrayList<User> kullanicilar=new ArrayList<>();
        User kullanici1=new User("Reyyan",
                "1234",true,true,userRole.OGRENCI);

        User kullanici2=new User("İsmet",
                "01234875",true,false,userRole.HOCA);
        kullanicilar.add(kullanici1);
        kullanicilar.add(kullanici2);
        System.out.println("kullanicilar = " + kullanicilar);

    }
}
