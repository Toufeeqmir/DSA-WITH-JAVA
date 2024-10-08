package ARRAYLIST;

import java.util.ArrayList;

public class second {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();

        list.add(2);
        list.add(4);
        list.add(5);
        list.add(8);
         list.add(9);
         
         for(int i = 0;i<list.size();i++){
             System.out.println(list.get(i));
            }
            System.out.println("The size of arraylist is :" +  list.size());

        }
    }
