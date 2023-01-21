package _17_Set_Methods_Arraylist_27Mayis_6Haziran;
import java.util.ArrayList;
import java.util.HashSet;
public class odev13 {
    //13-commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
    //return tipi arraylist olmalı.
    //**ÖRNEĞİN:**
    //    İlk Hashset : **"Germany"** , "England" , "South Africa" , **"Brazil" , "USA"**
    //     İkinci  hashset  : **"Germany"** , "China" , **"Brazil"** , "France" ,  **"USA"**
    //Ortak değerleri ArrayListe ekleyiniz.
    //çıktı:  "Germany" , "Brazil" ,"USA"
    //ArrayListi yazdırınız.
    public static void main(String[] args) {
        HashSet<String> ulke1=new HashSet<>();
        HashSet<String> ulke2=new HashSet<>();
        ulke1.add("Germany"); ulke1.add("England"); ulke1.add("South Africa");
        ulke1.add("Brazil"); ulke1.add("USA");
        ulke2.add("Germany");  ulke2.add("China"); ulke2.add("Brazil");
        ulke2.add("France"); ulke2.add("USA");
        ArrayList<String> ortakUlke=new ArrayList<>();
        ortakUlke=commonValues(ulke1,ulke2);
        System.out.println("ortakUlke = " + ortakUlke);}
    public static ArrayList<String> commonValues(HashSet<String> set1,HashSet<String> set2){
        ArrayList<String> common =new ArrayList<>();
        for (String A:set1) common.add(A);
        common.retainAll(set2);
    return common;}
}
