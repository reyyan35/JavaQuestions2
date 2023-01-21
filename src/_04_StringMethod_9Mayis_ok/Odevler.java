package _04_StringMethod_9Mayis_ok;

public class Odevler {

    public static void main(String[] args) {
        //1-**I love java** olan bir String oluşturun.
        // Bu cümlenin toplam karakter sayısını yazdırın.
        String bir="I love java";
        System.out.println("Birinci cümlenin karakter sayısı "+bir.length());

        //2-**Sprint planning** olan bir String oluşturun.
        //Bu dizenin _toplam karakter sayısını_ yazdırın.
        String iki="Sprint planning";
        System.out.println("ikinci cümlenin karakter sayısı = " + iki.length());

        //3-**apple** olan bir String oluşturun.
        //String'in _içinde_ **app** olup olmadığını **doğrula**.
        String uc="apple";
        System.out.println("uc.contains(\"app\") = " + uc.contains("app"));

        //4-**orange** kelimesinden oluşan bir String oluşturun.
        // String'in **Apple**'a _eşit_ olup olmadığını doğrulayın.
        String dort="orange";
        System.out.println("dort.equalsIgnoreCase(uc) = " + dort.equalsIgnoreCase(uc));

        //5-**apple**  olan  bir String oluşturun.
        //String'in **apple**'a _eşit_ olup olmadığını doğrulayın.
        //_Büyük harf veya küçük harf önemli değildir.
        System.out.println("uc apple eşit mi = " + uc.equalsIgnoreCase("apple"));

        //6-**Florida** kelimesinden bir String oluşturun.
        //Florida kelimesinin içindeki, sadece  **'o'**  harfinin bulunduğu indexini yazdırın.
        String bes="Florida";
        System.out.println("bes.indexOf(\"o\") = " + bes.indexOf("o"));

        //7-**Thank you** olan bir String oluşturun.
        //Thank you içindeki, sadece  **'y'** harfinin bulunduğu _konumu_ yazdırın.
        String alti="Thank you";
        System.out.println("alti.indexOf(\"y\") = " + alti.indexOf("y"));

        //8-**Main method** oluşturun.
        //**Mouse** değerinde bir String oluştur.
        //Mouse String'inin 3_. sırasındaki karakteri_ yazdırın.
        String yedi="Mouse";
        System.out.println("yedi.charAt(3) = " + yedi.charAt(3));



}}
