public class majorityelements{
    public static int majority(int arr[]){
        int count =0;
        int num =0;
        for(int i=0;i<arr.length;i++){
            if(count ==0){
                num = arr[i];
            }
            if(arr[i] == num){
                count++;
            }
            else{
                count--;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int arr[] = {2 , 2, 1, 1, 1, 2, 2};
        System.out.println(majority(arr));
    }
}