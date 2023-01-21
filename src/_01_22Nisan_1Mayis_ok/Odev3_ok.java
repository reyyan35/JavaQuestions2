package _01_22Nisan_1Mayis_ok;

import java.util.Scanner;

public class Odev3_ok {
    public static void main(String[] args) {
        //3- Girilen 20 sayıdan tek olup da
        // yüzler basamağı 8 den küçük kaç sayı olduğunu bulunuz.
        Scanner oku =new Scanner(System.in);
        int sayac=0;
        for (int i = 1; i <=20 ; i++) {
            System.out.print(i+".sayıyı giriniz= ");
            int sayi= oku.nextInt();
            if (sayi%2!=0 && sayi/100<8){
                sayac++;}}
        System.out.println("sayac = " + sayac);

    }
}
