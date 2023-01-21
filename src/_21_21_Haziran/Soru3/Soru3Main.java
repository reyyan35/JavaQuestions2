package _21_21_Haziran.Soru3;
public class Soru3Main {
    public static void main(String[] args) {
        Bicycle b1=new Bicycle(15,2);
        Car c1=new Car(150,3);

        System.out.println("ilk hali");System.out.println();
        System.out.println("bisiklet");
        b1.printAll();System.out.println();

        System.out.println("araba");c1.printAll();
        System.out.println("-------");

        b1.changeGear(3);b1.speedUp(20);
        b1.applyBrakes(10);c1.changeGear(4);
        c1.speedUp(15);c1.applyBrakes(10);
        System.out.println("sonrası");System.out.println();
        System.out.println("bisiklet");
        b1.printAll();System.out.println();
        System.out.println("araba");
        c1.printAll();


    }
}
