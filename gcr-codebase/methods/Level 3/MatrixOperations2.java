import java.util.*;

public class MatrixOperations2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter number of columns: ");
		int col = sc.nextInt();
		
		int mat[][] = matrixIntialize(rows,col);
		System.out.println("Matrix is: ");
		display(mat);
		
		int[][] trans = transpose(mat);
		System.out.println("Transpose of matrix is: ");
		for(int i=0;i<mat.length;i++)
			System.out.println(Arrays.toString(trans[i]));
		
		int inverse[][] = inverseMatrix(mat);
		System.out.println("Inverse of matrix is: ");
		if(inverse!=null){
			for(int i=0;i<mat.length;i++){
				System.out.println(Arrays.toString(inverse[i]));
			}
		}
	}
	
	// Method to create a random matrix
	public static int[][] matrixIntialize(int row, int col){
		int mat[][] = new int[row][col];
		
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
				mat[i][j] = (int)(Math.random()*9+1);
		return mat;
	}
	
	// Method to find the transpose of a matrix
	public static int[][] transpose(int[][] mat){
		int trans[][] =new int[mat.length][mat[0].length];
		
		for(int i=0;i<mat.length;i++){
			for(int j=i;j<mat[0].length;j++){
				trans[i][j] = mat[j][i];
				trans[j][i] = mat[i][i];
			}
		}
		return trans;
	}
	
	//Method to find the determinant of a 2x2 matrix
	public static int determinant(int mat[][]){
		int deter= 0;
		if(mat.length !=mat[0].length)
			return 0;
		
		if(mat.length==1)
			return mat[0][0];
		
		if(mat.length==2)
			return mat[0][0]*mat[1][1]-mat[0][1]*mat[1][0];
		
		int[][] subMat = new int[mat.length][mat.length];
		int sign = 1;
		
		for(int col = 0; col<mat.length;col++){
			int subi = 0;
			for(int i=0;i<mat.length;i++){
				int subj=0;
				for(int j =0;i<mat.length;j++){
					if(j==col)
						continue;
					subMat[subi][subj++]= mat[i][j];
				}
				subi++;
			}
			deter += sign* mat[0][col]*determinant(subMat);
			sign = -sign;
		}
		return deter;
	}
	
	//Write a Method to find the inverse of a 2x2 matrix
	public static int[][] inverseMatrix(int[][] a) {
		int n = a.length;
		int[][] aug = new int[n][2 * n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				aug[i][j] = a[i][j];

			for (int j = n; j < 2 * n; j++)
				aug[i][j] = (i == j - n) ? 1 : 0;
		}

		for (int i = 0; i < n; i++) {
			int pivot = aug[i][i];

			if (pivot == 0)
				return null; 

			
			for (int j = 0; j < 2 * n; j++)
				aug[i][j] /= pivot;

			
			for (int k = 0; k < n; k++) {
				if (k != i) {
					int factor = aug[k][i];
					for (int j = 0; j < 2 * n; j++)
						aug[k][j] -= factor * aug[i][j];
				}
			}
		}

		
		int[][] inv = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				inv[i][j] = aug[i][j + n];

		return inv;
	}
	
	//Write a Method to display a matrix
	public static void display(int[][] mat){
		
		System.out.print("[");
		for(int i=0;i<mat.length;i++){
			System.out.print("[");
			for(int j=0;j<mat[0].length;j++)
				System.out.print(mat[i][j]+" ");
			System.out.print("]");
		}
		System.out.println("]");
		
	}
}