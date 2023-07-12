package patika_soru_cevaplari.com;

public class MergeSortAlgoritmasi {
    public static void main(String[] args) {
        int array[] = {16,21,11,8,12,22};
        System.out.println("Before sorting : ");
        printArray(array);
        System.out.println("\nAfter sorting : ");
        mergeSort(array);
        printArray(array);


    }
    public static void mergeSort(int[] inputArray){
        int inputArraySize = inputArray.length;
        if(inputArraySize<2){
            return;
        }
        int midSize = inputArraySize/2;
        int leftHalfSize[] = new int[midSize];
        int rightHalfSize[] = new  int[inputArraySize-midSize];

        for(int i = 0;i<midSize;i++){
            leftHalfSize[i] = inputArray[i];
        }

        for(int i = midSize;i<inputArraySize;i++){
            rightHalfSize[i-midSize] = inputArray[i];
        }
        mergeSort(leftHalfSize);
        mergeSort(rightHalfSize);
        merge(inputArray,leftHalfSize,rightHalfSize);
    }

    public static void merge(int arr[],int leftHalf[],int[]rightHalf){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0,j = 0,k = 0;
        while(i<leftSize &&j<rightSize){
            if(leftHalf[i]<=rightHalf[j]){
                arr[k] = leftHalf[i];
                i++;
            }
            else{
                arr[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while(i<leftSize){
            arr[k] = leftHalf[i];
            i++;k++;
        }
        while(j<rightSize){
            arr[k] = rightHalf[j];
            j++;k++;
        }


    }
    public static void printArray(int [] arr){
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
