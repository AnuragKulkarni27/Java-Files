import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class pathsum {
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
    private Node root;
    public pathsum(){}
    static int countpaths(Node node, int sum){
        List<Integer> path = new ArrayList<>();
        return helper(node, sum, path);
    }
    static int helper(Node node, int sum, List<Integer> path){
        if(node==null) return 0;
        path.add(node.value);
        int count =0;
        int s=0;
        ListIterator<Integer> itr = path.listIterator(path.size());
        while(itr.hasPrevious()){
            s+=itr.previous();
            if(s==sum) count++;
        }
        count += helper(node.left, s, path) + helper(node.right, sum, path);
        path.remove(path.size()-1);
        return count;
    }
}
