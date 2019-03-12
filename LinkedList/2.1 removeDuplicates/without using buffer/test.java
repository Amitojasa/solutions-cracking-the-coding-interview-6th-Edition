class node{
	int data;
	node next = null;
	
	node(int data){
		this.data = data;
	}
	
	void append(int d){
		node end = new node(d);
		node n = this;
		while(n.next!=null){
			n=n.next;
		}
		n.next=end;
	}
	void show(){
		node n = this;
		while(n.next!=null){
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
	}
	
        void removeDups(){
			node first,second,prev;
			first = this;
					
			while(first!=null){
				prev=first;
				second = first.next;
				while(second!=null){
					
					if(first.data == second.data){
						prev.next = second.next;
						second = prev.next;
					}else{
						prev=prev.next;
						second=second.next;
					}
				}

				first = first.next;
			}
        }
}

class test{
	public static void main(String args[]){
		
		node n1 = new node(0);
		n1.append(10);
		n1.append(20);
		n1.append(30);
		n1.append(20);
		n1.append(20);
		n1.append(30);

		n1.show();
				
		n1.removeDups();
		System.out.println();
		n1.show();
		
	}
}