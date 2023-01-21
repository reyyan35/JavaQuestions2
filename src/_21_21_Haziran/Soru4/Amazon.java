package _21_21_Haziran.Soru4;
import java.util.ArrayList;
public class Amazon implements IDeliveryOptions{
    @Override
    public int getTheTotal(ArrayList<String> alisveris) {
        int toplam=0;
        int harcama=0;
        for (String h:alisveris){
            if (h.contains("K")){
                harcama=Integer.parseInt(h.replaceAll("\\D",
                        ""));
                harcama=harcama*1000;}
            else
                harcama=Integer.parseInt(h.replaceAll("\\D",
                        ""));
        toplam+=harcama;}
        return toplam;}
    @Override
    public String isFreeShipping(ArrayList<String> alisveris) {
        if (getTheTotal(alisveris)>=AmazonMinFreeDelivery){
            return "KARGO ÜCRETSİZ";}
        else return AmazonMinFreeDelivery-getTheTotal(alisveris)+" Tutarında alışveriş yapmalısınız";}}
