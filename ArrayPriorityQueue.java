/*=======
 * class ArrayPriorityQueue
 * implements a priority queue 
 * elements are added in priority
 * uses an ArrayList
 * last element is removed (the end)
 =======*/

import java.util.ArrayList;

public class ArrayPriorityQueue<Ticket extends Comparable> implements PriorityQueue<Ticket>{

    ArrayList<Ticket> _data;

    public ArrayPriorityQueue() {
        _data = new ArrayList<Ticket>();
    }
     
    //adds an item to this priority queue, based on the priority
    //uses binary search
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
    } // O(logn)

     
    //returns true if this stack is empty, otherwise returns false
    public boolean isEmpty() {
        return _data.size() == 0;
    } //O(1)
     
    //returns the smallest item stored in the array
    public Ticket peekMin() {
	if (isEmpty()) {
	    throw new RuntimeException();
	}
	else {
	    return _data.get(_data.size() - 1);
	}
    } //O(1)

    // removes and returns smallest item stored in the array
    public Ticket removeMin() {
	if (isEmpty()) {
	    throw new RuntimeException();
	}
	else {
	    Ticket temp = peekMin();
	    _data.remove(temp);
	    return temp;
	}
    } //O(1)

    public String toString() {
	String retStr = "";
	for (Ticket x : _data) {
	    retStr += x + ",";
	}
	return retStr;
    } //O(n)

}


