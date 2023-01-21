package _22_22_Haziran.Soru3;

import java.util.ArrayList;

public abstract class Phone {
    static ArrayList<String > cart=new ArrayList<>();
    int getSum(ArrayList<String> liste){
        int toplam=0;
        int harcama=0;
        for (String h:cart) {
                harcama = Integer.parseInt(h.replaceAll("[^0-9]+", ""));
        toplam=toplam+harcama;}
                return toplam;}

    abstract void options(String s1, String s2);

        }