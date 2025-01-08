package wordle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("make a guess");
		char letter1 = 's';
		char letter2 = 't';
		char letter3 = 'o';
		char letter4 = 'e';
		char letter5 = 'l';

		for (int i = 0; i < 10; i++) {

			char poging1 = scanner.next().charAt(0);
			char poging2 = scanner.next().charAt(0);
			char poging3 = scanner.next().charAt(0);
			char poging4 = scanner.next().charAt(0);
			char poging5 = scanner.next().charAt(0);

			if (poging1 == letter1) {
				System.out.println("goed");
			} else if (poging1 == letter2 || poging1 == letter3 || poging1 == letter4 || poging1 == letter5) {
				System.out.println("fout");
			} else {
				System.out.println("fout");
			}
			if (poging2 == letter2) {
				System.out.println("goed");
			} else if (poging2 == letter1 || poging2 == letter3 || poging2 == letter4 || poging2 == letter5) {
				System.out.println("fout");
			} else {
				System.out.println("fout");
			}
			if (poging3 == letter3) {
				System.out.println("goed");
			} else if (poging3 == letter2 || poging3 == letter1 || poging3 == letter4 || poging3 == letter5) {
				System.out.println("fout");
			} else {
				System.out.println("fout");
			}
			if (poging4 == letter4) {
				System.out.println("goed");
			} else if (poging4 == letter2 || poging4 == letter3 || poging4 == letter1 || poging4 == letter5) {
				System.out.println("fout");
			} else {
				System.out.println("fout");
			}
			if (poging5 == letter5) {
				System.out.println("goed");
			} else if (poging5 == letter2 || poging5 == letter3 || poging5 == letter4 || poging5 == letter1) {
				System.out.println("fout");
			} else {
				System.out.println("fout");
			}

		}
	}
}
