package practice.treenode;
//二叉树的锯齿形层序遍历
//给定一个二叉树，返回其节点值的锯齿形层序遍历。
// （即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
import java.util.ArrayList;
import java.util.List;

public class ZigzagLevelOrder {
    // result 就用于表示最终的结果
    // 为了能够在递归方法中方便的进行更新, 把这个结果
    // 做成了一个成员变量.
    public List<List<Integer>> ret = null;
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // 我们需要保证每次调用 levelOrder 都创建新的 result
        // 防止多个用例之间相互干扰.
        ret = new ArrayList<>();
        if(root == null){
            return ret;
        }
        // 我们的策略是采取递归的方式进行先序遍历, 把该节点的层数信息
        // 放到递归方法的参数中.
        helper(root,0);
        return ret;
    }
    public void helper(TreeNode root,int level){
        if(level == ret.size()){
            // 如果满足这个条件, 意味着, 下面直接取下标就会出现
            // 越界的情况, 就需要给二维 List 中添加一个新行
            ret.add(new ArrayList<Integer>());
        }
        // 就是一个简单的先序遍历.
        // 访问节点操作, 是把当前节点放到 result 的合适位置上.
        if (level % 2 == 0){
            ret.get(level).add(root.val);
        }else {
            ret.get(level).add(0,root.val);
        }
        // 递归处理左右子树即可
        if(root.left != null){
            helper(root.left,level + 1);
        }
        if(root.right != null){
            helper(root.right,level + 1);
        }
    }
}
