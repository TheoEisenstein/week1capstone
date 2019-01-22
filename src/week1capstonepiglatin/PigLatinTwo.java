package week1capstonepiglatin;

import java.util.Scanner;

public class PigLatinTwo {

	public static void main(String[] args) {
		System.out.println("Welcome to the English to Pig Latin Translator\nPlease enter a word to be translated!");
		
		boolean run = true;
		while (run) {
		
		Scanner scnr = new Scanner(System.in);
		
		String notPigLatin = scnr.nextLine();
		
		notPigLatin = notPigLatin.toLowerCase();
		
		int notPigLatinLength = notPigLatin.length();
		
		
		char vowelTest = notPigLatin.charAt(0);
		
		
		
		boolean firstVowel;
		
			if(vowelTest == 'a' || vowelTest == 'e' || vowelTest == 'i' || vowelTest == 'o' || vowelTest == 'u') {
				firstVowel = true;
				System.out.println(notPigLatin.substring(0,notPigLatinLength)+"way");
			}else {
				firstVowel = false;
			}
			if (!firstVowel) {
			for (int i = 0; i < notPigLatinLength || notPigLatin.substring(i,notPigLatinLength).startsWith("a") || notPigLatin.substring(i,notPigLatinLength).startsWith("e") 
					|| notPigLatin.substring(i,notPigLatinLength).startsWith("i") || notPigLatin.substring(i,notPigLatinLength).startsWith("o") ||
					notPigLatin.substring(i,notPigLatinLength).startsWith("u"); i++) {
				
				if (notPigLatin.substring(i,notPigLatinLength).startsWith("a") || notPigLatin.substring(i,notPigLatinLength).startsWith("e") 
					|| notPigLatin.substring(i,notPigLatinLength).startsWith("i") || notPigLatin.substring(i,notPigLatinLength).startsWith("o") ||
					notPigLatin.substring(i,notPigLatinLength).startsWith("u")) { 
					
					System.out.println(notPigLatin.substring(i,notPigLatinLength)+notPigLatin.substring(0,i)+"ay");
					break;
				}else {
					}
				}
			}
			System.out.println("Would you like to translate another word into Pig Latin? y/n");
			String againTranslate = scnr.next();
			if(againTranslate.equalsIgnoreCase("y")) {
				run = true;
				System.out.println("Enter another word!");
			} else {
				run = false;
				System.out.println("\nThank you for using the translator!");
			}
	}
		
	}
}
						
				
				
	
		
	




