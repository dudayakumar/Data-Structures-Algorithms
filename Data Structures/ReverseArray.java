/*
 *  Given the size and the elements of array A, print all the elements in reverse order.
	Input: 
	First line of input contains, N - size of the array. 
	Following N lines, each contains one integer, i{th} element of the array i.e. A[i]. 
	Output: 
	Print all the elements of the array in reverse order, each element in a new line. 
	Constraints: 
	1≤N≤100
	0≤A[i]≤1000
*/

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter size of Array: ");
		int N = s.nextInt();
		int[] A = new int[N];
		int[] Arev = new int[N];
		
		System.out.println("Enter Array elements: ");
		for(int i=0; i<N; i++) {
			A[i] = s.nextInt();
		}
		
		System.out.println("Reversed Array: ");
		int j=N-1;
		for(int i=0; i<N; i++) {
			Arev[i] = A[j];
			System.out.println(Arev[i]);
			j--;
		}
		 
	}

}
