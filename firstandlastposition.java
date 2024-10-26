
import java.util.Arrays;

public class firstandlastposition {
    public static int[] searchRange(int arr[] , int target){
        int ans[] = {-1 , -1};

        ans[0] = search(arr , target , true);
        ans[1]  = search(arr, target , false);
        return ans;
    }
    public static int search(int arr[] , int target , boolean isindex){
        int start =0 , end = arr.length-1;

      int ans = -1;
      while(start <= end){
        int mid = start + (end - start)/2;

        if(arr[mid] < target){
            start = mid + 1;


        }
        else if(arr[mid] > target){
            end = mid-1;
        }
        else{
            ans = mid;

            if(isindex){
                end = mid -1;

            }
            else{
                start = mid +1;
            }
        }
    
      }
      return ans;

    }
    public static void main(String[] args){
        int arr[] = {1 , 3 ,8, 4, 8};
        int target = 8;
        int newarray[] = searchRange(arr, target);
        System.out.println(Arrays.toString(newarray));


    }
    
}
