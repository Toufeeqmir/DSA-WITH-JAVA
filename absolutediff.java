// package GREEDY_ALGORITIHIM;

// import java.util.*;

// public class absolutediff {
//     public static void main(String[] args){
//   int A[] = {4 , 1, 8 , 7};
//   int B[] = {2 , 3, 6 ,5};
//   Arrays.sort(A);
//   Arrays.sort(B);


//   int mindiff = 0;
//   for(int i =0;i<A.length;i++){
//     mindiff+=Math.abs(A[i] - B[i]);

//   }
//   System.out.println("mindifference is :" + mindiff);
//     }
    
// }
package  GREEDY_ALGORITIHIM;

import java.util.Arrays;

public class  absolutediff{
  public static void main(String[] args) {
      int A[] ={4 , 1, 8 , 7};
      int B[] = {2, 3, 6 ,5};
      Arrays.sort(A);
      Arrays.sort(B);

      int mindif =0;
      for(int i =0;i<A.length;i++){
        mindif += Math.abs(A[i] - B[i]);

      }
      System.out.println("Mindifferenece is " + mindif);
  }
}