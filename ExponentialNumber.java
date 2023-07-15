package patika_soru_cevaplari.com;
import java.util.*;
public class ExponentialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.

        int taban,us;
        System.out.println("Üslü sayının tabanını giriniz  :");
        taban = scanner.nextInt();
        System.out.println("\nÜslü sayının üssünü giriniz :");
        us = scanner.nextInt();
        int etkisizEleman = 1;
        for(int i = 1;i<=us;i++){
           etkisizEleman*=taban;
        }
        System.out.println(taban + " ^ " + us  + "  : " + etkisizEleman);
    }
}
