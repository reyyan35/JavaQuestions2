package _21_21_Haziran.Soru1;

public class Cat extends Animal implements IAnimal{
    public Cat(String cins) {
        super(cins);
    }
    @Override
    public String food() {
        return "Mama";
    }
}
