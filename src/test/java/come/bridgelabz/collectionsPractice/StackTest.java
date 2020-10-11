package come.bridgelabz.collectionsPractice;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {
	
	@Test
	public void given3numbers_should_return_true() {
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		Stack<Integer> newStack = new Stack<>();
		newStack.push(firstNode);
		newStack.push(secondNode);
		newStack.push(thirdNode);
		newStack.printStack();
		INode<Integer> returned=newStack.peek();
		Assert.assertEquals(returned,thirdNode);

	}
}
