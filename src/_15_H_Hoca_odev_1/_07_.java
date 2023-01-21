package _15_H_Hoca_odev_1;

import java.util.Scanner;

public class _07_ {
    //7- Girilen pozitif bir sayının tam kare olup olmadığını bulunuz, tam kare ise true değilse false
    //yazdırınız.
    //Not: sqrt gibi fonksiyonları kullanmayın.
    //Example 1:
    //Input: 16
    //Output: true
    //Not: bu sayı tam kare çünkü 4*4 = 16
    //Example 2:
    //Input: 14
    //Output: false (14 tam kare degil)
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayı giriniz= ");
        int sayi = oku.nextInt();
        boolean kareMi=true;
        for (int i = 1; i < (sayi / 2); i++) {
            if (sayi == i * i) {
                System.out.println(kareMi);break;}
            else kareMi=false;
            System.out.println("kareMi = " + kareMi);}
    }
}
