package patika_soru_cevaplari.com;

public class ColumnAndRowOperationsInArray {
    public static void main(String[] args) {
        int[][]arr = {{1,2,3,},{4,5,6},{7,8,9}};
        for(int i = 0;i< arr.length; i++){
            int sum = 0;
            for(int j = 0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            System.out.println("The sum of " + (i+1) + ". row is : " + sum);

        }
        int toplam = 0;
        System.out.println();

        int myArr[][] = {{3,6,5},{4,1,2},{8,4,0},{6,5,1}};
        for(int i = 0;i<myArr[i].length;i++){
            toplam=0;
            for(int j = 0;j<myArr.length;j++){
                toplam+=myArr[j][i];
            }
            System.out.println("The sum of " + (i+1) + " .  column is : " + toplam);

        }

    }
}
