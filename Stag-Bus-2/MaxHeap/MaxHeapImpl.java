package MaxHeap;

public class MaxHeapImpl implements MaxHeap{
	
	//An int array is created for the coin values as entries
	private int[] Heap; 
	
	//Number of elements currently in the array 
	private int size;
	
	//maximum number of elements allowed in the array
	private int capacity;
	
	public MaxHeapImpl(int capacity) {
		this.capacity = capacity;
		this.size = 0;
		Heap = new int[this.capacity+1];
		Heap[0] = Integer.MAX_VALUE;
	}
	
	private int parent(int p) { //returns the index of parent(p) 
		return p/2;
	}
	
	private int leftChild(int p) {
		return 2*p;
	}
	private int rightChild(int p) {
		return(2*p+1);
	}
	private boolean hasLeft(int j) {
		return leftChild(j)<Heap.length;
	}
	
	private boolean hasRight(int j) {
		return rightChild(j)<Heap.length;
	}
	
	 
	private void swap(int p, int q) {
		int temp = Heap[p];
		Heap[p]=Heap[q];
		Heap[q] = temp;
	}

	private void upheap(int j) {
		while(j>1) {
			int p = parent(j);
			if(Heap[j]<Heap[p]) {
				break;
			}
			swap(j,p);
			j=p;
		}
	}
	private void downheap(int j) {
		while(hasLeft(j)) {  //continue to bottom(or break statement)
			int leftIndex = leftChild(j);
			int smallChildIndex = leftIndex;  //although right might be smaller
			if(hasRight(j)) {
				int rightIndex = rightChild(j);
				if(Heap[leftIndex]<Heap[rightIndex]) {
					smallChildIndex = rightIndex;
				}
			}
			if(Heap[smallChildIndex]<=Heap[j]) {
				break;
			}
			swap(j,smallChildIndex);
			j=smallChildIndex;
		}
	}
	
	public int sizes() {
		return this.size;
	}
	 
	public void insert(int element) {
		Heap[++size] = element;
		int current = size;
		upheap(current);
	}
	
	public int extractMax() {
		int max = Heap[1];
		Heap[1] = Heap[size--];
		downheap(1);
		return max;
		
	}
	
	public void display() {
		for(int i=1; i<=size/2; i++) {
			System.out.print("Parent : "+ Heap[i]
							+ " Left Child : " + Heap[leftChild(i)]
							+" Right Child : " + Heap[rightChild(i)]	);
			System.out.println();
		}
		System.out.println("********");
	}
}
	
 
