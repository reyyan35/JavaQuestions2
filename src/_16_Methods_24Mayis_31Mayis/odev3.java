package _16_Methods_24Mayis_31Mayis;

import java.util.Scanner;

public class odev3 {
    //3- reverseString isminde bir method oluşturun.
    //Bu method bir String'i parametre olarak alsın.
    //Ve bu method, girilen String'i tersten yazsın.
    //Terste yazılmış halini yazdırınız.
    //Örn: String = "Java'yı Seviyorum."
    //Print: .muroyiveS ıy'avaJ
    public static void main(String[] args) {

        System.out.println(reverseSting());}
    public static String reverseSting(){
        Scanner oku=new Scanner(System.in);
        System.out.print("cümle gir= ");
        String cumle= oku.nextLine();
        String ters="";
        for (int i = cumle.length()-1; i>=0; i--) {
            ters+=cumle.charAt(i);}
        return ters;}
}
