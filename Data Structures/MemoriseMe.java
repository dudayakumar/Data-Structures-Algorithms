
/*
 *  Arijit is a brilliant boy. He likes memory games. He likes to participate alone but this time he has to have a partner. 
	So he chooses you.
	In this Game , your team will be shown N numbers for few minutes . You will have to memorize these numbers. 
	Now, the questioner will ask you Q queries, in each query He will give you a number , and you have to tell him the total number of occurrences of that number in the array of numbers shown to your team . If the number is not present , then you will have to say “NOT PRESENT” (without quotes).
	INPUT And OUTPUT
	The first line of input will contain N, an integer, which is the total number of numbers shown to your team.
	The second line of input contains N space separated integers .
	The third line of input contains an integer Q , denoting the total number of integers.
	The Next Q lines will contain an integer denoting an integer, Bi, for which you have to print the number of occurrences of that number (Bi) in those N numbers on a new line.
	If the number Bi isn’t present then Print “NOT PRESENT” (without quotes) on a new line.
	CONSTRAINTS
	1≤N≤105
	0≤Bi≤1000
	
	Explanation:
	The given array is (1,1,1,2,2,0) of size 6.
	Total number of queries is 6 also.
	For the first query i.e for 1 , the total of number of occurrences of 1 in the given array is 3 . Hence the corresponding output is 3.
	For the second query i.e. for 2, the total of number of occurrences of 2 in the given array is 2 . Hence the corresponding output is 2.
	For the fifth query i.e. for 3. 3 is not present in the array . So the corresponding output is "NOT PRESENT" (without quotes).
 */

import java.util.Scanner;

public class MemoriseMe {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Array size: ");
		int N = s.nextInt();
		int[] A = new int[N];

		System.out.println("Array Elements: ");
		for (int i = 0; i < N; i++) {
			A[i] = s.nextInt();
		}
				
		System.out.println("Number of queries: ");
		int Q = s.nextInt();
		int[] B = new int[Q];


		System.out.println("List of numbers you want to search for: ");
		for (int i = 0; i < Q; i++) {
			B[i] = s.nextInt();	
		}

		
		for (int i = 0; i < Q; i++) {
			int j=0;
			int count = 0;
				
					if (B[i] == A[j]) {
						count++;
						
					}
				
			if (count > 0)
				System.out.println(count);
			else
				System.out.println("NOT PRESENT");
		}
	}

}
