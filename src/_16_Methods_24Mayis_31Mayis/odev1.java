package _16_Methods_24Mayis_31Mayis;

public class odev1 {
    public static void main(String[] args) {
        // 1-Ismi **randomNum** olan bir method oluşturun.
        // Parametre olarak **int max** almalı.
        // Bu method, 0 ile max arasında random bir değer döndürmelidir.
        // Random numarayı döndürünüz.
        int random=randomNum(5);
        System.out.println("random = " + random);}
    public static int randomNum(int max){
        return (int)(Math.random()*max);}}
