package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreams {

	public static void main(String[] args) {

	    List<String> lines = Arrays.asList("spring", "node", "mkyong");

        List<String> result = lines.stream()                // convert list to stream
                .filter(line -> !"mkyong".equals(line))     // we dont like mkyong
                .collect(Collectors.toList());              // collect the output and convert streams to a List

        lines.forEach(System.out::println);
        System.out.println("------------");
        result.forEach(System.out::println);                //output : spring, node

        
	}

}
