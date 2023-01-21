package _20_21Haziran;
import java.util.ArrayList;
import java.util.Collections;
public class OdevMain {
    public static void main(String[] args) {
        Okul okul1=new Okul("Atatürk Lisesi",1000);
        ArrayList<Kisi> kisiler=new ArrayList<>();
        Ogrenci o1=new Ogrenci("Reyyan","İzmir",okul1,Role.OGRENCI,1000);
        Ogrenci o2=new Ogrenci("Ahmet","İzmir",okul1,Role.OGRENCI,1200);
        Calisan c1=new Calisan("Ayşe","izmir",okul1,Role.CALISAN,6000);
        Calisan c2=new Calisan("Mehmet","izmir",okul1,Role.CALISAN,6500);
        Collections.addAll(kisiler,o1,o2,c1,c2);
        for (Kisi k:kisiler){
            System.out.println(k);
            System.out.println();}}}
