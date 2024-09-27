// package ARRAYLIST;

// import java.util.ArrayList;

// public class Maximum {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(4);
//         list.add(8);
//         list.add(7);
//         list.add(9);
//         int max = Integer.MIN_VALUE;
//         for (int i = 0; i < list.size(); i++) {
//              if (max < list.get(i)) {
//                 max = list.get(i);

//              }
//            // max  = Math.max(max, list.get(i));
//         }
//         System.out.println("the maximum element is " + max);

//     }

// }
package ARRAYLIST;

import java.util.ArrayList;

//import javax.crypto.AEADBadTagException;
// finding the minimum element in an arraylist
public class Maximum{
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(8);
        list.add(4);
        list.add(3);
        int min = Integer.MAX_VALUE;
        for(int i =0;i<list.size();i++){
            // if(min >list.get(i)){
            //     min = list.get(i);

          //  }
          min = Math.min(min, list.get(i));
        }
        System.out.println(" the minimum element in arraylist is " + min);
    }
}
