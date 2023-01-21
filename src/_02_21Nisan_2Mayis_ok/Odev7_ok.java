package _02_21Nisan_2Mayis_ok;

import java.util.Scanner;

public class Odev7_ok {
    public static void main(String[] args) {
        //7- Girilen 20 sayıdan yüzler basamağı 5 olan kaç sayı olduğunuz bulunuz.
        Scanner oku=new Scanner(System.in);
        int sayac=0;
        for (int i = 1; i <=20 ; i++) {
            System.out.print(i+".sayıyı gir= ");
            int sayi= oku.nextInt();
            if ((sayi/100)%10==5)sayac++;}
        System.out.println("sayac = " + sayac);
    }
}
