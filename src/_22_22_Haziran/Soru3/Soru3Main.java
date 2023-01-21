package _22_22_Haziran.Soru3;

import java.util.Scanner;

public class Soru3Main {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("apple 1 özelliğini giriniz");
        String s1= oku.nextLine();
        System.out.println("apple 2 özelliğini giriniz");
        String s2= oku.nextLine();
        Apple a1=new Apple();

        a1.options(s1,s2);
        System.out.println("samsung 1 özelliğini giriniz");
        String s3= oku.nextLine();
        System.out.println("samsung 2 özelliğini giriniz");
        String s4= oku.nextLine();
        Samsung sa1=new Samsung();
        sa1.options(s3,s4);

    }
}
