package _17_Set_Methods_Arraylist_27Mayis_6Haziran;
import java.util.HashSet;
public class odev11_hashset {
    //11-totalCount() isminde bir method oluşturun.
    //Parametresi  'Integer Hashset' olmalı
    //HashSetteki eleman sayısını alın.
    //totalCount'u döndürün.
    //_**Örnek:**_
    //hashset ; 4,2,3,1,7
    //cevap: 5
    public static void main(String[] args) {
        HashSet<Integer> nums=new HashSet<>();
        nums.add(4); nums.add(2);nums.add(3);nums.add(1);nums.add(7);
        int kacTane=totalCount(nums);
        System.out.println("kacTane = " + kacTane);
    }
    public static int totalCount(HashSet<Integer> s1){
        int count=0;
        count=s1.size();
    return count;}
}
