package practice.treenode;
//根据二叉树创建字符串
//你需要采用前序遍历的方式，将一个二叉树转换成一个由括号和整数组成的字符串。
//
//空节点则用一对空括号 "()" 表示。而且你需要省略所有不影响字符串与原始二叉树之间的一对一映射关系的空括号对。
public class Tree2str {
    // 需要在递归过程中, 把当前的结果添加到 stringBuilder 里头
    public StringBuilder stringBuilder = null;
    public String tree2str(TreeNode t) {
        // 为了防止多个用例之间相互影响, 就需要每次进入方法
        // 都去重新初始化
        stringBuilder = new StringBuilder();
        if (t == null) {
            return "";
        }
        // 搞一个辅助递归的方法来完成
        _tree2str(t);

        // 把最外层括号给删掉
        stringBuilder.deleteCharAt(0);
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }

    public void _tree2str(TreeNode root) {
        if (root == null) {
            return;
        }
        // 先序遍历. 访问操作是把元素插入到 stringBuilder 里面
        stringBuilder.append("(");

        stringBuilder.append(root.val);
        _tree2str(root.left);
        if (root.left == null && root.right != null) {
            stringBuilder.append("()");
        }
        _tree2str(root.right);

        stringBuilder.append(")");
    }
}
