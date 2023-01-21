package _15_H_Hoca_odev_1;

import java.util.Scanner;

public class _05_ {
    //5- Girilen bir sayının faktöriyel değerini bulmak için bir program yazın.
    //number:6
    //factorial:1*2*3*4*5*6=720
    //output ---> 720
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı gir= ");
        int sayi= oku.nextInt();
        int carpim=1;
        for (int i = 1; i <= sayi; i++) {
            carpim=i*carpim;}
        System.out.println(sayi+"!= " + carpim);
    }
}
