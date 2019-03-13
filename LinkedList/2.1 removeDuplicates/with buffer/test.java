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
	public void removeDups(){
		node n = this;
		HashSet<Integer> s = new HashSet<Integer>();
		node prev=n;
		s.add(n.data);
		n = n.next;
		while(n!=null){
			if(s.contains(n.data)){
				prev.next = n.next;
			}else{
				s.add(n.data);
				prev = n;
			}
			n = n.next;
		}
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
		n.removeDups();
		n.show();
		
		
		
	}
}