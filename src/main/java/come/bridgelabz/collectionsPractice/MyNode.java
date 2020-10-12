package come.bridgelabz.collectionsPractice;

public class MyNode<K> implements INode<K> {

	private K data;
	private INode<K> next;

	public MyNode(K data) {
		super();
		this.data = data;
	}

	@Override
	public void setKey(K data) {
		this.data = data;
	}

	@Override
	public K getKey() {
		return data;
	}

	@Override
	public void setNext(INode<K> Node) {
		this.next = Node;
	}

	@Override
	public INode<K> getNext() {
		return next;
	}

	
}