package _17_Set_Methods_Arraylist_27Mayis_6Haziran;
import java.util.ArrayList;
public class odev1_getCount {
    //1-ismi getCount() olan bir method oluşturun.
    //Parametre olarak bir String ArayList  ve  bir tane String
    //Return tipi int olmalı.
    //ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
    //Örneğin;
    //ArrayList = Orange , Kiwi , Peach , Banana , Orange
    //String Orange:
    //Count = 2 olmalı. (Orange 2 kez yazılmış)
    public static void main(String[] args) {
        ArrayList<String> meyveler =new ArrayList<>();
        String grape="Grape";
        meyveler.add("Orange");
        meyveler.add("Kiwi");
        meyveler.add("Peach");
        meyveler.add("Banana");
        meyveler.add("Grape");meyveler.add("Grape");meyveler.add("Grape");
        System.out.println(grape+" "+getCount(meyveler,grape)+" kere yazılmış");}
    public static int getCount(ArrayList<String> liste,String kelime ){
        int count=0;
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i).contains(kelime))count++;}
        return count;}}
