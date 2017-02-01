package com.test;

import java.util.Scanner;
/**
 * @author mtomy
 * Given a String and a Character, remove all instances of the Character in the String

 * Solve this two ways:
 * 1. Iterate through the String, one character at a time
 * 2. Find a method in the String class that can solve this in one line
 */
public class RemoveCharacterDemo {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter your input String and character seperated by space");
		while (sc.hasNext()) {
			String str = sc.next();
			String ch = String.valueOf(sc.next().charAt(0));
			System.out.println("input = " + str);
			System.out.println("Soultion1 = " + customRemoveChar(str, ch));
			System.out.println("Solution2 = " + builtInRemoveChar(str, ch));
			System.out.println("\nEnter your input String and character seperated by space");
		}
	}
	/**
	 * Custom method to remove character from string . Append
	 * each character to a stringbuilder except the given char
	 * @param str
	 * @param ch
	 * @return resultant string
	 */
	public static String customRemoveChar(String str, String ch) {
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ch.charAt(0)) {
				output.append(str.charAt(i));
			}
		}
		return output.toString();
	}
	/**
	 * Java's String replace will replace each character by empty value
	 * @param str
	 * @param ch
	 * @return resultant string
	 */
	public static String builtInRemoveChar(String str, String ch) {
		return str.replace(ch, "");
	}

}
