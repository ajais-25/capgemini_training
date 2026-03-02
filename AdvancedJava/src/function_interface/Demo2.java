package function_interface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class Demo2 {

	public static void main(String[] args) {
		List<String> emp = new ArrayList<>();
		emp.add("ryan");
		emp.add("bob");
		emp.add("josh");
		emp.add("josh");
		
		Function<List<String>, Set<String>> f1 = (empList) -> new HashSet<>(empList);
		
		System.out.println(f1.apply(emp));
		
		Function<List<String>, Set<String>> f2 = HashSet::new;
		
		System.out.println(f2.apply(emp));
	}

}
