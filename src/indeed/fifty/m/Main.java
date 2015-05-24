package indeed.fifty.m;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		System.out.println(50 / (s * 1.0));
		in.close();
	}
}
