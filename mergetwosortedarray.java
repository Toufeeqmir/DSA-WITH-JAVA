public class mergetwosortedarray {
    public static void mergearray(int arr1[] , int m , int arr2[] , int n){
        //Arrays.sort(arr2);
        int i = m-1;
        int j = n-1;
        int k = m + n -1;

        while(i>=0 && j>=0){
            if(arr1[i] > arr2[j]){
                arr1[k--] = arr1[i--];

            }
            else{
                arr1[k--] = arr2[j--];
            }
        }
        while(j>=0){
            arr1[k--] = arr2[j--];
        }
    }
    public static void main(String[] args){
   int arr1[] = {1 , 2, 3, 0 , 0 , 0};
   int m = 3;
   int arr2[] ={2 , 2 , 6};
   int n = 3;
mergearray(arr1, m, arr2, n);


   System.out.println("merged array");

   for(int i =0;i<m+n;i++){
    System.out.print(arr1[i]  + " ");
   }
    }
    
}
