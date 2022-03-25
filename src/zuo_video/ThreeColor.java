package zuo_video;

public class ThreeColor {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length<2){
            return;
        }
        quick(nums,0,nums.length-1);
    }
    public void quick(int[] arr,int l,int r){
        if(l<r){

            potion(arr,l,r);

        }
    }
    public int[] potion(int[] arr,int l,int r){
        int y = 1;
        int less = l-1;
        int more = r+1;
        while(l<more){
            if(arr[l] < y){
                swap(arr,++less,l++);
            }else if(arr[l]>y){
                swap(arr,--more,l);
            }else{
                l++;
            }
        }
        return arr;

    }

    public  void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
