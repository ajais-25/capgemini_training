package function_interface;

import java.util.function.Function;

//class Demo10 implements Function<String, Integer> {
//
//	@Override
//	public Integer apply(String t) {
//		return t.length();
//	}
//	
//}

public class Functions {

	public static void main(String[] args) {
		Function<String, Integer> f = (String s) -> s.length();
		System.out.println(f.apply("Hello World"));
	}

}
