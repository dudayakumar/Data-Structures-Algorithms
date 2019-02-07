import java.util.Scanner;

public class PriorityInterview {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of candidates: ");
		int N = sc.nextInt();
		
		int[][] ab = new int[N][2];
		
		int aCount = 0, bCount = 0;
		System.out.println("Male/Female and talent level: ");
		for(int i=0; i<N; i++) {
			for(int j=0; j<2; j++) {
				ab[i][j] = sc.nextInt();
				if(ab[0][j] == 0) {
					aCount++;
				}
				else if(ab[0][j] == 1) {
					bCount++;
				}
			}
		}
		
		int[] a = new int[aCount];
		int[] b = new int[bCount];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<2; j++) {
				if(ab[0][j] == 0) {
					a[]
				}
				else if(ab[0][j] == 1) {
					bCount++;
				}
			}
		}
	}

}
