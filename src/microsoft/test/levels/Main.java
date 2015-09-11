package microsoft.test.levels;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<List<Integer>> lists = new ArrayList<List<Integer>>(n + 1);
		int[] p = new int[n + 1];
		int[] q = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			p[i] = scanner.nextInt();
			q[i] = scanner.nextInt();
		}
		for (int i = 0; i < n - 1; i++) {
			int index = scanner.nextInt();
			int next = scanner.nextInt();
			List<Integer> nodes = lists.get(index);
			if (nodes == null)
				nodes = new ArrayList<>();
			nodes.add(next);
		}
		
	}

	class Node {
		int p;
		int q;
		Node in;
		List<Node> out;
	}
}
