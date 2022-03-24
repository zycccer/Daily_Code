package zuo_video;
// 记住边界要求  l -m m+1 r
// 后面数据传输边界  j = 0  arr[l+j] == arr2[j]

public class MergeSort {
    public  static void mergeSort(int[] arr,int l ,int r){
        if (l==r){
            return;
        }
        int mid = l + ((r - l) >> 1);
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,r,mid);
    }

    private static void merge(int[] arr,int l,int r,int mid){
        int[] arr2 = new int[r-l+1];
        int i = 0;
        int p1 = l;
        int p2 = mid+1;
        while (p1<=mid && p2<=r){
           arr2[i++] = arr[p1]>arr[p2] ? arr[p2++]:arr[p1++];
        }
        while (p2<=r){
            arr2[i++] = arr[p2++];
        }
        while (p1<=mid){
            arr2[i++] = arr[p1++];
        }
        for (i = 0; i < arr2.length; i++) {
            arr[l + i] = arr2[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2323,434,123,2,1,2,0,8,7,64,5,353,234,123,12};
        mergeSort(arr,0,arr.length-1);
        for (int a:
                arr) {
            System.out.println(a);


    }
    }
}
