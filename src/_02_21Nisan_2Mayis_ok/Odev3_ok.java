package _02_21Nisan_2Mayis_ok;

import java.util.Scanner;

public class Odev3_ok {
    public static void main(String[] args) {
        //3- Girilen bir sayının yüzler ve birler basamağının farkını bulunuz.
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz= ");
        int sayi= oku.nextInt();
        int fark=((sayi/100)%10)-sayi%10;
        System.out.println("fark = " + fark);
    }
}
