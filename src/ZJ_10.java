public class ZJ_10 {
    public static int fbnq(Integer n){
        if (n == 0)return  0;
        if (n == 1)return  1;
        else {
          return fbnq(n-1)+fbnq(n-2);
        }
    }

    public static  Integer fbnq_arr(Integer n){
        Integer per = 1;
        Integer per_p = 0;
        Integer result = 0;
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        for (int i = 2; i <=n ; i++) {

            result = per+per_p;
            per_p =  per;
            per = result;

        }
        return  result;
    }
    public static void main(String[] args) {
        System.out.println(fbnq_arr(10));
    }
}
