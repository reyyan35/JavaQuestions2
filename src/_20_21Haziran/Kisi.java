package _20_21Haziran;
public class Kisi {
    private String isim;
    private String adres;
    private Okul okul;
    private Role role;
    public Kisi(String isim, String adres,
                Okul okul, Role role) {
        this.isim = isim;
        this.adres = adres;
        this.okul = okul;
        this.role = role;}
    @Override
    public String toString() {
        return "isim= "+isim+"\n"+
                "adres= "+adres+"\n"+
                "okul= "+okul+"\n"+
                "role= "+role;}}