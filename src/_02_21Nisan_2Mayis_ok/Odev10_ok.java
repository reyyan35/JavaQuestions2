package _02_21Nisan_2Mayis_ok;

import java.util.Scanner;

public class Odev10_ok {
    public static void main(String[] args) {
        int tutulanSayi = (int) (Math.random() * 50);
        Scanner oku = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ".tahmin= ");
            int tahmin = oku.nextInt();
            if (i==10){ System.out.println("tahmin hakkınız doldu");
                System.out.println("tutulanSayi = " + tutulanSayi);break;}
            if (tutulanSayi<tahmin) System.out.println("Küçük yazınız");
            else if (tutulanSayi > tahmin) System.out.println("Büyük yazınız");
            else {System.out.println("tebrikler doğru tahmin");break;}}

    }
}
