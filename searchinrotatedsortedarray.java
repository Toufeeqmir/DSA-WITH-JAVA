public class searchinrotatedsortedarray {
    public static int search(int arr[] , int target , int si , int ei){
        if(si > ei){
            return -1;
        }
       
        int mid = si + (ei - si)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[si] <= arr[mid]){
            if(arr[si] <= target && target <= arr[mid]){
                return search(arr, target, si , mid -1);
            }
            else{
                return search(arr, target, mid+1, ei);
            }
            
        }else{
            if(arr[mid] <= target && target <= arr[ei]){
                return search(arr, target, mid+1, ei);
        }
    
       else{
        return search(arr, target, si, mid -1);
       }
    } 

    }
    public static void main(String[] args){
      int arr[] = {6 , 4, 3, 2,1 };
      int target = 3;
      int tergetidx = search(arr, target, 0, arr.length-1);
      System.out.println(tergetidx);

    }
}
