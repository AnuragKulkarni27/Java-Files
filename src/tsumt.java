import java.util.Arrays;
public class tsumt {
    

    public int[] twoSum(int[] nums, int target) {
        int s = 0 , e = nums.length-1;
        while(s<e){
            if(nums[s]+nums[e]>target){
                e--;
        
            }
            else if(nums[s]+nums[e]<target){
                s++;
            
            }
            else{
                return new int[]{s+1,e+1};
            }

        }
        return null;
    }
    public static void main(String[] args) {
        int[] s = {2,7,11,15};
        int value = 9;
        tsumt r = new tsumt();
        int[] a = r.twoSum(s,value);
        System.out.println(Arrays.toString(a));
    }
}

