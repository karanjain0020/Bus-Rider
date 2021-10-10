package linkedList;

public class LinkedListImpl implements LinkedList {
	private ListItem head;
	private int count;

	@Override
	public Boolean isItemInList(String thisItem) {
		// TODO Auto-generated method stub
		ListItem temp=head; 
		while(temp!=null) {
			if(temp.data.equals(thisItem)) {
				return true;
			}
			temp=temp.next;
		}
		
		return false;
	}

	@Override
	public Boolean addItem(String thisItem) {
		ListItem lastItem = getLastItem();

		//add to the end of the list
		
		ListItem newItem = new ListItem(thisItem);

		if (head == null)
			head = newItem;
		else {
			lastItem.next = newItem;
		}
		count++;
		return true;
	}
	
	private ListItem getLastItem() {
		
		ListItem lastItem = head;

		if (head == null)
			lastItem = null;
		else {
			lastItem = head;

			// last node points to null
			while (lastItem.next != null)
				lastItem = lastItem.next;
			//here should we not change the data too?????
		}

		return lastItem;
		
	}
	

	@Override
	public Integer itemCount() {
			
			return count;
		}
	
	

	@Override
	public void listItems() {
		ListItem tmp = head;
			while(tmp != null) {
				System.out.println("item: " + tmp.data);
				tmp = tmp.next;
		}
		
	}
	
	
	
	//helper methods 
	public ListItem getTheCurrentItem(String theItem) {
		ListItem temp=head; 
		while(temp!=null) {
			if(temp.data.equals(theItem)) {
				return temp;
			}
			temp=temp.next;
		}
		
		return null;
		
	}
	
	
	public ListItem getPreviousItem(String theItem) {
		if(head==null) {
			return null;
			
		}
		else {
			ListItem temp=head; 
			while(temp.next!=null) {
				if(temp.next.data.equals(theItem)) {
					return temp;
				}
				temp=temp.next;
			}
		}
		return null;
	}

	@Override
	public Boolean deleteItem(String thisItem) {
		// TODO Auto-generated method stub
		
		ListItem currentItem=getTheCurrentItem(thisItem);
		

		ListItem previousItem=getPreviousItem(thisItem);
		
		//1->2->null
		if(currentItem==null) {
			return false;
		}
		
		if(previousItem==null) {
			head=currentItem.next;
			count--;
			return true;
		}
		previousItem.next=currentItem.next;
		count--;
		
		
		return true;
	}

	@Override
	public Boolean insertBefore(String newItemString, String itemToInsertBefore) {
		// TODO Auto-generated method stub
		ListItem newItem=new ListItem(newItemString);
		ListItem previousItem=getPreviousItem(itemToInsertBefore);
		ListItem currentItem=getTheCurrentItem(itemToInsertBefore);
		
		if(currentItem==null) {
			
			return false;
		}
	
		if(previousItem==null) {
			currentItem.next=head;
			head=newItem;
			return true;
		}
		
		newItem.next=currentItem; 
		previousItem.next=newItem; 
		
		count++;
		
		return true;
	}

	@Override
	public Boolean insertAfter(String newItemString, String itemToInsertAfter) {
		// TODO Auto-generated method stub
		ListItem newItem=new ListItem(newItemString);
		
		
		ListItem theItem=getTheCurrentItem(itemToInsertAfter);
		
		if(theItem==null) {
			return false;
		}
		
		newItem.next=theItem.next;
		theItem.next=newItem;
		count++;
		
		return true;
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		
	}
	
}
