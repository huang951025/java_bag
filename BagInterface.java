package bag;

public interface BagInterface<T> {
	public int getCurrentSize();
	public boolean isEmpty();
	public boolean isFull();
	public boolean add(T newEntry);
	public T remove();
	public boolean remove(T anEntry);
	public void clear();
	public int getFrequencyOf(T anEntry);
	public boolean contains(T anEntry);
	public T[] toArray();
}
