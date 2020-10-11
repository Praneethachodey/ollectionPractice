package come.bridgelabz.collectionsPractice;

public interface INode<K>{
	void setData(K data);

	K getData();

	void setNext(INode<K> Node);

	INode<K> getNext();

}
