package _15_H_Hoca_odev_1;

import java.util.Scanner;

public class _06_ {
    //6- İçinde negatif de olabilen sayının ve para sembolünün olduğu aşağıdaki gibi 3 tane String
    //okutunuz
    //okunan bu 3 string içindeki negatif de olabilen sayıları toplayın.
    //Toplam pozitif ise toplamı yazdırın, eğer toplam negatif ise sadece -1 yazdırın.
    //Ornek:
    //String num1 = "$15";//String num2 = "$20";//String num3 = "$30";
    // output ----> 65; olmali
    //String num1 = "$15";//String num2 = "$-80";//String num3 = "$30";
    // output ----> -1; olmali
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int toplam=0;
        for (int i = 0; i < 3; i++) {
            System.out.print("para miktarını giriniz= ");
            String para= oku.nextLine();
            para=para.replace("$","");
            int para1=Integer.parseInt(para);
            toplam=toplam+para1;}
        if (toplam>=0){
            System.out.println("toplam miktar= "+ toplam);}
        else System.out.println(-1);
    }
}
