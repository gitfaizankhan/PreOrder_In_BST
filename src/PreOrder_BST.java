public class PreOrder_BST {
    Node root;
    PreOrder_BST(){
        root = null;
    }
    public static void main(String[] args) {
        PreOrder_BST tree = new PreOrder_BST();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.print("PreOrder Traversal in Binary Search tree: ");
        tree.preOrder();
    }
    void preOrder(){
        preOrder_BST(root);
    }
    void preOrder_BST(Node node){
        if (node == null){
            return;
        }

        System.out.print(node.key+" ");
        preOrder_BST(node.left);
        preOrder_BST(node.right);
    }
}
class Node{
    int key;
    Node left, right;
    Node(int item){
        key = item;
        left = null;
        right = null;
    }
}