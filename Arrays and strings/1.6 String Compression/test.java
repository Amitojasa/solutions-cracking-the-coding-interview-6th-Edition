import java.util.*;

class test{
	
	public static void main(String args[]){
		
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		String str1="";
		char x=str.charAt(0);
		int count=0;
		for(int i=0;i<str.length();i++){
			
			char c = str.charAt(i);
			
			if(c==x){
				count++;
			}else{
				str1 = str1 + x + "" + count;
				count=1;
				x = str.charAt(i);
			}
			
		}
			str1 = str1 + x + "" + count;
			
			if(str.length()>=str1.length()){
				System.out.println(str1);
			}else{
				System.out.println(str);
			}
		
	}
	
}