package _02_21Nisan_2Mayis_ok;

import java.util.Scanner;

public class Odev9_ok {
    public static void main(String[] args) {
        //9- Girilen 20 sayıdan yüzler basamağı birler basamağından büyük kaç sayı olduğunuz bulunuz.
        Scanner oku=new Scanner(System.in);
        int sayac=0;
        for (int i = 1; i <=20 ; i++) {
            System.out.print(i+".sayıyı giriniz= ");
            int sayi=oku.nextInt();
            if ((sayi/100)%10>sayi%10)sayac++;}
        System.out.println("sayac = " + sayac);
    }
}
