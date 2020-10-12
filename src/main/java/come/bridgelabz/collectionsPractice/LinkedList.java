package come.bridgelabz.collectionsPractice;

public class LinkedList<K extends Comparable<K>> {

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

	public void append(INode<K> newNode) {
		if (this.head == null)
			this.head = newNode;
		if (this.tail == null)
			this.tail = newNode;
		else {
			this.tail.setNext(newNode);
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
			if (tempNode.getKey().equals(value))
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
	
	public void deleteAt(INode<K> nodeToDelete) {
		if (this.head == null)
			return;
		INode<K> tempNode=head;
		INode<K> prevNode=head;
		while(tempNode!=null && tempNode!=nodeToDelete)
		{
			prevNode=tempNode;
			tempNode=tempNode.getNext();
		}
		prevNode.setNext(tail.getNext());
		if(tempNode==null) this.tail=prevNode;
		this.count--;
	}

	public void addSorted(INode<K> newNode) {
		if (this.head == null)
			this.head = newNode;
		if (this.tail == null)
			this.tail = newNode;
		else {
			INode<K> traverseNode = this.head;
			INode<K> prevNode = null;
			while (traverseNode != null && traverseNode.getKey().compareTo(newNode.getKey()) < 0) {
				prevNode = traverseNode;
				traverseNode = traverseNode.getNext();
			}
			if (prevNode == null) {
				newNode.setNext(this.head);
				this.head = newNode;
				return;
			}
			prevNode.setNext(newNode);
			newNode.setNext(traverseNode);
			if (traverseNode == null) {
				this.tail = newNode;
			}
		}
		this.count++;
	}

	public void printLinkedList() {
		StringBuffer mynodes = new StringBuffer("My Nodes : ");
		INode<K> tempNode = this.head;
		while (tempNode.getNext() != null) {
			mynodes.append(tempNode.getKey());
			tempNode = tempNode.getNext();
			mynodes.append("->");
		}
		mynodes.append(tempNode.getKey());
		System.out.println(mynodes);
	}

	public String toString() {
		return "MyLinkedListNodes are { " + head + "}";
	}

}
