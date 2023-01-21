package _02_21Nisan_2Mayis_ok;

import java.util.Scanner;

public class Odev2_ok {
    public static void main(String[] args) {
        //2- Girilen bir sayının Binler basamağını bulunuz.
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz= ");
        int sayi= oku.nextInt();
        int sayiBinler=(sayi/1000)%10;
        System.out.println("sayiBinler = " + sayiBinler);
    }
}
