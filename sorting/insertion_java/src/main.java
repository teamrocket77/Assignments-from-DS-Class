// Class:             Data Structures Section 03
// Term:              Spring: 2022
// Name:              
// Program Number:    insertion_java
// IDE:               Eclipse
// DATE:              03 17,2022
// JRE: 	      15.0.1
class main {
	public static void main(String[] args){

		System.out.println("Hello");
		int[] arr = {3, 2, 1};
		printArr(arr);
		//QuickSortLeft(arr);
		QuickSortRight(arr);
		printArr(arr);

	}
	public static void QuickSortRight(int[] list){
		QuickSortRight(list, 0, list.length -1);
	}
	public static void QuickSortRight(int[] list, int first, int last){
		if (first < last){
			int pivotIndex = partitionRight(list, 0, last);
			QuickSortRight(list, 0, pivotIndex - 1);
			QuickSortRight(list, pivotIndex + 1, last);
		}
	}
	public static int partitionRight(int[] list, int first, int last){
		int pivot = list[last];
		int low = first;
		int high = last - 1;
		while (low < high){
			while (high >= low && list[high] >= pivot) {
			high--;
			}
			while (high > low && list[low] < pivot) {
			low++;
			}
			if ( low <= high ) {
				int temp = list[high];
				list[high] = list[low];
				list[low] = temp;
			}
		}
		while ( low < last && list[low] <= pivot)
			low++;
		if (pivot < list[low]){
			list[last] = list[low];
			list[low] = pivot;
			return low;
		}
		return last;
	}
	public static void printArr(int[] list){
		for (int i = 0; i < list.length; i++){
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}
	public static int partitionLeft(int[] list, int first, int last){
		int pivot = list[first];
		int low = first +1 ;
		int high = last;
		while(high > low){
			while ( low <= high && list[low] <= pivot)
				low++;
			while ( low <= high && list[high] > pivot)
				high--;
			if (high > low){
				int temp = list[low];
				list[low] = list[high];
				list[high] = temp;

			}
		}
		while ((high > first) && list[high] >= pivot){
			high--;
		}
		if (pivot > list[high]){
			list[first] = list[high];
			list[high] = pivot;
			return high;
		}

		return first;
	}
	public static void QuickSortLeft(int[] list){
		QuickSortLeft(list, 0, list.length - 1);
	}
	public static void QuickSortLeft(int[] list, int first, int last){
		if (first < last) {
			int pivotIndex = partitionLeft(list, first, last);
			QuickSortLeft(list, first, pivotIndex - 1);
			QuickSortLeft(list, pivotIndex + 1, last);
		}
	}
}
