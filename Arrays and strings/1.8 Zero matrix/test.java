import java.util.*;

class test{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		
		int[][] a = new int[m][n];
		Vector<Integer> x = new Vector<Integer>();
		Vector<Integer> y = new Vector<Integer>();
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				a[i][j] = s.nextInt();
			}
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(""+a[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(a[i][j]==0){
					x.add(i);
					y.add(j);
				}
			}
		}
		
		for(int k=0;k<x.size();k++){
			for(int i=0;i<n;i++)
						a[x.get(k)][i]=0;
			for(int i=0;i<m;i++){
				a[i][y.get(k)]=0;
			}
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(""+a[i][j]+" ");
			}
			System.out.println();
		}

	}
	
}