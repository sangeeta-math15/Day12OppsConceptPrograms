
/*****************************
 * Program written for shuffle of cards and distribute the card
 * 
 * @author Sangeeta
 * 
 ****************************/
package com.bridge.day11;

import java.util.Random;

public class DeckOfCard {

	public static void main(String[] args) {

		String[] cardType = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] cardNumbers = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		String[] cardsArray = new String[52];
		int start = 0, end = 12, j1 = 0;
		// for combination of cardType and cardNumbers
		for (int i = 0; i < 4; i++) {
			for (int j = start; j <= end; j++) {
				cardsArray[j] = cardType[i] + " " + cardNumbers[j1];
				j1++;
			}
			j1 = 0;
			start = end + 1;
			end += 13;
		}

		// printing all cards
		for (int i = 0; i < cardsArray.length; i++) {
			System.out.print(cardsArray[i] + " ");
		}
		// code for shuffle all the cards
		shuffleCardsDeck(cardsArray);
		System.out.println();
		System.out.println("**************************************");

		// printing cards for 4 players

		int j2 = 0;
		for (int i = 0; i < 4; i++) {
			System.out.println();
			System.out.print("For Player " + i + ": \n");
			System.out.println("====================");
			for (int j = 0; j < 9; j++) {
				System.out.print(cardsArray[j2] + "-->");
				j2++;
			}
			System.out.println();
		}

	}

	private static Object shuffleCardsDeck(String[] arr) {
		Random random = new Random();
		int f1, f2;
		String temp;
		for (int i = 0; i < 52; i++) {
			f1 = random.nextInt(51);
			f2 = random.nextInt(51);
			if (f1 != f2) {
				temp = arr[f1];
				arr[f1] = arr[f2];
				arr[f2] = temp;
			}
		}

		return arr;
	}
}
