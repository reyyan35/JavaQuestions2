package Mentoring._10_Haziran;

import java.util.ArrayList;

public class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public static void main(String[] args) {
        Holiday holiday1=new Holiday("işçi bayramı",1,"Mayıs");
        Holiday holiday2=new Holiday("Gençlik Bayramı",19,"Mayıs");
        Holiday holiday3=new Holiday("çocuk bayramı",23,"Nisan");
        Holiday holiday4=new Holiday("cumhuriyet",29,"Ekim");

        System.out.println(Holiday.inSameMonth(holiday1,holiday2));
        System.out.println(Holiday.inSameMonth(holiday1,holiday3));
        ArrayList<Integer> days=new ArrayList<>();
        days.add(holiday1.day);
        days.add(holiday2.day);
        days.add(holiday3.day);
        days.add(holiday4.day);
        System.out.println(Holiday.ortalama(days));



    }
    public static boolean inSameMonth(Holiday h1, Holiday h2){
        boolean dogrumU;
        if (h1.month.equalsIgnoreCase(h2.month))
            dogrumU=true;
        else dogrumU=false;
        return dogrumU;
    }
    public static double ortalama(ArrayList<Integer> liste){
        double ort=0;
        int toplam=0;
        for (int i = 0; i < liste.size(); i++) {
            toplam += liste.get(i);
        }
        ort=(Integer)(toplam/liste.size());
        return ort;
    }
}
