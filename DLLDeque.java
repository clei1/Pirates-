/*======================================
  class DLLDeque
  Implements a deque with doubly linked nodes
  A queue is designed to have elements inserted at the end of the queue, and elements removed from the beginning of the queue. 
  A Dequeue is deisigned to allow insertion and removal of elements from both ends of the queue
  This implementation of Deque does not have capacity restrictions so it does not have certain functions
  ======================================*/

public class DLLDeque<T> implements Deque<T>{
<<<<<<< HEAD

    // customized interface Deque.java must be in same dir	

    // instance variables
    public DLLNode<T> _first, _last; //pointers to first, last DLLNodes, may only be of type T
    public int _size;

  
    // constructor -- initializes instance vars
    public DLLDeque() {
	// created two objects for first and last because it allows us to call addFirst(T) and addLast(T) without any errors if the deque has a size of 0
	// if first had equaled null, it would cause an error because null does not have methods, therefore you would need an added ifelse statement in the add methods
	_first = new DLLNode<T>(null, null, null);
	_last = new DLLNode<T>(null, null, null);
	// even though first and last both are instances of DLLNode, they are not important and unlinked (there is no need to link them because they are just placeholders)
	// it does not matter if they were linked and since it takes two extra steps to link them, they aren't
	/***
	    // Code for linking the two heads at the beginning:
	    

	    _first = new DLLNode<T>(null, null, new DLLNode<T>(null, null, null));
	    _last = _first.getNext();
	    _last.setPrev(_first);

	    // OR

	    _first = new DLLNode<T>(null, null, null);
	    _last = new DLLNode<T>(null, null, null);
	    _first.setNext(_last);
	    _last.setPrev(_first);
	***/
	// size is set to zero because no values of importance have been set
	_size = 0;
    }   


    //--------------v  Deque interface methods  v--------------

    // Inserts the specified element at the front of this deque
    // Throws ClassCastException - if the class of the specified element prevents it from being added to this deque
    //        NullPointerException - if the specified element is null and this deque does not permit null elements
    //        IllegalArgumentException - if some property of the specified element prevents it from being added to this deque
    public void addFirst(T cargo){
	if(cargo.equals(null)) //checks to make sure null is not being added
	    throw new NullPointerException();
	_first.setPrev(new DLLNode(cargo, null, _first)); //creates a link to the new node with cargo, adding it before the first node
	_first = _first.getPrev(); //updates first to reset it at the head of the linked nodes
	_size++; //updates size because one added element
    }
    
    // Inserts the specified element at the end of this deque
    // Throws ClassCastException - if the class of the specified element prevents it from being added to this deque
    //        NullPointerException - if the specified element is null and this deque does not permit null elements
    //        IllegalArgumentException - if some property of the specified element prevents it from being added to this deque	
    public void addLast (T cargo) {
	if(cargo.equals(null)) //checks to make sure null is not being added
	    throw new NullPointerException(); 
	_last.setNext(new DLLNode(cargo, _last, null)); //creates a link to the new node with cargo, adding it after the last node
	_last = _last.getNext(); //updates last to reset it at the end of the linked nodes
	_size++; //updates size because one added element
    }

    // Retrieves and removes the first element of this deque. This method differs from pollFirst only in that it throws an exception if this deque is empty.
    // Returns the head of this deque
    // Throws NoSuchElementException - if this deque is empty
    public T removeFirst() {
	_size--; //update the size counter because one node is being removed
	_first = _first.getNext(); //first becomes the one after the one being removed	
	return _first.setPrev(null).getCargo(); //remove the link between the node being removed and first, setPrev(T) returns the removed node, so you can automatically call an accessor
    }
    
    // Retrieves and removes the last element of this deque. This method differs from pollLast only in that it throws an exception if this deque is empty.
    // Returns the tail of this deque
    // Throws NoSuchElementException - if this deque is empty
    public T removeLast(){
	_size--; //update the size counter because one node is being removed
	_last = _last.getPrev(); //last becomes the one before the one being removed
	return _last.setNext(null).getCargo(); //remove the link between the node being removed and last, setNext(T) returns the removed node, so you can automatically call an acccessor
    }
    
    //--------------v  ACCESSORS  v--------------
    public int size() { return _size; }

    // Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.
    // Returns the head of this deque, or null if this deque is empty
=======
    
    //add removeLast(), if the thing exists and where it exists, other stuffs	
	
    public DLLNode<T> first, last; //Nodes for the first and last element
    public int size; // keep track of size


    //Constructor 
    public DLLDeque() {
	first = null;
	last = null;
	size = 0;
    }
    
