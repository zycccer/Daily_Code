package zuo_video;

import javax.swing.plaf.nimbus.State;
import java.util.Stack;

public class IsPalindromeList {
    public static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }
    }
    
    public static boolean isPalindrome_one(Node node){
        Stack<Node> stack  = new Stack<>();
        Node cur = node;
        while (cur!=null){
            stack.push(cur);
            cur = cur.next;
        }
        
        while (node!=null){
            if (node.value !=stack.pop().value){
                return false;
            }
            node = node.next;
        }
        return true;
    }
    
    public static boolean isPalindrome_two(Node node){
        if (node == null || node.next==null){
            return true;
        }
        
        Node right = node.next;
        Node cur = node;
        
        while (cur.next != null && cur.next.next !=null){
            right = right.next;
            cur = cur.next.next;
        }
        
        Stack<Node> stack = new Stack<>();
        while (right != null){
            stack.push(right);
            right =right.next;
        }
        
        while (!stack.isEmpty()){
            if (stack.pop().value != node.value){
                return  false;
            }
            node = node.next;
        }
        return true;
    }
    
    public static boolean isPalindrome_three(Node node){
        if (node == null || node.next ==null ){
            return true;
        }
        Node n1  = node;
        Node n2  = node;
        
        while (n2.next  != null && n2.next.next!=null){
            n1 = n1.next;
            n2 = n2.next.next;
        }
        
        n2 = n1.next;
        n1.next = null;
        Node n3 = null;
        
        while (n2!=null){
          n3 = n2.next;
          n2.next = n1;
          n1 = n2;
          n2 = n3;
        }
        n3 = n1;
        n2 = node;
        
        boolean ret = true;
        while (n1 !=null && n2 !=null){
            if (n1.value != n2.value) {
                ret = false;
                break;
            }
            n1 = n1.next; // left to mid
            n2 = n2.next; // right to mid 
        }
        n1 = n3.next;
        n3.next = null;
        while (n1 != null) { // recover list
            n2 = n1.next;
            n1.next = n3;
            n3 = n1;
            n1 = n2;
        }
        return ret;
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

        Node head = null;
        printLinkedList(head);
        System.out.print(isPalindrome_one(head) + " | ");
        System.out.print(isPalindrome_two(head) + " | ");
        System.out.println(isPalindrome_three(head) + " | ");
        printLinkedList(head);
        System.out.println("=========================");

        head = new Node(1);
        printLinkedList(head);
        System.out.print(isPalindrome_one(head) + " | ");
        System.out.print(isPalindrome_two(head) + " | ");
        System.out.println(isPalindrome_three(head) + " | ");
        printLinkedList(head);
        System.out.println("=========================");

        head = new Node(1);
        head.next = new Node(2);
        printLinkedList(head);
        System.out.print(isPalindrome_one(head) + " | ");
        System.out.print(isPalindrome_two(head) + " | ");
        System.out.println(isPalindrome_three(head) + " | ");
        printLinkedList(head);
        System.out.println("=========================");

        head = new Node(1);
        head.next = new Node(1);
        printLinkedList(head);
        System.out.print(isPalindrome_one(head) + " | ");
        System.out.print(isPalindrome_two(head) + " | ");
        System.out.println(isPalindrome_three(head) + " | ");
        printLinkedList(head);
        System.out.println("=========================");

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        printLinkedList(head);
        System.out.print(isPalindrome_one(head) + " | ");
        System.out.print(isPalindrome_two(head) + " | ");
        System.out.println(isPalindrome_three(head) + " | ");
        printLinkedList(head);
        System.out.println("=========================");

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(1);
        printLinkedList(head);
        System.out.print(isPalindrome_one(head) + " | ");
        System.out.print(isPalindrome_two(head) + " | ");
        System.out.println(isPalindrome_three(head) + " | ");
        printLinkedList(head);
        System.out.println("=========================");

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(1);
        printLinkedList(head);
        System.out.print(isPalindrome_one(head) + " | ");
        System.out.print(isPalindrome_two(head) + " | ");
        System.out.println(isPalindrome_three(head) + " | ");
        printLinkedList(head);
        System.out.println("=========================");

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        printLinkedList(head);
        System.out.print(isPalindrome_one(head) + " | ");
        System.out.print(isPalindrome_two(head) + " | ");
        System.out.println(isPalindrome_three(head) + " | ");
        printLinkedList(head);
        System.out.println("=========================");

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        printLinkedList(head);
        System.out.print(isPalindrome_one(head) + " | ");
        System.out.print(isPalindrome_two(head) + " | ");
        System.out.println(isPalindrome_three(head) + " | ");
        printLinkedList(head);
        System.out.println("=========================");

    }
}

