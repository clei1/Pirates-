public class DLLDeque<T> implements Deque<T>{
    
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
    public T peekFirst() {
	return first.getCargo();
    }

    //Returns (does not remove) the last element of the Deque
    public T peekLast() {
	return last.getCargo();
    }

    //Returns a boolean, checks if the Deque is empty
    public boolean isEmpty() {
	return size == 0;
    }

    
    /* public static void main(String[] args) {
	DLLDeque fred = new DLLDeque();
	System.out.println(fred.isEmpty());
	System.out.println(fred.size());
	fred.addFirst(1);
	fred.addFirst(2);
	fred.addLast(60);
	System.out.println(fred.isEmpty());
	System.out.println(fred.size());
	System.out.println(fred.peekFirst());
	System.out.println(fred.peekLast());
	fred.removeFirst();
	System.out.println(fred.isEmpty());
	System.out.println(fred.size());
    }*/
}

    
	
