package patika_soru_cevaplari.com;
import java.util.*;

public class ExpoCalculaterCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base=1 ,expo,result= 1;
        while(base!=0){
            System.out.print("Taban değerini giriniz  :  ");
            base = scanner.nextInt();
            System.out.print(" Üs Değerini giriniz : ");
            expo = scanner.nextInt();
            result = 1;
            for(int i = 1;i<=expo;i++){
                result*=base;
            }
            System.out.println("Sonuç : " + result);

        }
    }
}
