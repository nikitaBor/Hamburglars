/*==================================
 * class Ticket
 * will be used for class HelpDesk
 ==================================*/

import java.util.Scanner;

public class Ticket implements Comparable<Ticket>{
    
    private int priority; // lower number is higher priority
    private String name; // user name
    private String deskOp; // 
    private int _ID; // ticket number for tracking purposes
    private boolean helped;

    // constructor
    public Ticket(int newID, int newPriority, String newName, String newDeskOp){
	
        //default initializations
        _ID = -1;
        name = "UNKNOWN USER";
        priority = -1;
        deskOp = "UNKNOWN DESKOP";
        helped = false;
	        
        _ID = newID;
	priority = newPriority;
	name = newName;
	deskOp = newDeskOp;
    }

    //compareTo method for enqueueing
    public int compareTo(Ticket other){
        if (this.priority < ((Ticket)other).priority) {
            return -1;
        }
        else if (this.priority == ((Ticket)other).priority) {
            return 0;
        }
        else {
	    return 1;
	}
    }
       
    // accessors + mutators
    
    public String getName(){
        return name;
    }
    
    public String setName(String newName){
	String oldName = name;
	name = newName;
	return oldName;
    }
    
    public String getDeskOp(){
        return deskOp;
    }

    public String setDeskOp(String newDeskOp){
	String oldDeskOp = deskOp;
	deskOp = newDeskOp;
	return oldDeskOp;
    }
    
    public boolean getHelped(){
        return helped;
    }
    
    public void setHelped(boolean b){
        helped = b;
    }

    public int setPriority(int newPriority){
	int oldPriority = priority;
	priority = newPriority;
	return oldPriority;
    }
    
    //main method for testing
    /* public static void main(String[] args){
       Ticket bob = new Ticket();//answer y
       Ticket bill = new Ticket();//answer n
       Ticket jill = new Ticket();//answer n
       System.out.println(bob.compareTo(bill)); //returns -1
       System.out.println(bill.compareTo(bob));//returns 1
       System.out.println(bill.compareTo(jill));//returns 0
       } */

    public static void main(String[] args){
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
