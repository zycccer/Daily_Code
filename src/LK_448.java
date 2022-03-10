import java.util.ArrayList;
import java.util.List;

public class LK_448 {
    //     public  static  List<Integer> findDisappearedNumbers(int[] nums) {
//         int a;
//         for(int i = 0; i< nums.length;++i){
//                 if (nums[i]<=0){
//                      a = Math.abs(nums[i])-1;
//                 }else {
//                      a = nums[i] -1;
//                 }


//                 if(nums[a]>0){
//                     nums[a] = -nums[a];
//                 }


//         }

//         List<Integer> result = new ArrayList<Integer>();
//         for(int i = 0; i<nums.length; i++){
//             if(nums[i]>=0)
//             {
//                 result.add(i+1);
//             }
//         }
//         return result;
// }

    public  static  List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for (int num : nums) {
            int x = (num - 1) % n;
            nums[x] = nums[x] + n;

        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] <= n) {
                result.add(i + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {4,3,2,7,8,2,3,1};

        System.out.println(findDisappearedNumbers(a));
    }
}
