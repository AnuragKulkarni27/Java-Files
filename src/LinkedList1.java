public class LinkedList1 {
    private Node head;
    private Node tail;
    private int size;
    private class Node {
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value ;
        }
        public Node(int value, Node next){
            this.value =  value;
            this.next =  next;
        }
    }
    public void insertfirst(int val){
        Node node = new Node(val);
        node.next =  head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size +=1;
    }
    public void insertlast(int val){
        if(tail == null){
            insertfirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail =  node;
        size++;
    }
    public void insert(int val, int index){
        if(index == 0){
            insertfirst(val);
            return;
        }
        if(index == size){
            insertlast(val);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next= node;
        size++;
    }
    public int deletefirst(){
        int val = head.value;
        head = head.next;
        if(head==null) tail = null;
        size--;
        return val;
    }
    public int deletelast(){
        if(size<=1){
            return deletefirst();
    }
    Node secondlast = get(size - 2);
    int val = tail.value;
    tail = secondlast;
    tail.next =  null;
    size--;
    return val;
}
public Node get(int index){
    Node node = head;
    for(int i=0;i<index;i++){
        node = node.next;
    }
    return node;
}
public int delete(int index){
    if(index==0) return deletefirst();
    if(index==size-1) return deletelast();
    Node prev = get(index-1);
    int val = prev.next.value;
    prev.next = prev.next.next;
    size--;
    return val;
}
public void display(){
    Node temp = head;
    while(temp!= null){
        System.out.print(temp.value + "->");
        temp = temp.next;
    }
    System.out.println("END");
}
public void insertRec(int val, int index){
    head = insertRec(val, index, head);
}
private Node insertRec(int val, int index, Node node){
    if (index == 0) {
        Node temp = new Node(val, node);
        size++;
        return temp;
    }

    node.next = insertRec(val, index-1, node.next);
    return node;
}
    public static void main(String[] args) {
        LinkedList1 first = new LinkedList1();
        LinkedList1 second = new LinkedList1();

        first.insertlast(1);
        first.insertlast(3);
        first.insertlast(5);

        second.insertlast(1);
        second.insertlast(2);
        second.insertlast(9);
        second.insertlast(14);

        LinkedList1 list = new LinkedList1();
        for (int i = 7; i > 0; i--) {
            list.insertlast(i);
        }
        first.display();
        second.display();
        list.display();

        list.insertRec(88, 2);
        list.display();
    }

}
