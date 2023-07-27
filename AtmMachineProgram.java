package patika_soru_cevaplari.com;
import java.util.*;
public class AtmMachineProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        int price ;

        while(right>0){
            System.out.print("Kullanıcı adınızı giriniz : ");
            userName = scanner.nextLine();
            System.out.print("Şifrenizi giriniz : ");
            password = scanner.nextLine();
            if(userName.equals("Köksal is ") && password.equals("Software Developer")){
                System.out.println("\nTebrikler sisteme giriş yapabilirsiniz.");
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye sorgulama\n4-Çıkış Yapma");
                    System.out.println("Lütfen tercihinizi giriniz : ");
                    select = scanner.nextByte();
                    switch (select) {
                        case 1:
                            price = scanner.nextInt();
                            System.out.println("Yatırmak istediğiniz miktar : " + price);
                            balance += price;
                            break;
                        case 2:
                            price = scanner.nextInt();
                            if (balance < price) {
                                System.out.println("Bakiyeniz : " + balance + " Çekmek istediğiniz miktar : " + price + " \n Tekrar deneyiniz.");
                                break;
                            } else {
                                System.out.println("Bakiyenizden çekmek istediğiniz miktar  :" + price);
                                balance -= price;
                                break;
                            }
                        case 3:
                            System.out.println("Toplam Bakiye miktarınız : " + balance);
                            break;

                    }


                }while (select!=4);
                System.out.println("Tekrar Görüşmek üzere!!!");
                break;
            }else{
                right--;
                System.out.println("Kulanıcı adı veya şifre hatalı , tekrar deneyiniz.");
                if(right==0){
                    System.out.println("Hesabınız bloke olmuştur , banka ile iletişime geçiniz");
                }else{
                    System.out.println("Toplam Hakkınız : " + right);
                }
    }

        }
    }
}
