package stack; 


public class StackImpl implements Stack {
	private String[] stackArray;
	private int size = 0;
	private int index = -1;

	

	@Override
	public void push(String s) {
		index++;
		stackArray[index] = s;
		
		
	}

	@Override
	public String pop() {
		if(isEmpty()) {
			System.out.println("nothing here");
		}
		
		String temp=stackArray[index];
		index--;
		return  temp;
		
		
	}

	
	@Override
	public Boolean isEmpty() {
		if(index==-1) {
			return true;
		}
		return false;
	
	}

	@Override
	public Boolean isFull() {
		if (index+1==size) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public String peek() {
	if(isEmpty()) {
		System.out.println("Empty stuff");
	}

		return stackArray[index];
	}

	@Override
	public void setCapacity(int size) {
		// TODO Auto-generated method stub
		this.size=size;
		stackArray=new String[size];
	}

	@Override
	public void display() {
		if(isEmpty()) {
			System.out.println("empty stack");
		}
		for(int i = 0; i <=index; i++) {
			if(stackArray[i]!=null) {
			System.out.println("element: " + stackArray[i]);
			}
		}
	}

}
