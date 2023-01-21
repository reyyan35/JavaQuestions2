package _22_22_Haziran.Soru2;

import java.util.Scanner;

public class Soru2Main {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı 1= ");
        int s1= oku.nextInt();
        System.out.print("Sayı 2= ");
        int s2= oku.nextInt();
            Sum sum=new Sum();
        System.out.println("s1+s2 = "+sum.calculating(s1,s2));
            Divide divide=new Divide();
        System.out.println("s1/s2 = "+divide.calculating(s1,s2));
            Multiply multiply=new Multiply();
        System.out.println("s1*s2 = "+multiply.calculating(s1,s2));
            Substract substract=new Substract();
        System.out.println("s1-s2 = "+substract.calculating(s1,s2));}}