import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiceTest {

	@Test
	void testtheWinner() {
		assertEquals("Tie", Dice1v1.theWinner(6,6)); 
	}
		
	@Test
	void testtheWinner2() {
		assertEquals("Computer is the Winner", Dice1v1.theWinner(4,6));
	}
		
	@Test
	void testtheWinner3() {
		assertEquals("Computer is the Winner", Dice1v1.theWinner(2,4)); 
	}
		
	@Test
	void testtheWinner4() {
		assertEquals("Computer is the Winner", Dice1v1.theWinner(2,5)); 
	}
		
	@Test
	void testtheWinner5() {
		assertEquals("User is the Winner", Dice1v1.theWinner(6,3)); 
	}
		
	@Test
	void testtheWinner6() {
		assertEquals("User is the Winner", Dice1v1.theWinner(5,2)); 
	}
		
	@Test
	void testtheWinner7() {
		assertEquals("Computer is the Winner", Dice1v1.theWinner(1,6)); 
	}
		
	@Test
	void testtheWinner8() {
		assertEquals("Tie", Dice1v1.theWinner(2,2)); 
	}
		
	@Test
	void testtheWinner9() {
		assertEquals("Computer is the Winner", Dice1v1.theWinner(5,6)); 
	}
		
	@Test
	void testtheWinner10() {
		assertEquals("User is the Winner", Dice1v1.theWinner(4,3)); 
	}
		
	@Test
	void testtheWinner11() {
		assertEquals("User is the Winner", Dice1v1.theWinner(3,1));
	}
		
	@Test
	void testtheWinner12() {
		assertEquals("Tie", Dice1v1.theWinner(1,1));  
	}

}
