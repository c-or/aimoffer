import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x)
        {val = x;}
    }

public class q55_1 {
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        int deepth = 0;
        TreeNode temp,flag,flag_temp = null;
        flag = root;
        queue.offer(root);
        while (!queue.isEmpty()){
            temp = queue.poll();
            if (temp.left!=null){
                flag_temp = temp.left;
                queue.offer(temp.left);
            }
            if (temp.right!=null){
                flag_temp = temp.right;
                queue.offer(temp.right);
            }
            if(temp==flag) {
                flag = flag_temp;
                deepth++;
            }

        }
        return deepth;
    }
}
