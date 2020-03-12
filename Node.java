package bag;

public class Node<T> {
	private T data;
	private Node<T> next;
	

	public Node(T data) {
			this.data = data;
		}
		
	
	public T getData() {
		return data;
	}
	
	public void setData(T dataportion) {
		data = dataportion;
	}
	
	public Node<T> getNextNode(){
		return next;
	}
	
	public void setNextNode(Node<T> nextNode) {
		next = nextNode;
	}
}
