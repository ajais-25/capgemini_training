package function_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30);
		
		Consumer<Integer> c = (i) -> System.out.println(i);
		
		list.forEach(c);
		
//		Consumer<Integer> c = new Consumer<Integer>() {
//
//			@Override
//			public void accept(Integer t) {
//				System.out.println(t);
//			}
//			
//		};
		
//		Consumer<Integer> c = (Integer t) -> System.out.println(t);
		
		
//		list.forEach(n -> System.out.println(n));
		list.forEach(System.out::println);

	}

}
