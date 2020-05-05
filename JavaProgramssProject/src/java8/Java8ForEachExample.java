package java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

@FunctionalInterface
interface Rums {

	void rum(int x);

	default void r() {

	}

	default void r1() {

	}

	static void rs() {

	}
	
	
}

public class Java8ForEachExample {

	public static void main(String[] args) {

		// creating sample Collection
		List<Integer> myList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
			myList.add(i);

		// traversing using Iterator
		Iterator<Integer> it = myList.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			System.out.println("Iterator Value::" + i);
		}

		// traversing through forEach method of Iterable with anonymous class
		myList.forEach(new Consumer<Integer>() {

			public void accept(Integer t) {
				System.out.println("forEach anonymous class Value::" + t);
			}

		});

		// traversing with Consumer interface implementation
		MyConsumer action = new MyConsumer();
		myList.forEach(action);

		Rums rf = (x) -> {
			System.out.println("Rums:" + x);
		};

		rf.rum(100);
		rf.r();

	}

}

// Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer> {
	int t = 10;

	public void accept(Integer t) {
		System.out.println("Consumer impl Value::" + t);
	}

}
