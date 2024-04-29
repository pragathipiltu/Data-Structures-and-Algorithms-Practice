package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinCost {

    /*
     * A number of points along the highway are in need of repair. 
     * An equal number of crews are available, stationed at various points along the highway. 
     * They must move along the highway to reach an assigned point. 
     * Given that one crew must be assigned to each job, what is the minimum total amount of distance traveled by 
     * all crews before they can begin work?
For example, given crews at points {1,3,5} and required repairs at {3,5,7}, 
one possible minimum assignment would be {1 → 3, 3 → 5, 5 → 7} for a total of 6 units traveled.
     */


     /*
      * Function Description
Complete the function getMinCost in the editor below. The function should return the minimum possible total distance traveled as an integer.
getMinCost has the following parameter(s): crewid[crewld[0],..crewld[n-1]] : a vector of
integers
jobld[jobld[0],...jobld[n-1]] : a vector of integers
      */



      public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the crew size:");
        int crewSize = sc.nextInt();

        List<Integer> crewId = new ArrayList();
        for(int i = 0 ;i<crewSize;i++){
            crewId.add(sc.nextInt());
        }
        System.out.println(crewId.toString());

        System.out.println("Enter the no of  job positions  :");
        int jobPositions = sc.nextInt();
        List<Integer> jobId = new ArrayList();
        for(int i = 0 ;i<jobPositions;i++){
            jobId.add(sc.nextInt());
        }
        System.out.println(jobId.toString());

        int result = getMinCost(crewId, jobId);
        System.out.println("total amount of distance travelled is :"+result);


      }

      public static int getMinCost (List<Integer>crewId , List<Integer>jobId) {

        Collections.sort(crewId);
        Collections.sort(jobId);

        int minDistance  =0;

        for(int i =0;i<crewId.size();i++){
            minDistance += Math.abs(crewId.get(i) - jobId.get(i));       
         }
         return minDistance;
      } 
    
}
