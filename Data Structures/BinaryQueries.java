import java.util.Scanner;
import java.util.Arrays;

/*
 *  Some problems appear hard though they are very easy. Today Aakash is stuck in a range query problem. He has been given an array with only numbers 0 and 1. There are two types of queries - 
	0 L R : Check whether the number formed from the array elements L to R is even or odd and print EVEN or ODD respectively. Number formation is the binary number from the bits status in the array L to R
	1 X : Flip the Xth bit in the array 
	Indexing is 1 based
	
	Input
	First line contains a number N and Q as input. Next line contains N space separated 0 or 1. Next Q lines contain description of each query 
	
	Output
	Output for only query type 0 L R whether the number in range L to R is "EVEN" or "ODD" (without quotes).
	Constraints
	1≤ N ≤ 10^6 
	1≤ L ≤ R ≤ 10^6 
	1≤ Q ≤ 10^6
	1≤ X ≤ N
	
	Sample input:
	5 2
	1 0 1 1 0
	1 2
	0 1 4
	
	Sample Output:
	odd
	Explanation 
	Our first query is 1 2 that means that we have to flip the 2nd bit in the given array so now our array becomes 1 1 1 1 0
	2nd query is 0 1 4 which means that if i pick the subarray 1 to 4 i.e 1 1 1 1 then the number formed by decimal representation of this binary number is of what kind ?. 
	Here the number formed is 15 so its odd and ODD is the output
 */

public class BinaryQueries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("N,Q : ");
		int N = s.nextInt();
		int Q = s.nextInt();
		int X = 0, L = 0, R = 0;

		int[] A = new int[N];
		int[] Asub = new int[N - L - R];

		System.out.println("Array A[] : ");
		for (int i = 0; i < N; i++) {
			A[i] = s.nextInt();
		}
		System.out.println("Array : " + Arrays.toString(A));
		String B = Arrays.toString(A);
		
		System.out.println("Queries : ");
		for (int i = 0; i < Q; i++) {
			int f = s.nextInt();
			if (f == 0) {
				X = s.nextInt();

				for (int j = 0; j < N; j++) {
					if (A[X] == 0) {
						A[X] = 1;
					} else
						A[X] = 0;
				}

			} else if (f == 1) {
				L = s.nextInt();
				R = s.nextInt();
				int l=0;
				for(int k=L-1; k<R-1; k++) {
					Asub[l] = A[k];
					l++;
				}
				String Bsub = Arrays.toString(Asub);
				System.out.println("Integer value = " + Integer.parseInt(Bsub,2));
			}
		}

	}

}
