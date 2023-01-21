package _18_H_Hoca_odev_2.Part_2_;

import java.util.Arrays;

public class Soru_1 {
    public static void main(String[] args) {
        int[] dizi={1,2,3,1,2};
        int[] dizi1=new int[3];
        int[] dizi2=new int[2];
        for (int i = 0; i < dizi1.length; i++) {
            dizi1[i]=dizi[i];}
        int dizi2sayac=3;
        for (int i = 0; i < dizi2.length; i++)
            dizi2[i]=dizi[dizi2sayac++];
        for (int i = 0; i < dizi1.length; i++) {
            if (dizi1[i]==dizi2[0])
                if (dizi1[i]==dizi2[1])
                    System.out.println(true);
        }



    }

}
