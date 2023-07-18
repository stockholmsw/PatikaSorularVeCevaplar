package patika_soru_cevaplari.com;
import java.util.*;
public class GelismisHesapMakinesi {
    public static void main(String[] args) {

        Scanner java = new Scanner(System.in);
        /*
        Gelişmiş Hesap Makinesi
Java ile kullanıcın seçtiği işlemleri yapan hesap makinesi yapıyoruz.

Hesap makinesinin fonksiyonları :

1- Toplama İşlemi
2- Çıkarma İşlemi
3- Çarpma İşlemi
4- Bölme işlemi
5- Üslü Sayı Hesaplama
6- Faktoriyel Hesaplama
7- Mod Alma
8- Dikdörtgen Alan ve Çevre Hesabı
         */

        int a,b;
        int obtion;
        String menu = "1-Toplama\n"
                + " 2- Çikarma\n"
                + " 3-Çarpma\n"
                +" 4- Bölme\n"
                + " 5- Mod Alma\n"
                +  "6- Us Alam\n"
                + " 7- Dikdörtgen Hesabi\n"
                + " 8 -Çıkış Yapma";


        System.out.println(menu);
        while(true){
            System.out.println("Menuden hangi islemi yapmak istediğinizi belirtin");
            obtion = java.nextInt();
            if(obtion==0){
                break;
            }
            System.out.println("2 adet sayi giriniz");
            System.out.println(" Ilk sayi : ");
            a = java.nextInt();
            System.out.println("Ikinci sayi : ");
            b = java.nextInt();

            switch (obtion){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    substitution(a,b);
                    break;
                case 3:
                    multiplication(a,b);
                    break;
                case 4:
                    division(a,b);
                    break;
                case 5:
                    modulus(a,b);
                    break;
                case 6:
                    exponantion(a,b);
                    break;

                case 7:
                    rectangleCalculate(a,b);
                    break;

            }

        }
    }
    public static int sum(int a,int b ){
        int result = a+b;
        System.out.println(result);
        return  result;
    }

    public static int substitution(int a,int b){
        int result = a-b;
        System.out.println(result);
        return result;
    }

    public static int multiplication(int a,int b){
        int result = a*b;
        System.out.println(result);
        return result;
    }
    public static int division(int a , int b){
        if(b==0){
            return 0;
        }else{
            int result = a/b;
            System.out.println(result);
            return  result;
        }

    }
    public static int exponantion(int a , int b){
        int result = 1;
        for(int i = 1;i<=b;i++){
            result*=a;

        }
        System.out.println(result);
        return  result;
    }
    public static int modulus(int a , int b){
        int result = a%b;
        System.out.println(result);
        return  result;
    }
    public static void rectangleCalculate(int a , int b){
        System.out.println("Dikdörtgenin çevresi : " + (2*(a+b)));
        System.out.println("Dikdörtgenin alanı : " + (a*b));

    }

}
