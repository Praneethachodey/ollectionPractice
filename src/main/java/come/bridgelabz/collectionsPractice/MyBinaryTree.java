package come.bridgelabz.collectionsPractice;

public class MyBinaryTree<K extends Comparable<K>> {

	private MyBinaryNode<K> root;

	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}

	public MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
		if (current == null)
			return new MyBinaryNode<>(key);
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0)
			return current;
		if (compareResult < 0) {
			current.left = addRecursively(current.left, key);
		} else {
			current.right = addRecursively(current.right, key);
		}
		return current;
	}

	public int getSize() {
		return getSizeRecursively(root);
	}

	public int getSizeRecursively(MyBinaryNode<K> current) {
		return current == null ? 0 : 1 + this.getSizeRecursively(current.left) + this.getSizeRecursively(current.right);
	}
	
	public MyBinaryNode<K> search(K key)
	{
		return searchRecursively(root, key);
	}

	public MyBinaryNode<K> searchRecursively(MyBinaryNode<K> current, K key) {
		if (current == null)
			return null;
		if (key.compareTo(current.key) > 0)
			return this.searchRecursively(current.right, key);
		if (key.compareTo(current.key) < 0)
			return this.searchRecursively(current.left, key);
		return current;
	}

}
