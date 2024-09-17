import java.util.ArrayList;

public class callheap {
    public static void main(String[] args) throws Exception {
        heap<Integer> h=new heap<>();
        h.insert(90);
        h.insert(2);
        h.insert(9);
        h.insert(18);
        ArrayList list=h.heapsort();
        System.out.println(list);
    }
}
