package _14_Arrays1_yaptim;

public class _00_Odev10 {
    //11-İnt Array oluştur ve elemanları   : 25,30,30,35,100
    //Array in elemanlarının toplamını yazdır.
    //Cevap 220 olmalı.
    public static void main(String[] args) {
        int [] sayilar={25,30,30,35,100};
        int toplam = 0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam= toplam +sayilar[i];}
        System.out.println("toplam = " + toplam);
    }
}
