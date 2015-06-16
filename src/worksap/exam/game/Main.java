package worksap.exam.game;

import java.util.Scanner;

/**
 * 4 4 -1 4 5 1 2 -1 2 4 3 3 -1 3 4 2 1 2 -- 4 4 -1 4 5 1 2 -1 2 4 3 3 -1 -1 4 2
 * 1 2
 * 
 * @author Administrator
 * 
 */
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] cell = new int[n][m];
		int[][][] directions = new int[n][m][n];
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
						directions[i][j][k] = -1;
						continue;
					}
					if (cell[k][j - 1] == -1 || cell[k][j] == -1) {
						tmp = -1;
						directions[i][j][k] = -1;
					} else if (i == k) {
						tmp = p[k][j - 1] + cell[i][j];
					} else {
						int[] res = maxColPath(cell, k, i, j, n, p[k][j - 1]);
						int maxColPath = res[0];
						if (maxColPath == -1) {
							tmp = -1;
						} else {
							tmp = maxColPath;
						}
					}
					directions[i][j][k] = tmp;
					if (tmp > maxPath) {
						maxPath = tmp;
					}
				}
				p[i][j] = maxPath;
			}
		}
		// for (int j = 0; j < m; j++) {
		// for (int i = 0; i < n; i++) {
		// System.out.print(p[j][i] + "\t");
		// }
		// System.out.println();
		// }
		int max = -1;
		int index = -1;
		for (int i = 0; i < n; i++) {
			if (p[i][m - 1] > max) {
				index = i;
				max = p[i][m - 1];
			}
		}
		System.out.println(max);
		StringBuffer buffer = new StringBuffer();
		for (int j = m - 1; j >= 0; j--) {
			buffer.append(cell[index][j]);
			max = -1;
			int newIndex = 0;
			for (int i = 0; i < n; i++) {
				if (directions[index][j][i] >= max) {
					max = directions[index][j][i];
					newIndex = i;
				}
			}
			if (max == cell[index][j]) {
				if (index == 0) {
					buffer.append(cell[n - 1][j]);
				} else {
					buffer.append(cell[0][j - 1]);
				}
			} else if (newIndex > index) {
				for (int k = index + 1; k <= newIndex; k++) {
					buffer.append(cell[k][j]);
				}
			} else {
				for (int k = newIndex; k < index; k++) {
					buffer.append(cell[k][j]);
				}
			}
			index = newIndex;
		}
		System.out.println(buffer.reverse());
		in.close();
	}

	private static int[] maxColPath(int[][] cell, int start, int end, int col,
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
				return new int[] { base + pathDown, 0 };
			else {
				return new int[] { pathUp, 1 };
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
				return new int[] { base + pathUp, 1 };
			else {
				return new int[] { pathDown, 0 };
			}
		}
	}
}
