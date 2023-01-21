package _14_Arrays1_yaptim;

public class _00_Odev5 {
    //5-int Array oluşturun ve elemanları : 5,6,8,12,14,19
    //Eğer sayı çiftse topla, tekse çıkar.
    //**Örneğin:**
    // **-5 + 6 + 8 + 12 + 14 - 19 = 16**
    //Toplamlarını yazdırın.
    public static void main(String[] args) {
        int negatiftoplam = 0;
        int pozitiftoplam = 0;
        int toplam;
        int[] dizi = {5, 6, 8, 12, 14, 19};
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 != 0) {
                int inegatif = dizi[i] * (-1);
                dizi[i] = inegatif;
                negatiftoplam = negatiftoplam + dizi[i];
            } else {
                int ipozitif = dizi[i];
                pozitiftoplam = pozitiftoplam + ipozitif;}}
        System.out.println("toplam = " +
                (toplam = pozitiftoplam + negatiftoplam));}}
