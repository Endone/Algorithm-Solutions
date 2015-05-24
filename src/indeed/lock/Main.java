package indeed.lock;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static final int C = 1000000007;
	static int N;
	static int B[];
	static ArrayList<Integer> al;

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		BufferedInputStream bs = new BufferedInputStream(System.in);
		Scanner sc = new Scanner(bs);
		N = sc.nextInt();

		int num[] = new int[N];

		int nm[] = new int[N];
		for (int i = 0; i < nm.length; i++) {
			nm[i] = 1;
		}

		long ans = 0;

		ans = (long) (Math.pow(10, N) - 1);

		for (int i = 0; i < ans + 1; i++) {
			for (int t : num) {
				sb.append(t);
			}
			sb.append("\n");
			for (int t = num.length - 1; t >= 0; t--) {
				num[t] += nm[t];
				if (num[t] == -1 || num[t] == 10) {
					nm[t] *= -1;
					num[t] += nm[t];
				} else {
					break;
				}

			}
		}

		System.out.println(ans);
		System.out.print(sb);
		sc.close();

	}

}