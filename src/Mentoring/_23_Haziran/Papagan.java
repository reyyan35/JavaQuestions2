package Mentoring._23_Haziran;

public class Papagan implements Domestic{
    @Override
    public void liveIn() {
        System.out.println("evde kafeste beslenir");
    }

    @Override
    public void walk() {
        System.out.println("genelde uçar, 2 ayaklıdır çok az yürür");

    }

    @Override
    public void eats() {
        System.out.println("çekirdek ve tahıllar ile beslenir");
    }

    @Override
    public void name() {
        System.out.println("adını genelde 'geveze' koyar ");
    }

    @Override
    public void takeCare() {
        System.out.println("gunluk bakımı önemlidir: kafesi günlük temizlenir, maması yenilenir, ");

    }
}
