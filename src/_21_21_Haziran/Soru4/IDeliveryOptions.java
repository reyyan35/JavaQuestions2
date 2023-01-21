package _21_21_Haziran.Soru4;
import java.util.ArrayList;
public interface IDeliveryOptions {
    int getTheTotal(ArrayList<String> total);
    String isFreeShipping(ArrayList<String> durum);
    int AmazonMinFreeDelivery = 10000;
    int CostcoMinFreeDelivery =  15000;}
