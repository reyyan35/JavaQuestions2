package _17_Set_Methods_Arraylist_27Mayis_6Haziran;
import java.util.ArrayList;
import java.util.Collections;
public class odev9_rangeBtw {
    //9-rangeBtw() isminde bir method oluşturun.
    //Parametre olarak   **bir Arraylist**  ve **iki ayrı int**
    //return tipi int
    // Arraylist'in **iki int arasında kaç değeri olduğunu** sayın.
    //return  **count**       (sayacı (count) döndürün.)
    //**Example (Örnek):**
    //ArrayList: 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28
    //min = 20
    //max = 30
    //return =  5    (20,22,25,28,30)
    //min ve max aralığı da  dahil (Örnek1 'deki 20 ve 30 da dahildir.)
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(1);num.add(5);num.add(22);num.add(10);num.add(20);num.add(14);
        num.add(8);num.add(25);num.add(30);num.add(28);
        int kacTane=rangeBtw(num,20,30);
        System.out.println("kacTane = " + kacTane);
        System.out.println("num = " + num);}
    public static int rangeBtw(ArrayList<Integer> liste,int s1,int s2){
        int count=0;
        int s1Index;
        int s2Index;
        Collections.sort(liste);
        s1Index=liste.indexOf(s1);
        s2Index=liste.indexOf(s2);
        count=s2Index-s1Index+1;
    return count;}
}
