package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
Question: 
 * A widget manufacturer is facing unexpectedly high demand for its 
 * new product,. They would like to satisty as many customers as possible. 
 * Given a number of widgets available and a list of customer orders,
 *  what is the maximum number of orders the manufacturer can 
 * fulfill in full?
 */

 /*
  * Complete the function filledOrders in the editor below. 
  The function must return a single integer denoting the maximum possible number of fulfilled orders.
filled Orders has the following parameter(s): order: an array of integers listing the orders
k: an integer denoting widgets available for shipment
  */

public class Fulfilledorders {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of orders: ");
        int n = sc.nextInt();
        
        // Input the list of orders
        List<Integer> order = new ArrayList<>();
        System.out.println("Enter the orders:");
        for (int i = 0; i < n; i++) {
            order.add(sc.nextInt());
        }
        System.out.println(order.toString());
        
        // Input available widgets
        System.out.print("Enter the number of available widgets: ");
        int k = sc.nextInt();
        
        // Call the function and output the result
        int result = filledOrders( k, order);
        System.out.println("Maximum number of fulfilled orders: " + result);
    }

    public static int filledOrders(int k , List<Integer>orders) {
        Collections.sort(orders);
        int ordersFulfilled =0;
        for(int i=0;i<orders.size();i++){
            if(orders.get(i)<=k){
                k = k-orders.get(i);
                ordersFulfilled++;
            }else {
                break;
            }
        }

        return ordersFulfilled;
    }


    
}
