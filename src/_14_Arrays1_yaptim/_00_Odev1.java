package _14_Arrays1_yaptim;

import java.util.Scanner;

public class _00_Odev1 {
    public static void main(String[] args) {
        //1-String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        //Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        //Eğer aitse "true" çevirin.
        String[] dizi = {"Apple", "Orange", "Banana", "Pineapple"};
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir meyve giriniz= ");
        String meyve = oku.nextLine();
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i].equalsIgnoreCase(meyve) == true) {
                System.out.println("TRUE");
                break;
            } else {
                System.out.println("False");
            }
        }
    }
}
