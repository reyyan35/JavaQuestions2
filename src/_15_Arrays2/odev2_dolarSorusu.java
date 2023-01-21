package _15_Arrays2;

import java.util.Scanner;

public class odev2_dolarSorusu {
    //2-  2x3 lük String bir tablo tanımlayınız, kullanıcıdan $22 veya $65
    // şeklinde para simgesi ve rakam olan değerlerle doldurunuz.
    //     sonrasında bütün RAKAMLARI toplayıp ö toplam para değerini bulunuz.
    // yarım
    public static void main(String[] args) {
        int[][] para = new int[2][3];
        int toplam=0;
        String[][] tablo = new String[2][3];
        Scanner oku = new Scanner(System.in);
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print("Ücret giriniz= ");
                tablo[i][j] = oku.nextLine();}}
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                tablo[i][j]=tablo[i][j].replace("$","");
                para[i][j]=Integer.parseInt(tablo[i][j]);
                toplam=para[i][j]+toplam;}}
        System.out.println("toplam = " + toplam);

}}
