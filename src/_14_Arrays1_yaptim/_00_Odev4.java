package _14_Arrays1_yaptim;

public class _00_Odev4 {
    public static void main(String[] args) {
        //4-int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        //Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
        // anlamadııımmmm !!!!!!!!!!!!!! sortla çözmek kolay
        int dizi[] ={15,25,22,18,30};
        int enbuyuk=15;
        int ikinci=0;
        for(int i=1;i<dizi.length;i++){
            if(dizi[i]>enbuyuk) {
                ikinci=enbuyuk;
                enbuyuk=dizi[i];}
            else
                if(dizi[i]>ikinci){
                ikinci = dizi[i];
            }
        }
        System.out.println("İkinci büyük sayı: " +ikinci);
    }
}
