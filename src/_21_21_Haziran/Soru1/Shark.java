package _21_21_Haziran.Soru1;

public class Shark extends Animal implements ISailing {
    public Shark(String cins) {
        super(cins);
    }

    @Override
    public String food() {

        return "Büyük balık";
    }
}
