package _17_Set_Methods_Arraylist_27Mayis_6Haziran;
import java.util.ArrayList;
public class odev2_getSum {
    //2-getSum() isminde bir method oluşturun.
    //Parametresi ArrayList olmalı
    //Return tipi int olmalı.
    //ArrayList teki tüm sayıları birbiri ile toplayın.
    //return olarak toplam sonucu döndürün.
    //Örneğin;
    //Arraylist = 1,2,3,4,5
    //return 15 olmalı
    public static void main(String[] args) {
        ArrayList<Integer> sayilar=new ArrayList<>();
        sayilar.add(12);
        sayilar.add(14);
        sayilar.add(45);
        int toplam=getSum(sayilar);
        System.out.println("toplam = " + toplam);}
    public static int getSum(ArrayList<Integer> sayi){
        int sum=0;
        for (int i = 0; i <sayi.size(); i++)
            sum=sum+ sayi.get(i);
    return sum;}}
