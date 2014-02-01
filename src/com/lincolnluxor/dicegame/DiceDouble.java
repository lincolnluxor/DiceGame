package com.lincolnluxor.dicegame;

import java.util.Random;

public class DiceDouble {
	
	/*
	 * Made this to assist a redditor at:
	 * http://www.reddit.com/r/learnprogramming/comments/19fiea/java_stuck_need_to_implement_while_loop_until_two/
	 */
	
	public static void main(String[] args){
		Roll();
	}
	
	public static void Roll(){
		Random random = new Random(); //initialize random
		System.out.println("DICE GAME!");
		boolean match = false; //do they match?
		int countRolls = 1; //start at one since you add at the end, not the beginning of the loop
		while (!match) {
			int num1 = random.nextInt(6) + 1; //since this is inside of the loop and not global it will re-initialize after every roll
			int num2 = random.nextInt(6) + 1;
			int total = num1 + num2;
			System.out.println("First roll: " + num1);
			System.out.println("Second roll: " + num2);
			System.out.println("Total is " + total);
			if (num1 == num2) { 
				System.out.println("They match after " + countRolls + " rolls"); //print result
				match = true; //end the loop if they match
			}
			else {
				countRolls++; //add to the roll counter
				System.out.println("_______________");
			}
		}
	}
}