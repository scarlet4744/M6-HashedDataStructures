


public class Module6_Wianecki_Assignment1 extends BinarySearchTree {

    public static void main(String[] args) {
        
        
        BinarySearchTree nameTree = new BinarySearchTree();
        
        String[] names = {"Daniel", "George", "Adam", "Peter", "Michael", "Jones", "Tom", "Allison", "James", "Brian" };
        int size = names.length;
        //System.out.println(size);
        
        
        root = nameTree.arrayToBST(names, 0, size - 1);
        
        System.out.println("Binary Search Tree: ");
        nameTree.printTree( root);
        
        System.out.println("\n-----------------------------------------\n");
        
        System.out.println("Preorder traversal: ");
        nameTree.preOrder(root);
        
        System.out.println("\n-----------------------------------------\n");
        
        System.out.println("Inorder traversal: ");
        nameTree.inOrder(root);
        
        System.out.println("\n-----------------------------------------\n");
      
        System.out.println("Postorder traversal: ");
        nameTree.postOrder(root);
        
        
        
        
    }
}
