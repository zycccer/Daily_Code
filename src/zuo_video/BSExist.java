package zuo_video;

public class BSExist {
    //有序数组中找数字二分查找
    public static boolean isExist(int[] arr,int num){
        if (arr == null || arr.length == 0) {
            return false;
        }
        int L = 0;
        int R = arr.length-1;
        int mid = 0;
        while (L < R) {
            mid = (L +R)/2;
            if (arr[mid] == num) {
                return true;
            } else if (arr[mid] > num) {
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }
        return false;
    }

    public static boolean exist(int[] sortedArr, int num) {
        if (sortedArr == null || sortedArr.length == 0) {
            return false;
        }
        int L = 0;
        int R = sortedArr.length - 1;
        int mid = 0;
        while (L < R) {
            mid = L + ((R - L) >> 1);
            if (sortedArr[mid] == num) {
                return true;
            } else if (sortedArr[mid] > num) {
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }
        return sortedArr[L] == num;
    }


    public static void main(String[] args) {
        int a[] = {1,2,434,123,2,1,2,0,8,7,64,5,353,234,123,12};
        int arr[] = InsertSort.insertSort(a);

        System.out.println( isExist(arr,3));

    }
}
