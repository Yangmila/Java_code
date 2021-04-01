package homework;

import java.util.Scanner;

public class CreatTree {
    public static class TreeNode{
        public char val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(char val){
            this.val = val;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String input = scanner.next();
            TreeNode root = build(input);
            inOrder(root);
            System.out.println();
        }
    }

    public static int index = 0;
    public static TreeNode build(String line){
        index = 0;
        return _build(line);
    }

    public static TreeNode _build(String input){
        char ch = input.charAt(index);
        if(ch == '#'){
            return null;
        }
        TreeNode root = new TreeNode(ch);
        index++;
        root.left = _build(input);
        index++;
        root.right = _build(input);
        return root;
    }

    public static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
}
