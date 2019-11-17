import java.io.*; 

// Java program to implement 
// a Singly Linked List 
public class LinkedList { 

	Node head; // head of list 

	// Linked list Node. 
	// This inner class is made static 
	// so that main() can access it 
	static class Node { 

		int data; 
		Node next; 

		// Constructor 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 

	// Method to insert a new node 
	public static LinkedList insert(LinkedList list, int data) 
	{ 
        return null;
	} 

	// Method to print the LinkedList. 
	public static void printList(LinkedList list) 
	{ 
		Node currNode = list.head; 

		System.out.print("LinkedList: "); 

		// Traverse through the LinkedList 
		while (currNode != null) { 
			// Print the data at current node 
			System.out.print(currNode.data + " "); 

			// Go to next node 
			currNode = currNode.next; 
		} 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		/* Start with the empty list. */
		LinkedList list = new LinkedList(); 

		// 
		// ******INSERTION****** 
		// 

		// Insert the values 
		list = insert(list, 1); 
		list = insert(list, 2); 
		list = insert(list, 3); 
		list = insert(list, 4); 
		list = insert(list, 5); 
		list = insert(list, 6); 
		list = insert(list, 7); 
		list = insert(list, 8); 

		// Print the LinkedList 
		printList(list); 
	} 
} 
