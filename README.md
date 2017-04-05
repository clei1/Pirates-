# Team Pirates (but should have been Queuepids)
Donia Tung, Connie Lei, Dima Hvirtsman<br />
APCS2 Period 1 <br />

##### Please don't be lazy and look at our interface for the method listings.... :)
##### Great extra drowning in copypasta comments!
```void addFirst( T );``` <br />
```void addLast( T );``` <br />
```T removeFirst();``` <br />
```T removeLast();``` <br />
```int size();``` <br />
```boolean isEmpty();``` <br />
```T peekFirst();``` <br />
```T peekLast();``` <br />

## Method Selections
We wanted to have similar functionality as Queue had, so when we looked at the APIs, we choose the functions for Deque that equated to what Queue's functions. Just as Queue had peeks, we also wanted to have peeks in Deque because we might want to check what we are removing from the queue before we actually remove it. We decided not to use get() for this because we didn't want to throw an exception and preferred going with returning null. Then we added the corresponding remove functions for the front and end. We choose to have both isEmpty() and size() because it is easy to be able to use it. isEmpty() will only return true or false and if it returns false, you just know that the size is greater than 0. Since Deque is a "linear collection that supports element insertion and removal at both ends," we had the add and remove functions for both. Our reasoning for using add and remove instead of offer and poll is because most people are more used to the other. It is also nice to know that it didn't work because the other two wouldn't cause an error. If you were not printing the poll and offer, you would never know that it had returned null. You will always print peek and you don't want your code to break when it is running and null looks nicer.

## Choosing Doubly Linked Nodes
We literally choose nodes because Dima wanted us to. At first we thought it should have been an ArrayList because it is a lot easier to do, but we began with singly linked nodes. Instead of using doubly linked nodes, we choose to use singly linked nodes because it got complicated for all the other methods except removeLast. Our removeLast function had a linear runtime, when it could have been a constant runtime had we used ArrayList. However, if we used ArrayList, our addFront would have a linear runtime. We have implemented doubly linked nodes because then all of our functions would be constant. Instead of iterating through all the linked nodes, we can just use getPrev to get a removeLast.
