import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of rows and columns (N & M):");
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] matrix = new int[N][M];
		
		System.out.println("Elements of matrix: ");
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Transpose of matrix: ");
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println();
		}
	}

}
