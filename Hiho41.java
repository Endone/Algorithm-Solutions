package hiho41;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			if (n == 1) {
				System.out.println(1);
				continue;
			}
			if (n == 2) {
				System.out.println(2);
				continue;
			}
			int count = 0;
			int temp = n;
			while (temp != 0) {
				temp = temp >> 1;
				count++;
			}
			Matrix matrix = new Matrix(0, 1, 1, 1);
			Matrix[] matrixs = new Matrix[count];
			matrixs[0] = matrix;
			for (int i = 1; i < count; i++) {
				matrixs[i] = matrixs[i - 1].multiply(matrixs[i - 1]);
			}
			long m = 1;
			Matrix res = new Matrix(1, 0, 0, 1);
			count = 0;
			while (n != 0) {
				if ((n & m) == 1) {
					res = res.multiply(matrixs[count]);
				}
				n = n >> 1;
				count++;
			}
			System.out.println(res.b2);
		}
	}
}

class Matrix {
	public long a1, a2, b1, b2;
	public static long p = 19999997;

	public Matrix(long a1, long a2, long b1, long b2) {
		super();
		this.a1 = a1;
		this.a2 = a2;
		this.b1 = b1;
		this.b2 = b2;
	}

	public Matrix multiply(Matrix matrix) {
		Matrix res = new Matrix(0, 0, 0, 0);
		res.a1 = (((this.a1 % p) * (matrix.a1 % p)) % p + ((this.a2 % p) * (matrix.b1 % p))
				% p)
				% p;
		res.a2 = (((this.a1 % p) * (matrix.a2 % p)) % p + ((this.a2 % p) * (matrix.b2 % p))
				% p)
				% p;
		res.b1 = (((this.b1 % p) * (matrix.a1 % p)) % p + ((this.b2 % p) * (matrix.b1 % p))
				% p)
				% p;
		res.b2 = (((this.b1 % p) * (matrix.a2 % p)) % p + ((this.b2 % p) * (matrix.b2 % p))
				% p)
				% p;
		return res;
	}
}