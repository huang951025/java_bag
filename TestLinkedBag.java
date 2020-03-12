/**
Author: Wei Wen Huang
Date; 10/10/2019
Describe: wrting a bag interface and linked bag class, main calss teset LinkedBag test add, remove,isempty,isfull

*/


package bag;


public class TestLinkedBag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating an empty bag.");
		BagInterface aBag = new LinkedBag();
		displayBag(aBag);
		testIsFull(aBag, false);
		testIsEmpty(aBag, false);
		String[] contentsOfBag = {"A", "C", "A", "A", "C", "A", "B"};
		testAdd(aBag, contentsOfBag);
		displayBag(aBag);
		String[] bString = {"A"};
		testFrequency(aBag,bString);
		String[] dString = {"D"};
		testContains(aBag, dString);
		testRemove(aBag);
		displayBag(aBag);
		testClear(aBag);
		testIsFull(aBag, false);
		testIsEmpty(aBag, false);
		
		
	}//end main
	
	//test the method add
	private static void testAdd(BagInterface aBag, String[] content) {
	
	System.out.print("Adding to the bag: ");
	for(int index = 0; index < content.length; index++) {
			aBag.add(content[index]);
			System.out.print(content[index] + " ");
		}//end for loop
	System.out.println();
	displayBag(aBag);
	
}//end test add
	
	private static void testRemove(BagInterface aBag) {
		aBag.remove();	
		}// end test Remove
	private static void testClear(BagInterface aBag){
		aBag.clear();
		System.out.println("Bag is clear");
		displayBag(aBag);
	}
	@SuppressWarnings({ "unused", "rawtypes" })
	private static void testIsEmpty(BagInterface aBag, boolean correctResult){
		System.out.print("Testing isEmpty with ");
		if (correctResult) {
			System.out.println("an empty bag:");
		}else {
			System.out.println("a bag that is not empty:");}

		System.out.print("isEmpty finds the bag ");
		if (correctResult && aBag.isEmpty()) {
			System.out.println("empty: OK.");
		}
		else if (correctResult) {
			System.out.println("not empty, but it is empty: ERROR.");
		}else if (!correctResult && aBag.isEmpty()) {
			System.out.println("empty, but it is not empty: ERROR.");
		}else {
			System.out.println("not empty: OK.");   }   
		System.out.println();
	} // end testIsEmpty
	
	// Tests the method getFrequencyOf.
	@SuppressWarnings("unchecked")
	private static void testFrequency(BagInterface aBag, String[] tests)
	{
		System.out.println("\nTesting the method getFrequencyOf:");
		for (int index = 0; index < tests.length; index++)
			System.out.println("In this bag, the count of " + tests[index] + 
					" is " + aBag.getFrequencyOf(tests[index]));
	} // end testFrequency
	
	// Tests the method contains.
	private static void testContains(BagInterface aBag, String[] tests)
	{
		System.out.println("\nTesting the method contains:");
		for (int index = 0; index < tests.length; index++)
			System.out.println("Does this bag contain " + tests[index] + 
					"? " + aBag.contains(tests[index]));
	} // end testContains
	
	private static void displayBag(BagInterface aBag) {
		System.out.println("The bag contains "+ aBag.getCurrentSize() + " string(s), as follows:");
		Object[] bagArray = aBag.toArray();
		for (int index = 0; index < bagArray.length; index++)
		{
			System.out.print(bagArray[index] + " ");
		} // end for
		System.out.println();
	}//end display
	
	private static void testIsFull(BagInterface aBag, boolean Result) {
		System.out.println("Check is the bag full");
		if(aBag.isFull()) {
			System.out.println(" bag is full");
		}else {
			System.out.println(" bag is not full");
		}
	}
}