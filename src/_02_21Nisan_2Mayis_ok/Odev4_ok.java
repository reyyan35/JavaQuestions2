package _02_21Nisan_2Mayis_ok;

import java.util.Scanner;

public class Odev4_ok {
    public static void main(String[] args) {
        //4- Girilen bir sayının yüzler basamağının tek mi çift mi olduğunuz bulunuz.
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı gir= ");
        int sayi= oku.nextInt();
        int yuzler=(sayi/100)%10;
        if (yuzler%2==1)
            System.out.println("yüzler basamağı tek");
        else System.out.println("yüzler basamağı çift");

    }
}
