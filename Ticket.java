import java.util.Scanner;

public class Ticket implements Comparable{
    private int priority;
    private String name;
    private String deskOp;
    public Ticket(){
        //default initializations
        name = "UNKNOWN USER";
        priority = -1;
        deskOp = "UNKNOWN DESKOP";
        
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Welcome to the help desk. What is your name?");
        name = reader.nextLine();
        System.out.println("Do you have a problem with your cupholder?(y/n)");
        String ans = reader.nextLine();
        if(ans.equals("y")){
            priority = 2; 
            deskOp = "brokenCupholder";
        }
        else{
            System.out.println("The only other problem people have with computers are viruses.");
            priority = 1;
            deskOp = "reinstallOS";
        }
        System.out.println("Please stand by.");
        System.out.println("------------");
    }

	//compareTo method for enqueueing
    public int compareTo(Object other){
        if( this.priority < ((Ticket)other).priority){
            return -1;
        }
        else if(this.priority == ((Ticket)other).priority){
            return 0;
        }
        else{return 1;}
    }
    
    //respond method to help user after a dequeue
    public void respond(){
        System.out.println("Thank you for your patience " + name);
        if(priority == -1){
            System.out.println("Error you have not made a request");
        }
        else if(priority == 1){
            System.out.println("You will need to reinstall your OS to get rid of viruses.");
        }
        else if(priority == 2){
            System.out.println("That isn't a cupholder. It is a cd drive.");
        }
        System.out.println("We hope that we were helpful.");
        System.out.println("------------");
    }
    
    //main method for testing
    /* public static void main(String[] args){
        Ticket bob = new Ticket();//answer y
        Ticket bill = new Ticket();//answer n
        Ticket jill = new Ticket();//answer n
        System.out.println(bob.compareTo(bill)); //returns -1
        System.out.println(bill.compareTo(bob));//returns 1
        System.out.println(bill.compareTo(jill));//returns 0
        bob.respond();
        bill.respond();
    } */
}