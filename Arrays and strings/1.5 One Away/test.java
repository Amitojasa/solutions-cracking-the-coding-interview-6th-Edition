import java.util.*;

class test{
	
	public static int[] a = new int[26];
	public static void main(String args[]){
	
		Scanner s =  new Scanner(System.in);
		
		String str = s.nextLine();
		String str2 = s.nextLine();
		str = str.toLowerCase();
		str2 = str2.toLowerCase();
		
		for(int i=0;i<str.length();i++){
			int value=str.charAt(i)-'a';
			if(value>=0 && value<=25)
				a[value]++;
		}
		for(int i=0;i<str2.length();i++){
			int value=str2.charAt(i)-'a';
			if(value>=0 && value<=25)
				a[value]--;
		}
		
		boolean b= check();
		
		if(b){
			System.out.println(b);
		}else{
			System.out.println(b);
		}
	}
	
	public static boolean check(){
		int sum=0,neg=0;
		for(int i=0;i<26;i++){
			if (a[i]<0){
				if(neg==1){
					return false;
				}
				neg=1;
			}
		}
		return true;
		
	}

}