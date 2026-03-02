package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(20, 11, 240, 4, 0, 0, 19, 11);
		
//		l.stream().filter(n -> (n & 1) == 0).sorted().forEach(System.out::println);
//		System.out.println(l.stream().filter(n -> (n & 1) == 0).sorted().count());
		
//		s.forEach(System.out::println); // will give error, because we cannot consume stream multiple times and it does n affect the main list
//		l.forEach(System.out::println);
		
//		Stream<Integer> s = l.stream().map(e -> e * 2);
//		
//		Integer sum = l.stream().reduce(0, (a, b) -> a + b);
//		
//		System.out.println(sum);
		
//		l.stream()
//			.map(n -> n * 2)
//			.collect(Collectors.toList()).forEach(System.out::println);
//		
		l.stream()
			.map(n -> n * 2)
			.collect(Collectors.toSet()).forEach(System.out::println);
	}

}
