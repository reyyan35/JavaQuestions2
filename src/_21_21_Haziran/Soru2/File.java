package _21_21_Haziran.Soru2;

public class File {
    String name;
    int size;

    public File(String name, int size) {
        setName(name);
        setSize(size);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
