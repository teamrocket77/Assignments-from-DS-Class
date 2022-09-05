

import java.util.Iterator;

//Implements Linkedlist
public class newlist<T> {
    Node head = null;
    Node tail = null;
    int size = 0;

    public int indexOf(T t){
        int counter = 0;
        if(head.data ==  t){
            return 0;
        }
        Iterator it = iterator();
        while(it.hasNext()){
            if(it.next() == t){
                return counter;
            }
            counter++;
        }
        return -1;
    }
    public T getFirst(){
        return head.data;
    }
    public T getLast(){
        return tail.data;
    }
    public boolean isEmpty(){
        if (size == 0){
            return true;
        }
        return false;
    }
    public T removeFirst() throws RuntimeException{
        if (size == 0){
            throw new RuntimeException("There are no nodes in the list");
        }
        else if (size == 1){
            T data = head.data;
            head = null;
            tail = null;
            size--;
            return data;
        }
        T data = head.data;
        head = head.link;
        size--;
        return data;
    }
    public void removeLast() throws RuntimeException{
        boolean sentinel = false;
        if (size == 0){
            throw new RuntimeException("There are no nodes in the list");
        }
        if (size == 1){
            head = null;
            tail = null;
            size--;
            return;
        }
        Iterator it = iterator();
        Node p1, p2;
        p1 = null;
        p2 = null;
        while(it.hasNext()){
            if (sentinel){
                p1 = p2;
            }
            sentinel = true;
            p2 = it.next;
            it.next();
        }
        p1.link = null;
        size--;
    }
    public void addLast(T d){
        if (tail == null){
            tail = new Node(d);
            head = tail;
            size++;
            return;
        }
        tail.link = new Node(d);
        tail = tail.link;
        size++;
        return;
    }
    public void addFirst(T d){
        if (head == null){
            head = new Node(d);
            tail = head;
            size++;
            return ;
        }
        Node n = new Node(d);
        n.link = head;
        head = n;
        size++;
        return;
    }
    public void Add(T d, int position){
        if (position == size){
            addLast(d);
            return;
        }
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
        Iterator it = iterator();
        StringBuilder SB = new StringBuilder();
        while(it.hasNext()){
            SB.append(it.next + "\n");
            it.next();
        }
        return SB.toString();
    }
}