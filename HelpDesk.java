/*======================================================
 * class HelpDesk
 * uses class Ticket and ArrayPriorityQueue
 * implementation of a help desk using a priority queue
 =====================================================*/

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class HelpDesk {

    private ArrayPriorityQueue<Ticket> _data;
    private int IDcount = 13;
    private boolean continuous = false;

    // constructor
    public HelpDesk() {
        _data = new ArrayPriorityQueue<Ticket>();
    }

    // checks if _data is empty
    public boolean isDataEmpty(){
	return _data.isEmpty();
    }

    // checks to see if help desk should continue or not
    public void continuous() {
	Scanner prelim = new Scanner(System.in);
	System.out.println("Welcome to the help desk. Do you need help? (y/n)");
	String ans = prelim.nextLine();
	if(ans.equals("y")){
	    continuous = true;
	}
    }

    // 
    public void helpSequence(){
	// Read from Scanner & System.in
        Scanner reader = new Scanner(System.in);

	// name input
        System.out.println("Welcome to the help desk. What is your name?");
	String newName = reader.nextLine();

	// cupholder problem or no
        System.out.println("Do you have a problem with your cupholder?(y/n)");
        String cupAns = reader.nextLine();
	
	int newPriority;
	String newDeskOp;
	
        if (cupAns.equals("y")) {
	    newPriority = 2;
	    newDeskOp = "brokenCupholder";
	    IDcount += 1;
        }
	
        else {
            System.out.println("The only other problem people have with computers are viruses and passwords.");
	    System.out.println("Do you have a problem with viruses?(y/n)");
	    String virusAns = reader.nextLine();

	    if (virusAns.equals("y")) {
		newPriority = 0;
		newDeskOp = "reinstallOS";
	    }

	    else {
		System.out.println("Then you must have a problem with resetting your password.");
		newPriority = 1;
		newDeskOp = "passReset";
	    }

	    // increment ID
	    IDcount += 1;
        }
	
        System.out.println("Please stand by.");
        System.out.println("------------");

	Ticket t = new Ticket(IDcount, newPriority, newName, newDeskOp);
	_data.add(t);
    }
    
    //respond method to help user after a dequeue
    public void respond(){
	
	Ticket t = (Ticket)_data.removeMin();
        System.out.println("Thank you for your patience " + t.getName());
	
        if (t.getDeskOp().equals("reinstallOS")) {
            System.out.println("You will need to reinstall your OS to get rid of viruses.");
        }
        else if (t.getDeskOp().equals("brokenCupholder")) {
            System.out.println("That isn't a cupholder. It is a CD drive.");
        }
	else if (t.getDeskOp().equals("passReset")) {
	    System.out.println("Please scan the page for a 'Forgot your Password?' link and follow the instructions.");
	}
        else {
            System.out.println("Error you have not made a request");
        }
	
        System.out.println("We hope that we were helpful.");
        System.out.println("------------");
    }
    
    public static void main(String[] args){
	
	HelpDesk foo = new HelpDesk();
	foo.continuous(); // 1
 	foo.helpSequence(); // cupholder

	foo.continuous(); // 2
	foo.helpSequence(); // virus

	foo.continuous(); // 3
	foo.helpSequence(); // passreset

        foo.continuous(); // 4
	foo.helpSequence(); // cupholder
 
        foo.continuous(); // 5
	foo.helpSequence(); // passreset
	
	foo.respond();
	foo.respond();
	foo.respond();
	foo.respond();
	foo.respond();
  
    }
}
