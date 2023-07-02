package patika_soru_cevaplari.com;
import java.util.*;

public class HesapMakinesiSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi1, sayi2,secim,tekrar=1;
        System.out.println("Switch case ile hesap makinesi kodu yazılacak");

        System.out.println("Hangi işlemi yapmak istiyorsunuz : \n" +
                "1 - Toplama\n" +
                "2-Çıkarma\n" +
                "3-Çarpma\n" +
                "4-Bölme\n" +
                "5-Üs alma\n"
                 );



        System.out.print("Seçiminizi giriniz  :");
        secim = scanner.nextInt();

        System.out.print("İlk sayıyı giriniz : ");
        sayi1 = scanner.nextInt();
        System.out.print("\nİkinci sayiyi giriniz :" );
        sayi2 = scanner.nextInt();

        switch (secim){
            case 1 :
                System.out.println("Sayıların toplamı  : " + (sayi1+sayi2));
                break;
            case 2:
                System.out.println("Sayıların farkı : " + (sayi1-sayi2));
                break;
            case 3:
                System.out.println("Sayıların carpımı : " + (sayi1*sayi2));
                break;
            case 4:
                if(sayi2==0){
                    System.out.println("Bölen 0 olamaz , böleni  değiştir");
                }else{
                    System.out.println("Bölme işlemi sonucu : " + (sayi1/sayi2));
                }
                break;
            case 5:

                for(int i = 1;i<=sayi2;i++){
                    tekrar*=sayi1;
                }
                System.out.println("Üs alma işleminin sonucu : " + tekrar);
                break;

            default:
                System.out.println("İşlemlerinizi tekrar gözden geçiriniz.");

        }







    }

}
