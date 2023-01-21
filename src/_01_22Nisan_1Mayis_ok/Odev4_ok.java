package _01_22Nisan_1Mayis_ok;

import java.util.Scanner;

public class Odev4_ok {
    public static void main(String[] args) {
        //4- Girilen 20 sayıdan yüzler basamağı en büyük olan sayıyı bulunuz.
        Scanner oku=new Scanner(System.in);
        int enb=0;
        for (int i = 1; i <= 20; i++) {
            System.out.print(i+".sayıyı giriniz= ");
            int sayi= oku.nextInt();
            if (sayi/100>enb/100)
                enb=sayi;}
        System.out.println("yüzler basamağı en büyük sayı= " + enb);
    }
}
