public class LK_83 {
//    public ListNode deleteDuplicates(ListNode head) {
//        ListNode a;
//        ListNode p;
//        if (head == null){
//            return head;
//        }
//        if (head.next == null){
//            return  head;
//        }
//        p = head;
//        while (null != head.next){
//            if (head.val == head.next.val){
//                head.next = head.next.next;
//            }else {
//                head = head.next;
//            }
//        }
//        return p;
//    }
public ListNode deleteDuplicates(ListNode head) {
    if (head==null&&head.next == null){
        return head;
    }
    head.next = deleteDuplicates(head.next);
    return head.val == head.next.val ? head.next:head;
}
}
