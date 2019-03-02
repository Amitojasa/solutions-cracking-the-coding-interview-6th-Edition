import java.util.*;
public class test{
		
		public static int[] s1=new int[128];
		public static int[] s2=new int[128];
		public static void checkString(String str,int[] s){
			
			for(int i=0;i<str.length();i++){
				int val=str.charAt(i);
				s[val]++;
			}
			
		}
		
		public static void main(String args[]){
			int flag=1;
			Scanner s = new Scanner(System.in);
			String str1,str2;
			
			str1 = s.nextLine();
			str2 = s.nextLine();
			
			if(str1.length()!=str2.length()){
				flag=0;
			}
			
			if(flag==1){
				checkString(str1,s1);
				checkString(str2,s2);
			}
			
			for(int i=0;i<128;i++){
				if(s1[i]!=s2[i]){
					flag=0;
					break;
				}
			}
			
			if(flag==1){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
			
		}
}