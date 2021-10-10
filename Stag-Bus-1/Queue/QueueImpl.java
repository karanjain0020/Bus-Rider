package queue;

public class QueueImpl implements Queue {
	private int length=10;
	String[] arr = new String[length];
	int size=0;

	

	@Override
	public boolean isFull() {
		if (arr[length - 1] != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		if (arr[0] == null) {
			return true;
		}
		return false;
	}

	@Override
	public void enQueue(String element) {
		if (isFull()) {
			System.out.println("sorry, full queue");
		} else if (isEmpty()) {
			arr[0] = element;
			size++;
		}
		else {
		for (int i = size; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = element;
		
		size++;
		}
	}

	@Override
	public String deQueue()  {
		String element=null;
		if (isEmpty()) {
			System.out.println("Sorry, empty queue");
		}
		else{
			element = arr[size];
			arr[size] = null;
			size--;
		}
		return element;
		
	}

	@Override
	public void display() {
		for(int i=0; i<size; i++) {
		System.out.println(arr[i]);	
		}

	}

	@Override
	public String peek() {

	

		return arr[size-1];
	}

}
