
public class LearningGenerics {
	public static void main(String args[]) {
		GenericStack<String> s = new GenericStack<String>();
		s.Add("Lisa is cool");
		System.out.println(s.peek());
		System.out.println("Finished");
		String[] str = new String[10];
		print(str);
		java.util.ArrayList list = new java.util.ArrayList();
		list.add("Java Programming");
		

		}
	
	// You can declare a method with a generic type in the header of that method
	// you should be using <letter> after using static
	// That method can be accessed with classname.<Type_to_pass>methodname
	
	public static <E> void print(E[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i] + " ");
			
		}
		System.out.println();
	}
	
	/*
	 * ? is the wildcard operator that is the same as passing the word "object"
	 * ? extends T is an upper bounded phrase that allows a Generic object to be a subtype:
	 * 		Integer, Long, Byte of of those  
	 * 
	 * ? super T:
	 * 		References a super type maybe a number class
	 */
	public static double max(GenericStack<? extends Number> stack) {
		double max = stack.pop().doubleValue();
		
		while (!stack.isEmpty()) {
		}
		
		return 0.0;
		
	}

}
