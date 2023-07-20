package patika_soru_cevaplari.com;
import java.util.*;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" 2 ADET SAYI GİRİNİZ ");
        int a, b;
        System.out.print("İlk sayı : ");
        a = scanner.nextInt();
        System.out.println("\nİkinci sayı  : ");
        b = scanner.nextInt();
        int ebob =0;
        int ekok = 0;

        System.out.println(a + " " + " ve " + b + " nin ortak bölenleri" );
        if(a>b){
            for(int i = 1;i<=b;i++){
                if(a%i==0 && b%i==0){
                    System.out.println( i + " ");
                    ebob = i;
                    ekok = (a*b)/ebob;
                }

            }
            }
        else {
            for(int i = 1;i<=a;i++){
                if(a%i==0 && b%i==0){
                    System.out.println( i + " ");
                    ebob = i;
                    ekok = (a*b)/ebob;
                }
            }
        }
        System.out.println(a + " " + "Ve " + b + " nin ebobu : " + ebob);
        System.out.println(a + " " + "Ve " + b + " nin ekoku : " + ekok);

        }
    }

