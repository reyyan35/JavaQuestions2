package _02_21Nisan_2Mayis_ok;

import java.util.Scanner;

public class Odev8_ok {
    public static void main(String[] args) {
        //8- Girilen 10 sayıdan kaçtanesinin birler ve onlar basamağının eşit olduğunu bulunuz.
        Scanner oku=new Scanner(System.in);
        int sayac=0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i+"sayıyı gir= ");
            int sayi= oku.nextInt();
            int birler=sayi%10;
            int onlar=sayi/10%10;
            if (birler==onlar)sayac++;}
        System.out.println("sayac = " + sayac);
    }
}
