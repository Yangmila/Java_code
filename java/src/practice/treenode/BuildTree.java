package practice.treenode;

import java.util.ArrayList;
import java.util.List;
//从前序与中序遍历序列构造二叉树
//给定一棵树的前序遍历 preorder 与中序遍历  inorder。请构造二叉树并返回其根节点。
public class BuildTree {
    public int index = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // 为了让多个用例之间相互不影响, 每次进入这个入口方法
        // 都需要把 index 再清空
        index = 0;

        // 当前给定的第二个参数表示中序遍历结果. int[]
        // 为了让后面的操作方便, 此处我们把这个 int[] => List<Integer>
        // 方便后续代码中截取 中序中的 某个部分
        List<Integer> inorderList = new ArrayList<>();
        for (int x : inorder) {
            inorderList.add(x);
        }
        return _buildTree(preorder, inorderList);
    }

    // 第一个参数表示整个大的二叉树的先序结果. 不管怎么递归, 这个内容都是相同的.
    // 第二个参数表示当前这个节点对应的子树的中序结果.
    // 这个会随着当前的树(递归的进行) 发生变化的.
    // 如果当前的树是空树, 此时 inorder 就是空的 List

    // 要去进行递归了. 需要把左右子树的中序结果告诉递归方法
    // 左右子树的中序结果就包含在当前这个树的中序结果中.
    // 中序结果 = 左子树的中序 + 根节点 + 右子树的中序
    // 只要知道了根节点在中序结果中的位置, 就能确定出左右子树分别是啥了
    public TreeNode _buildTree(int[] preorder, List<Integer> inorder) {
        if (inorder.isEmpty()) {
            return null;
        }
        // 创建当前节点
        TreeNode root = new TreeNode(preorder[index]);
        index++; // 构建好一个节点之后就 ++, 以备下次构建节点的时候能够读取到下一个元素
        int pos = inorder.indexOf(root.val);
        // 左子树的中序: [0, pos)
        root.left = _buildTree(preorder, inorder.subList(0, pos));
        // 右子树的中序: [pos+1, len)
        root.right = _buildTree(preorder, inorder.subList(pos+1, inorder.size()));
        return root;
    }
}
