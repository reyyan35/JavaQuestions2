package _21_21_Haziran.Soru2;

public class DMGFile extends File implements IReadFile{
    public DMGFile(String name, int size) {
        super(name, size);
    }

    @Override
    public String open() {
        return "opening.dmg";
    }

    @Override
    public String read() {
        return "readig.dmg";
    }

    @Override
    public String save() {
        return "saving.dmg";
    }

    @Override
    public String close() {
        return "closing.dmg";
    }
}
