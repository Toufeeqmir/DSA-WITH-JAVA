package GREEDY_ALGORITIHIM;

import java.util.*;

public class indiancoins {
    public static void main(String[] args){
       Integer coins[] = {1 ,2 , 5, 10 , 20 , 50 , 100 , 500, 2000};
      Arrays.sort(coins , Comparator.reverseOrder()); //descending order      
      int countofcoins =0;
       int amount = 590;
       ArrayList<Integer>ans = new ArrayList<>();
       for(int i=0;i<coins.length;i++){
        if(coins[i] <=amount){
            while(coins[i]<=amount){
                countofcoins++;
                ans.add(coins[i]);
                amount -= coins[i];//decreasing the coins after changing one by one 
            }
        }
       }
       System.out.println("total(min) coins :" + countofcoins);
       for(int i =0;i<ans.size();i++){
        System.out.print(ans.get(i) + " ");
       }
    System.out.println();
    }
    
}
