package patika_soru_cevaplari.com;
import java.util.*;

public class DikUcgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Java ile kullanıcıdan dik kenarlarının uzunluğunu
         alan ve hipotenüsü hesaplayan programı yazın.
         */
        int kenar1,kenar2;
        double kenar3,alan;
        double u;
        double ucgeninCevresi = 0;
        System.out.println("Dik üçgenin kenarlarını giriniz \n");
        System.out.print ("Birinci Kenar  : ");
        kenar1 = scanner.nextInt();
        System.out.print("\n İkinci Kenar  :");
        kenar2 = scanner.nextInt();
        kenar3 = Math.sqrt(kenar1*kenar1 + kenar2*kenar2);

        System.out.println("Hipotenüs: " + kenar3);

        u =  (kenar1+kenar2+kenar3)/2.0;
        ucgeninCevresi = 2*u;
        alan  = (Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3)));
        System.out.println("Alan: " + alan);

    }
}
