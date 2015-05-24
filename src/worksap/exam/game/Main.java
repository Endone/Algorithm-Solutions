package worksap.exam.game;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] cell = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				cell[i][j] = in.nextInt();
			}
		}
		int[][] p = new int[n][m];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (cell[i][0] == -1) {
				p[i][0] = -1;
				sum = 0;
			} else {
				sum += cell[i][0];
				p[i][0] = sum;
			}
		}
		sum = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (cell[i][0] == -1) {
				p[i][0] = -1;
				sum = 0;
			} else {
				sum += cell[i][0];
				p[i][0] = sum > p[i][0] ? sum : p[i][0];
			}
		}
		for (int j = 1; j < m; j++) {
			for (int i = 0; i < n; i++) {
				int maxPath = -1;
				for (int k = 0; k < n; k++) {
					int tmp = 0;
					if (cell[i][j] == -1) {
						p[i][j] = -1;
						break;
					}
					if (cell[k][j - 1] == -1 || cell[k][j] == -1) {
						tmp = -1;
					} else if (i == k) {
						tmp = p[k][j - 1] + cell[i][j];
					} else {
						int maxColPath = maxColPath(cell, k, i, j, n,
								p[k][j - 1]);
						if (maxColPath == -1) {
							tmp = -1;
						} else {
							tmp = maxColPath;
						}
					}
					if (tmp > maxPath)
						maxPath = tmp;
				}
				p[i][j] = maxPath;
			}
		}
		// for (int j = 0; j < m; j++) {
		// for (int i = 0; i < n; i++) {
		// System.out.print(p[i][j] + "\t");
		// }
		// System.out.println();
		// }
		int max = -1;
		for (int i = 0; i < n; i++) {
			if (p[i][m - 1] > max)
				max = p[i][m - 1];
		}
		System.out.println(max);
		in.close();
	}

	private static int maxColPath(int[][] cell, int start, int end, int col,
			int n, int base) {
		int pathUp = 0;
		int pathDown = 0;
		if (start < end) {
			for (int i = end; i < n; i++) {
				if (cell[i][col] == -1) {
					pathUp = -1;
					break;
				} else {
					pathUp += cell[i][col];
				}
			}
			for (int i = start; i <= end; i++) {
				if (cell[i][col] == -1) {
					pathDown = -1;
					break;
				} else {
					pathDown += cell[i][col];
				}
			}
			if (pathDown > pathUp)
				return base + pathDown;
			else {
				return pathUp;
			}
		} else {
			for (int i = end; i <= start; i++) {
				if (cell[i][col] == -1) {
					pathUp = -1;
					break;
				} else {
					pathUp += cell[i][col];
				}
			}
			for (int i = 0; i <= end; i++) {
				if (cell[i][col] == -1) {
					pathDown = -1;
					break;
				} else {
					pathDown += cell[i][col];
				}
			}
			if (pathDown < pathUp)
				return base + pathUp;
			else {
				return pathDown;
			}
		}
	}
}
