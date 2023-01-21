package _21_21_Haziran.Soru1;
import java.util.ArrayList;
import java.util.Collections;
public class soru1Main {
    public static void main(String[] args) {
        Cat kedi=new Cat("Tekir");
        Duck ordek=new Duck("Pekin");
        Shark kopbal=new Shark("Çekiç");
        Swallow kirlangic=new Swallow("Kaya");

        ArrayList<Animal> hayvanlar=new ArrayList<>();
        Collections.addAll(hayvanlar,kedi,ordek,kopbal,kirlangic);

        for (Animal a: hayvanlar){
            if (a instanceof Swallow)
                System.out.println("Kırlangıçlar "+((Swallow) a).food()+ " ile beslenir.");
            if (a instanceof Cat)
                System.out.println("Kediler "+((Cat) a).food()+ " ile beslenir.");
            if (a instanceof Shark)
                System.out.println("Köpek balıkları "+((Shark) a).food()+ " ile beslenir.");
            if (a instanceof Duck)
                System.out.println("Ördekler "+((Duck) a).food()+ " ile beslenir.");
            System.out.println("-*-*-*-*-*-*-");
        }
    }
}
