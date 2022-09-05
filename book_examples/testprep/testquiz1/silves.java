


public class silves<T>{
    public int size = 0;
    Node head = null;
    Node tail = null;

    public void push(T t){
        if(head == null){
            head = new Node(t);
            tail = head;
            size++;
            return;
        }
        tail.link = new Node(t);
        tail = tail.link;
        size++;
        return;
    }
    public T pop() throws RuntimeException{
        if (size == 0){
            throw new RuntimeException("There's no nodes in the stack");
        }
        if (size == 1 ){
            T t = head.data;
            tail = null;
            head = null;
            size--;
            return t;
        }
        Node p1 = null;
        Iterator it = iterator();
        while(it.next != tail){
            p1 = it.next;
            it.next();
        }
        T t = tail.data;
        p1.link = null;
        tail = p1;
        size--;
        return t;
    }
    public T peek(){
        return tail.data;
    }
    class Node{
        public T data;
        public Node link = null;
        public Node(T d){
            data = d;
            
        }
        public Node(T d, Node n){
            data = d;
            link = n;
        }

        @Override
        public String toString(){
            return new StringBuilder("data :"+ data).toString();
        }
    }
    public Iterator iterator(){
        return new Iterator();
    }
    class Iterator{
        Node next = head;
        public T next(){
            T datafield = next.data;
            next = next.link;
            return datafield;
        }

        public boolean hasNext(){
            if (next == null){
                return false;
            }
            return true;
        }
        public boolean lookAhead(){
            if (next.link == null){
                return false;
            }
            return true;
        }
    }
    @Override
    public String toString(){
        StringBuilder SB = new StringBuilder();
        Iterator it = iterator();
        while(it.hasNext()){
            SB.append(it.next.toString() + "\n");
            it.next();
        }
        return SB.toString();
    }
}