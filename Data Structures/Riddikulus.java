/*
 *  R-r-riddikulus"  used in the movie Harry Potter to transform anything from one form to other, Similarly you have to transform the array by rotation.
	A left rotation operation on an array shifts each of the array's elements 1 unit to the left. For example, if 2  left rotations are performed on array [1,2,3,4,5], then the array would become [3,4,5,1,2].
	Given an array a of n integers and a number, d, perform d left rotations on the array. Return the updated array to be printed as a single line of space-separated integers.
 
	Input Format
	The first line contains two space-separated integers n and d, the size of a and the number of left rotations you must perform. 
	The second line contains space-separated integers a[i] .
	Constraints
	1<=n<=105
	1<=d<=n
	1<=a[i]<=106

	Output Format:
	Print a single line of n space-separated integers denoting the final state of the array after performing  left rotations.
*/

import java.util.Scanner;

public class Riddikulus {
	
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Array size(n) and number of rotations(d): ");
		int n = s.nextInt();
		int d = s.nextInt();
		int[] A = new int[n];
		int[] Anew = new int[n];
		System.out.println();
		System.out.print("Enter array elements: ");
		for(int i=0; i<n; i++) {
			A[i] = s.nextInt();
		}
		
		int j=0;
		System.out.println("Array elements shifted by "+d+" rotations to left: ");
		for(int i=0; i+d<n; i++) {
			Anew[j] = A[i+d];
			System.out.print(Anew[j] + " ");
			j++;
			
			if(i+d == n-1) {
				for(int k=0; k<d; k++) {
					Anew[j] = A[k];
					System.out.print(Anew[j] + " ");
					j++;
				}
			}			
		}
	}
}
