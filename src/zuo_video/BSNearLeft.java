package zuo_video;

public class BSNearLeft {
    // 在arr上，找满足>=value的最左位置
    public  static  int nearestIndex(int[] arr,int value){
        int L = 0;
        int R = arr.length-1;
        int index = 0;

        while (L < R){
           int mid = (L+R)/2;
           if(arr[mid] >=value){
                value = mid;
                R = mid-1;
            }else {
                L = mid+1;
            }
        }
        return index;
    }
}
