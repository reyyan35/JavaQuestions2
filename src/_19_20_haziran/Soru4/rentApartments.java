package _19_20_haziran.Soru4;

public class rentApartments {
    private String name;
    private int roomCount;
    private boolean balconyOrNo;
    private static int rent=0;

    public rentApartments(String name, int roomCount, boolean balconyOrNo) {
        this.name = name;
        this.roomCount = roomCount;
        this.balconyOrNo = balconyOrNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public boolean isBalconyOrNo() {
        return balconyOrNo;
    }

    public void setBalconyOrNo(boolean balconyOrNo) {
        this.balconyOrNo = balconyOrNo;
    }
    public int kira(){

        if (roomCount==0)
            rent=1400;
        if (roomCount==1)
            rent= 1700;
        if (roomCount==2)
            rent=2200;
        if (roomCount==3)
            rent=2700;
        return rent;
    }
    public int balcony(){
        if (balconyOrNo=true)
            rent+=200;
        else rent=rent;
        return rent;
    }
}
