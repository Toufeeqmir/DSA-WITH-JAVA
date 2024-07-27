import java.util.ArrayList;
import java.util.Collections;


public class revese {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(8);
        list.add(9);
        list.add(3);
        
        System.out.println(list);
        //in ascending order
        Collections.sort(list);
        System.out.println(list);
           //in descending order
        Collections.sort(list , Collections.reverseOrder());
        System.out.println(list);

    }
    
}
