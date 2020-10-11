package come.bridgelabz.collectionsPractice;

public class LinkedList<K> {

	public INode<K> head;
	public INode<K> tail;
	public int count;

	public LinkedList() {
		super();
		this.head = null;
		this.tail = null;
		this.count = 0;
	}

	public void add(INode<K> newNode) {
		if (this.tail == null)
			this.tail = newNode;
		if (this.head == null)
			this.head = newNode;
		else {
			INode<K> tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
		this.count++;
	}

	public void addAtTail(INode<K> newNode) {
		if (this.head == null)
			this.head = newNode;
		if (this.tail == null)
			this.tail = newNode;
		else {
			INode<K> tempNode = this.tail;
			tempNode.setNext(newNode);
			this.tail = newNode;
		}
		this.count++;
	}

	public void insertAfter(INode<K> destNode, INode<K> newNode) {
		INode<K> traverseNode = this.head;
		while (traverseNode != null && traverseNode != destNode)
			traverseNode = traverseNode.getNext();

		newNode.setNext(traverseNode.getNext());
		traverseNode.setNext(newNode);
		this.count++;

	}

	public void pop() {
		if (head == null)
			return;
		this.head = this.head.getNext();
		this.count--;
	}

	public void popLast() {
		if (head == null)
			return;
		INode<K> tempNode = this.head;
		while (tempNode.getNext() != this.tail)
			tempNode = tempNode.getNext();
		this.tail = tempNode;
		this.tail.setNext(null);
		this.count--;
	}

	public INode<K> search(K value) {
		if (head == null)
			return null;
		INode<K> tempNode = this.head;
		while (tempNode != null) {
			if (tempNode.getData() == value)
				return tempNode;
			tempNode = tempNode.getNext();
		}
		return null;
	}

	public int size() {
		return this.count;
	}

	public void delete(INode<K> nodeToDelete) {
		if (this.head == null)
			return;
		nodeToDelete.setNext(nodeToDelete.getNext().getNext());
		this.count--;
	}

	public void printLinkedList() {
		StringBuffer mynodes = new StringBuffer("My Nodes : ");
		INode<K> tempNode = this.head;
		while (tempNode.getNext() != null) {
			mynodes.append(tempNode.getData());
			tempNode = tempNode.getNext();
			mynodes.append("->");
		}
		mynodes.append(tempNode.getData());
		System.out.println(mynodes);
	}

}
