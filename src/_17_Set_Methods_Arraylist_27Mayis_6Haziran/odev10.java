package _17_Set_Methods_Arraylist_27Mayis_6Haziran;
import java.util.ArrayList;
public class odev10 {
    //10-Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
    //Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
    //**Örnek:*
    //**Girdi:**
    //[[ 1, 2, 3 ],
    // [ 4, 5, 6 ],
    // [ 7, 8, 9 ]]
    //**Çıktı:** [1,2,3,4,5,6,7,8,9]
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> numList=new ArrayList<>();
        ArrayList<Integer> n1=new ArrayList<>();
        ArrayList<Integer> n2=new ArrayList<>();
        ArrayList<Integer> n3=new ArrayList<>();
        n1.add(1); n1.add(2); n1.add(3);
        n2.add(4); n2.add(5);n2.add(6);
        n3.add(7); n3.add(8); n3.add(9);
        numList.add(n1); numList.add(n2); numList.add(n3);
        System.out.println("numList = " + numList);
        ArrayList<Integer> istenen=new ArrayList<>();
        istenen.addAll(n1);
        istenen.addAll(n2);istenen.addAll(n3);
        System.out.println("istenen = " + istenen);
    }
}
