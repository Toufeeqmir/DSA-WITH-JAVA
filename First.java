package ARRAYLIST;

import java.util.ArrayList;

public class  First {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
       // ArrayList<String>list2 = new ArrayList<>();
        //ArrayList<Boolean>list3 = new ArrayList<>();

        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(9);
        System.out.println(list);
  //Get element
        int element = list.get(2);
        System.out.println(element);

        //Remove element
        list.remove(3);
        list.remove(2);
     System.out.println(list);
     

     // set element
     list.set(2, 8);
     System.out.println(list);

     //contains element

     System.out.println(list.contains(1));
     System.out.println(list.contains(3));

    }
    
}
