package _19_20_haziran.Soru2;

public class Employees {
    private String name;
    private int salary;
    private String dob;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    public int ageCalculator(int yil){
        int yas=0;
        dob.substring(0,'/');
        dob.substring(0,'/');
        String yils=dob;
        int dyil=Integer.parseInt(yils);
        yas=yil-dyil;



return yas;
    }
}
