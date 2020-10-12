package come.bridgelabz.collectionsPractice;

import java.util.ArrayList;

public class MyLinkedHashMap<K extends Comparable<K>, V> {
	private final int numBuckets;
	ArrayList<LinkedList<K>> myBuckedArray;

	public MyLinkedHashMap() {
		super();
		this.numBuckets = 10;
		this.myBuckedArray = new ArrayList<>(numBuckets);

		for (int i = 0; i < numBuckets; i++) {
			this.myBuckedArray.add(null);
		}
	}

	public V get(K key) {
		int index = this.getBucketIndex(key);
		LinkedList<K> myLinkedList = this.myBuckedArray.get(index);
		if (myLinkedList == null)
			return null;
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.search(key);
		return (myMapNode == null? null : myMapNode.getValue());
	}

	private int getBucketIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode % numBuckets;
		System.out.println("Key: " + key + " hashcode :" + hashCode + " index : " + index);
		return index;
	}

	public void add(K key, V value) {
		int index = this.getBucketIndex(key);
		LinkedList<K> myLinkedList = this.myBuckedArray.get(index);
		if (myLinkedList == null) {
			myLinkedList = new LinkedList<>();
			this.myBuckedArray.set(index, myLinkedList);
		}
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.search(key);
		if (myMapNode == null) {
			myMapNode = new MyMapNode<K, V>(key, value);
			myLinkedList.append(myMapNode);
		} else {
			myMapNode.setValue(value);
		}

	}
	
	public void remove(K key) {
		int index = this.getBucketIndex(key);
		LinkedList<K> myLinkedList = this.myBuckedArray.get(index);
		if (myLinkedList == null) {
			return;
		}
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.search(key);
		if (myMapNode == null) {
			return;
		} else {
			myLinkedList.deleteAt(myMapNode);
		}

	}


	@Override
	public String toString() {
		return "MyLinkedHashMap List { " + myBuckedArray + "}";
	}

}
