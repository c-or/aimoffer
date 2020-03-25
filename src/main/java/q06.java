
import java.util.Arrays;
import java.util.Stack;

public class q06 {
    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode p;
        p = head;
        while (p!=null){
            stack.push(p);
            p = p.next;
        }
        int length = stack.size();
        int[] nodes = new int[length];
        for (int i=0;i<length;i++) {
            nodes[length-1-i] = stack.get(i).val;
        }
        return nodes;
    }

    public static void main(String[] args) {
        Integer[] list = {1,2,3,4,5,6};
        ListNode listNode = new LinkList(list).CreateList();
        q06 q06 = new q06();
        int[] ints = q06.reversePrint(listNode);
        for (int i :
                ints) {
            System.out.println(i);
        }
    }

}
