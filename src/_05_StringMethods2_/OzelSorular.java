package _05_StringMethods2_;

import java.util.Scanner;

public class OzelSorular {
    public static void main(String[] args) {
        //1- Girilen bir cümlede kaç kelime olduğunuz bulunuz
        Scanner oku=new Scanner(System.in);
        System.out.print("bir cümle giriniz= ");
        String cumle=oku.nextLine();
        String cumle2=cumle.replace(" ","");
        System.out.println(cumle.length()-cumle2.length()+1);

        //2- Girilen bir cumledeki kelimeleri ilk harflerini hazdırınız
        


    }
}
