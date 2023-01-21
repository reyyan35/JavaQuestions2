package _17_Set_Methods_Arraylist_27Mayis_6Haziran;
import java.util.HashSet;
public class odev12 {
    //12-changeSet() isminde bir method oluşturun.
    //Parametre olarak bir String HashSet   ve  iki String
    //return hashset olmalı
    //Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.
    //**ÖRNEK:**
    //hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
    //String 1 = **banana**
    //String 2 = **peach**
    //**CEVAP:** "peach" , "strawberry" , "kiwi" , "pineapple"
    public static void main(String[] args) {
        HashSet<String> fruits=new HashSet<>();
        fruits.add("banana");  fruits.add("strawberry"); fruits.add("kiwi"); fruits.add("onion");
        String sebze="onion";
        String meyve="cherry";
        HashSet<String> dogruMeyveler=changeSet(fruits,sebze,meyve);
        System.out.println("dogruMeyveler = " + dogruMeyveler);}
    public static HashSet<String> changeSet(HashSet<String> set1,String s1, String s2){
        HashSet<String> degismis=new HashSet<>();
        set1.remove(s1);
        set1.add(s2);
        degismis=set1;
        return degismis;}}