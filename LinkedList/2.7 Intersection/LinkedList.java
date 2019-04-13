import java.io.*; 
 
public class LinkedList { 

	Node head;
	static Node i;
	int count=0;
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
		
		if(data==6){
			i=new_node;
		}
		
		if (list.head == null) { 
			list.head = new_node; 
		} 
		else { 

			Node last = list.head; 
			while (last.next != null) { 
				last = last.next; 
			} 

			last.next = new_node; 
			if(data==30){
				new_node.next=i;
			}
	
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
	public static int counting(LinkedList list){
		
		Node currNode=list.head;
		while (currNode != null) { 
			
			list.count++;

			currNode = currNode.next; 
		} 
		
		return list.count;
	}
	
	public static Node findIntersection(LinkedList list,LinkedList list2, int diff){
		Node l1=list.head;
		Node l2=list2.head;
		if(diff<0){
			while(diff<0){
				l2=l2.next;
				diff++;
			}
		}else{
			while(diff>0){
				l1=l1.next;
				diff--;
			}
		}
		
		while(l1!=null){
			if(l1==l2){
				return l1;
			}
			l1=l1.next;
			l2=l2.next;
		}
		return null;
		
	}
	
	public static void main(String[] args) 
	{ 

		LinkedList list = new LinkedList(); 
		LinkedList list2 = new LinkedList(); 
 
		list = insert(list, 1); 
		list = insert(list, 2); 
		list = insert(list, 3); 
		list = insert(list, 4); 
		list = insert(list, 5); 
		list = insert(list, 6); 
		list = insert(list, 7); 
		list = insert(list, 8);
		list = insert(list, 9);
		list2 = insert(list2, 10);
		list2 = insert(list2, 30);
		
		//printList(list);
		//printList(list2);
		int l1=counting(list);
		//System.out.println(l1);
		int l2=counting(list2);
		//System.out.println(l2);
		
		Node n=findIntersection(list,list2,l1-l2);
		if(n!=null)
			System.out.println(n.data);
		else
			System.out.println("no intersection");
	} 
} 
