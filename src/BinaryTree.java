import java.util.Scanner;
public class BinaryTree {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BinaryTree tree=new BinaryTree();
        tree.populate(scanner);
        tree.display();
    }
    public BinaryTree(){}
    private static class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value=value;
        }
    }
    private Node root;
    private void populate(Scanner scanner){
        System.out.println("Enter the root Node:");
        int value = scanner.nextInt();
        root=new Node(value);
        populate(scanner, root);
    }
    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter left" + node.value);
        boolean left = scanner.nextBoolean();
        if(left){
        System.out.println("Enter the Value of the left" + node.value);
        int value=scanner.nextInt();
        node.left=new Node(value);
        populate(scanner,node.left);
        }
        System.out.println("Do you want to enter right" + node.value);
        boolean right = scanner.nextBoolean();
        if(right){
        System.out.println("Enter the Value of the right" + node.value);
        int value=scanner.nextInt();
        node.right=new Node(value);
        populate(scanner,node.right);
        }
    }
    public void display() {
        display(root, 0);
    }
    private void display(Node node, int level){
        if(node==null) return;
        display(node.right, level+1);
        if(level!=0){
            for(int i=0;i<level-1;i++){
                System.out.print("|\t");
            }
            System.out.println("|------->"+node.value);
        }else System.out.println(node.value);
        display(node.left, level+1);
    }
    public void preorder(){ 
        preorder(root);
    }
    private void preorder(Node node){
        if(node==null) return;
        System.out.println(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }
    public void inorder(){
        inorder(root);
    }
    private void inorder(Node node){
        if(node==null) return;
        inorder(node.left);
        System.out.println(node.value + " ");
        inorder(node.right);
    }
    public void postorder(){
        postorder(root);
    }
    private void postorder(Node node){
        if(node==null) return;
        postorder(node.left);
        System.out.println(node.value + " ");
        postorder(node.right);
    }
}
