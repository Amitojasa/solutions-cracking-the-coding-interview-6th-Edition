import java.util.*;
class node{
	
	int data;
	node next = null;
	
	node(int data){
		this.data = data;
	}
	
	public void append(int data){
		node end = new node(data);
		node n = this;
		
		while(n.next!=null){
			n = n.next;
			
		}
		n.next=end;
	}
	public void show(){
		node n = this;
		
		while(n!=null){
			System.out.println(n.data);
			n = n.next;
		}

	}
	public int kToLast(int i,int size){
		node n = this;
		int counter=0;
		while(counter<i){
			counter++;
			n=n.next;
		}
		return(n.data);
		
	}
}

class test{
	public static void main(String args[]){
		node n = new node(0);
		n.append(10);
		n.append(20);
		n.append(30);
		n.append(20);
		n.append(20);
		n.append(30);
		n.show();
		System.out.println();
		int size=7;//0 10 20 30 20 20 30
		int i = size-3;//we are finding 3rd element from behind
		int result = n.kToLast(i,size);//20
	
		System.out.println(result);
		
		
		
	}
}