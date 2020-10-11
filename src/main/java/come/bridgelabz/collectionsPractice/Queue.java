package come.bridgelabz.collectionsPractice;

public class Queue<K extends Comparable<K>> {
	public int count;
	public LinkedList<K> newList;
	
	public Queue() {
		super();
		newList = new LinkedList<>();
		count=0;
	}
	
	public void enqueue(INode<K> newNode) {
		this.count++;
		newList.addAtTail(newNode);
	}

	public void printStack() {
		newList.printLinkedList();
	}

	public INode<K> peek() {
		return newList.head;
	}

	public void pop() {
		newList.pop();
	}

	public int size() {
		return count;
	}

	public boolean isEmpty() {
		if (count == 0)
			return true;
		return false;
	}

}

	
	


