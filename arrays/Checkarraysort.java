package arrays;

import java.util.Arrays;
import java.util.Scanner;

//to check if array is sorted or not 

public class Checkarraysort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0 ;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        boolean result = CheckSortedOrNot(arr);
        System.out.println(result);
    }

    public static boolean CheckSortedOrNot(int arr[]){
        for(int i = 1 ;i<arr.length;i++) {
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
    
}
