class stack{
	static int n=9;
	static int[] a=new int[n];
	int top;
	int size,minSize;
	
	public stack(int top,int size){
		this.top = top;
		this.minSize=top;
		this.size = size-1;
	}
	
	public void push(int data){
		if(this.top>this.size){
			System.out.println("Stack is full");
			this.top--;
		}else{
			a[this.top]=data;
			System.out.println(a[this.top]+" added");
			this.top++;
		}
	}
	
	public void pop(){
		if(this.top<this.minSize){
			System.out.println("Stack is empty");
		}else{
			System.out.println(a[this.top]);
			this.top--;
		}
	}
	
	public void peek(){
		if(this.top<this.minSize){
			System.out.println("Stack is empty");
		}else{
			System.out.println(a[this.top]);;
		}
	}
	
}

class test{
	public static void main(String args[]){
		int n=stack.n;
		stack s1=new stack(0,n/3);
		stack s2=new stack(n/3,2*(n/3));	
		stack s3=new stack(2*(n/3),n);
		
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.peek();
		s1.pop();
		s1.peek();
		
		s2.push(100);
		s2.push(200);
		s2.push(300);
		s2.push(400);
		s2.peek();
		s2.pop();
		s2.peek();
		s1.peek();
		
		s3.push(1000);
		s3.push(2000);
		s3.push(3000);
		s3.push(4000);
		s3.peek();
		s3.pop();
		s3.pop();
		s3.pop();
		s3.pop();
		s3.peek();
		s1.peek();
		
	}
}