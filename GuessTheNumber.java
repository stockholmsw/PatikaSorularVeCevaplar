package patika_soru_cevaplari.com;
import java.util.*;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int)(Math.random()*101);
        System.out.println(randomNumber);
        int guessNum;
        int right = 5;
        int denemeSayisi = 0;
        while(right>0){
            denemeSayisi++;
            System.out.println("Tahmin ettiğiniz sayıyı giriniz.");
            guessNum = scanner.nextInt();
            if(guessNum ==randomNumber){
                System.out.println("Sayıyı Doğru tahmin ettiniz , tebrikler");
                break;
            }else if(guessNum<randomNumber){
                System.out.println("Tahmininizi artırınız.");
            }else{
                System.out.println("Tahmininizi azaltınız");
            }
        }
        System.out.println("Sayıyı " + denemeSayisi  + " . Tahminde bilmeyi başardınız. ");



    }

    }

