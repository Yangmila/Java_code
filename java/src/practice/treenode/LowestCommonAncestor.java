package practice.treenode;
// 最近公共祖先 LCA
//给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
//
//百度百科中最近公共祖先的定义为：“对于有根树 T 的两个节点 p、q，最近公共祖先表示为一个节点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
public class LowestCommonAncestor {
    public TreeNode lca = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        // 我们期望在 find 递归的过程中, 找到 lca , 并且
        // 把结果放到 lca 成员变量中
        find(root, p, q);
        return lca;
    }

    // 只要当前 root 这个树中能找到 p 或者 q, 找到一个, 就返回 true
    public boolean find(TreeNode root, TreeNode p, TreeNode q) {
        // find 要做的事情就是针对当前节点 root 进行查找 p 和 q
        if (root == null) {
            // 空树里肯定找不到, 就返回 false
            return false;
        }
        // 使用 ? : 把 boolean 转换成 整数
        int mid = (root == p || root == q) ? 1 : 0;
        int left = find(root.left, p, q) ? 1 : 0;
        int right = find(root.right, p, q) ? 1 : 0;
        if (mid + left + right == 2) {
            // p 和 q 来自于 3 个渠道中的 2 个, 就认为找到了 lca
            lca = root;
        }
        // 只要找到了其中的 p 或者 q 中的一个, 都可以返回 true
        // 要是找到两个也是 返回 true
        // 一个都没找到才是返回 false
        return (left + right + mid) > 0;
    }
}
