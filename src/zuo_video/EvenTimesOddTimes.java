package zuo_video;

public class EvenTimesOddTimes {
    public static void printOddTimesNum1(int[] arr){
        int e0 = 0;
        for (int a:
             arr) {
            e0^=a;
        }
        System.out.println(e0);
    }
    public static void  printOddTimesNum2(int[] arr){
        int e0 = 0;
        int e1= 0;
        for (int a:arr){
            e0^=a;
        }
        int rigthOne = e0&(~e0+1);
        for (int cur:arr){
            if ((cur & rigthOne)==1)
            {
                e1^=cur;
            }
        }
        System.out.println("a:"+e1);
        System.out.println("b:"+ (e1^e0));
    }

    public static void main(String[] args) {
        int[] arr1 = { 3, 3, 2, 3, 1, 1, 1, 3, 1, 1, 1 };
        printOddTimesNum1(arr1);
        int[] arr2 = { 4, 3, 4, 2, 2, 2, 4, 1, 1, 1, 3, 3, 1, 1, 1, 4, 2, 2 };
        printOddTimesNum2(arr2);
    }

}
