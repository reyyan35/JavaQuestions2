package _14_Arrays1_yaptim;

public class _00_Odev2 {
    public static void main(String[] args) {
        //2- int Array oluşturun ve elemanları : 12,2,5,15,8
        //En büyük değeri yazdırınız.
        int dizi[] ={12,2,5,15,8};
        int enbuyuk=2;

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]>enbuyuk){
                enbuyuk=dizi[i];}}
        System.out.println("en buyuk sayı= " + enbuyuk);
    }
}
