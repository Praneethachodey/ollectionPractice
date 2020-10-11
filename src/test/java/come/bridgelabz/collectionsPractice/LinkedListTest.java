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

	@Test
	public void given3numbers_should_delete_head() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		LinkedList<Integer> newList = new LinkedList<>();
		newList.addAtTail(firstNode);
		newList.addAtTail(secondNode);
		newList.addAtTail(thirdNode);
		newList.pop();
		newList.printLinkedList();
		boolean result = newList.head.equals(secondNode) && newList.tail.equals(thirdNode);
		Assert.assertTrue(result);

	}

	@Test
	public void given3numbers_should_delete_tail() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		LinkedList<Integer> newList = new LinkedList<>();
		newList.addAtTail(firstNode);
		newList.addAtTail(secondNode);
		newList.addAtTail(thirdNode);
		newList.popLast();
		newList.printLinkedList();
		boolean result = newList.head.equals(firstNode) && newList.tail.equals(secondNode);
		Assert.assertTrue(result);

	}

	@Test
	public void given3numbers_should_search_value() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		LinkedList<Integer> newList = new LinkedList<>();
		newList.addAtTail(firstNode);
		newList.addAtTail(secondNode);
		newList.addAtTail(thirdNode);
		INode<Integer> searched = newList.search(30);
		boolean result = searched.getData().equals(30);
		Assert.assertTrue(result);

	}

	@Test
	public void given3numbers_should_insert_after_searching() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		MyNode<Integer> newNode = new MyNode<Integer>(40);
		LinkedList<Integer> newList = new LinkedList<>();
		newList.addAtTail(firstNode);
		newList.addAtTail(secondNode);
		newList.addAtTail(thirdNode);
		INode<Integer> searched = newList.search(30);
		newList.insertAfter(searched, newNode);
		newList.printLinkedList();
		boolean result = newList.search(30).getNext().equals(newNode);
		Assert.assertTrue(result);

	}
	
	@Test
	public void given3numbers_should_delete_after_searching() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		MyNode<Integer> fourthNode = new MyNode<Integer>(40);
		LinkedList<Integer> newList = new LinkedList<>();
		newList.addAtTail(firstNode);
		newList.addAtTail(secondNode);
		newList.addAtTail(fourthNode);
		newList.addAtTail(thirdNode);
		INode<Integer> searched = newList.search(30);
		newList.delete(searched);
		newList.printLinkedList();
		System.out.println("new size after deletion " +newList.size());
		boolean result = newList.search(30).getNext().equals(fourthNode);
		Assert.assertTrue(!result);

	}
	
	@Test
	public void given3numbers_should_add_sorted() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		MyNode<Integer> fourthNode = new MyNode<Integer>(40);
		LinkedList<Integer> newList = new LinkedList<>();
		newList.addSorted(firstNode);
		newList.addSorted(secondNode);
		newList.addSorted(fourthNode);
		newList.addSorted(thirdNode);
		newList.printLinkedList();
		boolean result = newList.head.equals(firstNode) && newList.tail.equals(thirdNode);
		Assert.assertTrue(!result);

	}
}
