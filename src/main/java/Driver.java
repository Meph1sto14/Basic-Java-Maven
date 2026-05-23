import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		// System.out.println("Count:" + counter.getCount());
		
		// counter.increment();
		
		// System.out.println("Count:" + counter.getCount());
		
		// counter.decrement();
		
		// System.out.println("Count:" + counter.getCount());
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.increseBy(5);
		
		System.out.println("Count:" + counter.getCount());
		
		counter.decreseBy(2);
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.multiplyBy(6);
		
		System.out.println("Current count:" + counter.getCount());
	}

}