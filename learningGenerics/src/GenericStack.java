
public class GenericStack <E>{
	
	private java.util.ArrayList<E> list = new java.util.ArrayList<E>();
	
	/* 
	 * IPO
	 * I: Any and all Objects declaring the stack with a reference class makes
	 *		the class that value
	 *
	 *	P: to create several methods that can refer to objecs in a nice way
	 *		here the variable that I've parameterized is E
	 *		E is a general object
	 *		when I make a statement E e I am declaring that e is an object of type E.
	 *
	 *	O: 	Whatever?
	 */
	
	public void Add(E e) {
		list.add(e);
	}
	
	public E peek() {
		return list.get(list.size() -1);
	}
	
	public E pop() {
		E o = list.get(list.size() -1 );
		list.remove(list.size() -1);
		return o;
	}
	
	public boolean isEmpty() {
		if (list.size() != 0) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Stack: " + list.toString();
	}

}
