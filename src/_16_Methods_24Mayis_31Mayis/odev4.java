package _16_Methods_24Mayis_31Mayis;

import java.util.Arrays;

import static java.lang.System.*;

public class odev4 {
    //4-adı  reverseWord olan bir method oluşturun
    //Bu methodun String olarak bir parametresi olmalıdır
    //Ve bu cümledeki kelimelerle tersine çevirmeli
    //Ters halini yazdırın.
    //Örnek 1 :
    //Dize: Java yazın
    //dönüş şöyle olmalıdır:  yazın Java
    //Örnek 2:
    //Dize: Sakin olun ve evde kalın
    //dönüş olmalı: kalın evde ve olun sakin
    public static void main(String[] args) {
        String[] dizi=reverseWord("Bir cümle gir");
        out.println(Arrays.toString(dizi));

    }
    public static String[] reverseWord(String cumle){

        String[] kelimeler=cumle.split(" ");
        String[] terscumle=new String[kelimeler.length];
        int tersIndex=0;
        for (int i = (kelimeler.length-1); i >=0 ; i--) {
            terscumle[tersIndex]=kelimeler[i];
            tersIndex++;}

        return terscumle; }
}
