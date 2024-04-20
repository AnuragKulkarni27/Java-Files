public class BST {
    public static void main(String[] args) {
        BST tree = new BST();
        int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
        tree.populate(nums);
        //int[] nums1 = { 1,2,3,4,5 };
        //tree.populatesorted(nums1);
        tree.display();
    }
    public class Node{
        private int value;
        Node left;
        Node right;
        private int height;
        public Node(int value){
            this.value=value;
        }
        public int getvalue(){
            return value;
        }
    }
    private Node root;
    public BST(){}
    public void insert(int value) {
        root = insert(value, root);
    }
    
    private Node insert(int value, Node node) {
        if (node == null) {
        node = new Node(value);
        return node;
        }
    
        if (value < node.value) {
        node.left = insert(value, node.left);
        }
        if (value > node.value) {
        node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }
    public void populate(int[] nums){
        for(int i=0;i<nums.length;i++) this.insert(nums[i]);
    }
    public void populatesorted(int[] nums) {
        populatesorted(nums, 0, nums.length);
    }
    private void populatesorted(int[] nums, int s, int e){
        if(s>=e) return;
        int m=(s+e)/2;
        this.insert(nums[m]);
        populatesorted(nums, s,m);
        populatesorted(nums,m+1,e);
        }
    public void display() {
        display(this.root, "Root Node: ");
    }
    private void display(Node node, String deatils){
        if(node==null) return;
        System.out.println(deatils + node.value);
        display(node.left, " Left child of " + "");
        display(node.right, " Right child of " + "");
    }
    public boolean isempty(){
        return root == null;
    }
    public int height(Node node){
        if(node == null) return -1;
        return node.height;
    }
        public boolean balanced() {
            return balanced(root);
        }
        private boolean balanced(Node node) {
            if (node == null) return true;
            return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
        }
}
