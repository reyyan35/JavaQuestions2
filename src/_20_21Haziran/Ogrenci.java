package _20_21Haziran;
public class Ogrenci extends Kisi{
    private int ucret;
    public Ogrenci(String isim, String adres,
                   Okul okul, Role role,
                   int ucret) {
        super(isim, adres, okul, role);
        this.ucret = ucret;}
    @Override
    public String toString() {
        return super.toString()+
                " ucret= "+ ucret;}}
