package come.bridgelabz.collectionsPractice;

public class Stack<K extends Comparable<K>> {
	public int count = 0;
	public LinkedList<K> newList;

	public Stack() {
		super();
		count = 0;
		newList = new LinkedList<>();
	}

	public void push(INode<K> newNode) {
		this.count++;
		newList.add(newNode);
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
