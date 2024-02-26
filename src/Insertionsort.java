import java.util.Arrays;
public class Insertionsort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        insertion(arr);
        System.out.println(Arrays.toString(arr));;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) { //j-- isliye liya h kuki wo j ki value ke piche bhi pure elements ko check karega aur sort krte jayega
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
        }
    }

    }
}