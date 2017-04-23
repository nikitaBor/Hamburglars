/*=======
 * public interface PriorityQueue
 ========*/

public interface PriorityQueue<Ticket> {

    // adds an item to the priority queue
    void add (Ticket x);

    // returns true if the queue is empty, false otherwise
    boolean isEmpty();

    // returns the smallest item stored in the priority queue
    Ticket peekMin();

    // returns and removes the smallest item stored in the priority queue
    Ticket removeMin();

}
