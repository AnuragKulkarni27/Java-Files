public class RotatedSortedArray {
    static int search(int[] nums, int target){
        int pivot = findpivot(nums);
        if (pivot==-1){
            return binarysearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        if(target>=nums[0]){
            return binarysearch(nums,target,0,pivot-1);
        }
        return binarysearch(nums, target, pivot+1, nums.length -1);
    }
    static int binarysearch(int[]arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    static int findpivot(int[]arr){
        int start =0;
        int end = arr.length;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (mid > start && arr[mid]< arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                if (start< end && arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                if(end > start && arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(arr[start]< arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid+1;
            } else{
                end= mid-1;
            }
            }
            return -1;
        }
    }

