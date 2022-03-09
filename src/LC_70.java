public class LC_70 {
    class Solution {
        // private Map<Integer,Integer>  storeMap = new HashMap<>();
        // public int climbStairs(int n) {
        //     if(n==1) return 1;
        //     if(n==2) return 2;
        //     if(null!=storeMap.get(n)){
        //         return storeMap.get(n);
        //     }
        //     else{
        //         int result =  climbStairs(n-1)+climbStairs(n-2);
        //         storeMap.put(n,result);
        //         return result;
        //     }

        // }
        public int  climbStairs(int n ){
            if(n==1) return 1;
            if(n==2) return 2;
            int pre = 2;
            int pre_p = 1;
            int result = 0;
            for(int i= 3; i<=n;++i){
                result = pre + pre_p;
                pre_p = pre;
                pre = result;
            }
            return result;
        }
    }
}
