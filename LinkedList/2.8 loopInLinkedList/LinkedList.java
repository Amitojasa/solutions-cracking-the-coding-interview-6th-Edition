import java.io.*; 
 
public class LinkedList { 

	Node head;
	static Node l;
	static class Node { 

		int data; 
		Node next; 

		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 

	public static LinkedList insert(LinkedList list, int data) 
	{ 
		Node new_node = new Node(data); 
		new_node.next = null; 
		//creating loop
		if(data==4){
			l=new_node;
		}
		//
		
		if (list.head == null) { 
			list.head = new_node; 
		} 
		else { 

			Node last = list.head; 
			while (last.next != null) { 
				last = last.next; 
			} 

			last.next = new_node; 
			//creating Loop 
			if(data==8){
				new_node.next=l;
			}
			//
		} 

		return list; 
	} 

	public static void printList(LinkedList list) 
	{ 
		Node currNode = list.head; 

		System.out.print("LinkedList: "); 
		while (currNode != null) { 
			
			System.out.print(currNode.data + " "); 

			currNode = currNode.next; 
		} 
	} 
	public static Node findLoop(LinkedList list){
		Node f,n;
		f=list.head;
		n=list.head;
		
		while(f!=null && n!=null && n.next!=null){
			f=f.next;
			n=n.next.next;
			if(f==n){
				return f;
			}
		}
		return null;
		
	}
	
	public static Node startNode(LinkedList list,Node n){
		
		Node f=list.head;
		while(f!=n){
			f=f.next;
			n=n.next;
		}
		return f;
		
	}

	public static void main(String[] args) 
	{ 

		LinkedList list = new LinkedList(); 

 
		list = insert(list, 1); 
		list = insert(list, 2); 
		list = insert(list, 3); 
		list = insert(list, 4); 
		list = insert(list, 5); 
		list = insert(list, 6); 
		list = insert(list, 7); 
		list = insert(list, 8);
		
		Node n = findLoop(list);
		
		if(n!=null){
			System.out.println(startNode(list,n).data);
		}else{
			System.out.println("No loop present");
			printList(list); 
		}
			

		// Print the LinkedList 
		//printList(list); 
	} 
} 
