package GREEDY_ALGORITIHIM;
// to count the highest L's and R's in the string array
public class greedyQues{
    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";
        int n= str.length();
        int countL =0 , countR = 0 , count =0;
        for(int i=0;i<n;i++){
            if(str.charAt(i) == 'L'){
                countL++;
            }
            else{
                countR++;
            }
            if(countL == countR){
                count++;
                countL =0;
                countR=0;
            }
        }
        System.out.println("the count of the partition of the string is "  + count);
    }
}
