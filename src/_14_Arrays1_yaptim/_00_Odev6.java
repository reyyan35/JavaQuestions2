package _14_Arrays1_yaptim;

public class _00_Odev6 {
    //7-Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve
    // int array'inin(ilk oluşturduğunuz array) ilk ve son elementlerini kapsayan yeni array'e return edin.
    // Oluşturacağınız int array'i =   ([1, 2, 3, 4])
    //Sonuç bu şekilde olmalıdır. [1, 4]
    public static void main(String[] args) {
        int [] dizi1={1,2,3,4};
        int [] dizi2={dizi1[0],dizi1[dizi1.length-1]};
        System.out.println("dizi2 = [" + dizi2[0]+", "+dizi2[1]+"]");}}
