package _21_21_Haziran.Soru4;
import java.util.ArrayList;
public class Costca extends Amazon implements IDeliveryOptions{
    @Override
    public int getTheTotal(ArrayList<String> alisveris) {
        return super.getTheTotal(alisveris);}
    @Override
    public String isFreeShipping(ArrayList<String> alisveris) {
        if (getTheTotal(alisveris)>=CostcoMinFreeDelivery){
            return "KARGO ÜCRETSİZ";}
        else return CostcoMinFreeDelivery-getTheTotal(alisveris)+
                " Tutarında alışveriş yapmalısınız";}}