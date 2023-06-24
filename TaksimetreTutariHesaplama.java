package patika_soru_cevaplari.com;
import java.util.*;

public class TaksimetreTutariHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.

         */

        double km = 2.20 ;
        System.out.print("Kac km gittiğini yazınız : ");
        double kacKm = scanner.nextDouble();
       int acilisUcret = 10;

       double totalTutar = (kacKm*km);
       totalTutar = (totalTutar<20)?20:totalTutar;
        System.out.println("Toplam Tutar : " + totalTutar);

    }
}
