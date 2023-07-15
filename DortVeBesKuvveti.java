package patika_soru_cevaplari.com;
import java.util.*;
public class DortVeBesKuvveti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Java döngüler ile girilen sayıya kadar olan 4 ve 5'in
        kuvvetlerini ekrana yazdıran programı yazıyoruz.
         */

        // 4 ün kuvvetleri ;
        System.out.println("Bir sayı giriniz : ");
        int sayi = scanner.nextInt();
        for(int i = 4;i<sayi;i*=4){
            System.out.print(i  + " ");
        }
        // 5 in kuvvetleri
        int sayi2;
        System.out.println("\nBi sayı daha giriniz  :");
        sayi2 = scanner.nextInt();
        for(int i = 5;i<sayi2;i*=5){
            System.out.print( i + " ");
        }

    }
}
