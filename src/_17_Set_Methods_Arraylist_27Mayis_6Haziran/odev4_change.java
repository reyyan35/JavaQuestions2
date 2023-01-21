package _17_Set_Methods_Arraylist_27Mayis_6Haziran;
import java.util.ArrayList;
import java.util.Collections;
public class odev4_change {
    //4-İsmi changelnArraylist() olan bir method oluşturun.
    //Parametre olarak String ArrayList, String s1, String s2
    //   Arraylist'te s1'i s2 olarak değiştirin
    //Return String arrayList
    //Örneğin;
    //Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
    //s1 = blue
    //s2 = yellow
    //Tüm blue 'ları yellow'a dönüştürün.
    //cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
    public static void main(String[] args) {
        ArrayList<String> renkler=new ArrayList<>();
        renkler.add("sarı");
        renkler.add("mavi");renkler.add("mavi");String mavi="mavi";
        renkler.add("kırmızı");
        renkler.add("yeşil");
        String yesil="yeşil";
        ArrayList<String> mavisiz=new ArrayList<>();
        mavisiz=changelnArrayList(renkler,mavi,yesil);
        System.out.println("mavisiz = " + mavisiz);}
    public static ArrayList<String> changelnArrayList(ArrayList<String> liste, String s1, String s2){
        ArrayList<String> istenen=new ArrayList<>();
        Collections.replaceAll(liste,s1,s2);
        istenen=liste;
    return istenen;}}
