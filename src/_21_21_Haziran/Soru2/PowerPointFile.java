package _21_21_Haziran.Soru2;

public class PowerPointFile extends File implements IReadFile{
    public PowerPointFile(String name, int size) {
        super(name, size);
    }

    @Override
    public String open() {
        return "opening.ppt";
    }

    @Override
    public String read() {
        return "reading.ppt";
    }

    @Override
    public String save() {
        return "saving.ppt";
    }

    @Override
    public String close() {
        return "closing.ppt";
    }
}
