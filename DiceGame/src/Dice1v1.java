import java.util.Random;
/**
 * 
 * @author Michael Yemenshwa 
 * Description: This program plays a simple dice game with the user and the computer as the two players 
 * of the game, also this game loops for a total of 10 rounds, and whoever has the most wins is 
 * the champion.
 *
 */
public class Dice1v1 {

	public static void main(String[] args) {
		
		//initializing 
		int userW = 0;
		int compW = 0;
		
		Dice1v1 user = new Dice1v1();
		Dice1v1 computer = new Dice1v1();
		
		//using the printf tool to format my output of the code to be nice and neat 
		System.out.printf("%1s%20s%20s%20s\n", "Round", "User Round", "Computer Round", "The Winner");
		System.out.println();
		
		//for loop to max out the amount of rounds at 10, with an if else statement to count up the 
		//total points for each player
		for (int i = 1; i <= 10; i++) { 
			
			int user1 = user.getFace();
			int computer1 = computer.getFace();   
			
			if (user1 > computer1) {
				userW++;
			}
			else if (computer1 > user1) {
				compW++;
			}
			 
			//Another printf to line up all the outputs into one neat table 
			System.out.printf("%1s%20s%20s%26s\n", String.valueOf(i), user1, computer1, theWinner(user1, computer1));
		}
		
		System.out.println("User Wins: " + userW);
		System.out.println("Computer Wins: " + compW);
		System.out.println("The Champion: " + theWinner(userW, compW)); 
		
		
	}
	//Creating a method to print out the correct message for the current winner or tie of a round 
	public static String theWinner(int usr, int comp) { 
		String champion = "";
		
		if (usr > comp) {
			champion = "User is the Winner";
		}
		if (comp > usr) {
			champion = "Computer is the Winner";
		}
		if (usr == comp) {
			champion = "Tie";
		}
		return champion;
	}
	
	//Another method to generate random values from 1-6 to give each player a chance to win each round
	public int getFace() {
		
		Random random = new Random();
		int num = random.nextInt(6)+1;  
		
		return num;
			

	}

}
