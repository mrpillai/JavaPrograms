package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This java program demonstrates the use of 'flatMap()' method in Java8
 * programming. The 'flatMap()' function is used to convert a Stream of list of
 * values to a Stream of values and this process is called "Flattening of
 * Streams".
 *
 * @author Batra, Yatin
 **/

class A {

	int a;

	static void testst() {
		System.out.println("main cl");

	}
}

class B extends A {

	  static void testst(){
		   	System.out.println("child cl");
	  }
}

public class Java8Test {

	public static void main(String[] args) {

		A a = new B();
		a.testst();
		
		A a1 = new A();
		a.testst();
		
		B b1 = new B();
		b1.testst();
		
	
		
		List<String> houseGryffindor = Arrays.asList("Albus", "Harry", "Ron", "Hermione");
		List<String> houseHufflepuff = Arrays.asList("Bridget", "Cedric", "Nymphadora");
		List<String> houseRavenclaw = Arrays.asList("Luna", "Garrick", "Filius");
		List<String> houseSlytherin = Arrays.asList("Severus", "Tom", "Phineas");

		List<List<String>> hogwarts = new ArrayList<List<String>>();
		hogwarts.add(houseGryffindor);
		hogwarts.add(houseHufflepuff);
		hogwarts.add(houseRavenclaw);
		hogwarts.add(houseSlytherin);

		// Printing All Hogwarts Houses In Pre-Java8 World
		List<String> listOfAllHouses = new ArrayList<String>();
		for (List<String> house : hogwarts) {
			for (String hName : house) {
				listOfAllHouses.add(hName);
			}
		}

		System.out.println("<!---------------Hogwarts Houses---------------!>");
		System.out.println(listOfAllHouses);

		System.out.println();

		// Now let's Achieve This By Using 'flatMap()' Method In Java8
		List<String> flatMapList = hogwarts.stream().flatMap(hList -> hList.parallelStream())
				.collect(Collectors.toList());

		List<List<String>> flatMapList2 = hogwarts.stream().collect(Collectors.toList());

		List<String> flatMapList3 = hogwarts.stream().flatMap(List::stream).collect(Collectors.toList());

		System.out.println("<!---------------Hogwarts Houses Using Java8---------------!>");
		System.out.println(flatMapList);

		System.out.println(flatMapList2);

		System.out.println(flatMapList3);

		Stream<UserPogo> userStream = Stream.of(new UserPogo(0, "Alice", null, null, null),
				new UserPogo(0, "Bob", null, null, null), new UserPogo(0, "Chuck", null, null, null));
		userStream.peek(u -> u.setName(u.getName().toLowerCase())).forEach(System.out::println);

		Java8Test java8Test = new Java8Test();
		int i = java8Test.m();
		System.out.println("i==" + i);

	}

	private int m() {

		try {
			System.out.println("");

			return 1;
		} catch (Exception e) {
			return 2;
		} finally {
			return 3;
		}
	}
}