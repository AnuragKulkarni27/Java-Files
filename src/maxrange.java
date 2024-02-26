public class maxrange {
    public static void main(String[] args) {
        int[] arr = {18, 3, 144, 9, 23};
        
        System.out.println(maxRange(arr, 0, 4));
     }

    static int maxRange(int[] arr, int start, int end){
        int maxVal = arr[start];
        for (int i = start; i <= end; i++){
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}