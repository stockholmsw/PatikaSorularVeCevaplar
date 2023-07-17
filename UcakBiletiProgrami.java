package patika_soru_cevaplari.com;
import java.util.*;
public class UcakBiletiProgrami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int  age,travelType;
         double distance ;
         double indirimliFiyat;
        System.out.print("Mesafe bilgisini giriniz  : ");
        distance = scan.nextInt();
        System.out.println("Yaşınızı giriniz :");
        age = scan.nextInt();
        System.out.println("Seyahat tipini giriniz :");
        travelType = scan.nextInt();
        double normalTutar = distance*0.10;


        if((distance<0 || age<0) || (travelType<0 || travelType>2)){
            System.out.println("Hatalı veri girdiniz!! ,  değerleri tekrar diriniz.");
        }
        else{
            if(age<12 ){
                normalTutar -= normalTutar*0.50;
                indirimliFiyat = normalTutar;
                if(travelType==2){
                    indirimliFiyat-=indirimliFiyat*0.20;
                    indirimliFiyat*=2;
                    System.out.println("Toplam Bilet Ücretiniz : " + indirimliFiyat);
                }else{
                    System.out.println("Toplam Bilet Ücretiniz : " + indirimliFiyat);
                }
            }else if(age>=12 && age<24){
                normalTutar-=normalTutar*0.10;
                indirimliFiyat = normalTutar;
                if(travelType==2){
                    indirimliFiyat-=indirimliFiyat*0.20;
                    indirimliFiyat*=2;
                    System.out.println("Toplam Bilet Ücretiniz : " + indirimliFiyat);
                }else{
                    System.out.println("Toplam Bilet Ücretiniz : " + indirimliFiyat);
                }
            }else if(age>65){
                normalTutar-=normalTutar*0.30;
                indirimliFiyat = normalTutar;
                if(travelType==2){
                    indirimliFiyat-=indirimliFiyat*0.20;
                    indirimliFiyat*=2;
                    System.out.println("Toplam Bilet Ücretiniz : " + indirimliFiyat);
                }else{
                    System.out.println("Toplam Bilet Ücretiniz : " + indirimliFiyat);
                }
            }else{
                if(travelType==1){
                    System.out.println("Toplam Bilet Ücretiniz  : " + normalTutar);
                }else if(travelType ==2){
                    normalTutar-=normalTutar*0.20;
                    indirimliFiyat = normalTutar;
                    System.out.println("Toplam Bilet Ücretiniz : " + indirimliFiyat);
                }

            }


        }




    }
}
