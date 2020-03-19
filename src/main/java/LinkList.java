import java.util.LinkedList;

public class LinkList {
    Integer[] list;
    LinkList(Integer[] list){
        this.list = list;
    }

    ListNode CreateList(){
        LinkedList<ListNode> listNodes = new LinkedList<>();
        int length = list.length;
        ListNode temp;
        for (int i=0;i<length;i++){
            temp = new ListNode(list[i]);
            listNodes.add(i,temp);
        }
        for (int i=0;i<length-1;i++)
            listNodes.get(i).next = listNodes.get(i+1);
        return listNodes.get(0);
    }

}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}