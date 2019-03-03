import java.util.*;

class test{
	
	public static int[] a = new int[26];

	public static void main(String args[]){
	
		Scanner s =  new Scanner(System.in);
		
		String str = s.nextLine();
		str = str.toLowerCase();
		
		for(int i=0;i<str.length();i++){
			int value=str.charAt(i)-'a';
			if(value>=0 && value<=25)
				a[value]++;
		}
		
		boolean b= check();
		
		if(b){
			System.out.println(b);
		}else{
			System.out.println(b);
		}
	}
	
	public static boolean check(){
		int odd=0;
		for(int i=0;i<26;i++){
			if(a[i]%2==1){
				if(odd==1){
					return false;
				}else{
					odd=1;
				}
			}
		}
		return true;
	}

}