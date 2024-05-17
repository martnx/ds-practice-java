package Stack;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		// *****************************************************
		
		// stack = LIFO data structure. Last-In First-Out
		//               stores objects into a sort of "vertical tower"
		//		  push() to add objects to the top
		//		  pop() to remove objects from the top
				
		// uses of stacks?
		// 1. undo/redo features in text editors
		// 2. moving back/forward through browser history
		// 3. backtracking algorithms (maze, file directories)
		// 4. calling functions (call stack)
				
		//  *****************************************************
		
		Stack<String> string = new Stack<String>();
		
		Stack<Integer> integer = new Stack<Integer>();
		
		//to check if empty
		//System.out.println(string.isEmpty());
		
		//***** basic method
		string.push("atomic habits");
		string.push("Letters from a stoic");
		string.push("Fairy tale");
		string.push("48 law");
		
		//System.out.println(string.pop());
		for(int i = 0; i < 15; i++) {
			string.push("Manga");
		}
		
		System.out.print(string);

	}

}
