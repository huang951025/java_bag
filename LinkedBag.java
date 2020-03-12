package bag;

@SuppressWarnings("unchecked")
public class LinkedBag<T> implements BagInterface<T> {
	public Node<T> firstNode;//reference to first node
	public int numberOfEntries;
	public int capacity = 10;
	
	public LinkedBag(){
		firstNode = null;
		numberOfEntries = 0;
	}
	
	
	public LinkedBag(T dataportion) {
		this.firstNode = new Node<T>(dataportion);
	}
	
	
	public boolean add(T newEntry) {
		Node<T> newNode = new Node<T>(newEntry);
		newNode.setNextNode(firstNode);
		firstNode = newNode;
		numberOfEntries++;
		
		return true;
	}//end add
	
	public boolean isEmpty() {
		return firstNode == null;
	}
	
	public T[] toArray() {
		T[] result = (T[])new Object[numberOfEntries];
		Node<T> currentNode = firstNode;
		int index = 0;
		
		while((index < numberOfEntries)&&(currentNode != null)){
			
			result[index] = currentNode.getData();
			currentNode = currentNode.getNextNode();
			index++;
		}//end while loop
		
		return result;
		}//end to array
			
	public T remove() {
		
		T result = null;
		if(firstNode != null) {
			result = firstNode.getData();
			firstNode = firstNode.getNextNode();
			numberOfEntries--;
		}
		return result;
	}//end remove
	
	public boolean remove(T anEntry) {
		Node<T> currentNode = firstNode;
		Node<T> lastNode = null;
		if(this.contains(anEntry)) {
			while(currentNode.getData() != anEntry) {
				lastNode = currentNode;
				currentNode = currentNode.getNextNode();
			}
			if(lastNode != null) {
				lastNode.setNextNode(currentNode.getNextNode());
			}else {
				firstNode = currentNode.getNextNode();
				numberOfEntries--;
				return true;
			}
		}
		return false;
	}//end remove
	
	public boolean contains(T anEntry){
      boolean found = false;
      Node<T> currentNode = firstNode;
      
      while (!found && (currentNode != null))
      {
         if (anEntry.equals(currentNode.getData()))
            found = true;
         else
            currentNode = currentNode.getNextNode();
      } //end the while loop
      return found;
   } //end contains
	
	public void clear() {
		firstNode = null;
		numberOfEntries = 0;
	}//end clear
	
	public int getCurrentSize() {
		return numberOfEntries;
	}

	public int getFrequencyOf(T anEntry) {
	T[] array = this.toArray();
	int counter = 0;
	for (int i = 0; i < getCurrentSize(); i++) {
		if (array[i] == anEntry)
			counter++;
	}
	return counter;
}


	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return numberOfEntries >= capacity;
	}
	
	}
	

