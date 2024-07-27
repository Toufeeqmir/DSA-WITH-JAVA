import java.util.ArrayList;
import java.util.Scanner;

public class rotatedsum {
    public static boolean rotatesum(ArrayList<Integer>list , int target){
        int bp = -1;
        for(int i =0;i<list.size();i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        }
            int lp = bp + 1;
            int rp = bp;
            while(lp != rp){
                if(list.get(lp) + list.get(rp) == target){
                    return true;
                }

                if(list.get(lp) + list.get(rp) < target){
                    lp = (lp + 1) %list.size();
                }
                else{
                    rp = (list.size() + rp -1) %list.size();
                }
            }

            return false;


    }
    
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n <=0){
                break;
            }
            list.add(n);
            System.out.print(list);
        }
        System.out.println(rotatesum(list, 16));
    }
    
}
