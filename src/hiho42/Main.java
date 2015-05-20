package hiho42;

import java.util.Scanner;

public class Main {
	private static final int p = 12357;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			long n = in.nextLong();
			if (n % 2 != 0) {
				System.out.println(0);
			} else {
				System.out.println(compute(n) % 12357);
			}
		}
	}

	public static long compute(long n) {
		if (n == 2)
			return 3;
		if (n == 4)
			return 11;
		long a = 3, b = 11, c = 39;
		n = n - 2;
		while (n != 4) {
			long tmp = c;
			c = (((3 * (c % p)) % p) + ((2 * (b % p)) % p)) % p;
			a = b;
			b = tmp;
			n -= 2;
		}
		return c;
	}
}
