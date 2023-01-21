package Mentoring._23_Haziran;

public class ornek1Main {
    public static void main(String[] args) {
        Papagan p1=new Papagan();
        System.out.println(p1.getClass().getSimpleName());
        p1.walk();
        p1.eats();
        p1.liveIn();
        p1.name();
        p1.takeCare();
        System.out.println();
        Aslan a1=new Aslan();
        System.out.println(a1.getClass().getSimpleName());
        a1.walk();
        a1.eats();
        a1.liveIn();
        a1.friendToHumans();
        a1.hunts();
        Domestic p2=new Papagan(); // böyle de metodları çağırabiliriz;
        p2.name();
        p2.takeCare();
        p2.liveIn();
        p2.walk();
        Animal a2=new Aslan(); // böyle yaparsak super interfaceyi alırsak sadec ondaki metodlar çalışır
        a2.eats();
        a2.liveIn();
        a2.walk();
        // diğerleri çalışsın diye
        ((Wild)a2).friendToHumans(); // önüne sen wild sın dedik :)

    }
}
