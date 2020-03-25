import java.util.LinkedList;
import java.util.Queue;

public class p27 {
    public TreeNode mirrorTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode temp=null;
        TreeNode child;
        while(!queue.isEmpty()){
            System.out.println(queue.peek().val);
            while (queue.peek()==null) {
//                temp=queue.poll();
                System.out.println(queue.peek()==null);
            }
            temp = queue.poll();
            child = temp.left;
            temp.left = temp.right;
            temp.right = child;
            queue.offer(temp.right);
            queue.offer(temp.left);
            System.out.println(temp);
        }
        return root;
    }

    public static void main(String[] args) {
        Integer[] integers = {4, 2, 7, 1, 3, 6, 9};
        TreeNode tree = new BinTree(integers).createTree();
        p27 p27 = new p27();
        TreeNode treeNode = p27.mirrorTree(tree);
        System.out.println(treeNode.val+" "+treeNode.left.val+" "+treeNode.right.val);
    }
}
