import java.util.Scanner;

public class MaximizeEarning {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Number of streets: ");
		int S = sc.nextInt();

		int N = 0, R = 0, fh = 0;

		int[] e = new int[S];

		for (int i = 0; i < S; i++) {
			System.out.println("Number of buildings & rupees earned per building : ");
			N = sc.nextInt();
			R = sc.nextInt();
			int[] h = new int[N];
			int count = 1;

			System.out.println("Enter heights of buildings: ");
			for (int j = 0; j < N; j++) {
				h[j] = sc.nextInt();
				if (j == 0) {
					fh = h[0];
				}
				if (h[j] > fh) {
					fh = h[j];
					count++;
				}
			}
			e[i] = R * count;
		}

		for (int i = 0; i < S; i++) {
			System.out.println("Earnings: ");
			System.out.println(e[i]);
		}
	}

}
