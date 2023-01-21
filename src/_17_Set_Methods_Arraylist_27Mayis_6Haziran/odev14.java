package _17_Set_Methods_Arraylist_27Mayis_6Haziran;
import java.util.LinkedHashSet;
public class odev14 {
    //14-removing() isminde bir method oluşturun.
    //Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
    //Eğer Stringler LinkedHashset 'in içinde varsa, sil.
    //Return tipi linkedhashset
    //Örneğin,
    //linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
    //String 1= Germany
    //String 2 = USA
    // **Germany ve USA 'i sil.**
    //**Set'i döndür.**
    public static void main(String[] args) {
        LinkedHashSet<String> ulkeler=new LinkedHashSet<>();
        ulkeler.add("Germany");  ulkeler.add("France");  ulkeler.add("USA");  ulkeler.add("Canada");
        ulkeler.add("Mexico");  ulkeler.add("Brazil");
        String germany="Germany";
        String usa="USA";
        LinkedHashSet<String> yeniUlkeler=new LinkedHashSet<>();
        yeniUlkeler=removing(ulkeler,germany,usa);
        System.out.println("yeniUlkeler = " + yeniUlkeler);}
    public static LinkedHashSet<String> removing(LinkedHashSet<String> set1,String s1, String s2){
        LinkedHashSet<String> istenen=new LinkedHashSet<>();
        set1.remove(s1);set1.remove(s2);
        istenen=set1;
    return istenen;}
}
