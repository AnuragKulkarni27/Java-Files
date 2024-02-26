public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {5,3,1};
        int target = 1;
        int ans = binarySearch(arr,target);
        System.out.println(ans);

    }
    static int binarySearch (int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start +(end-start) /2;
            if (arr[start]<arr[end]){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else if (target>arr[mid]){
                    start = mid + 1;
                }
                else{
                    return mid;
                }
            }
            else{
                if(target > arr[mid]){
                end = mid - 1;
            }
            else if (target < arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;

            }
        }


    }return -1;
}
}
