package patika_soru_cevaplari.com;
import java.util.*;

public class SinifGeçme {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int matematik,fizik,turkce,kimya,muzik;
        System.out.print("MATEMATİK NOTUNUZU GİRİNİZ:");
        matematik = input.nextInt();

        System.out.print("TÜRKÇE NOTUNUZU GİRİNİZ:");
        turkce = input.nextInt();

        System.out.print("KİMYA NOTUNUZU GİRİNİZ:");
        kimya = input.nextInt();

        System.out.print("FİZİK NOTUNUZU GİRİNİZ:");
        fizik = input.nextInt();

        System.out.print("MÜZİK NOTUNUZU GİRİNİZ:");
        muzik = input.nextInt();

        int toplamNot = 0;
        int dersSayisi = 0;
        boolean gecersizNotGirildi = false;

        if (matematik >= 0 && matematik <= 100) {
            toplamNot += matematik;
            dersSayisi++;
        } else {
            gecersizNotGirildi = true;
            System.out.println("Geçersiz Matematik notu girdiniz.");
        }

        if (turkce >= 0 && turkce <= 100) {
            toplamNot += turkce;
            dersSayisi++;
        } else {
            gecersizNotGirildi = true;
            System.out.println("Geçersiz Türkçe notu girdiniz.");
        }

        if (kimya >= 0 && kimya <= 100) {
            toplamNot += kimya;
            dersSayisi++;
        } else {
            gecersizNotGirildi = true;
            System.out.println("Geçersiz Kimya notu girdiniz.");
        }

        if (fizik >= 0 && fizik <= 100) {
            toplamNot += fizik;
            dersSayisi++;
        } else {
            gecersizNotGirildi = true;
            System.out.println("Geçersiz Fizik notu girdiniz.");
        }

        if (muzik >= 0 && muzik <= 100) {
            toplamNot += muzik;
            dersSayisi++;
        } else {
            gecersizNotGirildi = true;
            System.out.println("Geçersiz Müzik notu girdiniz.");
        }

        if (!gecersizNotGirildi) {
            double ortalama = (double) toplamNot / dersSayisi;
            if (ortalama >= 55) {
                System.out.println("Ortalama: " + ortalama + " - Geçti");
            } else {
                System.out.println("Ortalama: " + ortalama + " - Kaldı");
            }
        }
    }
}


