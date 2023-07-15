package patika_soru_cevaplari.com;
public class UcVeDortBolunen {
    public static void main(String[] args) {
        System.out.println("Toplam : " + ortakKatToplam(33));
    }
    public static int ortakKatToplam(int number){
        int toplamSayi = 0;
        for(int i = 1;i<number;i++){
            if(i %3==0 && i %4==0){
                toplamSayi+=i;
            }
        }
        return toplamSayi;
    }
}
