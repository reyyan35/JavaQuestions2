package _21_21_Haziran.Soru3;
public class Bicycle implements IVehicle {
    int speed;
    int gear;
    public Bicycle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;}
    @Override
    public int changeGear(int vites) {
        return gear=vites;}
    @Override
    public int speedUp(int hiz) {
        return speed=speed+hiz;}
    @Override
    public int applyBrakes(int fren) {
        return speed=speed-fren;}
    public void printAll(){
        System.out.println("current speed is "+speed+", gear count is "+gear);}}
