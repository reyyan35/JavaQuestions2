package _21_21_Haziran.Soru4;

import java.util.ArrayList;
import java.util.Scanner;

public class Soru4Main {
    public static void main(String[] args) {
        Amazon a1=new Amazon();
        ArrayList<String> Ashop=new ArrayList<>();
        Scanner oku=new Scanner(System.in);
        System.out.println(a1.getClass().getSimpleName());
        for (int i = 0; i < 3; i++) {
            System.out.print("Tutar giriniz= ");
            String tutar= oku.nextLine();
            Ashop.add(tutar);}
        System.out.println();
        System.out.println("toplam harcama= "+a1.getTheTotal(Ashop));
        System.out.println("*-*-*-*");
        System.out.println("kargo ücreti= "+ a1.isFreeShipping(Ashop));
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println();
        Costca c1=new Costca();
        ArrayList<String> Cshop=new ArrayList<>();
        System.out.println(c1.getClass().getSimpleName());
        for (int i = 0; i < 3; i++) {
            System.out.print("Tutar giriniz= ");
            String tutarc= oku.nextLine();
            Cshop.add(tutarc);}
        System.out.println();
        System.out.println("toplam harcama= "+c1.getTheTotal(Cshop));
        System.out.println("*-*-*-*");
        System.out.println("kargo ücreti= "+ c1.isFreeShipping(Cshop));

    }
}
