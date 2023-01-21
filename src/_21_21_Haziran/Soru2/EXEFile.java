package _21_21_Haziran.Soru2;

public class EXEFile extends File implements IReadFile{
    public EXEFile(String name, int size) {
        super(name, size);
    }

    @Override
    public String open() {
        return "opening.exe";
    }

    @Override
    public String read() {
        return "reading.exe";
    }

    @Override
    public String save() {
        return "saving.exe";
    }

    @Override
    public String close() {
        return "closing.exe";
    }
}
