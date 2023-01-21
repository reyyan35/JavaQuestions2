package _16_Methods_24Mayis_31Mayis;

import java.util.Scanner;

public class odev2 {//2-"OrtaKelime" isminden bir method oluşturun.
    //Bu method String'i parametre olarak almalı.
    //Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.
    //Ortadaki kelimeyi return yapınız.
    //Örnek: Ben Java'yı seviyorum.
    //print : Java'yı
    //Örnek2:
    //Java'yı kolayca öğreniyorum.
    //print: kolayca
    public static void main(String[] args) {
        OrtaKelime();}
    public static String OrtaKelime(){
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle giriniz= ");
        String cumle= oku.nextLine();
        String[] kelimeler =cumle.split(" ");
        String orta="";
        if (kelimeler.length%2!=0)
        for (int i = 0; i < kelimeler.length; i++) {
            if (i==(kelimeler.length/2)){
                orta=kelimeler[i];
                System.out.println(orta);}}
        return orta;}}
