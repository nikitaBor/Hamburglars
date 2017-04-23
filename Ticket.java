public class Ticket implements Comparable{
    private int priority;
    private String name;
    public Ticket(){
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("what is your name?");
        username = reader.readLine();
        System.out.println("do you have a problem with your cupholder(y/n)");
        String ans = reader.readLine();
        if(ans.equals("y")){
            priority = 2; 
            deskOp = "broken cupholder";
        }
        else{
            System.out.println("the only other problem people have with computers are viruses.");
            priority = 1;
            deskOp = "viruses";
        }
        System.out.println("pls stand by");
    }

	
    public int compareTo(Ticket other){
	if( this.priority < other.priority){
	    return -1;
	}
	else if(this.priority == other.priority){
	    return 0;
	}
	else{return 1;}
    }
}