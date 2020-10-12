package come.bridgelabz.collectionsPractice;

public interface INode<K>{
	void setKey(K key);

	K getKey();

	void setNext(INode<K> Node);

	INode<K> getNext();

}
