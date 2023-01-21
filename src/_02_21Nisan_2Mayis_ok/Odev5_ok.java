package _02_21Nisan_2Mayis_ok;

import java.util.Scanner;

public class Odev5_ok {
    public static void main(String[] args) {
        //5- Girilen 10 sayının sadece yüzler basamaklarının toplamını bulunuz.
        Scanner oku=new Scanner(System.in);
        int toplam=0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i+".sayıyı gir= ");
            int sayi=oku.nextInt();
            int yuzler= (sayi/100)%10;
            toplam=toplam+yuzler;}
        System.out.println("toplam = " + toplam);
    }
}
