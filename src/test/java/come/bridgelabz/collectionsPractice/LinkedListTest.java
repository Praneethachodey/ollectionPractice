package come.bridgelabz.collectionsPractice;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

	@Test
	public void given3numbers_should_return_true() {
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		thirdNode.setNext(secondNode);
		secondNode.setNext(firstNode);
		boolean result = thirdNode.getNext().equals(secondNode) && secondNode.getNext().equals(firstNode);
		Assert.assertTrue(result);

	}
}
