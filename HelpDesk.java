/*===
 * class HelpDesk
 * uses class Ticket and ArrayPriorityQueue
 * implementation of a help desk using a priority queue
  ==*/

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class HelpDesk {

    private ArrayPriorityQueue<Ticket> _data;
    private int IDtracker = 0;

    public HelpDesk() {
        _data = new ArrayPriorityQueue<Ticket>();
    }

    public boolean dataEmpty(){
	return _data.isEmpty();
    }
    
    public void createTicket(){
	Ticket jeff = new Ticket(setIDtracker());	
	_data.add(jeff);
    }

    public void helpSequence(){
	Ticket t = (Ticket)_data.removeMin();

        Scanner reader = new Scanner(System.in);  // Reading from System.in     
        System.out.println("Welcome to the help desk. What is your name?");
        t.setName(reader.nextLine());
        System.out.println("Do you have a problem with your cupholder?(y/n)");
        String ans = reader.nextLine();
        if(ans.equals("y")){
            t.setPriority(2);
            t.setDeskOp("brokenCupholder");
        }
        else{
            System.out.println("The only other problem people have with computers are viruses.");
	    t.setPriority(1);
            t.setDeskOp("reinstallOS");
        }
        System.out.println("Please stand by.");
        System.out.println("------------");
    }
    
    //respond method to help user after a dequeue
    public void respond(Ticket t){
        System.out.println("Thank you for your patience " + t.getName());
        if(t.getDeskOp().equals("reinstallOS")){
            System.out.println("You will need to reinstall your OS to get rid of viruses.");
        }
        else if(t.getDeskOp().equals("brokenCupholder")){
            System.out.println("That isn't a cupholder. It is a cd drive.");
        }
        else{
            System.out.println("Error you have not made a request");
        }
        System.out.println("We hope that we were helpful.");
        System.out.println("------------");
    }
    
    public int setIDtracker() {
        IDtracker += 1; 
	return IDtracker;
    }
    
    public static void main(String[] args){
	HelpDesk hello = new HelpDesk();
	//	Ticket jeff = new Ticket(IDtracker);
	hello.createTicket();
	hello.createTicket();
	hello.createTicket();
	hello.createTicket();
	hello.createTicket();
	while(!(hello.dataEmpty())){
	    hello.helpSequence();
	    //hello.respond();
	    hello.IDtracker();
	}
	/*
	Ticket john = new Ticket(47);
        Scanner reader = new Scanner(System.in);  // Reading from System.in     
        System.out.println("Welcome to the help desk. What is your name?");
        john.name = reader.nextLine();
        System.out.println("Do you have a problem with your cupholder?(y/n)");
        String ans = reader.nextLine();
        if(ans.equals("y")){
            john.priority = 2;
            john.deskOp = "brokenCupholder";
        }
        else{
            System.out.println("The only other problem people have with computers are viruses.");
	    john.priority = 1;
            john.deskOp = "reinstallOS";
        }
        System.out.println("Please stand by.");
        System.out.println("------------");
	*/
    }
}
