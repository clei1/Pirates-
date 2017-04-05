/*****************************************************
 * interface Deque -- subset of actual Java List interface
 * Specifies actions a Deque must be able to perform.
 * If present in local dir, will take precedence over Java's 
 * built-in Deque interface.
 *****************************************************/

public interface Deque<T>{

    public void addFirst(T cargo);
    public void addLast(T cargo);
  
    public T removeFirst();
    public T removeLast();
    
    public int size();
    public boolean isEmpty();
  
    public T peekFirst();
    public T peekLast();

    /**
    public T getFirst();
    public T getLast();
    **/
  
}
  
  
  
