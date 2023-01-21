package _01_22Nisan_1Mayis_ok;

import java.util.Scanner;

public class Odev1_ok {
    //1- Girilen 2 basamaklı bir sayının tersi olan sayıyı bulunuz.
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("İki basamaklı bir sayı giriniz= ");
        int num=scan.nextInt();
        int numReverse=((num%10)*10)+(num/10);
        System.out.println("numReverse = " + numReverse);

    }
}
