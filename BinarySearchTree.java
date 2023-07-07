
public class BinarySearchTree extends Node {
    
    public static Node root;
    
    public Node arrayToBST(String array[], int start, int end) {
        
        if(start > end) {
            return null;
        }
        
        int mid = (start + end) / 2;
        Node node = new Node(array[mid]);
        
        node.left = arrayToBST(array, start, mid - 1);
        node.right = arrayToBST(array, mid + 1, end);
        
        return node;
        
    } //end of arrayToBST
    
    //preorder traversal of the binary search tree
    public void preOrder(Node node) {
        
        if(node == null) {
            
            return;
        }
        
        System.out.print(node.key + " ");
        preOrder(node.left);
        preOrder(node.right);
        
    } //end of preOrder
    
    //inorder traversal of the binary search tree
    public void inOrder(Node node) {
        
        if(node == null) {
            
            return;
        }
        
        inOrder(node.left);
        System.out.print(node.key + " ");
        inOrder(node.right);
      
    } //end of inOrder
    
    //postorder traversal of the binary search tree
    public void postOrder(Node node) {
        
        if(node == null) {
            
            return;
        }
        
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.key + " ");
        
    } //end of postOrder
    
   public void printTree(Node root) {
        if (root == null) return;
        System.out.println(root.key);
        printTree(root.left);
        printTree(root.right);
    }   
    
} //end of BinarySearchTree
