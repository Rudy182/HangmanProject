// This program is meant to run a simple game of Hangman

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class HangmanTester {
	
	public int lives = 5;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int guesses = 0;
		
		System.out.println("Enter the word you would like the player to guess");
		String word = in.next();
		
		String string[] = word.split("");
		List<String> splitString = new LinkedList<>(Arrays.asList(string));
	
		
		
		
		System.out.println("There are " + splitString.size() + " letters in the word.");
		System.out.println("Would you like to guess a letter or guess the full word? A wrong guess will cost you one of your 5 lives.");
		System.out.println("Say '1' to guess a letter, or '2' to guess a word");
		int choice = in.nextInt();
		
		switch (choice)
		{
		// Letter guess
		case 1: System.out.println("What letter would you like to guess?");
				String guess = in.next();
				
				for(int i = 0; i < splitString.size(); i++)
				{
					if(guess.equals(splitString.get(i)))
					{
						splitString.remove(i);
						System.out.println("There are " + splitString.size() + " letters remaining");
					}
					
				}
				
					
				break;
		}
		
	}
	
	public void letterGuess(String guess, ArrayList<String> splitString)
	{
		for(int i = 0; i < splitString.size(); i++)
		{
			if(guess == splitString.get(i))
					{
						splitString.remove(i);
						System.out.println("There are " + splitString.size() + " letters remaining");
					}
			else
			{
				lives--;
				System.out.println("Sorry! That letter is not here.");
				System.out.println("You have " + lives + " remaining.");
			}
		}
	}

}


