package GREEDY_ALGORITIHIM;

import java.util.ArrayList;
 /*when given array is sorted */
public class activsel {
    public static void main(String[] args){
        int start[] = {1 , 3 , 0 , 5 , 8 , 5};
        int end[] = {2 , 4 , 6 , 7 , 9 , 9};
        //end timebased
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
       // ist Activity;
       maxAct = 1;
       ans.add(0);
       int lastend = end[0];
       for(int  i =1;i<end.length;i++){
        if(start[i] >= lastend){
            maxAct++;
            ans.add(i);
            lastend = end[i];

        }
       }
       System.out.println("max number of selection is :" + maxAct);
       for(int i =0;i<ans.size();i++){
        System.out.print("A" + ans.get(i) + " ");

       }
       System.out.println();

    }
    
}
