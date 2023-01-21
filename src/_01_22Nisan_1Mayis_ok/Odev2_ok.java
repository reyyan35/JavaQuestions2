package _01_22Nisan_1Mayis_ok;

import java.util.Scanner;

public class Odev2_ok {
    //2- Girilen 3 basamaklı bir sayının tersi olan sayıyı bulunuz.
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("3 basamaklı sayı giriniz= ");
        int num=scan.nextInt();
        int reserveNum=(num%10*100)+(((num/10)%10)*10)+(num/100);
        System.out.println("reserveNum = " + reserveNum);
    }
}
