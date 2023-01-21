package _04_StringMethod_9Mayis_ok;

public class OzelSoru {
    //10 -  3 kelimelik ismi olan kişinin ad , 2.ad ve soyadını A.E.Y. şeklinde yazınız.
    public static void main(String[] args) {
        String fullName="Reyyan Nur Yılmaz";
        char ilk=fullName.charAt(0);
        char iki=fullName.charAt(fullName.indexOf(" ")+1);
        char uc=fullName.charAt(fullName.lastIndexOf(" ")+1);
        System.out.println(ilk+"."+iki+"."+uc+".");

    }
}
