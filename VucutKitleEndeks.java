package patika_soru_cevaplari.com;
import java.util.*;
public class VucutKitleEndeks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
        Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)
         */
        System.out.println("Vücut kitle indeksinizi hesaplayan kodu yazıcağız şimdi.");
        System.out.println("lÜTFEN BOYUNUZU METRE CİNSİNDEN GİRİNİZ.");
        double boy = scan.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz");
        double kilo = scan.nextDouble();

        double result = kilo/(boy*boy);
        System.out.println("Vücut kitle indeksinizin sonucu : "  +result);
    }
}
