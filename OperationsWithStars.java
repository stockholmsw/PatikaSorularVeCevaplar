package patika_soru_cevaplari.com;
import java.util.*;
public class OperationsWithStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = scan.nextInt();

        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------------------");

        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("---------------------------");
        for(int i = n;i>=1;i--){
            for(int j = 1;i>=j;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------");

        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n-1;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<= 2*i - 1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------------");

        for(int i = 1;i<=n;i++){
            for(int j = 1;j<n-1;j++){
                System.out.print("");
            }
            for(int j = 1;j<=2*i-1;j++){
                if(i==n){
                    System.out.print("*");
                }else{
                    if(j == 1||j==2*i-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }


    }
}
