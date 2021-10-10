package MaxHeap;

public class MaxHeapTester {

	public static void main(String[] args) {
	MaxHeap theHeap = new MaxHeapImpl(15);
	runTests(theHeap);
	}

	public static void runTests(MaxHeap theHeap) {
		
		theHeap.insert(23);
		theHeap.insert(14);
		theHeap.insert(7);
		theHeap.insert(38);
		theHeap.insert(202);
		theHeap.insert(230);
		theHeap.insert(139);
		theHeap.insert(72);
		theHeap.insert(33);
		theHeap.insert(875);
		
  	
		theHeap.display();
		
		System.out.println(theHeap.extractMax());
		
		theHeap.display();
		
	}
}
