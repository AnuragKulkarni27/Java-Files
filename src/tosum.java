import java.util.Arrays;
import java.util.HashMap;
public class tosum {
    

    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> Map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int findme = target - nums[i];

            if (Map.containsKey(findme)) {
                return new int[] { Map.get(findme), i };
            }

            Map.put(nums[i], i);
        }

        return null;
    }
    public static void main(String[] args) {
        int[] s = {150,24,79,50,88,345,3};
        int value = 200;
        tosum r = new tosum();
        int[] a = r.twoSum(s,value);
        System.out.println(Arrays.toString(a));
    }
}
