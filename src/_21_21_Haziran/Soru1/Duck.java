package _21_21_Haziran.Soru1;

public class Duck extends Animal implements ISailing,IFlying{
    public Duck(String cins) {
        super(cins);
    }
    @Override
    public String food() {

        return "Yeşillik";
    }
}
