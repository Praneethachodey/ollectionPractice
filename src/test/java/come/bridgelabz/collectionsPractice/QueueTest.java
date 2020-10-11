package come.bridgelabz.collectionsPractice;

import org.junit.Assert;
import org.junit.Test;

public class QueueTest {
	@Test
	public void given3numbers_should_return_true() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		Queue<Integer> newQueue = new Queue<>();
		newQueue.enqueue(firstNode);
		newQueue.enqueue(secondNode);
		newQueue.enqueue(thirdNode);
		newQueue.printStack();
		INode<Integer> returned = newQueue.peek();
		Assert.assertEquals(returned, firstNode);

	}
	@Test
	public void given3numbers_should_pop_and_peek() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		Queue<Integer> newQueue = new Queue<>();
		newQueue.enqueue(firstNode);
		newQueue.enqueue(secondNode);
		newQueue.enqueue(thirdNode);
		newQueue.pop();
		newQueue.printStack();
		INode<Integer> returned = newQueue.peek();
		Assert.assertEquals(returned, secondNode);
	}
	

}
