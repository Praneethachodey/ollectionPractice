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

	@Test
	public void given3numbers_should_add_from_head() {
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		LinkedList<Integer> newList = new LinkedList<>();
		newList.add(firstNode);
		newList.add(secondNode);
		newList.add(thirdNode);
		newList.printLinkedList();
		boolean result = newList.head.equals(thirdNode) && newList.tail.equals(firstNode)
				&& newList.head.getNext().equals(secondNode);
		Assert.assertTrue(result);

	}
	
	@Test
	public void given3numbers_should_add_from_tail() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		LinkedList<Integer> newList = new LinkedList<>();
		newList.addAtTail(firstNode);
		newList.addAtTail(secondNode);
		newList.addAtTail(thirdNode);
		newList.printLinkedList();
		boolean result = newList.tail.equals(thirdNode) && newList.head.equals(firstNode)
				&& newList.head.getNext().equals(secondNode);
		Assert.assertTrue(result);

	}
	
	@Test
	public void given3numbers_should_insert_between_two_nodes() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		LinkedList<Integer> newList = new LinkedList<>();
		newList.addAtTail(firstNode);
		newList.addAtTail(thirdNode);
		newList.insertAfter(firstNode, secondNode);
		newList.printLinkedList();
		boolean result = newList.tail.equals(thirdNode) && newList.head.equals(firstNode)
				&& newList.head.getNext().equals(secondNode);
		Assert.assertTrue(result);

	}
}
