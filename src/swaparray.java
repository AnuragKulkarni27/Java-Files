import java.util.Arrays;

public class swaparray {
     public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        //swap(arr, 0, 4);
        reverse(arr);
        
        System.out.println(Arrays.toString(arr));
     }

    static void reverse (int[] arr){
        int start = 0;
        int end = arr.length-1;
        
        while (start < end) {
            
            int temp =  arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        
            start++;
            end--;
        }
    }
}
    
    

    
