import java.util.ArrayList;

public class monotone {

    public static boolean ismonotone(ArrayList<Integer>list){
              boolean increase = true;
              boolean decrease = false;
      for(int i =0;i<list.size()-1;i++){
        if(list.get(i) > list.get(i+1)){
            increase = false;
        }
        if(list.get(i) < list.get(i+1)){
            decrease = false;
        }
    }
   return increase || decrease;
    }
    public static void main(String[] args){
        ArrayList<Integer>list = new ArrayList<>();
         list.add(1);
         list.add(2);
         list.add(5);
         System.out.println(ismonotone(list));

    }
    
}
