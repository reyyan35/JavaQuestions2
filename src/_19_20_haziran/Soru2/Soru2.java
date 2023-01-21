package _19_20_haziran.Soru2;

public class Soru2 {
    public static void main(String[] args) {
        Employees calisan1=new Employees();
        calisan1.setName("Fernando");
        calisan1.setSalary(8000);
        calisan1.setDob("11/23/2000");
        int calisan1yas= calisan1.ageCalculator(2022);
        System.out.println("calisan1yas = " + calisan1yas);
    }

}
