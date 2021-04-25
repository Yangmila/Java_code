package homework;

import java.util.ArrayList;
import java.util.List;

public class ZigzagLevelOrder {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        helper(root, result, 0);
        return result;
    }

    public void helper(TreeNode root,ArrayList<ArrayList<Integer>> result, int level) {
        if(root == null){
            return;
        }
        //如果res.size() <= level说明下一层的集合还没创建，所以要先创建下一层的集合
        if(level >= result.size()){
            result.add(new ArrayList<Integer>());
        }
        //遍历到第几层我们就操作第几层的数据
        List<Integer> list = result.get(level);
        //这里默认根节点是第0层，偶数层相当于从左往右遍历，
        // 所以要添加到集合的末尾，如果是奇数层相当于从右往左遍历，
        // 要把数据添加到集合的开头
        if (level % 2 == 0)
            list.add(root.val);
        else
            list.add(0, root.val);
        //分别遍历左右两个子节点，到下一层了，所以层数要加1
        helper(root.left,result,level + 1);
        helper(root.right,result,level + 1);
    }
}
