public interface PriorityQueue<Ticket> {
  void add (Ticket x);
  boolean isEmpty();
  Ticket peekMin();
  Ticket removeMin();
  String toString();
}
