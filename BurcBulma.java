package patika_soru_cevaplari.com;
import  java.util.*;
public class BurcBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sec;
        System.out.println("1 : 21 Mart - 20 Nisan");
        System.out.println("2 : 21 Nisan - 21 Mayıs");
        System.out.println("3 : 22 Mayıs - 22 Haziran");
        System.out.println("4 : 23 Haziran - 22 Temmuz");
        System.out.println("5 : 23 Temmuz - 22 Ağustos");
        System.out.println("6 : 23 Ağustos - 22 Eylül");
        System.out.println("7 : 23 Eylül - 22 Ekim");
        System.out.println("8 : 23 Ekim - 22 Kasım");
        System.out.println("9 : 23 Kasım - 21 Aralık");
        System.out.println("10 : 22 Aralık - 21 Ocak");
        System.out.println("11 : 22 Ocak - 19 Şubat");
        System.out.println("12 : 20 Şubat - 20 Mart");
        System.out.print("Doğduğunuz aralığı seçiniz:");
        sec=scanner.nextInt();
        System.out.print("Burcunuz: ");
        if (sec==1) {
            System.out.print("Koç");
        }else if (sec==2) {
            System.out.print("Boğa");
        }else if (sec==3) {
            System.out.print("İkizler");
        }else if (sec==4) {
            System.out.print("Yengeç");
        }else if (sec==5) {
            System.out.print("Aslan");
        }else if (sec==6) {
            System.out.print("Başak");
        }else if (sec==7) {
            System.out.print("Terazi");
        }else if (sec==8) {
            System.out.print("Akrep");
        } else if (sec==9) {
            System.out.print("Yay");
        }else if (sec==10) {
            System.out.print("Oğlak");
        }else if (sec==11) {
            System.out.print("Kova");
        }else if (sec==12) {
            System.out.print("Balık");
        }
    }


    }

