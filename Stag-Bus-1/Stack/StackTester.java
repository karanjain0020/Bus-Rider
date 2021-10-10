package stack;

public class StackTester {

	public static void main(String[] args) {
		Stack s = new StackImpl();
		runTests(s);

	}
	
	
	public static void runTests(Stack s) {
		s.setCapacity(10);
		s.isEmpty();
		s.push("Bibek");
		s.push("Bibek1");
		s.push("Bibek2");
		s.push("Bibek3");
		s.push("Bibek4");
		s.push("Bibek6");
		s.push("Bibek5");
		s.push("Bibek7");
		s.push("Bibek9");
		s.display();
		System.out.println(s.isFull());
		System.out.println(s.peek());	
	}

}
