package com.bridgelabz.oops.DeckOfCards;

import java.io.ObjectInputStream.GetField;
import java.io.StreamCorruptedException;
import java.util.Random;

public class DeckOfCards {

	static String[] suit= {"Clubs","Diamonds", "Hearts", "Spades"};
	
	static String[] rank= {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};
	
	static String[] cards=new String[52];
	
	static String[][] playerCards= new String[4][9]; 
	
	public  static void getcards()
	{
		int k=0;
		/*
		 * for (String suits : suit) {
		 * 
		 * for (String ranks : rank) {
		 * 
		 * cards[k]= suits+" "+ranks;
		 * 
		 * System.out.println(cards[k]); }
		 * 
		 * }
		 */
		
		
		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < rank.length; j++) {

				cards[k] = suit[i] + "-" + rank[j];

				// System.out.println(cards[k]);

				k++;
			}
		}
		
	}
	
	public static String[] shuffleCards()
	{
		String temp="";
				
		/*
		 * for(int i=0;i<cards.length;i++) {
		 */
			for (String card : cards) {
				
				int randomnumber=(int)(Math.random()*10);
				
				//System.out.println(randomnumber);
					
				temp=cards[randomnumber];
				cards[randomnumber]=card;
				card=temp;
			
				// System.out.println(cards[i]);
				
			}
			
			
		//}
		return cards;
	
	
	}
	
	
	public static void distributeCard(String[] cards)
	{
		int k=0;
		
		for(int i=0;i<4;i++)
		{
			System.out.print("Player "+(i+1)+" :- ");
			
			for(int j=0;j<9;j++)
			{
				
				playerCards[i][j]=cards[k];
				
				System.out.print(playerCards[i][j]+" ");
				
				k++;
			}
			
			System.out.println();
		}
		
		
	}
	

	public static void main(String[] args) {
		
		DeckOfCards.getcards();
		
		//System.out.println("after shuffuling");
		
		
		String[] card=DeckOfCards.shuffleCards();
		  
		DeckOfCards.distributeCard(card);
		 
		

	}


}
