import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Count:" + counter.getCount());
		if (counter.getCount() == 0) {
			System.out.println("PASS: Initial value benar");
		} else {
			System.out.println("FAIL: Initial value salah");
		}

		counter.increment();

		System.out.println("Count:" + counter.getCount());
		if (counter.getCount() == 1) {
			System.out.println("PASS: Increment berhasil");
		} else {
			System.out.println("FAIL: Increment gagal");
		}
		
		counter.decrement();
		
		System.out.println("Count:" + counter.getCount());
		if (counter.getCount() == 0) {
			System.out.println("PASS: Decrement berhasil");
		} else {
			System.out.println("FAIL: Decrement gagal");
		}

	}

}
