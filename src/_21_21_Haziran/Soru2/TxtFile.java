package _21_21_Haziran.Soru2;

public class TxtFile extends File implements IReadFile{
    public TxtFile(String name, int size) {
        super(name, size);
    }

    @Override
    public String open() {
        return "opening.txt";
    }

    @Override
    public String read() {
        return "reading.txt";
    }

    @Override
    public String save() {
        return "saving.txt";
    }

    @Override
    public String close() {
        return "closing.txt";
    }
}
