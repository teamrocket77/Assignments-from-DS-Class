package assignment4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class RadixSort {
	// Class:             Data Structures Section 03
	// Term:              Spring: 2022
	// Name:              
	// Program Number:    assignment4
	// IDE:               Eclipse
	// DATE:              04 19,2022
	// JRE: 	      15.0.1% 
	
	public static void main(String[] args) {
	String option = "y";
	Integer[] IntegerArray;
	String[] stringArray;
	Integer MAX_INT;
	java.util.Scanner s = new java.util.Scanner(System.in);

	//begin while loop 
	while (option.equals("y")) {
		
		//get integer amount 
		System.out.print("How many integers do you have?: ");
		MAX_INT = Integer.parseInt(s.nextLine().trim());
		
		System.out.println();
		
		System.out.print("Enter " + MAX_INT + " integer numbers: ");
		//get integers as string array
		stringArray = s.nextLine().split(" ");
		System.out.println("------------------------------------------------------");
		
		
		System.out.println();
		
		//convert string[] to int[]
		IntegerArray = new Integer[MAX_INT];
		for (int i = 0; i < MAX_INT; i++) {
			IntegerArray[i] = Integer.parseInt(stringArray[i].trim());
		}
		//Remove the final char and create object to print out
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < MAX_INT; i++) {
			buf.append(IntegerArray[i] + ", ");
		}
		buf.deleteCharAt(buf.length() - 1);
		//print out string buffer
		System.out.println("Inputs array before sorting (radix):  " + buf.toString());
		buf.setLength(0);
		
		
		RadixSort(IntegerArray);

		for (int i = 0; i < MAX_INT; i++) {
			buf.append(IntegerArray[i] + ",");
		}
		buf.deleteCharAt(buf.length() - 1);
		System.out.println("Inputs array after sorting (radix):  " + buf.toString());
		buf.setLength(0);
		
		System.out.print("Do you want to continue? (Y/N)");
		option = s.nextLine().trim().toLowerCase();
	}
	
	s.close();

	
}

	
	public static ArrayList<Queue<Integer>> Buckets = new ArrayList<Queue<Integer>>();

	/*
	 * Created the buckets that will be used in radix sort
	 * @param: int[] list: the list to be sorted
	 */
	public static void RadixSort(Integer [] list) {
		
		for (int i = 0; i < 10 ; i++) {
			Buckets.add(new Queue<Integer>());
		}
		Sort(list);
	}
	
	/*
	 * Helper method
	 * 
	 * @param: int[] list: the list to be sorted 
	 */
	public static void Sort(Integer[] list) {
		Sort(list, Collections.max(Arrays.asList(list)));
	}

	/*
	 * Method Sorts the int[] list
	 * 
	 *  Pseduocode
	 *  
	 *  SET i = 10: I is the counter that we will to perform the % operation
	 *  
	 *  for j in list.length; ++
	 *  	
	 *  	if (i == 10 ) // first iteration
	 *  		key = list[j] % 10 // to get the first value
	 *  
	 *  	else
	 *  		key = list[j] % i // for other cases
	 *  		key = key/(i/10) for rounding purposes since key is an int this will remove the decimal from 
	 *  					the key/10 operation
	 *  
	 *  	GET Buckets.key as bucket
	 *  		-> Enqueue the key
	 *  
	 *  for (bucket in Buckets)
	 *  	while !bucket.isEmpty()
	 *  		list[j] bucket.dequeue()
	 * 
	 * 
	 * @param: int[][ list: the list to be sorted
	 * @param: int max: the max of the list as identified by the collections function
	 */
	public static void Sort(Integer[] list, int max) {
		int key;
		int i = 10;
		
		do {
			int j;
			for ( j = 0; j < list.length; j++) {

				if (i == 10)
					key = list[j] % i;
				else {
					key = list[j] % i;
					key = key/(i/10);
					
				}
				Buckets.get(key).enqueue(list[j]);
			}
			j = 0;
			for ( int k = 0; k < Buckets.size() ; k++) {
				while (!Buckets.get(k).isEmpty()) {
					list[j] = Buckets.get(k).dequeue();
					j++;
				}
			}
			i = i * 10;
			
		}
		while (i <= max * 10);
	}
}
/*
 * Additional Comments for symbolic testing
 * 331, 454, 230, 34, 343, 45, 59, 543, 345, 231, 9
 * 
 * After 1st sort 
 * 	: Depositing elements into buckets Based on the number in the single digits
 * 
 * 230, 331, 231, 343, 453, 454, 45, 345, 59, 9
 * 
 * After second sort
 * 	: Depositing elements into buckets based off second digit
 * 
 * 9, 230, 331, 231, 34, 343, 45, 345, 453, 454, 59
 * 
 *After third sort
 *	: Depositing elements into buckets basedd of third digit
 *	: Note that 9 == 009 
 *
 *	9, 34, 45, 59, 230, 231, 331, 343, 453, 454 */
