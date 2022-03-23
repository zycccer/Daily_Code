package zuo_video;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        if (arr == null || arr.length<2){
            return;
        }
        for (int e = arr.length-1; e >0 ; e--) {
            for (int i = 0;i<e;i++){
                if (arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static void main(String[] args) {
        int arr[] = {1,2323,434,123,2,1,2,0,8,7,64,5,353,234,123,12};
        bubbleSort(arr);
        for (int a:
             arr) {
            System.out.println(a);

        }
    }
}
