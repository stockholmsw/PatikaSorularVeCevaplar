package patika_soru_cevaplari.com;
import java.util.*;

public class Kontrol {
    public static void main(String[] args) {
        /*
      Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
       girilen değerlerden çift ve 4'ün katları olan
       sayıları toplayıp ekrana basan programı yazıyoruz
         */
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int girilenSayi;

        System.out.println("Sayıları girin (Çıkmak için tek bir sayı girin):");

        while (true) {
            girilenSayi = scanner.nextInt();

            if (girilenSayi % 2 == 0 && girilenSayi % 4 == 0) {
                toplam += girilenSayi;
            }

            if (girilenSayi %2== 1) {
                break;
            }
        }

        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + toplam);
    }

    }

