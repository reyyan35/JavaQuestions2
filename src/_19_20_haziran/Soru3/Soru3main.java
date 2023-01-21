package _19_20_haziran.Soru3;

import java.util.Scanner;

public class Soru3main {
    public static void main(String[] args) {
        Subscribe m1=new Subscribe();
        Scanner oku=new Scanner(System.in);
        Scanner okub=new Scanner(System.in);
        System.out.print("what s your name?= ");
        m1.setName(oku.nextLine());

        System.out.print("do You Wanna Subscribe= ");
        m1.setDoYouWannaSubscribe(okub.nextBoolean());
        if (!m1.getDoYouWannaSubscribe())
            System.out.println("See you when you want to be a member. Thanks");
        else
            System.out.print("which Member= ");
        m1.setWhichMember(oku.nextLine());

        System.out.println(m1.getDoYouWannaSubscribe());
        if (m1.getWhichMember().equalsIgnoreCase("gold"))
            System.out.println("Welcome to membership "+ m1.getName() +". Your membership is 40 dollar for month you can enjoy the videos ,\n" +
                    "all homework and see you soon.");
        if (m1.getWhichMember().equalsIgnoreCase("silver"))
            System.out.println("Welcome to membership "+ m1.getName() +".Your membership is 20 dollar for month you can enjoy the videos and all homework");
        if (m1.getWhichMember().equalsIgnoreCase("bronze"))
            System.out.println("Welcome to membership Victoria. Your membership is 10 dollar for month you can enjoy the videos.");
    }
}
