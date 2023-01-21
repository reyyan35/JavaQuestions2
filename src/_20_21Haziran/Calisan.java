package _20_21Haziran;

public class Calisan extends Kisi{
    private int maas;
    public Calisan(String isim, String adres, Okul okul, Role role,int maas) {
        super(isim, adres, okul, role);
        this.maas=maas;}
    @Override
    public String toString() {
        return super.toString()+" maas= "+maas;}}
