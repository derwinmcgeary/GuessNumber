import java.util.Scanner;

public class Guesser{       

    int lower;
    int upper;

    class InvalidInputException extends Exception{
	public InvalidInputException() {}

    }


    public Guesser(int l,int u) {
	this.lower = l;
	this.upper = u;
      

    }

    public void setLower(int l) {
	this.lower = l;
    }

    public void setUpper(int u) {
	this.upper = u;
    }

    public void quiz(){
	System.out.println("Think of a number between " +
			   lower + " and "  + upper );

	int temp;

	while(lower != upper){
	    temp = lower + (upper - lower)/2;
	    boolean greaterThan = false;

	    System.out.println(generateQuestion(temp));
	    try {
		greaterThan = getAnswer();
	    } catch(InvalidInputException e) {
		System.out.println("please answer y or n");
		continue;
	    }
		
	    if(greaterThan) {
		setLower(temp+1);
	    } else {
		setUpper(temp);
	    }

	}

	System.out.println("Your number is " + upper);
    }


    public String generateQuestion(int n) {
	return "Is it greater than " + n + "?";
    }


    /*
     * This function gets [YyNn] from the keyboard and returns true/false/InvalidInputException
     */
    public boolean getAnswer() throws InvalidInputException {
	boolean output;
	Scanner sc  = new Scanner(System.in);
	String input = sc.next();
	    
	switch (input.toLowerCase()){
		
	case ("y"): 
	    output = true;
	    break;

	case "n":
	    output = false;
	    break;

	default:
	    throw new InvalidInputException(); 
	}

	return output;
    }
    
}
