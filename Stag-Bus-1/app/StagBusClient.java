package app;
 
import linkedList.LinkedList;
import linkedList.LinkedListImpl;
import queue.Queue;
import queue.QueueImpl;
import stack.Stack;
import stack.StackImpl;

public class StagBusClient {

	public static void main(String[] args) {

		System.out.println("-----L I S T  T E S T------");
		
		LinkedList stagList = new LinkedListImpl(); 
		stagList.addItem("CVS");
		stagList.addItem("Marshalls");
		stagList.addItem("Bookstore");
		stagList.addItem("WholeFoods");
		
		stagList.listItems();
		
		System.out.println("Is Bookstore in the list: "+ stagList.isItemInList("Bookstore"));
		System.out.println("Is MilkCraft in the list: "+ stagList.isItemInList("MilkCraft"));

		stagList.deleteItem("Bookstore");
		stagList.listItems();
		
		stagList.insertAfter("Station", "Marshalls");
		
		stagList.listItems();
 		
		
		
		System.out.println("-----Q U E U E  T E S T------");
		
		Queue riders = new QueueImpl();
		riders.enQueue("sam");
		riders.enQueue("pam");
		riders.enQueue("will");
		riders.enQueue("jill");
		riders.enQueue("hal");
		riders.enQueue("leo");
		
		riders.display();
		
		System.out.println(riders.peek());

		riders.deQueue();
		riders.display();
		System.out.println("Break");
		riders.enQueue("rye");
		riders.enQueue("dion");
		riders.display();
		System.out.println(riders.peek());

		riders.deQueue();
		riders.enQueue("Michael");
		riders.display();
		
		
		System.out.println("-----S T A C K  T E S T------");
		
		Stack s = new StackImpl();
		s.setCapacity(10);

		s.push("Bibek");
		s.push("Bibek2");
		s.push("Bibek3");
		s.push("Bibek4");
		s.push("Bibek5");
		s.push("Bibek6");
		s.display();
		
		System.out.println(s.peek());	
		
		s.pop();
		s.display();
		System.out.println(s.peek());	

		s.push("Bibek8");
		s.push("Bibek7");
		s.display();
		
		while(!s.isEmpty()) {
			s.pop();
		}
		s.display();
		
		
	 	}

}
