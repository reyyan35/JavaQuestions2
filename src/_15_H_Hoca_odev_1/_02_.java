package _15_H_Hoca_odev_1;

import java.util.Scanner;

public class _02_ {
    // 2- Girilen bir sayı çift ise "true" , tek ise "false" yazdırınız.
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz= ");
        int sayi= oku.nextInt();
        if (sayi%2!=0) System.out.println(false);
        else System.out.println(true);
    }
}
