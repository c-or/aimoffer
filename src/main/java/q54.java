import java.util.LinkedList;
import java.util.Stack;

public class q54 {
    public int kthLargest(TreeNode root, int k) {
        TreeNode temp;
        temp = root;
        int value = -1;
        Stack<TreeNode> stack = new Stack<>();
        while(k>0&&(temp!=null||!stack.isEmpty())){
            if (temp!=null) {
                stack.push(temp);
                temp = temp.right;

            }
            else {
                temp = stack.pop();
                value = temp.val;
                System.out.println(value);
                k--;
                temp = temp.left;
            }
        }

    return value;
    }

    public static void main(String[] args) {
        q54 q54 = new q54();
        Integer[] a = {5,3,6,2,4,null,null,1};
        TreeNode root = new BinTree(a).createTree();
        q54.kthLargest(root,5);

    }
}
