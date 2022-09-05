package iteratorTesting2;

import java.util.ArrayList;
import java.util.Iterator;


public class llinkedlist<T> implements Iterable<T>{
	Node head = null;
	Node tail = null;
	public int size = 0;
	
	
	private ArrayList<T> list = new ArrayList<T>();
	
	public class Node{
		public T data;
		public Node link = null;
		public Node(T t) {
			data = t;
			size++;
		}
		@Override
		public String toString() {
			StringBuilder SB = new StringBuilder();
			SB.append("My Data is: "+ data);
			return SB.toString();
		}
		
	}
	// Make head with constructor
	
	
	public llinkedlist() {
		
	}
	public llinkedlist(T d) {
		head = new Node(d);
		tail = head;
	}
	
	// add a sequential node
	public void addNode(T d) {
		
		if (head==null){
			Node n = new Node(d);
			head = n;
			tail = n;
			size++;
			return;
			}
		
		tail.link = new Node(d);
		tail = tail.link;
		size++;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		return "soemting";
		
		
	}

	@Override
	public Iterator<T> iterator() {
		Iterator<T> it = new Iterator<T>() {
		public Node next = head;
		@SuppressWarnings("unchecked")
		public T next() {
			if(next==null) {
				next = head;
				return next.data;
			}
			Node n = next;
			next = next.link;
			return (T)n.data;
			
		}
		public boolean hasNext() {
			if(next == null) {
				return false;
			}
			return true;
		}
		
	};
		return it;
	}

}
