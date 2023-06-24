package patika_soru_cevaplari.com;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam , ortalama;

        int matematik,fizik,kimya,turkce,tarih,muzik;
        System.out.print("Matematik notu : ");
        matematik = scanner.nextInt();
        System.out.print("\nFizik notu : ");
        fizik = scanner.nextInt();
        System.out.print("\nKimya notu : ");
        kimya = scanner.nextInt();
        System.out.print("\nTürkçe notu  :");
        turkce = scanner.nextInt();
        System.out.print("\nTarih notu : ");
        tarih = scanner.nextInt();
        System.out.print("\nMüzik notu  :");
        muzik = scanner.nextInt();

        toplam = (matematik+fizik+tarih+turkce+kimya+muzik);
        ortalama =  toplam/6;
        System.out.println("Toplam not : " + toplam);
        System.out.println("Ortalama : "  + ortalama);


        String sonuc = ortalama >60 ? "Sınıfta Kaldı" : " Sınıfta Kaldı ";
        System.out.println("Sonuç : "  + sonuc);



    }
    }

