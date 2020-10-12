package come.bridgelabz.collectionsPractice;

public class HashMap<K extends Comparable<K>, V> {

	LinkedList<K> newList;

	public HashMap() {
		this.newList = new LinkedList<>();
	}

	public V get(K key) {
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.newList.search(key);
		return (myMapNode == null ? null : myMapNode.getValue());
	}

	public void add(K key, V value) {
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.newList.search(key);
		if (myMapNode == null) {
			myMapNode = new MyMapNode<K, V>(key, value);
			this.newList.append(myMapNode);
		} else {
			myMapNode.setValue(value);
		}
	}

	@Override
	public String toString() {
		return "MyHashMapNodes{" + newList + "}";
	}
}
