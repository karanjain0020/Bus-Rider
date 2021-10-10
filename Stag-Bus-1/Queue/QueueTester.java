package queue;

public class QueueTester {

	public static void main(String[] args) {
		Queue q = new QueueImpl();

		q.enQueue("sam");
		q.enQueue("pam");
		q.enQueue("will");
		q.enQueue("jill");
		
		q.deQueue();
		System.out.println(q.isEmpty());
		System.out.println(q.isFull());
		
		q.display();
		
		System.out.println(q.peek());

	}

}

