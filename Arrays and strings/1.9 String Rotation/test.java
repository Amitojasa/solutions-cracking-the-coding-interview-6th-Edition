import java.util.*;

class test{
	public static boolean isSubstring(String str1,String str2){
		
		char a = str2.charAt(0);
		int l = str2.length();
		
		for(int i=0;i<str1.length()/2;i++){
			if(a==str1.charAt(i)){
				if(str2.equals(str1.substring(i,l+i))){
					return true;
				}
			}
		}
 		return false;
	}
	
	public static void main(String args[]){
		
		Scanner s = new Scanner(System.in);
		
		String str1 = s.nextLine();
		String str2 = s.nextLine();
		
		str1 = str1 + str1;
		
		//boolean t = str1.contains(str2);
		
		//or
		boolean t = isSubstring(str1,str2);
		
		System.out.println(t);
		
	}
}