    //Method to add to the front of the Deque
    public void addFirst(T node){
	first = new DLLNode(node, first);    
	size++;
    }

    //Method to add the the end of the Deque
    public void addLast (T node) {
	DLLNode nnode = new DLLNode(node, null);
	last.setNext(nnode);
	last = nnode;
	size++;
    }

    //Removes the first element of the Deque
    public void removeFirst() {
	first = first.getNext();
	size--;
    }

    //Returns the size of the Deque
    public int size() {
	return size;
    }

    //Returns (does not remove) the first element of the Deque
>>>>>>> 4aaeb8538158e0a40eb8e840f70a9c6552ce8e01
    public T peekFirst() {
	if(isEmpty()) //checks to make sure the deque is not empty by calling isEmpty() and utilizing size
	    return null; //fulfills the requirements stated in the API by returning null, a special value, instead of throwing an exception
	return _first.getCargo(); //if there is at least one element, continue on and return the last's cargo
    }

<<<<<<< HEAD
    // Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty.
    // Returns the tail of this deque, or null if this deque is empty
=======
    //Returns (does not remove) the last element of the Deque
>>>>>>> 4aaeb8538158e0a40eb8e840f70a9c6552ce8e01
    public T peekLast() {
	if(isEmpty()) //checks to make sure the deque is not empty by calling isEmpty() and utilizing size
	    return null; //fulfills the requirements stated in the API by returning null, a special value, instead of throwing an exception
	return _last.getCargo(); //if there is at least one element, continue on and return the last's cargo
    }

<<<<<<< HEAD
    /**
    // Retrieves, but does not remove, the first element of this deque. This method differs from peekFirst only in that it throws an exception if this deque is empty.
    // Returns the head of this deque
    // Throws NoSuchElementException - if this deque is empty
    public T getFirst(){
	if(isEmpty()) //checks to make sure the deque is not empty by calling isEmpty() and utilizing size
	    throw new NoSuchElementException();//fulfills the requirements stated in the API, the corresponding exception
	return _first.getCargo(); //if there is at least one element, continue on and return the first's cargo
    }

    // Retrieves, but does not remove, the last element of this deque. This method differs from peekLast only in that it throws an exception if this deque is empty.
    // Returns the tail of this deque
    // Throws NoSuchElementException - if this deque is empty
    public T getLast(){
	if(isEmpty()) //checks to make sure the deque is not empty by calling isEmpty() and utilizing size
	    throw new NoSuchElementException();//fulfills the requirements stated in the API, the corresponding exception
	return _last.getCargo();  //if there is at least one element, continue on and return the last's cargo
    }
    **/
    //--------------^  ACCESSORS  ^--------------

=======
    //Returns a boolean, checks if the Deque is empty
>>>>>>> 4aaeb8538158e0a40eb8e840f70a9c6552ce8e01
    public boolean isEmpty() {
	return _size == 0;
    }

    
<<<<<<< HEAD
    //--------------^  Deque interface methods  ^--------------

    // override inherited toString
    public String toString() { 
	String retStr = "HEAD->";
	DLLNode tmp = _first; //init tr
	while( tmp != null ) {
	    retStr += tmp.getCargo() + "->";
	    tmp = tmp.getNext();
	}
	retStr += "NULL";
	return retStr;
    }

    // main method for testing
    public static void main(String[] args) {
	
	/*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y) 
	//instantiates a new instance of object DLLDeque
=======
    /* public static void main(String[] args) {
>>>>>>> 4aaeb8538158e0a40eb8e840f70a9c6552ce8e01
	DLLDeque fred = new DLLDeque();

	//checks for inital emptiness
	System.out.println(fred.isEmpty());
	//checks for inital size
	System.out.println(fred.size());

	fred.addFirst(1);
	fred.addFirst(2);
	fred.addLast(60);

	//checks for emptiness status when the DLLDeque holds at least one important node
	System.out.println(fred.isEmpty());
	//checks for updated size after THREE additions
	System.out.println(fred.size());
	
	System.out.println(fred.peekFirst());
	System.out.println(fred.peekLast());
	fred.removeFirst();

	//checks for emptiness status after removing a node
	System.out.println(fred.isEmpty());
	//checks for updated size after THREE additions and ONE subtraction
	System.out.println(fred.size());
<<<<<<< HEAD
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
	
    }// end main
    
}// end class DLLDeque
=======
    }*/
}
>>>>>>> 4aaeb8538158e0a40eb8e840f70a9c6552ce8e01

    
	
