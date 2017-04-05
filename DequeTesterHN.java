//Michael Ruvinshteyn [Horse's Neck]
//APCS2 pd 1
//HW 29 -- Stress is the Best
//2017 - 4 - 4

/*
  DequeDriver: tests methods implemented from interface Deque

  Methods tested:offer(),contains(),poll(),offerFirst(),pollLast()

  Instructions: M-shift-5 -> DLDeque -> <whatever you named your implementation of Deque>
*/

public class DequeTesterHN{

    public static void main(String[] args){

	//tests offer() and poll()
	DLLDeque<String> test = new DLLDeque<String>();
	System.out.println("Upon initialization: size = " + test.size());

	System.out.println("\nTesting addLast()...");
	//adding elements until capacity of 5
        test.addLast("one");
        test.addLast("two");
        test.addLast("three");
        test.addLast("four");
        test.addLast("five");

	System.out.println("\nTesting toString()...");
	System.out.println(test);
	System.out.println("size = " + test.size());

	// System.out.println("\nTesting contains()...");
	// System.out.println(test.contains("one"));
	// System.out.println(test.contains("two"));
	// System.out.println(test.contains("three"));
	// System.out.println(test.contains("four"));
	// System.out.println(test.contains("five"));
	// //"six" does not exist
	// System.out.println(test.contains("six" + "- 'six' was never inserted"));

	System.out.println("\nTesting removeFirst()...");
	//removes elements one by one
	System.out.println(test.removeFirst());
	System.out.println(test.removeFirst());
	System.out.println(test.removeFirst());
	System.out.println(test.removeFirst());
	System.out.println(test.removeFirst());
	//polling an empty Dequeue
	System.out.println(test.removeFirst() + "-list empty");

	System.out.println("\nEnd of test 1\n");

	//tests offerFirst() and pollLast()
	DLLDeque<String> test2 = new DLLDeque<String>();
	System.out.println("Upon initialization: size = " + test2.size());

	System.out.println("\nTesting addFirst()...");
        test2.addFirst("one");
        test2.addFirst("two");
        test2.addFirst("three");
        test2.addFirst("four");
        test2.addFirst("five");
	//should not work, as the Dequeue is to capacity

	System.out.println("\nTesting toString()...");
	System.out.println(test2);
	//elements are backwards, as they were added to the front (stacky?)
	System.out.println("size = " + test2.size());

	// System.out.println("\nTesting contains()...");
	// System.out.println(test2.contains("one"));
	// System.out.println(test2.contains("two"));
	// System.out.println(test2.contains("three"));
	// System.out.println(test2.contains("four"));
	// System.out.println(test2.contains("five"));
	// System.out.println(test2.contains("six") + "-never inserted 'six'");

	System.out.println("\nTesting removeLast()...");
	//"last" elements were actually the first to be inserted
	System.out.println(test2.removeLast());
	System.out.println(test2.removeLast());
	System.out.println(test2.removeLast());
	System.out.println(test2.removeLast());
	System.out.println(test2.removeLast());
	System.out.println(test2.removeLast() + "-list empty");

	// //tests removeFirstOccurrence() and removeLastOccurrence()
	// DLLDeque<String> test3 = new DLLDeque<String>(5);
	// System.out.println("Upon initialization: size = " + test3.size());

	// System.out.println("\nNow adding elements...");
	// //adds some elements (3 of them are repeating to test methods mentioned above)
	// test3.offer("hello");
	// test3.offer("howdy");
	// test3.offer("hi");
	// test3.offer("hello");
	// test3.offer("hello");

	// System.out.println("\nCurrent state of test3...");
	// System.out.println(test3);

	// System.out.println("\nNow testing removeFirstOccurrence()..."); 
	// System.out.println(test3.removeFirstOccurrence("hello")); //should remove first occurrence of "hello" (in this case at position 0)

	// System.out.println("\nCurrent state of test3...");
	// System.out.println(test3);

	// System.out.println("\nNow testing removeLastOccurrence()..."); 
	// System.out.println(test3.removeLastOccurrence("hello")); //should remove last occurrence of "hello" (in this case at position 3)

	// System.out.println("\nCurrent state of test3...");
	// System.out.println(test3);
    }

}
