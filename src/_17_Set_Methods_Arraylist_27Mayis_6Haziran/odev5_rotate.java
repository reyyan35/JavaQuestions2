package _17_Set_Methods_Arraylist_27Mayis_6Haziran;
import java.util.ArrayList;
import java.util.Collections;
public class odev5_rotate {
    //5-rotateList() isminde bir method oluşturun.
    //Parametre olarak String ArrayList
    //ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
    //Tersten yazılmış halini return edin.
    //Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
    //cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
    public static void main(String[] args) {
        ArrayList<String> cities=new ArrayList<>();
        cities.add("İzmir");
        cities.add("İstanbul");
        cities.add("Balıkesir");
        cities.add("Denizli");
        cities.add("Manisa");
        System.out.println("cities = " + cities);
        ArrayList<String> ters=new ArrayList<>();
        ters=rotateList(cities);
        System.out.println("ters = " + ters);}
    public static ArrayList<String> rotateList(ArrayList<String> liste){
        ArrayList<String> istenen=new ArrayList<>();
        Collections.reverse(liste);
        istenen=liste;
    return istenen; }}
