package _02_21Nisan_2Mayis_ok;

import java.util.Scanner;

public class Odev6_ok {
    public static void main(String[] args) {
        //6- Girilen 10 sayıdan kaçtanesinin TEK olduğunuz bulunuz.
        Scanner oku=new Scanner(System.in);
        int sayac=0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i+".sayıyı gir= ");
            int sayi= oku.nextInt();
            if (sayi%2!=0)sayac++;}
        System.out.println("sayac = " + sayac);
    }
}
