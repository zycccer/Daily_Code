package zuo_video;
// 注意递归结束时候的返回值
// 当我们改变需求 是时候 记得递归排序的排序方式和移动位置  是左边移动的找 还是右边移动的找
public class SmallAdd {
//    public static void sort(int[] arr){
//        if (arr==null||arr.length<2){
//            return ;
//        }
//        smallAdd(arr,0,arr.length-1);
//    }
//
//    private   static int  smallAdd(int[] arr ,int l ,int r){
//        if (l==r){
//            return 0;
//        }
//        int mid = l+((r-l)>>1);
//        // 左边的累加  最右边的累加 和 现在的累加
//        return smallAdd(arr,l,mid)+
//        smallAdd(arr,mid+1,r)+addMerge(arr,l,r,mid);
//
//    }
//    private static int addMerge(int[] arr,int l,int r,int m){
//        int[] arr2 = new int[r-l+1];
//        int i = 0;
//        int p1 = l;
//        int p2 = m+1;
//        int res = 0;
//        while (p1<=m&&p2<=r){
//        res+= arr[p1]<arr[p2] ? (r-p2+1)*arr[p1]:0;

//             //  和右边比较 如果小了就看下一个 就看下一个和右边比较
//           arr2[i++] = arr[p1] < arr[p2]? arr[p1++]:arr[p2++];
//        }
//        while (p1<=m){
//            arr2[i++] = arr[p1++];
//        }
//        while (p2<=r){
//            arr2[i++] = arr[p2++];
//        }
//        for (int j = 0; j < arr2.length ; j++) {
//            arr[l+j] = arr2[j];
//        }
//        return res;
//    }
//
public static int smallSum(int[] arr) {
    if (arr == null || arr.length < 2) {
        return 0;
    }
    return mergeSort(arr, 0, arr.length - 1);
}

    public static int mergeSort(int[] arr, int l, int r) {
        if (l == r) {
            return 0;
        }
        int mid = l + ((r - l) >> 1);
        return mergeSort(arr, l, mid)
                + mergeSort(arr, mid + 1, r)
                + merge(arr, l, mid, r);
    }

    public static int merge(int[] arr, int l, int m, int r) {
        int[] help = new int[r - l + 1];
        int i = 0;
        int p1 = l;
        int p2 = m + 1;
        int res = 0;
        while (p1 <= m && p2 <= r) {
//            res += arr[p1] < arr[p2] ? (r - p2 + 1) * arr[p1] : 0;
            if (arr[p1]>arr[p2]){
                res+=(r - p2 + 1);
                System.out.println(arr[p1]+" : "+arr[p2]);
            }
            // 和右边比较 如果大了  说明全部都大了  看下一个数就行了  所以左边++
            help[i++] = arr[p1] > arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= m) {
            help[i++] = arr[p1++];
        }
        while (p2 <= r) {
            help[i++] = arr[p2++];
        }
        for (i = 0; i < help.length; i++) {
            arr[l + i] = help[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,2,3,1};
        System.out.println(smallSum(arr));

    }
}
