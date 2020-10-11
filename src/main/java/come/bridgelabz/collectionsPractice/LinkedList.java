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
	
	public void printLinkedList()
	{
		StringBuffer mynodes= new StringBuffer("My Nodes : ");
		INode<K> tempNode = this.head;
		while(tempNode.getNext()!=null)
		{
			mynodes.append(tempNode.getData());			
			tempNode=tempNode.getNext();
			mynodes.append("->");
		}
		mynodes.append(tempNode.getData());
		System.out.println(mynodes);
	}

}
