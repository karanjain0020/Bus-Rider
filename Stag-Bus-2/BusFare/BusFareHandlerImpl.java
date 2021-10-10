package BusFare;
 
import MaxHeap.MaxHeap;
import MaxHeap.MaxHeapImpl;

public class BusFareHandlerImpl implements BusFareHandler {
	MaxHeap wallet;
	
	public BusFareHandlerImpl() {
		wallet = new MaxHeapImpl(15);
	}

	
	public void grabChange() {
		wallet.insert(1);
		wallet.insert(5);
		wallet.insert(10);
		wallet.insert(25);
		wallet.insert(50);
		wallet.insert(100);
		
	}

	@Override
	public int getMaxFromHeap() {
		int max = wallet.extractMax();
		return max;
	}

	//only accepts 5, 25, 50, 100
	public int payBusFare(int coin) {
		
		//base case 
		int sum=coin; 
		if(sum==180) {
			return sum;
		}
		
		
		//get the max value from the heap 
		int value=getMaxFromHeap();
		
		if(value==25 || value==50 || value==5) {
			sum+=value;
		}
		return payBusFare(sum);
		
		
	
	}
	
	public void display() {
		wallet.display();
	}
 
}
