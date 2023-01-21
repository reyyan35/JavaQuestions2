package _02_21Nisan_2Mayis_ok;

import java.util.Scanner;

public class Odev1_ok {
    public static void main(String[] args) {
        //1- Girilen bir sayının yüzler basamağını bulunuz.
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz= ");
        int sayi= oku.nextInt();
        int sayiYuzler=(sayi/100)%10;
        System.out.println("sayiYuzler = " + sayiYuzler);
    }
}
