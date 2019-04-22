import java.util.*; 
class a extends Stack<Integer>{
	Stack<Integer> s2 = new Stack<Integer>();
	
	public void push(int data){
		if(data < min() || data == min()){
			s2.push(data);
		}
		super.push(data);
	}
	
	public Integer pop(){
		int val= super.pop();
		if(val==min()){
			s2.pop();
		}
		return val ;
	}
	
	public int min(){
		if(s2.isEmpty()){
			return Integer.MAX_VALUE;
		}else{
			return s2.peek();
		}
	}
	
	
}

class test{
	
	public static void main(String args[]){
		
		a s = new a();
		s.push(10);
		s.push(3);
		s.push(2);
		s.push(20);
		System.out.println(s.pop());
		System.out.println(s.min());
		System.out.println(s.pop());
		System.out.println(s.min());
		
	}
	
	
}