package patika_soru_cevaplari.com;
import java.util.*;
public class ReversedTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Satır sayısını giriniz.");
        int row = scanner.nextInt();

        for(int i = row;i>=1;i--){
            for(int j = 1;j<=(row-i);j++){
                System.out.print(" ");
            }
            for(int k = 1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
