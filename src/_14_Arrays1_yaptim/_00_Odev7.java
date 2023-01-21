package _14_Arrays1_yaptim;

public class _00_Odev7 {
    //8-int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
    //Array'in ortalamasını alınız.
    public static void main(String[] args) {
        int [] d1={12,14,21,23,10,4};
        int ortalama=0;
        int toplam=0;
        for (int i = 0; i < d1.length; i++) {
            toplam=toplam+d1[i];}
        ortalama=toplam/ d1.length;
        System.out.println("ortalama = " + ortalama);}}
