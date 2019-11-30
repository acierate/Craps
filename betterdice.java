import java.util.Random;
import java.util.Scanner;
public class betterdice {
public static void main (String[] args) {
	class Dice{
		int Die1;
		int Die2;
		int point;
		}
	
	
	
	Dice Dies = new Dice();
	Random Roller = new Random();
	Scanner Scan = new Scanner(System.in);
	boolean comeout = true;
	boolean game;
	boolean Hilo = true;
	
	
	 
	  while (Hilo = true) { 
	   Dies.Die1 = Roller.nextInt(6) + 1;
		  Dies.Die2 = Roller.nextInt(6) + 1;
		  
		  
	  
	System.out.println("Player 1 or 2? Hi-Lo round.");
	Scan.nextInt();
	try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
	
	System.out.println("Die 1: " + Dies.Die1 + "    Die 2: " + Dies.Die2);
	try {Thread.sleep(3500);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
	
	if (Dies.Die1 > Dies.Die2) {System.out.println("Player 1 wins the Hi-Lo");
	try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();} break;
	}
	else {System.out.println("Player 2 wins the Hi-Lo");
	try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();} break;}
	
	
	  }
	
	if (comeout = true){
		Dies.Die1 = Roller.nextInt(6) + 1;
		  Dies.Die2 = Roller.nextInt(6) + 1;
		  int roll = Dies.Die1+ Dies.Die2;
		System.out.println("Die 1: " + Dies.Die1 + "    Die 2: " + Dies.Die2   + "   rolled: " + roll);
		try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
		
			
			if (comeout = true) {
				if (Dies.Die1 + Dies.Die2 == 7) {System.out.println("Seven-out."); System.exit(0);}
				
				if (Dies.Die1 + Dies.Die2 == 11) {System.out.println("11-out."); System.exit(0);}
				
				if (Dies.Die1 + Dies.Die2 == 2) {System.out.println("Snake eyes, crapped out"); System.exit(0);}
				
				if (Dies.Die1 + Dies.Die2 == 3) {System.out.println("Crapped out"); System.exit(0);}
				
				if (Dies.Die1 + Dies.Die2 == 12) {System.out.println("Crapped out"); System.exit(0);}
				Dies.point = (Dies.Die1 + Dies.Die2);
				System.out.println("Your point is:  " + Dies.point);
				try {Thread.sleep(2000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
				comeout = false;}
				}
	
	game = true;
	
	while (game = true) {
		Dies.Die1 = Roller.nextInt(6) + 1;
		  Dies.Die2 = Roller.nextInt(6) + 1;
		  int roll2 = Dies.Die1+ Dies.Die2;
		  System.out.println("Die 1: " + Dies.Die1 + "    Die 2: " + Dies.Die2 + "   rolled: " + roll2);
		  try {Thread.sleep(2000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
		  
		  if (Dies.Die1 + Dies.Die2 == Dies.point) {System.out.println("You hit your point. You win!"); System.exit(0);}
		  
		  if (Dies.Die1 + Dies.Die2 == 2) {System.out.println("Snake eyes, crapped out"); System.exit(0);}
			
			if (Dies.Die1 + Dies.Die2 == 3) {System.out.println("Crapped out"); System.exit(0);}
			
			if (Dies.Die1 + Dies.Die2 == 12) {System.out.println("Crapped out"); System.exit(0);}
			
			if (Dies.Die1 + Dies.Die2 == 7) {System.out.println("Crapped out."); System.exit(0);}
			
			
		  
		  
		
	}
	
	
}
}
		 
	
	
	
	

	

	

	


