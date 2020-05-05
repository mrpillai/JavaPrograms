package java8;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSorting {

	public static void main(String[] args) {

		List<Developer> listDevs = getDevelopers();
		
		System.out.println("Before Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}
		
		System.out.println("After Sort");
		
		//lambda here!
		Collections.sort(listDevs,(Developer o1, Developer o2)->o1.getAge()-o2.getAge());
	
		//java 8 only, lambda also, to print the List
		listDevs.forEach((developer)->System.out.println(developer));
		
		
		Collections.sort(listDevs, (o1,o2)->o1.getName().compareTo(o2.getName()));
		
		listDevs.forEach((eveloper)->System.out.println(eveloper));
		
		
		List<String> ls = new ArrayList<>();
		String s = "ram";
		Object o = s;
		ls.add(o.toString());
		
		System.out.println("-----"+o.toString());

	}

	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("jason", new BigDecimal("100000"), 10));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));
		
		return result;

	}
	
}


class SalarySorter implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
