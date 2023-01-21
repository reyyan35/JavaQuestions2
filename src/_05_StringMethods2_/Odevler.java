package _05_StringMethods2_;

public class Odevler {
    public static void main(String[] args) {
        //1-**paper** olan bir String oluşturun.
        //String'i _büyük harfe_ çevirin ve yazdırın.
        //örn: apple > APPLE
        String paper="paper";
        System.out.println("paper.toUpperCase() = " + paper.toUpperCase());

        //2-**OraNge** olan bir String oluşturun.
        //String'i _küçük harfe_ çevirin ve yazdırın.
        //örn: APPLE > apple
        String orange="OraNge";
        System.out.println("orange.toLowerCase() = " + orange.toLowerCase());

        //3-**New Jersey** olan bir String oluşturun.
        // String'i _büyük harfe_ çevirin ve yazdırın
        String sehir="New Jersey";
        System.out.println("sehir.toUpperCase() = " + sehir.toUpperCase());

        //4-**New York** olan bir String oluşturun.
        // String'i _küçük harfe_ çevirin ve yazdırın.
        String sehir2="New York";
        System.out.println("sehir2.toLowerCase() = " + sehir2.toLowerCase());

        //5-**PADDLE** olan bir String oluşturun.
        //String'i _küçük harfe_ çevirin ve yazdırın.
        String paddle="PADDLE";
        System.out.println("paddle.toLowerCase() = " + paddle.toLowerCase());

        //6-**apple** olan bir String oluşturun.
        //String'in _içinde_ **app** olup olmadığını **doğrula**.
        String apple="apple";
        System.out.println("apple.equals(\"app\") = " + apple.equals("app"));




    }
}
