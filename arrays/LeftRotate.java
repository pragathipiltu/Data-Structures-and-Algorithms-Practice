package arrays;
import java.util.Arrays;

/**
 * Left rotate an array by 1 place
 */
public class LeftRotate {
    public static void main(String[] args) {
        int array[] = {1 , 2, 3, 4 , 5};
        int n = array.length;
        int temp = array[0];
        for(int i = 1 ; i<n ; i++) {
            array[i-1] = array[i];
        }
        array[n-1] = temp;
        System.out.println("Final array after left rotation: " + Arrays.toString(array));
        
    }
}