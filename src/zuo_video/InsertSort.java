package zuo_video;

public class InsertSort {
    public static int[] insertSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return null;
        }
        //  J是i需要比较区域的开始  所以J 最后需要指向0
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static void main(String[] args) {
        int arr[] = {1, 2323, 434, 123, 2, 1, 2, 0, 8, 7, 64, 5, 353, 234, 123, 12};
        insertSort(arr);
        for (int a :
                arr) {
            System.out.println(a);

        }
    }
}
