package com.learning.console;

import java.util.Scanner;

public class Anagrama {

	public static void main(String[] args) {
		System.out.println("=========================================="
				+ "==============================");
		System.out.println("|\t\t \t\tANAGRAMA APP      \t\t       |");
		System.out.println("========================================="
				+ "==============================");
		System.out.println("Porfavor ingrese una palabra");
		Scanner scanner = new Scanner(System.in);
		String word1= scanner.next();
		System.out.println("Porfavor ingrese el anagrama");
		String word2 = scanner.next();
		scanner.close();
		compareStrings(word2, word1);
	}

	
	public static boolean checkLetter(String word1, String word2, Character character) {
		int counter1 = 0;
		int counter2 = 0;
		for (int i = 0; i < word1.length(); i++) {
			if (word1.charAt(i) == character) {
				counter1++;

			}
			if (word2.charAt(i) == character) {
				counter2++;

			}

		}

		if (counter1 == counter2) {
			return true;
		} else {
			return false;
		}

	}

	public static void compareStrings(String word1, String word2) {
		if (word1.length() != word2.length()) {
			System.out.println("las palabra [" + word1.toUpperCase() + "] no tienen la misma cantidad de letras"
					+ " \n que la palabra [" + word2 + "]\n por tanto no es anagrama de [" + word2.toUpperCase() + "]");

		} else {
			for (int i = 0; i < word1.length(); i++) {

				boolean aux = checkLetter(word1, word2, word1.charAt(i));
				if (!aux) {
					System.out.println("las palabras no son palindromas");
					break;
				} else {
					if (i == word1.length() - 1) {
						System.out.println("las palabras [" + word1.toUpperCase() + "] es anagrama de  ["
								+ word2.toUpperCase() + "]");
					}
				}
			}

		}
	}
}