/*****************************************************
 * interface Deque -- subset of actual Java List interface
 * Specifies actions a Deque must be able to perform.
 * If present in local dir, will take precedence over Java's 
 * built-in Deque interface.
 *****************************************************/

public interface Deque<T>{

    // Inserts the specified element at the front of this deque
    // Throws ClassCastException - if the class of the specified element prevents it from being added to this deque
    //        NullPointerException - if the specified element is null and this deque does not permit null elements
    //        IllegalArgumentException - if some property of the specified element prevents it from being added to this deque
    public void addFirst(T cargo);
    
    // Inserts the specified element at the end of this deque
    // Throws ClassCastException - if the class of the specified element prevents it from being added to this deque
    //        NullPointerException - if the specified element is null and this deque does not permit null elements
    //        IllegalArgumentException - if some property of the specified element prevents it from being added to this deque	
    public void addLast(T cargo);
  
    // Retrieves and removes the first element of this deque. This method differs from pollFirst only in that it throws an exception if this deque is empty.
    // Returns the head of this deque
    // Throws NoSuchElementException - if this deque is empty
    public T removeFirst();
    
    // Retrieves and removes the last element of this deque. This method differs from pollLast only in that it throws an exception if this deque is empty.
    // Returns the tail of this deque
    // Throws NoSuchElementException - if this deque is empty
    public T removeLast();
    
    // Returns the instance variable _size
    public int size();
    
    // Returns if _size is 0
    public boolean isEmpty();
  
    // Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.
    // Returns the head of this deque, or null if this deque is empty
    public T peekFirst();
    
    // Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty.
    // Returns the tail of this deque, or null if this deque is empty
    public T peekLast();

    /**
    public T getFirst();
    public T getLast();
    **/
  
}
  
  
  
