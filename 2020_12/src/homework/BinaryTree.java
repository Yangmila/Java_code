package homework;

class Node{
    String val;
    Node left;
    Node right;

    public Node(String val){
        this.val = val;
    }
}

public class BinaryTree {
    public  static Node build(){
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        Node f = new Node("F");
        Node g = new Node("G");

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        e.left = g;
        c.right = f;
        return a;
    }

    // 先序遍历
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    //中序遍历
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }

    //后序遍历
    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val);
    }

    //记录元素个数
    public static int length(Node root){
        if(root == null){
            return 0;
        }
        return 1+length(root.left)+length(root.right);
    }

    //求叶子结点个数
    public static int getLeafSize(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }

        return getLeafSize(root.left) + getLeafSize(root.right);
    }

    //求第k层节点个数
    public static int getKLevelSize(Node root,int k){
        if(root == null || k < 1){
            return  0;
        }
        if(k == 1){
            return 1;
        }
        return getKLevelSize(root.left,k - 1) + getKLevelSize(root.right,k - 1);
    }

    //求二叉树的高度
    public static int getHeight(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return 1 + (leftHeight > rightHeight ? leftHeight : rightHeight);
    }

    //查找val所在的结点
    public static Node find(Node root,String toFind){
        if(root == null){
            return null;
        }
        if(root.val.equals(toFind)){
            return root;
        }
        Node ret = find(root.left,toFind);
        if(ret != null){
            return  ret;
        }
        return find(root.right,toFind);
    }
}
