package patika_soru_cevaplari.com;
import java.util.*;

public class KdvTutarHesapla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
         */
        System.out.print("Tutarı giriniz : ");
        int price = scanner.nextInt();
        System.out.println("\n");
        double toplam = 0;
        if(price>0&& price<1000){
            toplam =(price + price*0.18);
        }else if (price>=1000){
            toplam=(price + price*0.8);
        }else{
            System.out.println("Tutarı tekrar giriniz");
        }
        System.out.println("Kdv Tutarı : "  + toplam);

    }
}
