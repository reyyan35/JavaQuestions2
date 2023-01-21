package _16_Methods_24Mayis_31Mayis;

import java.util.Scanner;

public class odev8 {
    //8-powerOfThree isminde bir method oluşturun.
    //Parametre olarak int
    //Return tipi boolean
    //Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
    public static void main(String[] args) {
        int i=0;
        Scanner oku=new Scanner(System.in);
        System.out.print("sayı gir= ");
        int sayi= oku.nextInt();
        while (sayi<3) {
            sayi=sayi/3;}
    }
}
