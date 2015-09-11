package microsoft.test.give.my.text.back;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		Scanner scanner = new Scanner(System.in);
		StringBuffer resultBuffer = new StringBuffer();
		while (scanner.hasNextLine()) {
			String str = scanner.nextLine();
			buffer.append(str);
			if (str == "") {
				System.out.println();
				continue;
			}
			boolean firstLetter = true;
			boolean space = false;
			String text = str;
			for (int i = 0; i < text.length(); i++) {
				char c = text.charAt(i);
				if (firstLetter && !Character.isSpaceChar(c)) {
					if (space) {
						resultBuffer.append(" " + Character.toUpperCase(c));
						space = false;
					} else {
						resultBuffer.append(Character.toUpperCase(c));
					}
					firstLetter = false;
				} else if (Character.isLetter(c)) {
					if (space) {
						resultBuffer.append(" " + Character.toLowerCase(c));
						space = false;
					} else {
						resultBuffer.append(Character.toLowerCase(c));
					}
				} else if (Character.isSpaceChar(c) && !space) {
					space = true;
				} else if (Character.isSpaceChar(c) && space) {
				} else {
					space = false;
					resultBuffer.append(Character.toLowerCase(c));
					if (c == '.') {
						firstLetter = true;
					}
				}
			}
			System.out.println(resultBuffer.toString().trim());
			resultBuffer = new StringBuffer();
		}

	}
}
