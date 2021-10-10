package linkedList;

public class LinkedListTester {

	public static void main(String[] args) {

			LinkedList l = new LinkedListImpl();
			l.addItem("karan");
			l.addItem("newton");
			l.addItem("chris");
			l.addItem("will");
			
			
			
		
			l.deleteItem("karan");
			
			l.listItems();
			
			l.insertAfter("bibek", "newton");
			l.insertBefore("tim", "will");
			System.out.println(l.itemCount());
			System.out.println(l.isItemInList("tim"));
			l.listItems();

			
			
		}

	}


