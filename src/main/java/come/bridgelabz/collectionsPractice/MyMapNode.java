package come.bridgelabz.collectionsPractice;

public class MyMapNode<K, V> implements INode<K> {
	K key;
	V value;
	MyMapNode<K, V> next;

	public MyMapNode(K key, V value) {
		super();
		this.key = key;
		this.value = value;
		this.next = null;
	}

	@Override
	public K getKey() {
		return this.key;
	}

	@Override
	public void setNext(INode<K> Node) {
		this.next = (MyMapNode<K, V>) Node;
	}

	@Override
	public INode<K> getNext() {
		return next;
	}

	public V getValue() {
		return this.value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public void setKey(K key) {
		this.key = key;
	}

	@Override
	public String toString() {
		StringBuilder myMapNodeString = new StringBuilder();
		myMapNodeString.append("myMapNode{" + "K=").append(key).append(("V=")).append(value).append("}");
		if (next != null)
			myMapNodeString.append("->").append(next);
		return myMapNodeString.toString();
	}

}
