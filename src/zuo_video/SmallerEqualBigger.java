package zuo_video;

public class SmallerEqualBigger {

    public static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }
    }

    public static Node listPartition(Node node,int pivot){
        if (node == null){
            return node;
        }
        Node cur = node;
        int i = 0;

        while (cur!=null){
            i++;
            cur = cur.next;
        }

        Node[] nodeArr = new Node[i];

        i  = 0;
        cur = node;
        for (i = 0;i<nodeArr.length;i++){
            nodeArr[i] = cur;
            cur = cur.next;
        }

        arrPartition(nodeArr, pivot);
        int j = 1;
        for (; j < nodeArr.length; j++) {
            nodeArr[j-1].next = nodeArr[j];
        }
        nodeArr[j-1].next = null;

        return nodeArr[0];

    }

    public static void arrPartition(Node[] nodeArr,int pivot){
        int small = -1;
        int big = nodeArr.length;
        int index = 0;

        while (index != big){
            if (nodeArr[index].value < pivot){
                swap(nodeArr,++small,index);
            }else if (nodeArr[index].value== pivot){
                index++;
            }else {
                swap(nodeArr,--big,index);
            }
        }

    }

    public static void swap(Node[] nodeArr,int a, int b ){
        Node tmp = nodeArr[a];
        nodeArr[a] = nodeArr[b];
        nodeArr[b] = tmp;

    }

    public static Node listPartition2(Node head,int pivot){
        Node sH = null;
        Node sT = null;
        Node eH = null; // equal head
        Node eT = null; // equal tail
        Node bH = null; // big head
        Node bT = null; // big tail

        Node next = null; // save next node

        while (head!=null){
            next = head.next;
            head.next = null;

            if (head.value < pivot) {
                if (sH == null) {
                    sH = head;
                    sT = head;
                } else {
                    sT.next = head;
                    sT = head;
                }
            } else if (head.value == pivot) {
                if (eH == null) {
                    eH = head;
                    eT = head;
                } else {
                    eT.next = head;
                    eT = head;
                }
            } else {
                if (bH == null) {
                    bH = head;
                    bT = head;
                } else {
                    bT.next = head;
                    bT = head;
                }
            }
                head = next;
            }
            if (sT!= null){
                sT.next = eH;
                eT = eT==null? sT:eT;
        }
            if (eT!=null){
                eT.next = bH;
            }

            return sH != null ? sH:eH != null ? eH:bH;
    }
    public static void printLinkedList(Node node) {
        System.out.print("Linked List: ");
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head1 = new Node(7);
        head1.next = new Node(9);
        head1.next.next = new Node(1);
        head1.next.next.next = new Node(8);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(2);
        head1.next.next.next.next.next.next = new Node(5);
        printLinkedList(head1);
         head1 = listPartition(head1, 7);
//        head1 = listPartition2(head1, 5);
        printLinkedList(head1);

    }
}
