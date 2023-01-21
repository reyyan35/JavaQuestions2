package _15_Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class odev1 {
    //1- 4 elemanlı bir dizi tanımlayınız değerlei kullanıcan alınız.
    // Dizideki en küçük ve enbüyük elemanlar arasındaki farkı bulunuz.
    public static void main(String[] args) {
        int[] dizi = new int[4];
        Scanner oku = new Scanner(System.in);
        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i + 1) + ".Sayıyı gir= ");
            dizi[i] = oku.nextInt();}
        Arrays.sort(dizi);
        int fark=dizi[dizi.length-1]-dizi[0];
        System.out.println("fark = " + fark);
    }

}
