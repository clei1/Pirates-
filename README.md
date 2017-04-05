# Team Pirates (but should have been Queuepids)
Donia Tung, Connie Lei, Dima <br />
APCS2 Period 1 <br />
2017-04-03 <br />

## Method Selections
We wanted to have similar functionality as Queue had, so when we looked at the APIs, we decided to choose the functions that Deque had that equated to what Queue had. Just Queue had peeks, we also wanted to have peeks in Deque because we might want to check what we are removing from the queue before we actually remove it. Then we added the corresponding remove functions for the front and end. Instead of having an isEmpty function, we decided to go with the size function in the API because it is easy to check if the size is 0, but sometimes you might want to see the actual size of the queue and isEmpty will only respond true or false. We also added the add functions that correspond with what we already had. We don't really understand why you would want to add at the front, but because we have removeFront and peekFront, we decided we should.

## Choosing Doubly Linked Nodes
We literally choose nodes because Dima wanted us to. At first we thought it should have been an ArrayList because it is a lot easier to do, but we began with singly linked nodes. Instead of using doubly linked nodes, we choose to use singly linked nodes because it got complicated for all the other methods except removeLast. Our removeLast function had a linear runtime, when it could have been a constant runtime had we used ArrayList. However, if we used ArrayList, our addFront would have a linear runtime. We have implemented doubly linked nodes because then all of our functions would be constant. Instead of iterating through all the linked nodes, we can just use getPrev to get a removeLast.
