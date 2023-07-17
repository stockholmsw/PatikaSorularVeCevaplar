package patika_soru_cevaplari.com;
import java.util.*;
public class HarmonicProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int num = scanner.nextInt();
        double  result = 0;

        for(int i = 1;i<=num;i++){
            result = result + (double) 1/i;
        }
        System.out.println(result);

    }
}
