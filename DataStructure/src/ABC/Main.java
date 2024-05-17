package ABC;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		 // Create a LinkedList of Strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the linked list
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Print the initial linked list
        System.out.println("Initial Linked List: " + linkedList);

        // Add an element at the beginning
        linkedList.addFirst("Grapes");
        System.out.println("After adding Grapes at the beginning: " + linkedList);

        // Add an element at the end
        linkedList.addLast("Mango");
        System.out.println("After adding Mango at the end: " + linkedList);

        // Remove an element from a specific position
        linkedList.remove(2);
        System.out.println("After removing element at index 2: " + linkedList);

        // Check if an element exists in the linked list
        boolean containsBanana = linkedList.contains("Banana");
        System.out.println("Does the linked list contain Banana? " + containsBanana);

        // Iterate through the linked list and print each element
        System.out.print("Linked List Elements: ");
        for (String fruit : linkedList) {
            System.out.print(fruit + " ");
        }

	}

}
