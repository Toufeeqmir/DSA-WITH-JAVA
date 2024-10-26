
public class singlenumber {
// we can solve it using hashmap and bitmanipulation
    public static int single(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 2, 1 , 4, 1};
        System.out.println("the single element in an array is :" +  single(arr));
    }
}
