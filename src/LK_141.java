public class LK_141 {
    public boolean hasCycle(ListNode head) {
        if (head == null||head.next==null){
            return  false;
        }
        ListNode fir = head;
        ListNode sec = head;
        while (sec.next!=null&&sec.next.next!=null){
            fir = fir.next;
            sec = sec.next.next;

           if (sec.val == fir.val){
               return true;
           }

        }
        return false;
    }
}
