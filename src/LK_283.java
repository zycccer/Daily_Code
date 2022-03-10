public class LK_283 {
    public static void moveZeroes(int[] nums){
        if (nums == null){
            return;
        }
        int j = 0;
        for (int i = 0;i<nums.length;++i){
            if (nums[i]!=0){
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i =j;j<nums.length;++i){
            nums[i]=0;
        }

    }


    public static void main(String[] args) {
        int[] a = {0,1,0,3,12};
        moveZeroes(a);
    }
}
