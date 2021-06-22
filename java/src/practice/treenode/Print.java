package practice.treenode;
//把二叉树打印成多行
//从上到下按层打印二叉树，同一层结点从左至右输出。
//每一层输出一行。

import java.util.*;

//层序遍历大家应该都不陌生，这道题最关键的点在于如何保存层数信息，用变量 deep 存储层数信息，子树的 deep+1，该 deep 可以作为 Lists 的索引：
//
//当 deep >= lists 的大小，说明该层还未被存入过 lists，建立新的 list，存结点值，再把 list 存入 lists
//当 deep < lists 的大小，说明该层已经被存储过，取出原来存在 lists 中的该层 list，把结点信息继续存入 list
//由于递归和非递归算法的特点，将 deep 作为参数传递和作为 map 传递
//层序遍历的模板是用一个队列，入队每次遇到的非空结点，出队当前最前结点，直到队列为空，遍历完成
//现在为了保存层数信息，我们添加了map，每次入队新的结点，map 保存 <结点,层数> 的 <K,V> 对
public class Print {
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(pRoot == null){
            return res;
        }
        ArrayList<Integer> list;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode cur;
        queue.offer(pRoot);
        while(!queue.isEmpty()){
            list = new ArrayList<>();
            int size = queue.size();
            while(size > 0){ //记录上一层的size
                cur = queue.poll();
                list.add(cur.val);
                if(cur.left != null) queue.offer(cur.left);
                if(cur.right != null) queue.offer(cur.right);
                size--;
            }
            res.add(list);
        }
        return res;
    }
}
