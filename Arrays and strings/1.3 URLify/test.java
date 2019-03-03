import java.util.*;

class test{
	public static void main(String args[]){
		
		Scanner s = new Scanner(System.in);
		String str=s.nextLine();
		char[] c = str.toCharArray();
		int trueLength=s.nextInt();
		System.out.println(trueLength);
		int d=0;
		System.out.println(c);
		diff=str.length()-trueLength;
		
		a:
		for(int i=trueLength-1;i>=0;i--){
			if(c[i]!=' '){
				c[i+diff]=c[i];
			}else{
				c[i+diff]='0';
				c[i+diff-1]='2';
				c[i+diff-2]='%';	
				diff=diff-2;
				if(d==0) break a;
			}
		}
		System.out.println(c);
		
	}
}