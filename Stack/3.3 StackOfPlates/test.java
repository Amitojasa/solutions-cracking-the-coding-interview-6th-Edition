import java.util.*; 
class a extends Stack<Integer>{
	Stack<Integer> s;
	ArrayList<Stack> s1;
	public a(){
		s1 = new ArrayList<Stack>();
		s = new Stack<Integer>();
		s1.add(s);
	}
	int valuesPerStack=3;
	int count=0,i,j=0;
	public void push(int data){
		count++;
		if(count==4){
			i++;
			count=1;
		}
		if(i>j){
			s=new Stack<Integer>();
			s1.add(s);
			j++;
		}
		
		s1.get(i).push(data);
	}
	
	public void pops(){
	
		while(s1.get(j).isEmpty()){
			if(j==0){
				System.out.println("Empty");
			}
			j--;
			if(j==-1){
				return;
			}
		}
		System.out.println((s1.get(j)).pop());
		
	}
	public void popAt(int index){
		if(s1.get(index).isEmpty()){
			System.out.println("Empty");
		}
		System.out.println((s1.get(index)).pop());
		
	}
	
	public void display(){
		System.out.println(s1);
	}
	
	
}

class test{
	
	public static void main(String args[]){
		
		a s =new a();
		s.push(10);
		s.push(3);
		s.push(2);
		s.push(20);
		s.push(2);
		s.push(20);
		s.push(10);
		s.push(3);
		s.push(2);
		s.push(20);
		s.push(2);
		s.push(20);
		
		s.display();
		s.pops();
		s.popAt(0);
		s.display();
		s.popAt(1);
		s.display();
		s.popAt(0);
		s.display();
		s.popAt(1);
		s.display();
		s.display();
		s.pops();
		
		s.display();
		s.pops();
		s.display();
		s.pops();
		s.display();
		s.pops();
		s.display();
		s.pops();
		s.display();
	}
	
	
}