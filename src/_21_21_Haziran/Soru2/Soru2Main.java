package _21_21_Haziran.Soru2;
import java.util.ArrayList;
import java.util.Collections;
public class Soru2Main {
    public static void main(String[] args) {
        DMGFile d1=new DMGFile("dmg",120);
        EXEFile e1=new EXEFile("exe",210);
        PowerPointFile p1=new PowerPointFile("ppt",200);
        TxtFile t1=new TxtFile("txt",110);

        ArrayList<File> dosyalar=new ArrayList<>();
        Collections.addAll(dosyalar,d1,e1,p1,t1);

        for (File d:dosyalar) {
            System.out.println(d.getClass().getSimpleName());
            if (d instanceof DMGFile){
                System.out.println(((DMGFile) d).open());
                System.out.println(((DMGFile) d).read());
                System.out.println(((DMGFile) d).save());
                System.out.println(((DMGFile) d).close());}
            if (d instanceof EXEFile){
                System.out.println(((EXEFile) d).open());
                System.out.println(((EXEFile) d).read());
                System.out.println(((EXEFile) d).save());
                System.out.println(((EXEFile) d).close());}
            if (d instanceof PowerPointFile){
                System.out.println(((PowerPointFile) d).open());
                System.out.println(((PowerPointFile) d).read());
                System.out.println(((PowerPointFile) d).save());
                System.out.println(((PowerPointFile) d).close());}
            if (d instanceof TxtFile){
                System.out.println(((TxtFile) d).open());
                System.out.println(((TxtFile) d).read());
                System.out.println(((TxtFile) d).save());
                System.out.println(((TxtFile) d).close());}
            System.out.println("-*-*-*-*-*-*-*-*-*");}}}
