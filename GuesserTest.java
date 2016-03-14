import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GuesserTest {

    @Test
    public void newGuesser() {
	Guesser g = new Guesser(0,10);
    
	assertEquals(0, g.lower);
	assertEquals(10, g.upper);
    }

    @Test
    public void setLowerToOne() {
	Guesser g = new Guesser(0,10);
	g.setLower(1);
    
	assertEquals(1, g.lower);
	assertEquals(10, g.upper);
    }

    @Test
    public void setUpperToNine() {
	Guesser g = new Guesser(0,10);
	g.setUpper(9);
    
	assertEquals(0, g.lower);
	assertEquals(9, g.upper);
    }

    @Test
    public void makeNewQuestion() {
	Guesser g = new Guesser(0,10);
	String question = g.generateQuestion(5);
	assertEquals("Is it greater than 5?", question);
    }
}
