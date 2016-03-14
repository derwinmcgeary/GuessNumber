import java.util.Scanner;

public class GuessNumber{
    public static void main(String[] args){

	int lower= 0;
	int upper = 16;
	Guesser g = new Guesser(lower,upper);
	
	g.quiz();


    }
}
