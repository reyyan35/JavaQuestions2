package Mentoring._23_Haziran;

public class Aslan implements Wild{
    @Override
    public void liveIn() {
        System.out.println("afrika savanalarında yaşar");
    }

    @Override
    public void walk() {
        System.out.println("4 ayak üstünde yürür, koşar");

    }

    @Override
    public void eats() {
        System.out.println("avlandığı bizon, zürafa gibi diğer otobur canlılarla beslenir");

    }

    @Override
    public void hunts() {
        System.out.println("takım olarak avlanır");

    }

    @Override
    public void friendToHumans() {
        System.out.println("insanları sevmez, tehlikelidir");

    }
}
