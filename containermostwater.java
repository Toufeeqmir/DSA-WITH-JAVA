import java.util.ArrayList;

public class containermostwater {
    // public static int mostwater(ArrayList<Integer> list){
    //     int max= Integer.MIN_VALUE;
    //     for(int i =0;i<list.size();i++){
    //         for(int j =i+1;j<list.size();j++){
    //             int height = Math.min(list.get(i), list.get(j));
    //             //index between J and i 
    //             int width = j -i;

    //             int currwater =  height * width;
    //             max  = Math.max(max , currwater);
    //         }
    //     }
    //     return max;

    // }
    public static int mostwater(ArrayList<Integer>list){
        int maxwater =0;
        int lp =0;
        int rp = list.size()-1;

        while(lp < rp ){
            int ht = Math.min(list.get(lp), list.get(rp));
            int width = rp - lp;

            int currwater = ht * width;   

            maxwater = Math.max(maxwater, currwater);

            if(list.get(lp) < list.get(rp)){
                lp++;
            }
            else{

                rp--;
            }
        }
        return maxwater;
    }
    public static void main(String[] args){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
          list.add(5);
          list.add(4);
          list.add(8);
          list.add(3);
         list.add(7);
         System.out.print("The maximum water in the container is: ");
         System.out.println(mostwater(list));
    }
    
}
