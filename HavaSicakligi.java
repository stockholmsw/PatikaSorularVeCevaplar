package patika_soru_cevaplari.com;
import java.util.*;

public class HavaSicakligi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
Koşullar :
Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
         */

        int sicaklikDegeri;
        System.out.print("Sıcaklık değerini giriniz : ");
        sicaklikDegeri = scanner.nextInt();

        if(sicaklikDegeri<5){
            System.out.println("Kayak yapmanızı öneririz.");
        }else if(sicaklikDegeri<15){
            System.out.println("Sinema yapmanızı öneririz");
        }else if(sicaklikDegeri<25){
            System.out.println("Piknik yapmanızı öneririz.");
        }else{
            System.out.println("Yüzmenizi öneririz");
        }
    }
}
