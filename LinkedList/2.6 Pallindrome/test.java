import java.util.*;
class node{
	int data;
	
	node next=null;
	node prev=null;
	node head;
	node last=head;
	node(){
		head=this;

	}
	node(int data){
		this.data=data;
	}
	
	public void add(int data){
		node end = new node(data);
		node n=this.head;
		node prev;
		while(n.next!=null){
			n=n.next;
			
		}
		n.next=end;
		end.prev=n;
		this.last=end;
	}
	
	public void show(){
		node n=this.head.next;
		while(n!=null){
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.println();
	}
	public void reverse(node n2){
		node n=this.last;
		while(n.prev!=null){
			n2.add(n.data);
			n=n.prev;
		}
		System.out.println();
	}
	public boolean compare(node n2){
		node n=this.head.next;
		node n1=n2.head.next;
		
		while(n!=null ){
			
			if(n.data!=n1.data)
				return false;
			n=n.next;
			n1=n1.next;
		}
		
		return true;
	}
	public boolean palllindrome(){
		node n2 = new node();
		node n1=this;
		n1.reverse(n2);
		n1.show();
		n2.show();
		return n1.compare(n2);
		
	}
}
class test{
	public static void main(String args[]){
		
		node n1=new node();
		n1.add(10);
		n1.add(20);
		n1.add(20);
		n1.add(10);
		//n1.show();
		
		System.out.println("After deleting");
		
		boolean t = n1.palllindrome();
		System.out.println(t);
	}
}