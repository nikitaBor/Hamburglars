public class Ticket implements Comparable{
    private int priority;
    private String name;
    public Ticket(){
	Scanner sc = new Scanner(System.in);
	System.out.println("what is your name?");
	name = sc.readLine();
	System.out.println("Is your cup holder broken?(y/n)");
	String ans = sc.readLine();
	if(ans = "y"){
	    priority = 2;
	}
	else{
	    System.out.println("the only other possible problem with computers is viruses");
	    priority = 1;
	}
	System.out.println("Please stand by");
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
