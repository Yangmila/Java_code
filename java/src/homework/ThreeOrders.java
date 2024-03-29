package homework;

import java.util.ArrayList;
import java.util.List;

public class ThreeOrders {
    public int[][] threeOrders (TreeNode root) {
        // write code here
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        preOrder(root,list1);
        inOrder(root,list2);
        postOrder(root,list3);

        int[][] res = new int[3][list1.size()];
        for(int i = 0;i < list1.size();i++){
            res[0][i] = list1.get(i);
            res[1][i] = list2.get(i);
            res[2][i] = list3.get(i);
        }
        return res;
    }
    //前序遍历
    public void preOrder(TreeNode root,List<Integer> list){
        if(root == null){
            return ;
        }
        list.add(root.val);
        preOrder(root.left,list);
        preOrder(root.right,list);
    }
    //中序遍历
    public void inOrder(TreeNode root,List<Integer> list){
        if(root == null){
            return;
        }
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }
    //后序遍历
    public void postOrder(TreeNode root,List<Integer> list){
        if(root == null){
            return;
        }
        postOrder(root.left,list);
        postOrder(root.right,list);
        list.add(root.val);
    }
}
