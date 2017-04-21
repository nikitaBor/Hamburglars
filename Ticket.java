public class Ticket implements Comparable{
    private int priority;
    public Ticket(){
	priority = 1;
    }
    public compareTo(Ticket other){
	if( this.priority < other.priority){
	    return -1;
	}
	else if(this.priority == other.priority){
	    return 0;
	}
	else{return 1;}
    }
}
