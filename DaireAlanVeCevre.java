package patika_soru_cevaplari.com;
import java.util.*;

public class DaireAlanVeCevre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          final double PI = 3.14;
        System.out.print("Yarıçapı  değerini giriniz  :");
        int r = scanner.nextInt();


        double alan = (PI*r*r);
        double cevre = (2*PI*r);
        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin çevresi : " + cevre);


    }

}
