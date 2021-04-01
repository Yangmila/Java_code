package homework;

public class Tree2str {
    public StringBuilder result = null;
    public String tree2str(TreeNode t) {
        result = new StringBuilder();
        if(t == null){
            return "";
        }
        helper(t);
        result.deleteCharAt(0);
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }
    public void helper(TreeNode t){
        if (t == null){
            return;
        }
        result.append("(");
        result.append(t.val);
        helper(t.left);
        if (t.left == null && t.right != null){
            result.append("()");
        }
        helper(t.right);
        result.append(")");
    }
}
