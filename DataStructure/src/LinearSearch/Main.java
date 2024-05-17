package LinearSearch;

public class Main {

	public static void main(String[] args) {
		
		// linear search = 	Iterate through a collection one element at a time
		
		//				   	runtime complexity: O(n)
		
		//					Disadvantages:
		//					Slow for large data sets
		
		//					Advantages:
		//					Fast for searches of small to medium data sets
		//					Does not need to sorted
		//					useful for data structures that do not have random access (LinkedList
		
		int[] array = {5, 4, 3, 6, 8, 9, 1, 2, 7};
		
		int index = linerSearch(array, 1);

		if(index != -1) {
			System.out.println("Element found at index: " + index);
			
		}else {
			System.out.println("Element not found");
		}
		
	}

	private static int linerSearch(int[] array, int value) {
		
		for(int i = 0; i < array.length; i++) {
			if(array[i]== value) {
				return i;
			}
		}
		
		return -1;
	}

}
