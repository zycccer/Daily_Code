package zuo_video;

public class ReverseList {
    public static class Node{
        public int val;
        public Node next;
        public Node(int val){
            this.val = val;
        }
    }

    public static class DoubleNode{
        public int val;
        public DoubleNode first_Node;
        public DoubleNode last_Node;

        public DoubleNode(int val){
            this.val = val;
        }
    }
    public static Node reverseNode(Node node){

        Node pre = null;
        Node next = null;

        while (node!=null){
            next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
      return pre;
    }
    public static DoubleNode reverseList(DoubleNode head){
        DoubleNode pre = null;
        DoubleNode next = null;
        while (head!=null){
            next = head.last_Node;
            head.last_Node = pre;
            head.first_Node =next;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static Node reverseList(Node head) {
        Node pre = null;
        Node next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }


    public static void printLinkedList(Node head) {
        System.out.print("Linked List: ");
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void printDoubleLinkedList(DoubleNode head) {
        System.out.print("Double Linked List: ");
        DoubleNode end = null;
        while (head != null) {
            System.out.print(head.val + " ");
            end = head;
            head = head.last_Node;
        }
        System.out.print("| ");
        while (end != null) {
            System.out.print(end.val + " ");
            end = end.first_Node;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1 = reverseNode(head1);
        printLinkedList(head1);

        DoubleNode head2 = new DoubleNode(1);
        head2.last_Node = new DoubleNode(2);
        head2.last_Node.first_Node = head2;
        head2.last_Node.last_Node = new DoubleNode(3);
        head2.last_Node.last_Node.first_Node = head2.last_Node;
        head2.last_Node.last_Node.last_Node = new DoubleNode(4);
        head2.last_Node.last_Node.last_Node.first_Node = head2.last_Node.last_Node;
        printDoubleLinkedList(head2);
        printDoubleLinkedList(reverseList(head2));
    }
}
