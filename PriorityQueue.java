public interface PriorityQueue {
  void add (Ticket x);
  boolean isEmpty();
  Ticket peekMin();
  Ticket removeMin();
  String toString();
}
