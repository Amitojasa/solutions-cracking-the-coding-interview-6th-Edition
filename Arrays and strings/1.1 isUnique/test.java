import java.util.*;
public class test{
		public static boolean isUnique(String str){
			boolean[] b=new boolean[128];
			if(str.length()>128){
				return false;
			}
			for(int i=0;i<str.length();i++){
				int val=str.charAt(i);
				if(b[val]){
					return false;
				}else{
					b[val]=true;
				}
			}
			
			return true;
		}
		
		public static void main(String args[]){
			
			Scanner s = new Scanner(System.in);
			String str;
			
			str = s.nextLine();
			boolean flag;
			flag=isUnique(str);
			
			if(flag){
				System.out.println("unique");
			}else{
				System.out.println("duplicates");
			}
			
			
		}
}