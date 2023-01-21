package _17_Set_Methods_Arraylist_27Mayis_6Haziran;
import java.util.ArrayList;
public class odev7_common {
    //7-common_values() isminde bir method oluşturun.
    //Parametre olarak 2 tane Integer ArrayList
    //Return tipi integer ArrayList olmalı
    // İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
    //**Örneğin;**
    //ArrayList 1:    3 , 2 , 5 , 6
    //ArrayList 2:     5 , 8 , 9
    //return  5 olmalı
    //**Örneğin;**
    //ArrayList 1: 8,7,9,6,7
    //ArrayList 2: 6,7,12,3,1
    //return 6 ve 7 olmalı
    public static void main(String[] args) {
        ArrayList<Integer> sayilar1=new ArrayList<>();
        ArrayList<Integer> sayilar2= new ArrayList<>();
        sayilar1.add(3);sayilar1.add(2);sayilar1.add(5);sayilar1.add(6);
        sayilar2.add(5);sayilar2.add(8);sayilar2.add(9);
        ArrayList<Integer> ortak=new ArrayList<>();
        ortak=common_values(sayilar1,sayilar2);
        System.out.println("ortak = " + ortak);}
    public static ArrayList<Integer> common_values(ArrayList<Integer> liste1,ArrayList<Integer> liste2){
        ArrayList<Integer> common=new ArrayList<>();
        common.addAll(liste1);
        common.retainAll(liste2);
        return common; }
}
