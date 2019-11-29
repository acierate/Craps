
import java.util.Random;
import java.util.Scanner;

public class Poop {

	public static void main(String[] args) {    
		
																				  class Dice {
																					public int Hi;
																					public int Lo;
																					public int Hi1;
																					public int Lo1;
																					public int Hi2;
																					public int Lo2;
																					public int Hi3;
																					public int Lo3;
																					public int Roll1;
																					public int Roll2;
																					public int Roll3;
																					public int Roll4;
																					public int Roll5;
																					public int Roll6;
																					public int Roll7;
																					public int Roll8;
																					public int Roll9;
																					public int Roll10;
																					public int Roll11;
																					public int Roll12;
																					public int Roll13;
																					public int Roll14;
																					public int Roll15;
																					public int Roll16;
																					public int Roll17;
																					public int Roll18;
																					public int Roll19;
																					public int Roll20;
																					public int Roll21;
																					public int Roll22;
																					public int Roll23;
																					public int Roll24;
																					public int Roll25;
																					public int Roll26;
																					public int Roll27;
																					public int Roll28;
																					public int Roll29;
																					public int Roll30;
																					 }
		
	 Scanner Scan = new Scanner(System.in);   //creates scanner
	 Random Rand = new Random();              //creates random
					 
																	 	 Dice roller = new Dice();  {
																		 roller.Hi = Rand.nextInt(6) + 1;
																		 roller.Lo = Rand.nextInt(6) + 1;
																		 roller.Hi1 = Rand.nextInt(6) + 1;
																		 roller.Lo1 = Rand.nextInt(6) + 1;
																		 roller.Hi2 = Rand.nextInt(6) + 1;
																		 roller.Lo2 = Rand.nextInt(6) + 1;
																		 roller.Hi3 = Rand.nextInt(6) + 1;
																		 roller.Lo3 = Rand.nextInt(6) + 1;
																		 roller.Roll1 = Rand.nextInt(6) + 1;
																		 roller.Roll2 = Rand.nextInt(6) + 1;
																		 roller.Roll3 = Rand.nextInt(6) + 1;
																		 roller.Roll4 = Rand.nextInt(6) + 1;
																	 	 roller.Roll5 = Rand.nextInt(6) + 1;
																		 roller.Roll6 = Rand.nextInt(6) + 1;
																		 roller.Roll7 = Rand.nextInt(6) + 1;
																		 roller.Roll8 = Rand.nextInt(6) + 1;
																		 roller.Roll9 = Rand.nextInt(6) + 1;
																		 roller.Roll10 = Rand.nextInt(6) + 1;
																	 	 roller.Roll11 = Rand.nextInt(6) + 1;
																		 roller.Roll12 = Rand.nextInt(6) + 1;
																		 roller.Roll13 = Rand.nextInt(6) + 1;
																		 roller.Roll14 = Rand.nextInt(6) + 1;
																		 roller.Roll15 = Rand.nextInt(6) + 1;
																		 roller.Roll16 = Rand.nextInt(6) + 1;
																		 roller.Roll17 = Rand.nextInt(6) + 1;
																		 roller.Roll18 = Rand.nextInt(6) + 1;
																		 roller.Roll19 = Rand.nextInt(6) + 1;
																	 	 roller.Roll20 = Rand.nextInt(6) + 1;
																		 roller.Roll21 = Rand.nextInt(6) + 1;
																		 roller.Roll22 = Rand.nextInt(6) + 1;
																		 roller.Roll23 = Rand.nextInt(6) + 1;
																		 roller.Roll24 = Rand.nextInt(6) + 1;
																		 roller.Roll25 = Rand.nextInt(6) + 1;
																	 	 roller.Roll26 = Rand.nextInt(6) + 1;
																		 roller.Roll27 = Rand.nextInt(6) + 1;
																		 roller.Roll28 = Rand.nextInt(6) + 1;
																		 roller.Roll29 = Rand.nextInt(6) + 1;
																		 roller.Roll30 = Rand.nextInt(6) + 1;
																		
																		 
																	 	 }
		 
		 
	 
	  System.out.println("Choose Player 1 or 2:");
	  
	  Double choice1 = Scan.nextDouble();                //In this choice1, the players "ID" is made
	  											   // choice1 is never actually used, but roller.Hi is considered player 1
	  											   // while roller.Lo is considered player 2.
	  											   // ****On losses/wins  the player ID will be decided by the above values
	  				try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
	 
	  				System.out.println("Hi-Lo Roll----");
	  try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
	  System.out.println("Player 1: " + roller.Hi + "     Player 2: " + roller.Lo);
	  try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
	 
	  
	  
			  if (roller.Hi > roller.Lo) { System.out.println("Player 1 wins the Hi-Lo");
			  try {Thread.sleep(3500);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
			  System.out.println("Player 1 is the shooter");
			  try {Thread.sleep(3500);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}}
			  
				  if (roller.Lo > roller.Hi) {System.out.println("Player 2 wins the Hi-Lo"); 
				  try {Thread.sleep(3500);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
				  System.out.println("Player 2 is the shooter");
				  try {Thread.sleep(3500);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}}
		  
	  
				  if (roller.Hi == roller.Lo) {System.out.println("Equal roll.");
				  System.out.println("Hi-Lo Roll 2----");
				  System.out.println("Player 1: " + roller.Hi1 + "     Player 2: " + roller.Lo1);
				  
				  if (roller.Hi1 > roller.Lo1) {System.out.println("Player 1 wins the Hi-Lo"); 
				  try {Thread.sleep(3500);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
				  System.out.println("Player 1 is the shooter");
				  try {Thread.sleep(3500);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}}
				  
					  if (roller.Lo1 > roller.Hi1) {System.out.println("Player 2 wins the Hi-Lo"); 
					  try {Thread.sleep(3500);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
					  System.out.println("Player 2 is the shooter");
					  try {Thread.sleep(3500);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}}}
				  try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
	  
				  
				  
				  
				  
	  
																						// line 99 and 102 represent the current shooter. check compiler for line Id 
		                                                                              // if line 99/102 prints in the compiler/console, repeat its ID on lines that indicate winning rolls.
		
		
		
					try {Thread.sleep(3000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
					
					
	System.out.println("Roll 1----");
		System.out.print("Die 1:  ");
		System.out.print(roller.Roll1 + "     ");
					try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
		System.out.print("Die 2:  ");
		System.out.print(roller.Roll2 + " ");
					try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}

					                                                                            //v Ends the program
		if (roller.Roll1 + roller.Roll2 == 7) { System.out.println("  Player wins! Seven out." );     System.exit(0);} 
		if (roller.Roll1 + roller.Roll2 == 11) { System.out.println("  Player wins! 11 on the come out.");     System.exit(0);} 
		 if (roller.Roll1 + roller.Roll2 == 12) {
			  System.out.println("  Player crapped out. Rolled a 12."); System.exit(0);}
		 if (roller.Roll1 + roller.Roll2 == 3) {
			  System.out.println("  Player crapped out. Rolled a 3."); System.exit(0);}
		 if (roller.Roll1 + roller.Roll2 == 2) {
			  System.out.println("  Player crapped out. Rolled snake eyes."); System.exit(0);}
		
		System.out.println("");
		System.out.println(roller.Roll1 + roller.Roll2 + " is the point. *");
		
		int point = (roller.Roll1 + roller.Roll2);
		
		
		
		System.out.println("Roll 2----");                       // Roll 2
		System.out.print("Die 1:  ");
		System.out.print(roller.Roll3 + "     ");
					try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
		System.out.print("Die 2:  " + roller.Roll4);
		

					try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
					System.out.println("");	
	  
	  if (roller.Roll3 + roller.Roll4 == point) { 
		  System.out.println("  Player hit the point(" + point + ")    Player wins."); System.exit(0);}
		  
		  if (roller.Roll3 + roller.Roll4 == 7) { 
			  System.out.println("  Player crapped out. 7 rolled."); System.exit(0);}
			  
			  if (roller.Roll3 + roller.Roll4 == 2) {
				  System.out.println("  Player crapped out. Rolled snake eyes."); System.exit(0);}
			  
				  if (roller.Roll3 + roller.Roll4 == 12) {
					  System.out.println("  Player crapped out. Rolled a 12."); System.exit(0);}
				  
					  if (roller.Roll3 + roller.Roll4 == 3) {
						  System.out.println("  Player crapped out. Rolled a 3."); System.exit(0);}
					  
					  
					  
					  
					  
					  
					  
						System.out.println("Roll 3----");                       // Roll 3
						System.out.print("Die 1:  ");
						System.out.print(roller.Roll5 + "     ");
									try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
						System.out.print("Die 2:  ");
						System.out.print(roller.Roll6 + " ");
									try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
					  
					  if (roller.Roll5 + roller.Roll6 == point) { 
						  System.out.println("  Player hit the point(" + point + ")   Player wins."); System.exit(0);}
						  
						  if (roller.Roll5 + roller.Roll6 == 7) { 
							  System.out.println("  Player crapped out. 7 rolled."); System.exit(0);}
							  
							  if (roller.Roll5 + roller.Roll6 == 2) {
								  System.out.println("  Player crapped out. Rolled snake eyes."); System.exit(0);}
							  
								  if (roller.Roll5 + roller.Roll6 == 12) {
									  System.out.println("  Player crapped out. Rolled a 12."); System.exit(0);}
								  
									  if (roller.Roll5 + roller.Roll6 == 3) {
										  System.out.println("  Player crapped out. Rolled a 3."); System.exit(0);}
									  System.out.println("");
									  
									  
									  
		
System.out.println("Roll 4----");                       // Roll 4
System.out.print("Die 1:  ");
System.out.print(roller.Roll7 + "     ");
try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
System.out.print("Die 2:  ");
System.out.print(roller.Roll8 + " ");
try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
									  
if (roller.Roll7 + roller.Roll8 == point) { 
System.out.println("  Player hit the point(" + point + ")   Player wins."); System.exit(0);}
										  
if (roller.Roll7 + roller.Roll8 == 7) { 
System.out.println("  Player crapped out. 7 rolled."); System.exit(0);}
											  
if (roller.Roll7 + roller.Roll8 == 2) {
System.out.println("  Player crapped out. Rolled snake eyes."); System.exit(0);}
											  
if (roller.Roll7 + roller.Roll8 == 12) {
System.out.println("  Player crapped out. Rolled a 12."); System.exit(0);}
												  
if (roller.Roll7 + roller.Roll8 == 3) {
System.out.println("  Player crapped out. Rolled a 3."); System.exit(0);}

System.out.println("");




System.out.println("Roll 5----");                       // Roll 5
System.out.print("Die 1:  ");
System.out.print(roller.Roll9 + "     ");
try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
System.out.print("Die 2:  ");
System.out.print(roller.Roll10 + " ");
try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
									  
if (roller.Roll9 + roller.Roll10 == point) { 
System.out.println("  Player hit the point(" + point + ")    Player wins."); System.exit(0);}
										  
if (roller.Roll9 + roller.Roll10 == 7) { 
System.out.println("  Player crapped out. 7 rolled."); System.exit(0);}
											  
if (roller.Roll9 + roller.Roll10 == 2) {
System.out.println("  Player crapped out. Rolled snake eyes."); System.exit(0);}
											  
if (roller.Roll9 + roller.Roll10 == 12) {
System.out.println("  Player crapped out. Rolled a 12."); System.exit(0);}
												  
if (roller.Roll9 + roller.Roll10 == 3) {
System.out.println("  Player crapped out. Rolled a 3."); System.exit(0);}
System.out.println("");			





System.out.println("Roll 6----");                       // Roll 6
System.out.print("Die 1:  ");
System.out.print(roller.Roll11 + "     ");
try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
System.out.print("Die 2:  ");
System.out.print(roller.Roll12 + " ");
try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
									  
if (roller.Roll11 + roller.Roll12 == point) { 
System.out.println("  Player hit the point(" + point + ")    Player wins."); System.exit(0);}
										  
if (roller.Roll11 + roller.Roll12 == 7) { 
System.out.println("  Player crapped out. 7 rolled."); System.exit(0);}
											  
if (roller.Roll11 + roller.Roll12 == 2) {
System.out.println("  Player crapped out. Rolled snake eyes."); System.exit(0);}
											  
if (roller.Roll11 + roller.Roll12 == 12) {
System.out.println("  Player crapped out. Rolled a 12."); System.exit(0);}
												  
if (roller.Roll11 + roller.Roll12 == 3) {
System.out.println("  Player crapped out. Rolled a 3."); System.exit(0);}
System.out.println("");	


System.out.println("Roll 7----");                       // Roll 7
System.out.print("Die 1:  ");
System.out.print(roller.Roll13 + "     ");
try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
System.out.print("Die 2:  ");
System.out.print(roller.Roll14 + " ");
try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
									  
if (roller.Roll13 + roller.Roll14 == point) { 
System.out.println("  Player hit the point(" + point + ")    Player wins."); System.exit(0);}
										  
if (roller.Roll13 + roller.Roll14 == 7) { 
System.out.println("  Player crapped out. 7 rolled."); System.exit(0);}
											  
if (roller.Roll13 + roller.Roll14 == 2) {
System.out.println("  Player crapped out. Rolled snake eyes."); System.exit(0);}
											  
if (roller.Roll13 + roller.Roll14 == 12) {
System.out.println("  Player crapped out. Rolled a 12."); System.exit(0);}
												  
if (roller.Roll13 + roller.Roll14 == 3) {
System.out.println("  Player crapped out. Rolled a 3."); System.exit(0);}
System.out.println("");	

System.out.println("Roll 8----");                       // Roll 8
System.out.print("Die 1:  ");
System.out.print(roller.Roll15 + "     ");
try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
System.out.print("Die 2:  ");
System.out.print(roller.Roll16 + " ");
try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
									  
if (roller.Roll15 + roller.Roll16 == point) { 
System.out.println("  Player hit the point(" + point + ")    Player wins."); System.exit(0);}
										  
if (roller.Roll15 + roller.Roll16 == 7) { 
System.out.println("  Player crapped out. 7 rolled."); System.exit(0);}
											  
if (roller.Roll15 + roller.Roll16 == 2) {
System.out.println("  Player crapped out. Rolled snake eyes."); System.exit(0);}
											  
if (roller.Roll15 + roller.Roll16 == 12) {
System.out.println("  Player crapped out. Rolled a 12."); System.exit(0);}
												  
if (roller.Roll15 + roller.Roll16 == 3) {
System.out.println("  Player crapped out. Rolled a 3."); System.exit(0);}
System.out.println("");	


System.out.println("Roll 9----");                       // Roll 9
System.out.print("Die 1:  ");
System.out.print(roller.Roll17 + "     ");
try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
System.out.print("Die 2:  ");
System.out.print(roller.Roll18 + " ");
try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
									  
if (roller.Roll17 + roller.Roll18 == point) { 
System.out.println("  Player hit the point(" + point + ")    Player wins."); System.exit(0);}
										  
if (roller.Roll17 + roller.Roll18 == 7) { 
System.out.println("  Player crapped out. 7 rolled."); System.exit(0);}
											  
if (roller.Roll17 + roller.Roll18 == 2) {
System.out.println("  Player crapped out. Rolled snake eyes."); System.exit(0);}
											  
if (roller.Roll17 + roller.Roll18 == 12) {
System.out.println("  Player crapped out. Rolled a 12."); System.exit(0);}
												  
if (roller.Roll17 + roller.Roll18 == 3) {
System.out.println("  Player crapped out. Rolled a 3."); System.exit(0);}
System.out.println("");	
			  

System.out.println("Roll 10----");                       // Roll 10
System.out.print("Die 1:  ");
System.out.print(roller.Roll19 + "     ");
try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
System.out.print("Die 2:  ");
System.out.print(roller.Roll20 + " ");
try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
									  
if (roller.Roll19 + roller.Roll20 == point) { 
System.out.println("  Player hit the point(" + point + ")    Player wins."); System.exit(0);}
										  
if (roller.Roll19 + roller.Roll20 == 7) { 
System.out.println("  Player crapped out. 7 rolled."); System.exit(0);}
											  
if (roller.Roll19 + roller.Roll20 == 2) {
System.out.println("  Player crapped out. Rolled snake eyes."); System.exit(0);}
											  
if (roller.Roll19 + roller.Roll20 == 12) {
System.out.println("  Player crapped out. Rolled a 12."); System.exit(0);}
												  
if (roller.Roll19 + roller.Roll20 == 3) {
System.out.println("  Player crapped out. Rolled a 3."); System.exit(0);}
System.out.println("");	

System.out.println("Roll 11----");                       // Roll 11
System.out.print("Die 1:  ");
System.out.print(roller.Roll21 + "     ");
try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
System.out.print("Die 2:  ");
System.out.print(roller.Roll22 + " ");
try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
									  
if (roller.Roll21 + roller.Roll22 == point) { 
System.out.println("  Player hit the point(" + point + ")    Player wins."); System.exit(0);}
										  
if (roller.Roll21 + roller.Roll22 == 7) { 
System.out.println("  Player crapped out. 7 rolled."); System.exit(0);}
											  
if (roller.Roll21 + roller.Roll22 == 2) {
System.out.println("  Player crapped out. Rolled snake eyes."); System.exit(0);}
											  
if (roller.Roll21 + roller.Roll22 == 12) {
System.out.println("  Player crapped out. Rolled a 12."); System.exit(0);}
												  
if (roller.Roll21 + roller.Roll22 == 3) {
System.out.println("  Player crapped out. Rolled a 3."); System.exit(0);}
System.out.println("");	

System.out.println("Roll 12----");                       // Roll 12
System.out.print("Die 1:  ");
System.out.print(roller.Roll23 + "     ");
try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
System.out.print("Die 2:  ");
System.out.print(roller.Roll24 + " ");
try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
									  
if (roller.Roll23 + roller.Roll24 == point) { 
System.out.println("  Player hit the point(" + point + ")    Player wins."); System.exit(0);}
										  
if (roller.Roll23 + roller.Roll24 == 7) { 
System.out.println("  Player crapped out. 7 rolled."); System.exit(0);}
											  
if (roller.Roll23 + roller.Roll24 == 2) {
System.out.println("  Player crapped out. Rolled snake eyes."); System.exit(0);}
											  
if (roller.Roll23 + roller.Roll24 == 12) {
System.out.println("  Player crapped out. Rolled a 12."); System.exit(0);}
												  
if (roller.Roll23 + roller.Roll24 == 3) {
System.out.println("  Player crapped out. Rolled a 3."); System.exit(0);}
System.out.println("");	



System.out.println("Roll 13----");                       // Roll 13
System.out.print("Die 1:  ");
System.out.print(roller.Roll25 + "     ");
try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
System.out.print("Die 2:  ");
System.out.print(roller.Roll26 + " ");
try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
									  
if (roller.Roll25 + roller.Roll26 == point) { 
System.out.println("  Player hit the point(" + point + ")    Player wins."); System.exit(0);}
										  
if (roller.Roll25 + roller.Roll26 == 7) { 
System.out.println("  Player crapped out. 7 rolled."); System.exit(0);}
											  
if (roller.Roll25 + roller.Roll26 == 2) {
System.out.println("  Player crapped out. Rolled snake eyes."); System.exit(0);}
											  
if (roller.Roll25 + roller.Roll26 == 12) {
System.out.println("  Player crapped out. Rolled a 12."); System.exit(0);}
												  
if (roller.Roll25 + roller.Roll26 == 3) {
System.out.println("  Player crapped out. Rolled a 3."); System.exit(0);}
System.out.println("");	


System.out.println("Roll 14----");                       // Roll 14
System.out.print("Die 1:  ");
System.out.print(roller.Roll27 + "     ");
try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
System.out.print("Die 2:  ");
System.out.print(roller.Roll28 + " ");
try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
									  
if (roller.Roll27 + roller.Roll28 == point) { 
System.out.println("  Player hit the point(" + point + ")    Player wins."); System.exit(0);}
										  
if (roller.Roll27 + roller.Roll28 == 7) { 
System.out.println("  Player crapped out. 7 rolled."); System.exit(0);}
											  
if (roller.Roll27 + roller.Roll28 == 2) {
System.out.println("  Player crapped out. Rolled snake eyes."); System.exit(0);}
											  
if (roller.Roll27 + roller.Roll28 == 12) {
System.out.println("  Player crapped out. Rolled a 12."); System.exit(0);}
												  
if (roller.Roll27 + roller.Roll28 == 3) {
System.out.println("  Player crapped out. Rolled a 3."); System.exit(0);}
System.out.println("");	



System.out.println("Roll 15----");                       // Roll 15
System.out.print("Die 1:  ");
System.out.print(roller.Roll29 + "     ");
try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
System.out.print("Die 2:  ");
System.out.print(roller.Roll30 + " ");
try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
									  
if (roller.Roll29 + roller.Roll30 == point) { 
System.out.println("  Player hit the point(" + point + ")    Player wins."); System.exit(0);}
										  
if (roller.Roll29 + roller.Roll30 == 7) { 
System.out.println("  Player crapped out. 7 rolled."); System.exit(0);}
											  
if (roller.Roll29 + roller.Roll30 == 2) {
System.out.println("  Player crapped out. Rolled snake eyes."); System.exit(0);}
											  
if (roller.Roll29 + roller.Roll30 == 12) {
System.out.println("  Player crapped out. Rolled a 12."); System.exit(0);}
												  
if (roller.Roll29 + roller.Roll30 == 3) {
System.out.println("  Player crapped out. Rolled a 3."); System.exit(0);}
System.out.println("");	


	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}
