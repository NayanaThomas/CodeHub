package codeing;
/*program to set a row and column in an M*N matrix to 0, if the element at M[row][col] is 0.
 * 
 */
public class ZeroMatrix {
	public int[][] setMatrix(int[][] matrix) {
		boolean[] row = new boolean[matrix.length];
		boolean[] col = new boolean[matrix[0].length];
	
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				if(matrix[i][j] == 0) {
					row[i] = true;
					col[j]=true;
				}
			}
		}
		
		for(int i=0;i<matrix.length;i++) {
			if(row[i]==true) {
				 matrix = nullifyRow(matrix,i);
			}
		}
		for(int j=0;j<matrix[0].length;j++) {
			if(col[j]==true) {
				matrix = nullifyCol(matrix,j);
			}
		}
		return matrix;
		
	}
	public int[][] nullifyRow(int[][]matrix, int i) {
		for(int j=0;j<matrix[0].length;j++) {
			matrix[i][j] = 0;
		}
		return matrix;
	}
	
	public int[][] nullifyCol(int[][]matrix, int j) {
		for(int i=0;i<matrix.length;i++) {
			matrix[i][j] = 0;
		}
		return matrix;
	}
	
	public static void main(String args[])
    {
		ZeroMatrix lp = new ZeroMatrix();
		int[][] matrix = new int[][]{{1,2,34,5},{4,5,2,1},{1,2,0,4},{0,2,3,4}};
		System.out.println("Before changing: ");
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		matrix =  lp.setMatrix(matrix);
		System.out.println("After changing: ");
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
    }
}
