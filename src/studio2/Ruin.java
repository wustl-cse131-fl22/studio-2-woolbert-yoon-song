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
		
		boolean gameRunning = true;
		
		while(gameRunning) {
			
			if(Math.random() < winChance) {
				startAmount += 1;
				System.out.println("Congrats you won a dollar.");
			} else {
				startAmount -= 1;
				System.out.println("Better luck next time");
			}
			
			if(startAmount == 0) {
				System.out.println("Uh oh you are broke");
				gameRunning = false;
			} else if (startAmount == winLimit) {
				System.out.println("Congrats you have hit the win limit!");
				gameRunning = false;
			} 
		}
	}
}
