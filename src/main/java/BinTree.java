import java.util.LinkedList;

public class BinTree {
    LinkedList<TreeNode> list = new LinkedList<>();
    Integer[] a;
    //int 数组无法存null值，故使用 Integer
    public BinTree(Integer[] a){
        this.a = a;
    }
    public TreeNode createTree(){
        for (Integer i=0;i<a.length;i++){
            if (a[i]!=null) {
                TreeNode treeNode = new TreeNode(a[i]);
                list.add(i,treeNode);
            }
            else {
                TreeNode treeNode = null;
                list.add(i,treeNode);
            }

        }

        int parent_high = list.size()/2-1;
        for (int parentIndex=0;parentIndex<parent_high;parentIndex++){
            //左节点
            list.get(parentIndex).left = list.get(parentIndex*2+1);
            //右节点
            list.get(parentIndex).right = list.get(parentIndex*2+2);
        }
        list.get(parent_high).left = list.get(parent_high*2+1);
        if (list.size()%2==1)
            list.get(parent_high).right = list.get(parent_high*2+2);
        return list.get(0);

    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x)
    {val = x;}


}