package microsoft.memory.allocating.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] memory = new int[m];
		int freeHead = 0;
		int freeTail = m;
		int head = 0;
		int tail = 0;
		for (int i = 0; i < n; i++) {
			int data = scanner.nextInt();
			if (data < freeTail) {
				Arrays.fill(memory, tail, tail + data, i + 1);
				tail += data;
				freeTail -= data;
			} else if (data < freeHead) {
				Arrays.fill(memory, head, head + data, i + 1);
			} else {
				int remove = memory[head];
				for (int j = head; j < m; j++) {
					if (memory[j] == remove) {
						memory[j] = 0;
						freeHead++;
					}
				}
			}
		}
	}

}
