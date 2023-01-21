package _15_H_Hoca_odev_1;

import java.util.Scanner;

public class _03_ {
    //3- Girilen bir string de kaç tane b harfi olduğunu yazdırınız.
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir string giriniz= ");
        String s1= oku.nextLine();
        int ilk=s1.length();
        String s2=s1.toLowerCase().replace("b","");
        int son=s2.length();
        System.out.println("b sayısı = " +(ilk-son));
    }
}
