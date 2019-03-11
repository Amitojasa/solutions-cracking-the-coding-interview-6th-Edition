import java.util.*;

class test{
	static int[][] matrix;
	public static boolean rotate(){
		if(matrix.length == 0 || matrix.length != matrix[0].length) return false;
		int n = matrix.length;
		for( int l = 0; l < n/2 ; l++ ){
			int first = l;
			int last = n-1-l;
			for(int i=first; i<last; i++){
				int offset = i-first;
				int top = matrix[first][i];
				matrix[first][i] = matrix[last-offset][first];
				matrix[last-offset][first] = matrix[last][last-offset];
				matrix[last][last-offset] = matrix[i][last];
				matrix[i][last] = top;
			}
		}
		return true;
	}
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		matrix = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				matrix[i][j] = s.nextInt();
			}
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print("" + matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();System.out.println();
		boolean t = rotate();
		
		if(t){
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					System.out.print("" + matrix[i][j] + " ");
				}
				System.out.println();
			}
		}else{
			System.out.println(t);
		}
	}
	
}