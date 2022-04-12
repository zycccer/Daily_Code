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
}
