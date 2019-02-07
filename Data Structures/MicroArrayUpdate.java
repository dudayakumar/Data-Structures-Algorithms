import java.util.Scanner;

/*
 *  Micro purchased an array A having N integer values. After playing it for a while, he got bored of it and decided to update value of its element. In one second he can increase value of each array element by 1. He wants each array element's value to become greater than or equal to K. Please help Micro to find out the minimum amount of time it will take, for him to do so.
	Input: 
	First line consists of a single integer, T, denoting the number of test cases. 
	First line of each test case consists of two space separated integers denoting N and K. 
	Second line of each test case consists of N space separated integers denoting the array A. 
	Output:
	For each test case, print the minimum time in which all array elements will become greater than or equal to K. Print a new line after each test case. 
	Constraints: 
	1≤T≤5
	1≤N≤105
	1≤A[i],K≤106
*/

public class MicroArrayUpdate {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Number of test cases: ");
		int T = s.nextInt();

		for (int j = 0; j < T; j++) {
			System.out.print("Array size(N) and Maximum value(K): ");
			int N = s.nextInt();
			int K = s.nextInt();

			int[] A = new int[N];
			System.out.print("Enter array elements: ");
			for (int i = 0; i < N; i++) {
				A[i] = s.nextInt();
			}

			int d = 0; // difference
			for (int i = 0; i < N; i++) {
				if (A[i] < K) {
					if (K - A[i] > d) {
						d = K - A[i];
					}
				}
			}
			System.out.println("Minimum time required = " + d);
		}
	}

}
