public class LK_142 {
    //等于是他们两个有一个一样就
    public ListNode detectCycle(ListNode head) {
        if (head ==null||head.next == null)return  null;
        ListNode slow, fast;
        slow = head;
        fast =head;
        int k  = 0;
        //这里是与运算
        while (fast.next!=null && fast.next.next!=null){

            if (k == 0 ){
                slow = slow.next;
                fast = fast.next.next;
            }else {
                slow = slow.next;
                fast = fast.next;
            }

            if (slow == fast&&k==0){
                k=1;
                slow = head;
            }
            if (slow == fast&& k==1 ){
                return slow;
            }


        }
        return null;

    }
}
