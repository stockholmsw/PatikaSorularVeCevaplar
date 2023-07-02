package patika_soru_cevaplari.com;
import java.util.*;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName, password;
        String tekrarYaz = "";
        userName = "KöksalÖcal";
        password = "123456";
        System.out.print("Kullanıcı adınızı giriniz : ");
        userName = scan.nextLine();
        System.out.print("\n Şifrenizi giriniz : ");
        password = scan.nextLine();

        if (userName.equals("KöksalÖcal") && password.equals("123456")) {
            System.out.println("Tebrikler sisteme giriş yapabilirsiniz");
        } else {
            System.out.println("Kullanıcı adı  yada şifre hatalı ");
            if (!password.equals("123456")) {
                System.out.println("Şifrenizi sıfırlamak ister misiniz , evet ise  tekrar işlem yapınız.");
                 tekrarYaz = scan.nextLine();
                if (tekrarYaz.equals("123456") || (tekrarYaz.equals(password))) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre giriniz.");
                } else {
                    System.out.println("Şifre başarılı bir şekilde oluşturuldu.");
                }

            }
        }
        System.out.print("Kullanici adiniz : " + userName + " \n Yeni şifreniz  : " + tekrarYaz);
    }
}
