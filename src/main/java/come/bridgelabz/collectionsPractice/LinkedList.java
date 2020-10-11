package come.bridgelabz.collectionsPractice;

public class LinkedList<K> {

	public INode<K> head;
	public INode<K> tail;

	public LinkedList() {
		super();
		this.head = null;
		this.tail = null;
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
	}

	public void insertAfter(INode<K> destNode, INode<K> newNode) {
		INode<K> traverseNode = this.head;
		while (traverseNode != null && traverseNode != destNode)
			traverseNode = traverseNode.getNext();

		newNode.setNext(traverseNode.getNext());
		traverseNode.setNext(newNode);

	}

	public void pop() {
		if(head==null) return;
		this.head = this.head.getNext();
	}

	public void popLast() {
		if(head==null) return;
		INode<K> tempNode = this.head;
		while (tempNode.getNext() != this.tail)
			tempNode = tempNode.getNext();
		this.tail = tempNode;
		this.tail.setNext(null);
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
