package iteratorTesting2;

import java.util.Iterator;

public class iterator2 {

	public static void main(String[] args) {
		llinkedlist<String> s = new llinkedlist<>();
		s.addNode("something");
		s.addNode("Else");
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
