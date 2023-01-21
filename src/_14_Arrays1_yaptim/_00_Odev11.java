package _14_Arrays1_yaptim;
import java.util.Scanner;
public class _00_Odev11 {
    //12- Kullanıcıdan alacağınız 5 ayrı kelimeyi bir diziye atayınız,
    // Kelimelerden en uzun olanının ilk ve son harfini yer değiştiriniz.
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        String  [] dizi=new String[5];
        String enuzun="";
        for (int i=0;i< dizi.length;i++){
            System.out.print((i+1)+".kelime= ");
            dizi[i]= oku.nextLine();
            if (dizi[i].length()>enuzun.length())
                enuzun=dizi[i];}
        System.out.println("enuzun = " + enuzun);
        String ilkharf=enuzun.substring(0,1);
        String sonharf=enuzun.substring(enuzun.length()-1,enuzun.length());
        String diger=enuzun.substring(1,enuzun.length()-1);
        System.out.println(sonharf+diger+ilkharf);}}
