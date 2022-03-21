public class LC_8 {
    public boolean isPalindrome(int x) {
        if (x<0)return false;
        int r=0,y=0;
        int que = x;
        while (que!=0){
             y= que%10;
             r = r*10+y;
             que = que/10;

        }

        return true;
    }
}
