package Dynamic_Arrays;

import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		
		//ArrayList<String>arrayList = new ArrayList<String>();
		DynamicArray dynamicArray = new DynamicArray();
		
		dynamicArray.add("A");
		dynamicArray.add("B");
		dynamicArray.add("C");
		dynamicArray.add("D");
		dynamicArray.add("E");
		dynamicArray.add("F");
		
		dynamicArray.delete("A");
		dynamicArray.delete("B");
		dynamicArray.delete("C");
		//dynamicArray.insert(0, "X");
		//dynamicArray.delete("A");
		//dynamicArray.search(1);
		
		System.out.println(dynamicArray);
		System.out.println("size: " + dynamicArray.size);
		System.out.println("capacity : " + dynamicArray.capacity);
		System.out.println("empty: " + dynamicArray.isEmpty());
		System.out.println("search: "+ dynamicArray.search("F"));
	}
}
