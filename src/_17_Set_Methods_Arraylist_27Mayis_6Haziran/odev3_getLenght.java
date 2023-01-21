package _17_Set_Methods_Arraylist_27Mayis_6Haziran;
import java.util.ArrayList;
public class odev3_getLenght {
    //3-getLength() isminde bir method oluşturun.
    //Parametre olarak String ArrayList
    //Return tipi Integer ArrayList
    //ArrayList içindeki her bir Stringin uzunluğunu bulunuz.
    //Tüm elementlerin uzunluğunu döndürün
    //Örneğin;
    //ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
    //Tüm Stringlerin uzunluklarını yazdırın;
    //cevap: 10 ,  8 , 4 , 7 , 6 olmalı
    public static void main(String[] args) {
        ArrayList<String> cities=new ArrayList<>();
        cities.add("New Jersey");
        cities.add("New York");
        cities.add("Ohio");
        cities.add("Florida");
        cities.add("Boston");
        ArrayList<Integer> uzunluklar=new ArrayList<>();
        uzunluklar=getLenght(cities);
        System.out.println("uzunluklar = " + uzunluklar);}
    public static ArrayList<Integer> getLenght(ArrayList<String> liste){
        ArrayList<Integer> istenen=new ArrayList<>();
        for (int i = 0; i < liste.size(); i++) {
            istenen.add(liste.get(i).length());}
        return istenen;}}