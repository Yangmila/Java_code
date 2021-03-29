package homework;

class BinaryNode {
    public int key;
    public int value;
    public BinaryNode left;
    public BinaryNode right;

    public BinaryNode(int key,int value){
        this.key = key;
        this.value = value;
    }
}

public class BinarySearchTree{
    private BinaryNode root = null;

    //匹配当前值
    public  Integer get(int key){
        BinaryNode cur = root;
        while(cur != null){
            if(key < cur.key){
                cur = cur.left;
            }else if(key > cur.key){
                cur = cur.right;
            }else{
                return cur.value;
            }
        }
        return null;
    }

    //添加新节点
    public void put(int key,int value){
        if(root == null){
            root = new BinaryNode(key,value);
            return;
        }
        BinaryNode cur = root;
        BinaryNode parent = null;

        while(cur != null){
            if(key < cur.key){
                parent = cur;
                cur = cur.left;
            }else if(key > cur.key){
                parent = cur;
                cur = cur.right;
            }else{
                cur.value = value;
                return;
            }
        }

        BinaryNode newNode = new BinaryNode(key,value);
        if(newNode.key < parent.key){
            parent.left = newNode;
        }else {
            parent.right = newNode;
        }
    }

    //删除节点
    public void remove(int key){
        BinaryNode cur = root;
        BinaryNode parent = null;
        while(cur != null){
            if(key < cur.key){
                parent = cur;
                cur = cur.left;
            }else if(key > cur.key){
                parent = cur;
                cur = cur.right;
            }else {
                removeNode(parent,cur);
                return;
            }
        }
    }

    public void removeNode(BinaryNode parent,BinaryNode cur){
        // 1. 待删除的节点的左子树为 null
        if(cur.left == null){
            if(cur == root){
                root = cur.right;
            }else if(cur == parent.left){
                parent.left = cur.right;
            }else if(cur == parent.right){
                parent.right = cur.right;
            }
            // 2. 待删除节点的右子树为 null
        }else if(cur.right == null){
            if(cur == root){
                root = cur.left;
            }else if(cur == parent.left){
                parent.left = cur.left;
            }else if(cur == parent.right){
                parent.right = cur.left;
            }
            // 3. 左右子树都存在的情况
        }else {
            BinaryNode goat = cur.right;
            BinaryNode goatParent = cur;
            while(goat.left != null){
                goatParent = goat;
                goat = goat.left;
            }
            cur.key = goat.key;
            cur.value = goat.value;
            if(goat == goatParent.left){
                goatParent.left = goat.right;
            }else {
                goatParent.right = goat.right;
            }
        }
    }
}
