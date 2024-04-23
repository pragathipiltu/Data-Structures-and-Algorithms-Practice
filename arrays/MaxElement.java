package arrays;

import java.util.Arrays;
import java.util.Scanner;

//to find the largest element in the array;

public class MaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of array:");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("enter the elements of array");
        for(int i=0 ; i<n; i++){
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));

        int large = largetElement(array,n);
        System.out.println("The largest element in the array is :"+large);
    }

    public static int largetElement ( int arr[], int n ) {
        int max = 0;
       for(int i =0;i<n;i++){
        if(arr[i]>max){
            max = arr[i];
        }

       }
      return max;

    }
    
}
