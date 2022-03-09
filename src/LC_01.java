import java.util.HashMap;
import java.util.Map;

public class LC_01 {
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer,Integer> save = new HashMap<>();
//        int[] num = new int[2];
//        for(int i = 0; i < nums.length ; i++){
//            for(int j = i+1;j<nums.length;j++){
//                if (nums[i]+nums[j]==target){
//                    num[0] = i;
//                    num[1] = j;
//                    break;
//                }
//            }
//        }
//        return num;
//    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> save = new HashMap<>();
        int[] ret_num = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int another = target - nums[i];
            Integer num = save.get(another);
            if (num != null) {
                ret_num[0] = i;
                ret_num[1] = num;

            } else {
                save.put(nums[i], i);
            }
        }
        return ret_num;
    }
}





