
import java.util.ArrayList;
public class ArrayPriorityQueue<Ticket extends Comparable> implements PriorityQueue{

    ArrayList<Ticket> _data;

    public ArrayPriorityQueue() {
        _data = new ArrayList<Ticket>();
    }
     
    //adds an item to this priority queue
    public void add (Ticket x) {
        int lo = 0;
        int mid = 0;
        int hi = _data.size()-1;
        while (lo <= hi) { //running until target is found or bounds cross
	    mid = (lo + hi) / 2;
	    int c = _data.get(mid).compareTo(x);
	    if (c == 0) {//mid value and x are EQUAL
		//time to traverse backwards until you reach either the front or the next level of priority
		while (mid > -1 && _data.get(mid).compareTo(x) == 0) {	    
		    mid--;
		}
		_data.add(mid+1, x);
		return;
	    }
	    else if (c > 0) { //mid value is GREATER THAN x
		//look at upper half of data
		lo = mid + 1;
	    }
	    else { //mid value is LESS THAN x
		//look at lower half of data
		hi = mid - 1;
	    }
        }
        // x IS NOT PRESENT; insert x at lo.
        _data.add(lo, x);
    }

     
    //returns true if this stack is empty, otherwise returns false
    public boolean isEmpty() {
        return _data.size() == 0;
    }
     
    //returns the smallest item stored in the array
    public Ticket peekMin() {
        return _data.get(_data.size() - 1);
    }
     
    public Ticket removeMin() {
        Ticket temp = peekMin();
        _data.remove(temp);
        return temp;
    }

    public String toString() {
	String retStr = "";
	for (Ticket x : _data) {
	    retStr += x + ",";
	}
	return retStr;
    }

}


