
public class Node {
    
    public String key;
    public Node left;
    public Node right;
    
    //default constructor
    public Node() {
        
    	key = "";
        left = null;
        right = null;
        
    } //end of default constructor
    
    //constructor 
    public Node(String element) {
        
        this.key = element;
        this.left = null;
        this.right = null;
        
    } //end of constructor
   
} //end of Node