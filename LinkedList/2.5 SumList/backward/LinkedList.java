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
	
	public static LinkedList sum(LinkedList l1,LinkedList l2,LinkedList l3){
		Node currNode1=l1.head;
		Node currNode2=l2.head;
		int a,b,c,d=0;
		while(currNode1!=null || currNode2!=null){
			if(currNode1==null){
				a=0;
			}else{
				a=currNode1.data;
				currNode1=currNode1.next;
			}
			if(currNode2==null){
				b=0;
			}else{
				b=currNode2.data;
				currNode2=currNode2.next;
			}
			
			c=a+b+d;
			d=c/10;
			
			l3=insert(l3,c%10);
			

		}
		
		return l3;
		
	}
		
	public static void main(String[] args) 
	{ 

		LinkedList list = new LinkedList(); 
		LinkedList list2 = new LinkedList(); 
		LinkedList list3 = new LinkedList(); 
 
		list = insert(list, 7); 
		list = insert(list, 1); 
		list = insert(list, 6); 
	//321+275=596
		list2 = insert(list2, 5);
		list2 = insert(list2, 9);
		list2 = insert(list2, 2);
		
		list3=sum(list,list2,list3);
		
		printList(list);
		printList(list2);
		
		printList(list3);
		
	} 
} 
