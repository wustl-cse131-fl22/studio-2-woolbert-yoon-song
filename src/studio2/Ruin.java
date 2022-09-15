package studio2;

import java.util.Scanner;

public class Ruin {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a start amount: ");
		int startAmount = in.nextInt();
		
		System.out.println("Enter the win chance: ");
		double winChance = in.nextDouble();
		
		System.out.println("Enter the win limit: ");
		int winLimit = in.nextInt();
		
		System.out.println("Enter the number of day's you'll simulate: ");
		int totalSimulations = in.nextInt();
		
		boolean gameRunning = true;
		
		for(int day = 1; day <= totalSimulations + 1; day ++) {
			
			int gameAmount = startAmount;
			int plays = 0;

			while(gameRunning) {
				
				plays +=1;
				
				if(Math.random() < winChance) {
					gameAmount += 1;
				} else {
					gameAmount -= 1;
				}
				
				if(gameAmount == 0) {
					gameRunning = false;
				} else if (gameAmount == winLimit) {
					gameRunning = false;
				} 
			
			}
				
			if (gameAmount == winLimit) {
				System.out.println("The day number is " + day + ". There were " + plays + " number of plays. You succeeded.");
			}
			
			else if (gameAmount == 0){
				System.out.println("The day number is " + day + ". There were " + plays + " number of plays. You failed.");
			}
		
		}
	}
}
