package _17_Set_Methods_Arraylist_27Mayis_6Haziran;

import java.util.ArrayList;

public class odev6 {
    //6-hillNum() isminde bir method oluşturun.
    //Parametre olarak Integer ArrayList
    //Return tipi int,
    //Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    //Örneğin;
    //ArrayList  5,4,6,2,1
    //2, 6'dan küçük ve 1 den büyüktür.
    //Return 2 olmalı.
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(4);
        num.add(6);
        num.add(2);
        num.add(1);
        System.out.println("num = " + num);
        int requestedNum = hillNum(num);
        System.out.println("requestedNum = " + requestedNum);

    }

    public static int hillNum(ArrayList<Integer> liste) {
        int istenen=0;

        return istenen ;
    }}
