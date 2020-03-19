



public class q22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        int n = 0;
        int j;
        ListNode p = head;
        while(p!=null){
            p = p.next;
            n++;
        }
        p = head;
        j = n-k;
        for (int i=0;i<j;i++)
            p = p.next;
        return p;
    }

    public static void main(String[] args) {
        Integer[] list = {1,2,3,4,5,6};
        ListNode head = new LinkList(list).CreateList();
        q22 q22 = new q22();
        ListNode kthFromEnd = q22.getKthFromEnd(head, 2);
        System.out.println(kthFromEnd.val);

    }
}
