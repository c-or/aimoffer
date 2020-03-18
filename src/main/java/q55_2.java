import java.util.LinkedList;
import java.util.Queue;

public class q55_2 {
    public int deepth(TreeNode node){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(node);
        TreeNode temp,flag,flag_temp=null;
        flag = node;
        int deepth = 0;
        while (!queue.isEmpty()){
            temp = queue.poll();
            if (temp.left!=null){
                flag_temp = temp.left;
                queue.offer(temp.left);
            }
            if (temp.right!=null){
                flag_temp=temp.right;
                queue.offer(temp.right);
            }
            if (temp==flag) {
                flag = flag_temp;
                deepth++;
            }
        }
        return deepth;
    }

    public boolean isBalanced(TreeNode root) {
        if (root==null)
            return true;
        if (root.left==null && root.right==null)
            return true;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        TreeNode temp;
        int left_d=0,right_d=0;
        while (!queue.isEmpty()){
            temp = queue.poll();
            if (temp.left==null)
                left_d = 0;
            else {
                left_d = deepth(temp.left);
                queue.offer(temp.left);
            }
            if (temp.right==null)
                right_d = 0;
            else {
                right_d = deepth(temp.right);
                queue.offer(temp.right);
            }
            if (right_d-left_d>1||left_d-right_d>1)
                return false;
            }
        return true;
        }

}
