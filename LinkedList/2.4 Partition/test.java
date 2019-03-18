import java.util.*;
class node{
	int data;
	node next=null;
	
	node(int data){
		this.data=data;
	}
	
	public void add(int data){
		node end = new node(data);
		node n=this;
		while(n.next!=null){
			n=n.next;
		}
		n.next=end;
	}
	
	public void show(){
		node n=this;
		while(n!=null){
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.println();
	}
	
	public void partition(int val){
		node head=this;
		node prev=this;
		node n=prev.next;
		while(prev.next!=null){
			
			if(n.data<val){
				prev.next=n.next;
				n.next=head.next;
				head.next=n;
				n=prev.next;
				continue;
			}
			prev=prev.next;
			n=n.next;
			
		}
	}
}
class test{
	public static void main(String args[]){
		
		node n=new node(0);
		n.add(50);
		n.add(20);
		n.add(10);
		n.add(40);
		n.show();
		n.partition(50);
		
		System.out.println("After deleting");
		
		n.show();
	}
}