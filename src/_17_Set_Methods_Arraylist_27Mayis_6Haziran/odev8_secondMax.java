package _17_Set_Methods_Arraylist_27Mayis_6Haziran;
import java.util.ArrayList;
import java.util.Collections;
public class odev8_secondMax {
    //8-secondMax()  isminde bir method oluşturun.
    //Parametre olarak integer ArrayList.
    //Return tipi int olmalı.
    //ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
    //**ÖRN;**
    //ArrayList   --  5,3,4,6,7
    //CEVAP : 6
    public static void main(String[] args) {
        ArrayList<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);sayilar.add(3);
        sayilar.add(4);sayilar.add(6);
        sayilar.add(7);
        int ikinciMax=secondMax(sayilar);
        System.out.println("ikinciMax = " + ikinciMax);}
    public static int secondMax(ArrayList<Integer> list){
        int second=0;
        Collections.sort(list);
        Collections.reverse(list);
        second=list.get(1);return second;}
}
