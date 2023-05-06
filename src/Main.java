import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Alınan para değerini giriniz:");
        double para = inp.nextInt();

        boolean deger = para <=1000;
        boolean deger2 = para > 1000;

        double KDV_ORANI = (para <=1000) ? 0.18 :0.8;
        double kdvtutari = para * KDV_ORANI;
        double kdvtoplam = para + kdvtutari;
        System.out.println("KDV'siz Fiyatı :" + para);
        System.out.println("KDV Oranı :" + KDV_ORANI);
        System.out.println("KDV Tutarı :" + kdvtutari);
        System.out.println("KDV'li Fiyatı :" + kdvtoplam);


    }

}