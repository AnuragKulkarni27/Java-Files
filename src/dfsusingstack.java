import java.util.Stack;

public class dfsusingstack {
    public static void main(String[] args) {
        
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
    void dfsstack(Node node){
        if(node==null) return;
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        while(!stack.isEmpty()){
            Node removed = stack.pop();
            System.out.println(removed.value + " ");
            if(removed.right!=null) stack.push(removed.right);
            if(removed.left!=null) stack.push(removed.left);
        }
    }
}
