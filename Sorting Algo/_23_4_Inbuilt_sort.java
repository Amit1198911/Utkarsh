import java.util.*;
public class _23_4_Inbuilt_sort {
    public static void bubble_Sort(int arr[]){
        int n = arr.length;
        for(int turn=0;turn<n-1;turn++){
            for(int j=0;j<n-1-turn;j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;

                }

            }
        }

    }

    public static void printArr(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();

    }
    public static void main(String args[]){
        Integer arr[] = {5, 4, 1, 3, 2};
        // Arrays.sort(arr);
        // printArr(arr);
        // Arrays.sort(arr,0,2);
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        printArr(arr);  

    }
    
}
