import java.util.Arrays;
// else if 导致越界
public class LK_88 {
    // public void merge(int[] nums1, int m, int[] nums2, int n) {
    //         for(int i = 0; i < n; i++  ){
    //             nums1[m+i] = nums2[i];
    //         }
    //         Arrays.sort(nums1);
    // }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] counts = new int[m+n];
        for(int i = 0,num1_index = 0 ,num2_index=0;i<m+n;i++){
            if(num2_index >= n){
                counts[i] = nums1[num1_index++];
            }else if(num1_index >=m ){
                counts[i] = nums2[num2_index++];
            }else if(nums1[num1_index] > nums2[num2_index]){
                counts[i] = nums2[num2_index];
                num2_index++;
            }else{
                counts[i] = nums1[num1_index];
                num1_index++;
            }

        }
        for(int i = 0; i< nums1.length ;i++){
            nums1[i] = counts[i];
        }


    }
}
