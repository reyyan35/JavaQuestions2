package _21_21_Haziran.Soru1;

public class Swallow extends Animal implements IFlying{
    public Swallow(String cins) {
        super(cins);
    }

    @Override
    public String food() {
        return "Böcük";
    }
}
