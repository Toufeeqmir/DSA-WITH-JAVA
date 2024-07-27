import java.util.ArrayList;

public class optimisedsum {
    public static boolean pairsum(ArrayList<Integer>list , int target){
        int lp =0;
        int rp = list.size()-1;
        while(lp != rp){
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            if(list.get(lp) < list.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(9);
        list.add(2);
        int target = 4;
        System.out.println(pairsum(list, target));

    }
    
}
