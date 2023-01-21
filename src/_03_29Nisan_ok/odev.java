package _03_29Nisan_ok;

import java.util.Scanner;

public class odev {
    public static void main(String[] args) {
        //1- Bir String oluşturun. Konsol'a isminizi girin.İsminizi yazdırın.
        Scanner okustr=new Scanner(System.in);
        System.out.print("isim gir= ");
        String isim= okustr.nextLine();
        //2- Bir int oluşturun.Konsol'a herhangi bir sayı giriniz.Bu sayıyı yazdırın.
        Scanner okuint=new Scanner(System.in);
        System.out.print("sayı gir= ");
        int sayi=okuint.nextInt();
        //3- Bir String oluşturun.Konsol'a sevdiğiniz bir meyveyi yazın.O meyveyi yazdırınız.
        System.out.print("meyve gir= ");
        String meyve=okustr.nextLine();
        //4- Bir int oluştur.Konsol'a arabanızdaki kapı sayısını girin.Bu int'i yazdırın.
        System.out.print("arabanızın kapı sayısı= ");
        int kapiSayisi=okuint.nextInt();
        //5- Bir String oluştur.Konsol'a 10 sene önceki yaşadığın şehri yazın.Bu String'i yazdırın.
        System.out.print("10 sene önceki yaşadığınız şehir= ");
        String sehir=okustr.nextLine();
        //6- Bir string oluşturunuz.Doğum gününüzü konsola giriniz.String'i yazdırınız.
        System.out.print("doğum günü= ");
        String dgun=okustr.nextLine();
        //7- Bir boolean oluşturunuz.Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
        //   Varsa True , yoksa False olarak  konsoldan cevap veriniz.Boolean'ı yazdırınız.
        Scanner okub=new Scanner(System.in);
        System.out.print("Bir Banka Hesabınız Var mı ?true/false");
        boolean banka=okub.nextBoolean();
        System.out.println("banka = " + banka);
        //8- Bir byte oluşturunuz.Konsola kg cinsinden bir ağırlık yazınız.Byte'ı yazdırınız.
        Scanner okuby=new Scanner(System.in);
        System.out.print("kaç kg sin= ");
        byte kilo=okuby.nextByte();
        System.out.print("kilo = " + kilo);
        //9- Bir float oluşturunuz.Konsola boyunuzu giriniz.Float'ı yazdırınız.
        Scanner okuf=new Scanner(System.in);
        System.out.print("boyunu m olarak gir(or: 1,60)= ");
        float boy=okuf.nextFloat();
        System.out.print("boy = " + boy);

    }






}
