package patika_soru_cevaplari.com;
import java.util.*;
public class ManavKasa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double armut =  2.14 ;
        double elma = 3.67 ;
        double domates = 1.11;
        double  muz=  0.95 ;
        double patlican =  5.00;

        System.out.println("Manav Kasa programına Hoşgeldiniz , Menümüzü görebilirsiniz");
        double kacKgArmut,kacKgElma,kacKgDomates,kacKgMuz,kacKgPatlican;
        System.out.print("Kac kg Armut almak istersiniz : ");
        kacKgArmut = scan.nextInt();
        System.out.print("Kaç kg Elma Almak istersiniz : ");
        kacKgElma = scan.nextInt();
        System.out.print("Kac kg domates almak istersiniz :");
        kacKgDomates = scan.nextInt();
        System.out.print(" Kac kg muz almak istersiniz  :");
        kacKgMuz = scan.nextInt();
        System.out.print("Kac kg patlıcan almak istersiniz : ");
        kacKgPatlican = scan.nextInt();

        double totalPay = ((kacKgArmut*armut  + kacKgDomates*domates + kacKgElma* elma + kacKgMuz*muz + kacKgPatlican*patlican));

        System.out.println("Manavdan yaptığınız toplam alışveriş tutarı : " + totalPay);












    }


}
